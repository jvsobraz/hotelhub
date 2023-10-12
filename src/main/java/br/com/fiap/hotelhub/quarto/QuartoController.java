package br.com.fiap.hotelhub.quarto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/task")
public class QuartoController {
    
    @Autowired
    QuartoService service;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("quartos", service.findAll());
        return "quarto/index";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, RedirectAttributes redirect) {
        if(service.delete(id)){
            redirect.addFlashAttribute("success", "Quarto apagada com sucesso");
        }else{
            redirect.addFlashAttribute("error", "Quarto não encontrada");
        }
        return "redirect:/quarto";
    }

    @GetMapping("new")
    public String form(Quarto quarto) {
        return "quarto/form";
    }

    @PostMapping
    public String create(@Valid Quarto quarto, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) return "quarto/form";

        service.save(quarto);
        redirect.addFlashAttribute("success", "Quarto cadastrado com sucesso");
        return "redirect:/quarto";
    }
}

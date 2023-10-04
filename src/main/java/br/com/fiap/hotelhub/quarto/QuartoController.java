package br.com.fiap.hotelhub.quarto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
}

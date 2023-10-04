package br.com.fiap.hotelhub.reserva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/reserva")
public class ReservaController {

    @Autowired
    ReservaService service;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("reservas", service.findAll());
        return "reserva/index";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, RedirectAttributes redirect) {
        if(service.delete(id)){
            redirect.addFlashAttribute("success", "Reserva apagada com sucesso");
        }else{
            redirect.addFlashAttribute("error", "Reserva não encontrada");
        }
        return "redirect:/reserva";
    }
}
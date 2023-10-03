package br.com.fiap.hotelhub.web;

import br.com.fiap.hotelhub.entity.Quarto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.hotelhub.repository.QuartoRepository;

@RestController
@RequestMapping("/api/quartos")
public class QuartoController {
    
    @Autowired
    private QuartoRepository quartoRepository;

    @GetMapping("/disponiveis")
    public List<Quarto> buscarQuartosDisponiveis(@RequestParam Long hotelId) {
        return quartoRepository.findByHotelIdAndDisponivelTrue(hotelId);
    }
}

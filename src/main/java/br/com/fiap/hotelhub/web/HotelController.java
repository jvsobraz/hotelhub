package br.com.fiap.hotelhub.web;

import br.com.fiap.hotelhub.entity.Hotel;
import java.util.List;
//import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.hotelhub.repository.HotelRepository;

@RestController
@RequestMapping("/api/hoteis")
public class HotelController {
    
    @Autowired
    private HotelRepository hotelRepository;

    @GetMapping
    public List<Hotel> buscarHoteisPorCidade(@RequestParam String cidade) {
        return hotelRepository.findByCidade(cidade);
    }
}

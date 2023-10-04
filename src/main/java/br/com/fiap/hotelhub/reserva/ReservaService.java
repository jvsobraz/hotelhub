package br.com.fiap.hotelhub.reserva;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaService {
    
    @Autowired
    ReservaRepository repository;

    public List<Reserva> findAll() {
        return repository.findAll();
    }

    public boolean delete(Long id) {
        var reserva = repository.findById(id);
        if (reserva.isEmpty()) return false;
        repository.deleteById(id);
        return true;
    }
}

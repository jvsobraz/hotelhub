package br.com.fiap.hotelhub.quarto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuartoService {

    @Autowired
    QuartoRepository repository;

    public List<Quarto> findAll() {
        return repository.findAll();
    }

    public boolean delete(Long id) {
        var quarto = repository.findById(id);
        if (quarto.isEmpty()) return false;
        repository.deleteById(id);
        return true;
    }

    public void save(Quarto quarto) {
        repository.save(quarto);
    }
    
}

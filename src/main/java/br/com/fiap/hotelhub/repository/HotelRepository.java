package br.com.fiap.hotelhub.repository;

import java.util.List;
import br.com.fiap.hotelhub.entity.Hotel;

//import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
    List<Hotel> findByCidade(String cidade);
    
}

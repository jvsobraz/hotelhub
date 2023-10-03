package br.com.fiap.hotelhub.repository;

import java.util.List;
import br.com.fiap.hotelhub.entity.Quarto;

//import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuartoRepository extends JpaRepository<Quarto, Long> {
List<Quarto> findByHotelIdAndDisponivelTrue(Long hotelId);

}

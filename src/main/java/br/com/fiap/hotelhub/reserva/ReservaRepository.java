package br.com.fiap.hotelhub.reserva;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    
}

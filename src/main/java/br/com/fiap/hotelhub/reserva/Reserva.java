package br.com.fiap.hotelhub.reserva;

import java.util.Date;

import br.com.fiap.hotelhub.quarto.Quarto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Reserva {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotBlank
    Date checkin;

    @NotBlank
    Date checkout;

    Quarto quarto;

    //Usuario usuario;

    @NotBlank
    String statusDaReserva;

    @NotBlank
    Integer precoTotal;
    
}

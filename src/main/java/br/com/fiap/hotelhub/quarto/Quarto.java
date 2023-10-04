package br.com.fiap.hotelhub.quarto;

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
public class Quarto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotBlank
    @Min(1)
    Integer numeroDoQuarto;
    
    @NotBlank
    @Size(min= 5)
    String tipoDeQuarto;

    @NotBlank
    @Min(1)
    Integer capacidadeMaxima;

    @NotBlank
    Integer preco;
}
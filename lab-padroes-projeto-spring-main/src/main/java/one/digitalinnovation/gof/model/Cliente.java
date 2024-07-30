package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotBlank(message = "Email é obrigatório")
    private String email;

    private String telefone;
    private String celular;

    @ManyToOne
    private Endereco endereco;

    // Getters and Setters omitted for brevity

    // Optional: Custom method for total purchases (assuming Pedido entity exists)
    public double getTotalCompras() {
        // Implement logic to calculate total purchases from related Pedido entities
        return 0.0;  // Placeholder
    }
}

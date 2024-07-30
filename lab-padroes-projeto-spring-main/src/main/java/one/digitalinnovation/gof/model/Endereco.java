package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Endereco {

    @Id
    private Long cep;  // Consider using Long or custom CEP class
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    // Getters and Setters omitted for brevity

    // Optional constructor
    public Endereco(Long cep, String logradouro, String complemento, String bairro,
                     String localidade, String uf, String ibge, String gia, String ddd, String siafi) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.ibge = ibge;
        this.gia = gia;
        this.ddd = ddd;
        this.siafi = siafi;
    }

    // Optional method for formatted address
    public String getEnderecoCompleto() {
        StringBuilder builder = new StringBuilder();
        builder.append(logradouro);
        if (complemento != null && !complemento.isEmpty()) {
            builder.append(", ").append(complemento);
        }
        builder.append(", ").append(bairro).append(" - ").append(localidade).append(" - ").append(uf);
        return builder.toString();
    }
}

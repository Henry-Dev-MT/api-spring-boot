
package br.com.senai.cadastro_eventos.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class evento {

    @NotBlank(message = "O Cadastro do evento é obrigatório.")
    @Size(min = 5, message = "O Cadastro deve ter pelo menos 5 caracteres.")
    private String titulo;

    @NotBlank(message = "O local tem de ser válido.")
    private String local;

    @NotBlank(message = "A categoria é obrigatória.")
    private String categoria;

    @NotBlank(message = "O Numero de vagas tem que ser contado corretamente.")
    private String numeroVagas;



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNumeroVagas() {
        return numeroVagas;
    }

    public void setNumeroVagas(String numeroVagas) {
        this.numeroVagas = numeroVagas;
    }
}

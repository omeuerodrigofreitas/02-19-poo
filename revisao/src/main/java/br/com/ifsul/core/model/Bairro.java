package br.com.ifsul.core.model;

public class Bairro {

    private Long id;
    private String nome;

    protected Bairro() {}

    public Bairro(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
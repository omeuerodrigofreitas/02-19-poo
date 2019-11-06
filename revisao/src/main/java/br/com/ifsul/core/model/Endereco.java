package br.com.ifsul.core.model;

public class Endereco {

    private Long id;
    private String nomeRua;
    private int numeroCasa;
    private Bairro bairro;

    protected Endereco() {
    }

    public Endereco(String nomeRua, Bairro bairro) {
        this.nomeRua = nomeRua;
        this.bairro = bairro;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }




}
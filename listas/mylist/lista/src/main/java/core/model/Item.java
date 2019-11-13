package core.model;

import java.math.BigDecimal;

public class Item extends BaseClass {

    private String nome;
    private BigDecimal valor;


    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
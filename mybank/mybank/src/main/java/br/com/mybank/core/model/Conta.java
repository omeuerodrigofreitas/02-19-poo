package br.com.mybank.core.model;

import java.math.BigDecimal;
import java.util.List;

public class Conta {

    private String numero;
    private BigDecimal saldo;
    private List<Pessoa> pessoas;

    protected Conta() {
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Conta(String numero) {
        this.numero = numero;
    }


    public String getNumero() {
        return numero;
    }



    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    public void addPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }




}
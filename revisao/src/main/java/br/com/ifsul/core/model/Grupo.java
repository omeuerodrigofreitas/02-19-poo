package br.com.ifsul.core.model;

import java.util.List;
import java.util.stream.Collector;

public class Grupo {

    private Long id;
    private String nome;
    private List<Pessoa> pessoasDoGrupo;

    protected Grupo() {
    }

    public List<Pessoa> getPessoasDoGrupo() {
        return pessoasDoGrupo;
    }

    public void setPessoasDoGrupo(List<Pessoa> pessoasDoGrupo) {
        this.pessoasDoGrupo = pessoasDoGrupo;
    }

    public Grupo(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
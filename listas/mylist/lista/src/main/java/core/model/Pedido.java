package core.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import core.model.Item;

public class Pedido {


    public static String CNPJ = "1232125515-55"; 

    private Long id;
    private String nomeCliente;
    private List<Item> itens = new ArrayList<>();
    private BigDecimal valorTotal;


    public Long getId() {
        return id;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public BigDecimal valorTotalPedido() {
        BigDecimal valorSomado = BigDecimal.ZERO;
        for (Item item : this.itens) {
            valorSomado = valorSomado.add(item.getValor());
        }
        return valorSomado;
    }

}



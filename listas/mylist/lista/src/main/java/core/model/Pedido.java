package core.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pedido extends BaseClass implements Qualquer {

    public static String CNPJ = "1232125515-55"; 

    private String nomeCliente;
    private List<Item> itens = new ArrayList<>();
    private BigDecimal valorTotal;



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



    public void adicionarItem(Item item) {
        itens.add(item);
    }

    @Override
    public BigDecimal calcularValorTotalPedido() {
        BigDecimal valorSomado = BigDecimal.ZERO;
     for (Item item : this.itens) {
          valorSomado = valorSomado.add(item.getValor());
      }
     return valorSomado;
    }

//    public BigDecimal valorTotalPedido() {
//        BigDecimal valorSomado = BigDecimal.ZERO;
//        for (Item item : this.itens) {
//            valorSomado = valorSomado.add(item.getValor());
//        }
//        return valorSomado;
//    }

}



package core;

import java.math.BigDecimal;

import core.model.Item;
import core.model.Pedido;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();
        Pedido pedido3 = new Pedido();


        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();
        Item item5 = new Item();

        item1.setId(1L);
        item1.setNome("carregador de celular");
        item1.setValor(BigDecimal.valueOf(20L));

        item2.setId(2L);
        item2.setNome("roteador");
        item2.setValor(BigDecimal.valueOf(130L));

        item3.setId(3L);
        item3.setNome("caixa de som");
        item3.setValor(BigDecimal.valueOf(35L));

        item4.setId(4L);
        item4.setNome("pen drive");
        item4.setValor(BigDecimal.valueOf(50L));

        item5.setId(5L);
        item5.setNome("fone de ouvido");
        item5.setValor(BigDecimal.valueOf(80L));

        pedido1.setId(1L);
        pedido1.setNomeCliente("Seu Lucas");
        pedido1.adicionarItem(item1);
        pedido1.adicionarItem(item5);


        System.out.println("O pedido do "
        + pedido1.getNomeCliente() + 
        " tem os seguintes itens: ");
        BigDecimal valorTotal = BigDecimal.ZERO;
        for (Item item : pedido1.getItens()) {
            
            System.out.println("Item: " + item.getNome() +
            "Valor: " + item.getValor());

           valorTotal = valorTotal.add(item.getValor());
            
        }

        System.out.println("Valor total do pedido: " + 
        pedido1.valorTotalPedido());


        //extra aprendendo static
        System.out.println(Pedido.CNPJ);




        
       
    }
}

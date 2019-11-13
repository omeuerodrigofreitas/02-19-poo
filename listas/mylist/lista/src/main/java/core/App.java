package core;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import core.model.BaseClass;
import core.model.Item;
import core.model.Pedido;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        List<Pedido> pedidos = new ArrayList<>();

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

        //pedido 1
        pedido1.setId(1L);
        pedido1.setNomeCliente("Seu Lucas");
        pedido1.adicionarItem(item1);
        pedido1.adicionarItem(item5);

        //pedodo 2
        pedido2.setId(2L);
        pedido2.setNomeCliente("Arthur");
        pedido2.adicionarItem(item1);
        pedido2.adicionarItem(item2);
        pedido2.adicionarItem(item3);

        //vamos adicionar a lista de pedidos os pedidos que temos
        pedidos.add(pedido1);
        pedidos.add(pedido2);


        for(Pedido pedido : pedidos) {
            System.out.println("O pedido do senhor: "
                    + pedido.getNomeCliente()
                    + " tem os seguintes itens: ");
            for(Item item : pedido.getItens()) {
                System.out.println("Item: "
                        + item.getNome());
            }
            System.out.println(pedido.calcularValorTotalPedido());

        }


    }
}

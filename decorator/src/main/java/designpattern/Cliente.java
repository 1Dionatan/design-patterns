package designpattern;

public class Cliente {

    public static void main(String[] args){

        Pedido pedido1 = new PedidoBase(100.0);
        pedido1 = new EmbalagemPresenteDecorator(pedido1);
        pedido1 = new FreteExpressDecorator(pedido1);
        System.out.println("Custo Pedido 1:" +pedido1.calcularCustoTotal());

        Pedido pedido2 = new PedidoBase(200.0);
        pedido2 = new SeguroDecorator(pedido2, 0.02);
        pedido2 = new SeguroDecorator(pedido2, 0.02);
        System.out.println("Custo Pedido 2:" + pedido2.calcularCustoTotal());

    
        Pedido pedido3 = new PedidoBase(150.0);
        pedido3 = new EmbalagemPresenteDecorator(pedido3);
        pedido3 = new FreteExpressDecorator(pedido3);
        pedido3 = new SeguroDecorator(pedido3, 0.02);
        System.out.println("Custo Pedido 3 (com tudo): " + pedido3.calcularCustoTotal());

    }    

}

//O QUE FIZEMOS 
//Eliminamos os ifs de dentro da classe Pedido
//Permitimos adicionar ou remover funcionalidades facilmente
//Aplicamos o princípio Open/Closed (aberto para extensão, fechado para modificação)
//Deixamos o sistema mais flexível e modular
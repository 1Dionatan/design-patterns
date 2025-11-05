package designpattern;

public interface Pedido {

    double calcularCustoTotal();

}

class PedidoBase implements Pedido{
    private final double precoBase;

    public PedidoBase (double precoBase){
        this.precoBase = precoBase;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    @Override
    public double calcularCustoTotal() {
        return precoBase;
    }
}

abstract class PedidoDecorator implements Pedido{
    protected Pedido pedidoDecorado;

    public PedidoDecorator(Pedido pedidoDecorado) {
        this.pedidoDecorado = pedidoDecorado;
    }

    @Override
    public double calcularCustoTotal() {
        return pedidoDecorado.calcularCustoTotal();
    }
}

 class EmbalagemPresenteDecorator extends PedidoDecorator{
    public EmbalagemPresenteDecorator (Pedido pedidoDecorado) {
        super (pedidoDecorado);
        }
    

    @Override
    public double calcularCustoTotal(){
            return super.calcularCustoTotal() + 5.00;
        }
    }


    class FreteExpressDecorator extends PedidoDecorator{
        public FreteExpressDecorator(Pedido pedidoDecorado){
            super(pedidoDecorado);
        }

        @Override
        public double calcularCustoTotal(){
            return super.calcularCustoTotal() + 15.00;
    }
}

class SeguroDecorator extends PedidoDecorator {
    private final double percentual;

    public SeguroDecorator(Pedido pedidoDecorado, double percentual) {
        super(pedidoDecorado);
        this.percentual = percentual;
    }

    @Override
    public double calcularCustoTotal() {
        double base = super.calcularCustoTotal();
        return base + (base * percentual);
    }
}
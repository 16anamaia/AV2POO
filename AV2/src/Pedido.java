import AV2.PedidoItem;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int numeroPedido;
    private Date dataHoraPedido;
    private double precoTotal;
    private int statusPedido;
    private ArrayList<PedidoItem> itensPedido;

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = new Date(); // Data e hora atuais
        this.precoTotal = 0; // Valor inicial zero
        this.statusPedido = 1; // Status padrão é 1
        this.itensPedido = new ArrayList<>();
    }

    // Getters e Setters
    // ...

    public void excluirItensPedido(PedidoItem item) {
        this.itensPedido.remove(item);
        calcularTotalPagar();
    }

    private void calcularTotalPagar() {
        double total = 0;
        for (PedidoItem item : itensPedido) {
            total += item.getPrecoItem() * item.getQtdItem();
        }
        this.precoTotal = total;
    }

    public void inserirItensPedido(PedidoItem item1) {

    }
}


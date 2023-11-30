import AV2.PedidoItem;

public class Main {
    public static void main(String[] args) {

        Categoria categoria1 = new Categoria("Categoria 1");
        Categoria categoria2 = new Categoria("Categoria 2");


        Produto produto1 = new Produto("Produto 1", 10.0, "Descrição 1", 100, categoria1);
        Produto produto2 = new Produto("Produto 2", 20.0, "Descrição 2", 150, categoria1);
        Produto produto3 = new Produto("Produto 3", 15.0, "Descrição 3", 200, categoria2);
        Produto produto4 = new Produto("Produto 4", 25.0, "Descrição 4", 120, categoria2);
        Produto produto5 = new Produto("Produto 5", 30.0, "Descrição 5", 180, categoria1);


        PedidoItem item1 = new PedidoItem("Item 1", 2, 10.0);
        PedidoItem item2 = new PedidoItem("Item 2", 1, 20.0);
        PedidoItem item3 = new PedidoItem("Item 3", 3, 15.0);


        Pedido pedido1 = new Pedido(1);
        Pedido pedido2 = new Pedido(2);

        pedido1.inserirItensPedido(item1);
        pedido1.inserirItensPedido(item2);
        pedido2.inserirItensPedido(item3);

        pedido1.excluirItensPedido(item1);
    }
}
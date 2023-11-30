import AV2.PedidoItem;

import java.util.ArrayList;
import java.util.Date;

// Classe Produto
class Produto {
    private String nomeProduto;
    private double precoProduto;
    private String descProduto;
    private int estoqueAtual;
    private Categoria categoria;

    public Produto(String nomeProduto, double precoProduto, String descProduto, int estoqueAtual, Categoria categoria) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.descProduto = descProduto;
        this.estoqueAtual = estoqueAtual;
        this.categoria = categoria;
    }

    public boolean buscarProduto(Produto produto) {
        return this.nomeProduto.equals(produto.getNomeProduto());
    }

    private String getNomeProduto() {
        return null;
    }

}


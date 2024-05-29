package Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProdutos(Long codigo, String nome, double preco, int quantidade) {
        estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public Double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }

        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProdutos(1L, "Camiseta", 100.0, 10);
        estoqueProdutos.adicionarProdutos(2L, "Calça", 200.0, 10);
        estoqueProdutos.adicionarProdutos(3L, "Vestido", 300.0, 10);
        estoqueProdutos.adicionarProdutos(4L, "Bermuda", 400.0, 10);
        estoqueProdutos.adicionarProdutos(5L, "Sapato", 500.0, 10);
        estoqueProdutos.adicionarProdutos(6L, "Bota", 600.0, 10);

        estoqueProdutos.exibirProdutos();

        System.out.println(estoqueProdutos.calcularValorTotalEstoque());

        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
    }

}

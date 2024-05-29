package Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet); // nao pode ser hashSet pq a lista precisa ser
                                                                  // organizada
        return produtosPorNome; // perceba que nao precisou do Collections.sort() pois o proprio treeset ja
                                // organiza
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("Arroz", 1, 10.0, 10);
        cadastroProdutos.adicionarProduto("Feijao", 2, 5.0, 10);
        cadastroProdutos.adicionarProduto("Macarrao", 3, 15.0, 10);
        cadastroProdutos.adicionarProduto("Carne", 4, 20.0, 10);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirPorPreco());
    }
}

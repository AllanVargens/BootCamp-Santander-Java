package Collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * OrdenacaoPessoa
 */
public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade() { // esse metodo deve existir na classe Pessoa já que o Compareble altera a
                                             // classe, de uma olhada na mesma
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura()); // aqui vc consegue usar o metodo
                                                                       // ComparatorPorAltura() pra ordenar pois agora
                                                                       // este é uma classe de comparação independente,
                                                                       // assim como o comparator pede
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Maria", 20, 1.60);
        ordenacaoPessoa.adicionarPessoa("Joao", 19, 1.70);
        ordenacaoPessoa.adicionarPessoa("Pedro", 18, 1.80);
        ordenacaoPessoa.adicionarPessoa("Ana", 17, 1.90);

        System.out.println(ordenacaoPessoa.ordernarPorIdade());

        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

}

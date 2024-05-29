package OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidadis {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidadis() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int condigoConvite) {
        convidadoSet.add(new Convidado(nome, condigoConvite));
    }

    public void removerConvidadoPorCodigoDoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;

        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break; // se o elemento for encontrado nao vai ter mais elementos
            }
        }

        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidadis conjuntoConvidadis = new ConjuntoConvidadis();

        conjuntoConvidadis.adicionarConvidado("João", 1);
        conjuntoConvidadis.adicionarConvidado("Maria", 2);
        conjuntoConvidadis.adicionarConvidado("José", 3);
        conjuntoConvidadis.adicionarConvidado("Maria", 4);
        conjuntoConvidadis.adicionarConvidado("José", 5);
        conjuntoConvidadis.adicionarConvidado("Maria", 6);
        conjuntoConvidadis.adicionarConvidado("José", 7);
        conjuntoConvidadis.adicionarConvidado("Maria", 8);
        conjuntoConvidadis.adicionarConvidado("José", 9);
        conjuntoConvidadis.adicionarConvidado("Maria", 10);

        System.out.println("Existem " + conjuntoConvidadis.contarConvidados() + " dentro do Set de convidados");

        conjuntoConvidadis.removerConvidadoPorCodigoDoConvite(4);

        System.out.println("Existem " + conjuntoConvidadis.contarConvidados() + " dentro do Set de convidados");

        conjuntoConvidadis.exibirConvidados();

    }
}

package one.digitalinnovation.gof.Strategy;

public class ComportamentoAgressivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Estou andando agressivamente.");
    }

}

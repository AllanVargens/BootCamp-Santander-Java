public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        System.out.println("A TV esta ligando");
        ligada = true;
        System.out.println("A TV está ligada");
    }

    public void desligar() {
        System.out.println("A TV esta desliganda");
        ligada = false;
        System.out.println("A TV está desligada");
    }

    public void mudarCanal(int novoCanal) {
        if (ligada == true) {
            canal = novoCanal;
            System.out.println("Canal alterado para: " + canal);
        }
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Canal aumentado para: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Canal diminuido para: " + canal);
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume aumentado para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Volume diminuido para: " + volume);
    }
}
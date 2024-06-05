import interfaces.INavegador;
import interfaces.IReprodutorDeMusica;
import interfaces.ITelefone;
import models.Contato;
import models.Musica;

public class Iphone implements INavegador, IReprodutorDeMusica, ITelefone{

    @Override
    public void addNovaAba() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exibirPagina() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void refreshPagina() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void back() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void next() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void selecionarMusica(Musica musica) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ligar(Contato contato) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mandarMensagem(Contato contato, String menssagem) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void receberMensagem() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Boolean verficaRede() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verficaRede'");
    }

}

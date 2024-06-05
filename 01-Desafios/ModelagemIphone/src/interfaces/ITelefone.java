package interfaces;

import java.util.List;

import models.Contato;

public interface ITelefone {
   public static List<Contato> contatos = null;

    Boolean verficaRede();

    void ligar(Contato contato);

    void atender();

    void receberMensagem();

    void mandarMensagem(Contato contato, String menssagem);

}

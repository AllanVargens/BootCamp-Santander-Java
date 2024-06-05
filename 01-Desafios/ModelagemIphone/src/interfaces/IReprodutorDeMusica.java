package interfaces;

import java.util.List;

import models.Musica;

public interface IReprodutorDeMusica {
    public static List<Musica> musicas = null;

    void play();

    void pause();

    void selecionarMusica(Musica musica);

    void next();

    void back();

}

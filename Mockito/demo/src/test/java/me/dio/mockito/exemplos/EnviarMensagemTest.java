package me.dio.mockito.exemplos;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mockito.exemplos.EnviarMensagem;
import com.mockito.exemplos.Mensagem;

@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTest {

    @Spy
    private EnviarMensagem enviarMensagem;

    @Test
    void verificarComportamentoDaClasse() {
        Mockito.verifyNoMoreInteractions(enviarMensagem);

        Mensagem mensagem = new Mensagem("Hello, world!");

        enviarMensagem.adicionarMensagem(mensagem);

        Mockito.verify(enviarMensagem).adicionarMensagem(mensagem);

        assertFalse(enviarMensagem.getMensagens().isEmpty()); // dara false ja que o Spy, referencia o obj real
    }

}

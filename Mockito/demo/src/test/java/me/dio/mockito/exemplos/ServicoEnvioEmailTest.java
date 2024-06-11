package me.dio.mockito.exemplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mockito.exemplos.Email;
import com.mockito.exemplos.PlataformaDeEnvio;
import com.mockito.exemplos.ServicoEnvioEmail;

@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTest {

    @Mock
    private PlataformaDeEnvio plataforma;
    @InjectMocks
    private ServicoEnvioEmail servico;

    @Captor
    private ArgumentCaptor<Email> captor;

    @Test
    void validarDadosEnviadosParaPlataforma(){
        String enderecoDeEmail = "teste@teste.com";
        String mensagem = "teste";
        boolean ehFormatoHtml = false;


        servico.enviaEmail(enderecoDeEmail, mensagem, ehFormatoHtml);

        Mockito.verify(plataforma).enviaEmail(captor.capture());

        Email emailCapturado = captor.getValue();

        Assertions.assertEquals(enderecoDeEmail, emailCapturado.getEnderecoEmail());
        Assertions.assertEquals(mensagem, emailCapturado.getMensagem());

    }

}

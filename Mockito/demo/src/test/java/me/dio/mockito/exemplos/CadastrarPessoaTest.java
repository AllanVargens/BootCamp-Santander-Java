package me.dio.mockito.exemplos;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mockito.exemplos.ApiDosCorreios;
import com.mockito.exemplos.CadastrarPessoa;
import com.mockito.exemplos.DadosLocalizacao;
import com.mockito.exemplos.Pessoa;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro() {
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Patos de Minas", "Rua 2" , "casa", "bairro de minas");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("123123124")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Allan", "12312312", LocalDate.now(), "123123124");


        assertEquals("Allan", pessoa.getNome());
        assertEquals("12312312", pessoa.getDocumento());
        assertEquals("MG", pessoa.getEndereco().getUf());
        assertEquals("casa", pessoa.getEndereco().getComplemento());

    }
}

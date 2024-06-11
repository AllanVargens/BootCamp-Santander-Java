import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.BancoDeDados;
import com.example.Pessoa;

public class ConsultarDadosDePessoasTest {

    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
        System.out.println("rodou configuraConexao");
    }

    @BeforeEach
    static void insereDadosParaTeste() {
        BancoDeDados.inserirDados(new Pessoa("Joao", LocalDate.of(2000, 1, 13)));
    }

    @AfterEach
    static void removeDadosDoTeste() {
        BancoDeDados.removeDados(new Pessoa("Joao", LocalDate.of(2000, 1, 13)));
    } 

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizaConexao() {
        BancoDeDados.finalizarConexao();
        System.out.println("rodou finalizaConexao");
    }
}

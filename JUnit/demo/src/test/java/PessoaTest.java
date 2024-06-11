import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.Pessoa;

public class PessoaTest {
    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa allan = new Pessoa("Allan", LocalDate.of(2000, 1, 15));
        Assertions.assertEquals(24, allan.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa allan = new Pessoa("Allan", LocalDate.of(2000, 1, 15));
        Assertions.assertTrue(allan.ehMaiorDeIdade());
    }
}

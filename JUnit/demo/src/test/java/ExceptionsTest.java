import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.Conta;
import com.example.TransferenciaEntreContas;

public class ExceptionsTest {
    @Test
    void validaCenarioDeExcecaoNaTrasferencia() {
        Conta contaOrigem = new Conta("1234", 0);
        Conta contaDestino = new Conta("23124", 1);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> transferenciaEntreContas.trasfere(contaOrigem, contaDestino, -1));

    }
}

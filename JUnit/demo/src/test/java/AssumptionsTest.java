import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {
    @Test
    void ValidarAlgoSomenteNoUserAllan() {
        Assumptions.assumeTrue("root".equals(System.getenv("ALLAN")));
        Assertions.assertEquals(10, 5 + 5);
    }
}

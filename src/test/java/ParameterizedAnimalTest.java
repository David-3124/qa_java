import com.example.Feline;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedAnimalTest {

    Feline feline = new Feline();

    @ParameterizedTest
    @ValueSource(ints = {27, 20, 1, 5, 10})
    public void getKittensRandomCountFeline(int kittensCount) {
        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }

}

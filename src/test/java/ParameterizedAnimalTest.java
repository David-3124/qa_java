import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedAnimalTest {

    Feline feline = new Feline();

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 10, 100, -1})
    public void getKittensRandomCountFeline(int kittensCount) {
        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }

    @ParameterizedTest
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    void lionHasManeGender(String sex, boolean expected) throws Exception {
        Lion lion = new Lion(new Feline(), sex);
        assertEquals(expected, lion.doesHaveMane());
    }

}

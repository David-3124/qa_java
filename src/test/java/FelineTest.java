import com.example.Feline;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FelineTest {

    private final Feline feline = new Feline();

    @Test
    void eatMeat_shouldReturnPredatorFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());
    }

    @Test
    void getFamily_shouldReturnCats() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    void getKittens_withoutArgs_shouldReturnOne() {
        assertEquals(1, feline.getKittens());
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 5, 10})
    void getKittens_withArg_shouldReturnSameNumber(int kittensCount) {
        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }

    @Test
    void getFood_forHerbivore_shouldReturnPlants() throws Exception {
        List<String> expected = List.of("Трава", "Различные растения");
        assertEquals(expected, feline.getFood("Травоядное"));
    }

    @Test
    void getFood_forUnknownKind_shouldThrowException() {
        Exception exception = assertThrows(Exception.class,
                () -> feline.getFood("Насекомоядное"));
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник",
                exception.getMessage());
    }
}

import com.example.Feline;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void eatMeatPredator() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyCat() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensCount() {
        assertEquals(1, feline.getKittens());
    }
}

import com.example.LionAlex;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlexTest {

    @Test
    public void genderMaleAlex () throws Exception {
        LionAlex lionAlex = new LionAlex();

        assertTrue(lionAlex.doesHaveMane());
    }

    @Test
    public void noLionCubs() throws Exception{
        LionAlex lionAlex = new LionAlex();

        assertEquals(0, lionAlex.getKittens());
    }

    @Test
    void getFoodShouldReturnPredatorFood() throws Exception {
        LionAlex lionAlex = new LionAlex();

        assertEquals(List.of("Животные", "Птицы", "Рыба"), lionAlex.getFood());
    }

    @Test
    void getFriendsShouldReturnCorrectList() throws Exception {
        LionAlex lionAlex = new LionAlex();

        assertEquals(List.of("Марти", "Глория", "Мелман"), lionAlex.getFriends());
    }

    @Test
    void getPlaceOfResidence() throws Exception {
        LionAlex lionAlex = new LionAlex();
        assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }
}

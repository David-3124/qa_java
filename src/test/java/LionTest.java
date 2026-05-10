import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void LionGetFood() throws Exception {
        Lion lion = new Lion(feline, "Самец");

        when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
        verify(feline).getFood("Хищник");
    }

    @Test
    public void doesHaveManeFalse() throws Exception {
        Lion lion = new Lion(feline, "Самка");

        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void genderMaleLion () throws Exception {
        Lion lion = new Lion(new Feline(), "Самец");

        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void genderFemaleLion () throws Exception {
        Lion lion = new Lion(new Feline(), "Самка");

        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void unknownGenderLion () throws Exception {
        assertThrows(Exception.class, () -> new Lion(new Feline(),"Львицы"));
    }

    @Test
    public void getKittensFeline() throws Exception {
        Lion lion = new Lion(feline, "Самец");

        when(feline.getKittens()).thenReturn(5);
        assertEquals(5, lion.getKittens());
    }
}

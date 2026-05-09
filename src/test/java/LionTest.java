import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void LionGetFood() throws Exception {
        Lion lion = new Lion(feline);

        when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
        verify(feline).getFood("Хищник");
    }

    @Test
    public void doesHaveManeFalse(){
        Lion lion = new Lion(feline);

        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void genderMaleLion () throws Exception {
        Lion lion = new Lion("Самец");

        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void genderFemaleLion () throws Exception {
        Lion lion = new Lion("Самка");

        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void unknownGenderLion () throws Exception {
        assertThrows(Exception.class, () -> new Lion("Львицы"));
    }

    @Test
    public void getKittensFeline() {
        Lion lion = new Lion(feline);

        when(feline.getKittens()).thenReturn(5);
        assertEquals(5, lion.getKittens());
    }

}

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentServiceTest {

    @Test
    public void testSum() {
        StudentService service = new StudentService();
        int result = service.sum(2, 3);

        assertEquals(5, result);
    }

    @Test
    public void testIsAdultTrue() {
        StudentService service = new StudentService();
        boolean result = service.isAdult(20);

        assertTrue(result);
    }

    @Test
    public void testIsAdultFalse() {
        StudentService service = new StudentService();
        boolean result = service.isAdult(15);

        assertFalse(result);
    }
}
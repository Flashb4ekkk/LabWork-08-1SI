import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testCount() {
        assertEquals(2, Main.count("OGOAGA"));
    }

    @Test
    public void testReplaceOGOandAGA() {
        assertEquals("**", Main.replaceOGOandAGA("OGO"));
    }
}

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RunTest {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before class");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After class");
    }

    @Test
    public void Test1() {
        System.out.println("1");
        //AssertEquals ();

    }
    @Test
    public void Test2 () {
        System.out.println("2");
    }
}

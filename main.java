import org.junit.*;

public class main {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }

    @Test
    public void Test1() {
        System.out.println("1");
        //assert.equals("111", "112");

    }
    @Test
    public void Test2 () {
        System.out.println("2");
    }
}

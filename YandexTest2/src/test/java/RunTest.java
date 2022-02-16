import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class RunTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("before");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("after");
    }

    @Test
    public void test1() {
        Assertions.assertEquals("111", "111");
        System.out.println("Тест 1 пройден");
    }

    @Test
    public void test2() {
        open("https://demoqa.com/automation-practice-form");
        System.out.println("Сайт открыт. Тест 2 пройден");
    }
}

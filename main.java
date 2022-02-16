// import org.junit.*;

import org.apache.logging.log4j.core.util.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class main {
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

    @AfterClass
    public void afterClass() {
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

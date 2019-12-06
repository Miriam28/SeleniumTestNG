package cybertek.tests.d12_review;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NullTest {

    String string;

    @BeforeMethod
    public void setupMethod() {

        string = "AAA";
    }


    @Test
    public void test() {
        System.out.println(string.toLowerCase());
    }


}

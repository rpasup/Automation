import org.testng.annotations.Test;

public class SecondTest {

    @Test
    public void setup(){
        System.out.println("simple print statements");
    }
    @Test
    public void login(){
        System.out.println("login happen");
    }
    @Test
    public void teardown(){
        System.out.println("tear down done");
    }

}

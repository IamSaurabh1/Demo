import com.microsoft.demo.Demo;
import org.junit.Test;

public class MyTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        d.DoSomething(true);
    }

     @Test
     public void test_method_2() {
         Demo d2 = new Demo();
         d2.DoSomething(false);
     }

     @Test
     public void test_method_3() {
         Demo d3 = new Demo();
         d3.DoSomething(false);
     }
}

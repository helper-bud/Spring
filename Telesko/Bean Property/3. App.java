import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args )
    {
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("spring.xml");

        Tyre t  = (Tyre) applicationContext.getBean("tyre");
        System.out.println(t); // output : Tyre{brand='MRF'}
    }
}

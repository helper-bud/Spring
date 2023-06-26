import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args )
    {
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("spring.xml");
        Vehicle obj = (Vehicle) applicationContext.getBean("bike"); // in case of annotation based component, we just have to mention the file
        obj.drive();
    }
}

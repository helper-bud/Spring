
import org.springframework.stereotype.Component;


@Component // this annotation will give the access to use the class, but mention it in the spring.xml. and then use it. 
public class Doctor  implements  Staff{
    public  void assist(){
        System.out.println("doctor here");
    }
}

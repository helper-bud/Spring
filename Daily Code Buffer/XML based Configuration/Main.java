import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void  main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Staff staff = context.getBean(Doctor.class);
        staff.assist();

        Doctor doctor = context.getBean(Doctor.class);
        System.out.println(doctor.getQualification()); // tis is an example of how qualification class is called thorough the property .

        System.out.println(Doctor.getQualification_1()); // this is an example of how the costructor can be used from the spring.xml

    }
}

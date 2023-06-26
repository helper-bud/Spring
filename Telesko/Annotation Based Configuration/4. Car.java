import org.springframework.stereotype.Component;

@Component // when we use annotation based component , then we dont have to use it in the xml file.
public class Car implements Vehicle {
    public void drive() {
        System.out.println("Chal raha hay..");
    }
}

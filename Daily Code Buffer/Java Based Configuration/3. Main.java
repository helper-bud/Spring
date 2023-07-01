public class Main {

    public static void  main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanCofiguration.class);
        Doctor staff = context.getBean(Doctor.class);
        staff.assist(); // OUTPUT: doctor here


    }
}

package Demo;

public class Doctor  implements  Staff{

    private String qualification;
    public static   String qualification_1;
    private Nurse nurse;/* the code for spring, is added in the spring.xml for bean uses*/


    public Doctor(String qualification_1) { // we need to add it in the bean folder for accessing it.
        this.qualification_1 = qualification_1;
    }
  

    public static String getQualification_1() {
        return qualification_1;
    }

    public static void setQualification_1(String qualification_1) {
        Doctor.qualification_1 = qualification_1;
    }

  
  
    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

  

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }


  
    public  void assist(){
        System.out.println("doctor here");
    }
}

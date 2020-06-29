package PHPTRAVELS;

public class Java_Demo {
    public static void main(String[] args) {
        Java_practice student_Obj = new Java_practice();
        student_Obj.name = "Edil";
        student_Obj.age = 32;

        System.out.println("name :"+student_Obj);
        System.out.println("age :"+student_Obj);
        /*
        * Accessing the static veriable TechLeadCode.
        */
        System.out.println("TechLeadCode :"+Java_practice.TechLeadCode);
        int salary = student_Obj.getJobSalary();
        System.out.println("salary :"+salary);
    }
}

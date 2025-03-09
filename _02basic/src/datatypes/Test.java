package datatypes;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.name ="Prince";
        student.standard = 3;
        student.address ="Patna";
        student.rollNumber =88;
        System.out.println(student);

        Student student1 = new Student();
        student1.name = "Raj";
        student1.address ="Bihar";
        System.out.println(student1);
    }
}

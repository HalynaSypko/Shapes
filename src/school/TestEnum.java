
public class TestEnum {

    public static void main(String[] args) {

        Teacher teacher = new Teacher(28, "Tomas");
        System.out.print("Teacher ");
        System.out.print("Name:" + teacher.getName1() + "; ");
        System.out.print("Age:" + teacher.getAge() + "; ");
        System.out.println("Subject:" + Subject.getSubject("math") + "; ");

        Student student = new Student(16, "Jenifer");
        System.out.print("Student ");
        System.out.print("Name:" + student.getName1() + "; ");
        System.out.print("Age:" + student.getAge() + "; ");
        System.out.print("Subject:" + Subject.getSubject("astronomy") + "; ");

    }

}

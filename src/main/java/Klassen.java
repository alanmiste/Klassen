import model.ComputerScienceStudent;
import model.Student;
import model.StudentDB;

public class Klassen {
    public static void main(String[] args) {

        Student firstStudent = new Student(1,"Albert","Einstein",143);
        Student secoundStudent = new Student(2,"Albert","Einstein",143);

        System.out.println(secoundStudent.toString());
        System.out.println(secoundStudent.equals(firstStudent));

        StudentDB dbTest = new StudentDB();

        //print students array
        for (int i=0; i<dbTest.getAllStudents().length; i++)
            //for (int j=0; j<dbTest.getAllStudents().length; j++)
                System.out.println(dbTest.getAllStudents()[i]);

        //print all students as string via Override toString
        System.out.println("All students as string: ");
        System.out.println(dbTest.toString());

        //print a random student
        System.out.println("This is a random student: "+dbTest.randomStudent());

        ComputerScienceStudent csStudent = new ComputerScienceStudent(3,"Charlie", "Chaplin",133,"Java");
        System.out.println(csStudent);
    }

}

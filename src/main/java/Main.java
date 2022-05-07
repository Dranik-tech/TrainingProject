import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        ArrayList<Student> students = manager.createStudents();

        manager.sortingByFaculty(students,"FTK");
        manager.sortingByFacultyAndCourse(students,"FTK",(byte)5);
        manager.sortingByDate(students,1990);
        manager.sortingByGroup(students,"114415");
    }
}

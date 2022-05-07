import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class StudentManager {

    public ArrayList<Student> createStudents(){
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Anatolevich", "Andrey", "Korol", new GregorianCalendar(1987,8,20), "Aviatsionnaya 13", "12", "FTK", (byte)5, "114515"));
        students.add(new Student(2, "Aleksandrovna", "Yuliya", "Korol", new GregorianCalendar(1991,2,18), "Aviatsionnaya 13", "21", "FTK",(byte)5, "114515"));
        students.add(new Student(3, "Sergeevich", "Dmitriy", "Lavrenyuk", new GregorianCalendar(1993,9,23), "Serebryanka 5", "23", "SF",(byte)3, "123"));
        students.add(new Student(4, "Petrovna", "Tatyana", "Petrova", new GregorianCalendar(1980, 10,30), "Uruchye 3", "32", "SF",(byte)2, "123"));
        students.add(new Student(5, "Andreevna", "Anna", "Korol", new GregorianCalendar(2022,1,15), "Aviatsionnaya 13", "34", "FTK",(byte)1, "114415"));
        students.add(new Student(6, "Viktorovich", "Yuriy", "Viktorenko", new GregorianCalendar(1993,3,3), "Zapad 8", "43", "AF",(byte)3, "23"));
        students.add(new Student(7, "Egorovich", "Egor", "Egorov", new GregorianCalendar(1990,4,4), "Malinovka 6", "56", "AF",(byte)2, "32"));
        students.add(new Student(8, "Alekseevna", "Tonya", "Zaytseva", new GregorianCalendar(1995,5,5), "Loshiza 99", "65", "ATF",(byte)5, "67"));
        students.add(new Student(9, "Vladimirivich", "Vladimir", "Putinko", new GregorianCalendar(1905,4,21), "Bomj", "67", "ATF",(byte)4, "76"));
        students.add(new Student(10, "Konstantinovna", "Elena", "Zhmih", new GregorianCalendar(1905,4,21), "Pipkina 13", "76", "SF",(byte)3, "1234"));

        return students;
    }

    public void sortingByFaculty(ArrayList<Student> students, String faculty){
        ArrayList<Student> sortedList = new ArrayList<>();

        for(Student student : students){
            if(student.getFaculty().equals(faculty)) sortedList.add(student);
        }

        for(Student student : sortedList) {
            System.out.println(student);
        }
    }

    public void sortingByFacultyAndCourse(ArrayList<Student> students, String faculty, byte course){
        ArrayList<Student> sortedList = new ArrayList<>();

        for(Student student : students){
            if(student.getFaculty().equals(faculty) && student.getCourse() == course) sortedList.add(student);
        }

        for(Student student : sortedList) {
            System.out.println(student);
        }
    }

    public void sortingByDate(ArrayList<Student> students, int year){
        if (year<1900) {
            System.out.println("Your student is already death");
            return;
        }

        ArrayList<Student> sortedList = new ArrayList<>();
        for(Student student : students){
            if (student.getDateOfBirth().get(Calendar.YEAR) > year) sortedList.add(student);
        }

        for(Student student : sortedList){
            System.out.println(student);
        }
    }

    public void sortingByGroup(ArrayList<Student> students,String group){
        ArrayList<Student> sortedList = new ArrayList<>();

        for(Student student : students){
            if(student.getGroupName().equals(group)) sortedList.add(student);
        }

        for (Student student : sortedList){
            System.out.println(student);
        }
    }
}

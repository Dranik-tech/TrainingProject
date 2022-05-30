import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        ArrayList<Student> students = manager.createStudents();
        CustomerManager managerCust = new CustomerManager();
        ArrayList<Customer> customers = managerCust.createCustomers();
        //managerCust.sortByLastName(customers);
        //managerCust.sortByCCPart(customers,"12");

        PatientManager managerPat = new PatientManager();
        ArrayList<Patient> patients = managerPat.createPatientBatch();;
        //managerPat.sortByRangeOfMedicalCardNumber(patients,11115,12300);

        AbiturientManager managerAbi = new AbiturientManager();
        ArrayList<Abiturient> abiturients = managerAbi.createAbiturients();
        //managerAbi.sortByBadGrades(abiturients,5);
        //managerAbi.sortByGradesSum(abiturients,80);
        //managerAbi.sortByMaxSumOfGrades(abiturients,2,80);

        BookManager bookManager = new BookManager();
        ArrayList<Book> books = bookManager.createBooksList();
        //bookManager.sortByAuthor(books,"Ганс Христиан Андерсен");
        //bookManager.sortByPublishingHouse(books,"Дрофа");
        //bookManager.sortByPublishingYear(books,1995);



        /*manager.sortingByFaculty(students,"FTK");
        manager.sortingByFacultyAndCourse(students,"FTK",(byte)5);
        manager.sortingByDate(students,1990);
        manager.sortingByGroup(students,"114415");*/
    }
}

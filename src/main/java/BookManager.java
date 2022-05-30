import java.util.ArrayList;

public class BookManager {
    public ArrayList<Book> createBooksList(){
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(1,"Красная шапочка","Ганс Христиан Андерсен","Дрофа",1990,100,100.5,"solid"));
        books.add(new Book(2,"1984","Джордж Оуруэл","Дрофа",1995,300,150.85,"solid"));
        books.add(new Book(3,"Каласы пад сярпом тваiм","Владимир Караткевич","Тик-так",1996,320,200.1,"soft"));
        books.add(new Book(4,"О дивный новый мир","Олдос Хаксли","Тик-так",1996,500,195.2,"soft"));

        return books;
    }

    public void sortByAuthor(ArrayList<Book> books, String author){
        ArrayList<Book> sortedBooks = new ArrayList<>();

        for(Book book : books){
            if(book.getAuthor().equals(author)) sortedBooks.add(book);
        }

        for(Book book : sortedBooks){
            System.out.println(book.toString());
        }
    }

    public void sortByPublishingYear(ArrayList<Book> books, int publishingYear){
        ArrayList<Book> sortedBooks = new ArrayList<>();

        for(Book book : books){
            if(book.getPublishingYear() > publishingYear) sortedBooks.add(book);
        }

        for(Book book : sortedBooks){
            System.out.println(book.toString());
        }
    }

    public void sortByPublishingHouse(ArrayList<Book> books, String publishingHouse){
        ArrayList<Book> sortedBooks = new ArrayList<>();

        for(Book book : books){
            if(book.getPublishingHouse().equals(publishingHouse)) sortedBooks.add(book);
        }

        for(Book book : sortedBooks){
            System.out.println(book.toString());
        }
    }
}

import java.util.Objects;

public class Book {
    private int id;
    private String bookName;
    private String author;
    private String publishingHouse;
    private int publishingYear;
    private int pageCount;
    private double price;
    private String bindingType;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
       return this.id;
    }

    public void setBookName(String bookName){
        this.bookName =  bookName;
    }

    public String getBookName(){
        return this.bookName;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public String getBindingType() {
        return bindingType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && publishingYear == book.publishingYear && pageCount == book.pageCount && Double.compare(book.price, price) == 0 && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author) && Objects.equals(publishingHouse, book.publishingHouse) && Objects.equals(bindingType, book.bindingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookName, author, publishingHouse, publishingYear, pageCount, price, bindingType);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", publishingYear=" + publishingYear +
                ", pageCount=" + pageCount +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }

    public Book(int id, String bookName, String author, String publishingHouse) {
        setId(id);
        setBookName(bookName);
        setAuthor(author);
        setPublishingHouse(publishingHouse);
    }

    public Book(int id, String bookName, String author, String publishingHouse, int publishingYear, int pageCount, double price, String bindingType) {
        setId(id);
        setBookName(bookName);
        setAuthor(author);
        setPublishingHouse(publishingHouse);
        setPublishingYear(publishingYear);
        setPageCount(pageCount);
        setPrice(price);
        setBindingType(bindingType);
    }
}


import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String name;
    private String author;
    private String binding;
    private String publishHouse;
    private int pages;
    private int year;
    private int price;


    public Book(int id, String name, String author, String binding, String publishHouse, int pages, int year, int price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.binding = binding;
        this.publishHouse = publishHouse;
        this.pages = pages;
        this.year = year;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getPublishHouse() {
        return publishHouse;
    }

    public void setPublishHouse(String publishHouse) {
        this.publishHouse = publishHouse;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", binding='" + binding + '\'' +
                ", publishHouse=" + publishHouse +
                ", pages='" + pages + '\'' +
                ", year='" + year + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

}
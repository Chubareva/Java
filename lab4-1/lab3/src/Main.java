/*Book: id, Название, Автор (ы), Издательство, Год издания, Количество страниц, Цена, Тип переплета.
Создать массив объектов. Вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.*/




import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book book1 = new Book(1234,"Alice in the wondrland", "Lewis", "soft","Macmillan",196, 1865 , 60);
        Book book2 = new Book(3421,"Piter Pen", "Barrie", "soft","Mahaon",200, 1902 , 40);
        Book book3 = new Book(5879,"The Great Gatsby", "Fitzgerald", "hard","Pinguin Classics",300, 1925 , 85);

        ArrayList<Book> books = new ArrayList();
        books.add(book1);
        books.add(book2);
        books.add(book3);


        System.out.print("Enter name of the author ");
        String enterAuthor = input.next();
        System.out.println(enterAuthor);
        for (int i=0; i<3; i++){
            if (books.get(i).getAuthor().equals(enterAuthor)){
                System.out.println("   " +books.get(i).getName());
            }
        }
        System.out.print("Enter name of the publish house");
        String enterpublishHouse = input.next();
        System.out.println(enterpublishHouse);
        for (int i=0; i<3; i++){
            if (books.get(i).getPublishHouse().equals(enterpublishHouse) ){
                System.out.println(books.get(i).getName());
            }
        }
        System.out.print("Enter year = ");
        int year = input.nextInt();
        for (int i=0; i<3; i++){
            if (books.get(i).getYear() > year){
                System.out.print(books.get(i));
            }
        }

    }
}

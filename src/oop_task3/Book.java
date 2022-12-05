package oop_task3;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Author author = new Author();
        Title title = new Title();
        Content content = new Content();

        System.out.println("Vvedit` nazvu knigi: ");
        author.setAuthor(sc.next());

        System.out.println("Vvedit` zagolovok knigi: ");
        title.setTitle(sc.next());

        System.out.println("Vvedite text knigi: ");
        content.setContent(sc.next());
        /*
        sc.nextLine у мене не запрацював , не зміг розібратись чому в метод записується null і пропускається
        content.setContent(sc.nextLine());
         */


        title.show();
        author.show();
        content.show();
    }
}
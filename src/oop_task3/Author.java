package oop_task3;

public class Author {
    public String author;

    //set
    public void setAuthor(String author) {
        this.author = author;
    }

    void show(){
        System.out.println("Author name: " + author);
    }
}
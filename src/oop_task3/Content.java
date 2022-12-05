package oop_task3;

public class Content {
    public String content;

    //set
    public void setContent(String content) {
        this.content = content;
    }

    void show(){
        System.out.println("Zmist knigi: " + content);
    }
}
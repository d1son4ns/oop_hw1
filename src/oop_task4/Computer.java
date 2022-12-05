package oop_task4;
public class Computer {

    public String [] Computers = new String[5];

    // get
    public String[] getComputers() {
        return Computers;
    }
    // set
    public void setComputers(String[] computers){
        this.Computers = computers;
    }
    String detail;

    public static void main(String[] args) {
        //array Computer
        Computer[] computer = new Computer[5];

        computer[0] = new Computer();
        computer[1] = new Computer();
        computer[2] = new Computer();
        computer[3] = new Computer();
        computer[4] = new Computer();

        // array заповнення текстом , (i+1)  - для вигляду , щоб нумерація виводилась з 1 , а не з нуля , не руйнуючи індекси масиву
        for (int i = 0; i < 5; i++) {
            computer[i].detail = "computer" + (i+1);
        }

        // Вывод в цикле for each
        for (Computer comp : computer) {
            System.out.println("array computer: " + comp.detail);
        }
    }
}
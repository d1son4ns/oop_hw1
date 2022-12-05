// завдання 2
package oop_task2;

import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        /*
        змінна для перевірки правильності вводу двох сторін (будь-яка сторона > 0)
        до моменту коли дані введені правильно , змінна = false , а коли правильно - true
         */
        boolean bool = false;

        while (!bool) {
            Scanner sc = new Scanner(System.in);
            // створення
            Rectangle rec = new Rectangle();

            System.out.print("Vvedite 1 storonu pryamougolnika:");
            double side1 = sc.nextDouble();
            System.out.print("\nVvedite 2 storonu pryamougolnika:");
            double side2 = sc.nextDouble();

            // перевірка правильності введення данних
            if ((side1>0)&&(side2>0)) {
                bool = true;
                System.out.println("\nVi vveli vse virno , resultati obchislen`:");

                // застосування методів
                rec.areaCalculator(side1,side2);
                rec.perimeterCalculator(side1,side2);

                // вивід результатів окремим методом
                rec.Result();
            }
            else {
                System.out.println("Vi vveli nekorektni znachenya, sprobuyte znovu:");
                // bool залишається false бо ми не потрапляємо у if
            }
        }
    }
    // створення полів класу
    public double area,perimeter;

    // створення методів
    public double areaCalculator(double side1, double side2) {
        area = (side1 * side2);
        return area;
    }
    public double perimeterCalculator (double side1, double side2) {
        perimeter = 2*(side1+side2);
        return perimeter;
    }
    // метод виводу результатів
    public void Result(){
        System.out.println("Perimeter : " + perimeter);
        System.out.println("Ploshcha : " + area);
    }
}

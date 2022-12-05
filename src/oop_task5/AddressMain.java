package oop_task5;

public class AddressMain {
    public static void main(String[] args) {

        Address adr = new Address();
        System.out.println();

        adr.setIndex(90909);
        adr.twoMethodsStreet("Baker str.");
        adr.setCountry("United Kindom");
        adr.twoMethodsCity("London");
        adr.twoMethodsHouse(221);
        adr.twoMethodsApartament("b");

        adr.seeAddres();
    }
}

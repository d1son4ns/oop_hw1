package oop_task5;

public class Address {
    int index;
    String country;
    String city;
    String street;
    int house;
    String apartment;

    // get + set
    public void setIndex(int index){
        this.index = index;
    }

    public int getIndex(){
        return index;
    }


    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return country;
    }

    //Шилдт- Java-Полное руководство-10-изд , використання іншого методу подвійгого назначення
    public String twoMethodsCity(String city){
        this.city = city;
        return city;
    }
    public String twoMethodsStreet(String street){
        this.street = street;
        return street;
    }
    public int twoMethodsHouse(int house){
        this.house = house;
        return house;
    }
    public String twoMethodsApartament(String apartment){
        this.apartment = apartment;
        return apartment;
    }

    public void seeAddres(){
        System.out.println("Index: "+index);
        System.out.println("Country: "+country);
        System.out.println("City: "+city);
        System.out.println("Street: "+street);
        System.out.println("House: "+house);
        System.out.println("Appartment: "+apartment);
    }
}


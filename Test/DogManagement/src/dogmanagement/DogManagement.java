package dogmanagement;

import data.Dog;

public class DogManagement {

    public static void main(String[] args) {
        Dog chi = new Dog("chi",1,0);
        chi.bark();
        chi.setYob(23);
        System.out.println(chi.toString());
    }
}

package org.launchcode.java.demos.lsn1datatypes;

public class HelloMethods {

    public static void main(String[] args) {
        //String message = Message.getMessage("gm");
        //System.out.println(message);

        Animal animal = new Animal("1234");
        printAge(animal);

        Cat cat = new Cat("5678");
        printAge(cat);
    }

    public static class Animal {
        private String DOB;

        public Animal(String DOB) {
            this.DOB = DOB;
        }



        public String getAge() {
            return DOB;
        }
    }

    public static class Cat extends Animal {

        public Cat(String DOB) {
            super(DOB);
        }

        public void meow() {
            System.out.println("Meow");
        }
    }

    public static void printAge(Animal a) {
        System.out.println("Age: " + a.getAge());
    }
}

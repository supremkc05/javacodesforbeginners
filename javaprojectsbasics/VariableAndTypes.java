package javaprojectsbasics;

import java.util.Date;

public class VariableAndTypes {
    public static void main(String[] args) {
//        byte age = 30;
//        int phone = 1234567890;
//        long phone2 = 123456789000L; // long type ko value add gareako bela L lagauna parxa
//        float pi = 3.14F; // float type ko value add gareako bela F lagauna parxa
//        char letter = 'A'; // char type ko value single quote ma rakhinxa
//        boolean isAdult = true; // boolean type ko value true or false matra hunxa
// non-primitive types (reference types)
    String name = "supreme";//non primitive ma chai aafno nai type ko value assign garna milxa
        String neighbour = "surya";
        byte age = 25;
        Date now = new Date(); //new operater use gareako chai memory allocate garna lai
        System.out.println(now);
        System.out.println(neighbour.toUpperCase());
        System.out.println(name.length());
    }
}
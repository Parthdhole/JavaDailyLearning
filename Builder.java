package com.DesignPatterns;

public class Builder {
    public static void main(String[] args) {

        Phone phone = new Phone.PhoneBuilder()
                .setPname("Samsung")
                .setPrice(45000)
                .setProcessor("Snapdragon")
                .build();

        System.out.println(phone);
    }
}
/*Builder Pattern is used when an object has many optional parameters
 and we want flexible, readable, and controlled object creation without constructor overloads.
 */
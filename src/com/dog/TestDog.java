package com.dog;

public class TestDog {
    public static void main(String[] args){
    Dog d1 = new Dog("Mike", 2);
    Dog d2 = new Dog("Joe", 7);
    Dog d3 = new Dog("Pirson");
    //d1.setAge(2);
    //d2.setAge(7);
    d3.setAge(1);
    System.out.println(d1);
    d1.intoHumanAge();
    d2.intoHumanAge();
    d3.intoHumanAge();
    }
}

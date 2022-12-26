package com.design.pattern.Creational;

public class SingletonDesign {
    //create an object of SingleObject
    private static final SingletonDesign instance = new SingletonDesign();

    //make the constructor private so that this class cannot be
    //instantiated
    private SingletonDesign(){}

    //Get the only object available
    public static SingletonDesign getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
class SingletonPatternDemo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingletonDesign object = SingletonDesign.getInstance();

        //show the message
        object.showMessage();
    }
}

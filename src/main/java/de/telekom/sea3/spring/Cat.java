package de.telekom.sea3.spring;

public class Cat {
    String name;
    public Cat(){
        System.out.println("Cat is created"+toString());
    }
    public Cat (String name){
        this.name=name;
        System.out.println("Cat"+ name + "created"+ toString());
    }
}

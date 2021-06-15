package de.telekom.sea3.spring;
import org.springframework.context.annotation.*;

public class WebServerConfig {
    public Cat cat(){
        System.out.println("Hi");

        return new Cat ("Mau");
    }
}

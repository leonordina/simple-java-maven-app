package com.mycompany.app;

import java.time.LocalTime;

public class App {

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

    public String getGreeting(String fullName) {
        return "Hello " + fullName + "!";
    }

    public String getGreetingOnTime(String fullName) {
        String morningGreet = "morning ";
        String nightGreet = "night ";

        if (LocalTime.now().isBefore(LocalTime.NOON)) {
            return "Good " + morningGreet + fullName;
        } else {
            return "Good" + nightGreet + fullName;
        }
    }
}

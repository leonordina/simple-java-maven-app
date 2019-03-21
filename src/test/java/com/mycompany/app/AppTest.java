package com.mycompany.app;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAppConstructor() {
        App app = new App();
        Assertions.assertThat(app).as("App constructor may not fail").isNotNull();
    }

    @Test
    public void testAppMain() {
        App.main(null);
        Assertions.assertThat(outContent.toString()).as("Message is incorrect").contains("Hello World!");
    }

    @Test
    public void testAppGreeting() {
        App app = new App();
        Assertions.assertThat(app.getGreeting("Jack Sparrow")).as("Geeting is incorrect").isEqualTo("Hello Jack Sparrow!");
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}

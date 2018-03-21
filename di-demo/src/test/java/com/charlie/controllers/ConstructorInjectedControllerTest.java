package com.charlie.controllers;

import com.charlie.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());

    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS,this.constructorInjectedController.sayHello());
    }

    @Test
    public void testWithBla() throws Exception {
        assertNotEquals("sayHello method should return " + GreetingServiceImpl.HELLO_GURUS,"bla",this.constructorInjectedController.sayHello());
    }
}

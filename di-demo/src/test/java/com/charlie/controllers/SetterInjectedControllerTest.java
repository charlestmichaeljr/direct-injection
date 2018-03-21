package com.charlie.controllers;

import com.charlie.services.GreetingService;
import com.charlie.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testSetterInjectedController() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS,this.setterInjectedController.sayHello());
    }
}

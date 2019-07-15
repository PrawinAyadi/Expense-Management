package com.example.prabin.expencessmanagement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddCategoryTest {

    private Tab1 tab1;

    @Before
    public void setup() {
        tab1 = new Tab1();
    }

    @Test
    public void addCategoryTest() {
        String expectedResult = "Test category successfully added";

        String actualResult = tab1.addCategory("Test category");
        assertEquals(expectedResult, actualResult);

    }

    @After
    public void teaDown() {
        tab1 = null;
    }

}

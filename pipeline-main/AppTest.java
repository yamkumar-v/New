package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testGradeA() {
        App app = new App();
        assertEquals("A", app.calculateGrade(95));
    }

    @Test
    public void testGradeB() {
        App app = new App();
        assertEquals("B", app.calculateGrade(80));
    }

    @Test
    public void testGradeC() {
        App app = new App();
        assertEquals("C", app.calculateGrade(65));
    }

    @Test
    public void testGradeD() {
        App app = new App();
        assertEquals("D", app.calculateGrade(55));
    }

    @Test
    public void testGradeF() {
        App app = new App();
        assertEquals("F", app.calculateGrade(30));
    }
}

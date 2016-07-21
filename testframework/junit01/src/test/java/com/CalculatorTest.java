package com;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testadd() {
        System.out.println("---testing here---");
        Assert.assertEquals(new Calculator().add(5,6), 11);
    }

    @Test
    public void testsubtract() {
        System.out.println("---testing here---");
        Assert.assertEquals(new Calculator().subtract(6,6), 0);
    }

    @Test
    public void testmultiply() {
        System.out.println("---testing here---");
        Assert.assertEquals(new Calculator().multiply(5,6), 30);
    }

    @Test
    public void testdivide() {
        System.out.println("---testing here---");
        Assert.assertEquals(new Calculator().divide(30,6), 5);
    }


}

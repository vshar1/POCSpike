package com;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({CalculatorTest.class, DateUtilTest.class})
public class TestSuite {

    @BeforeClass
    public static void setupClass() {
        System.out.println("----------------SETTING UP -------");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("----------------TEARING DOWN ---------");
    }

}
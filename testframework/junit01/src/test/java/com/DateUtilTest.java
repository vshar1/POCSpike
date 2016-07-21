package com;

import org.junit.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class DateUtilTest {

    @Test
    public void testgetMonth() throws ParseException {
        System.out.println("---testing here---");
        String string = "December 20, 2010";
        DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        Date date = format.parse(string);

        DateUtil dateUtil = new DateUtil();
        Assert.assertEquals(dateUtil.getMonth(date), 2211);
    }

    @Test
    public void testgetDay() throws ParseException {
        System.out.println("---testing here---");
        String string = "December 20, 2010";
        DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        Date date = format.parse(string);

        DateUtil dateUtil = new DateUtil();
        Assert.assertEquals(dateUtil.getDate(date), 20);
    }

}

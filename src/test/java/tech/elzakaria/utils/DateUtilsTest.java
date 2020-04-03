package tech.elzakaria.utils;

import org.junit.Test;

import java.text.ParseException;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.*;

public class DateUtilsTest {

    @Test
    public void getDateFromString() {
        try {
            Date dateFromString = DateUtils.getDateFromString("2020-03-28");
            //not null
            assertNotNull(dateFromString);
            assertEquals(dateFromString.getTime(), 1585350000000L);
        } catch (ParseException e) {
            //nope, on passe pase
            fail();
        }
    }
}
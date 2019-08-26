package pl.rengreen.fizzbuzzwithtests;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class FizzBuzzTest extends FizzBuzz {
    private FizzBuzz fizzBuzz = new FizzBuzz();
    private Map<Integer, String> replacements = new HashMap<>();

    @Test
    public void getReplacedList_NumbersFrom8To10ShouldGive8AndFizzAndBuzz() {
        {
            replacements.put(3, "Fizz");
            replacements.put(5, "Buzz");
        }

        List<String> expectedList = Arrays.asList("8", "Fizz", "Buzz");

        assertEquals(expectedList, fizzBuzz.getReplacedList(8, 10, replacements));
    }

    @Test
    public void getReplacedList_15ShouldGiveFizzBuzz() {
        {
            replacements.put(3, "Fizz");
            replacements.put(5, "Buzz");
        }

        List<String> expectedList = Collections.singletonList("FizzBuzz");

        assertEquals(expectedList, fizzBuzz.getReplacedList(15, 15, replacements));
    }

    @Test
    public void getReplacedList_NumbersFrom1To100000ShouldGiveListOfSize100000() {
        {
            replacements.put(3, "Fizz");
            replacements.put(5, "Buzz");
        }

        assertEquals(100000, fizzBuzz.getReplacedList(1, 100000, replacements).size());
    }

    @Test
    public void replaceNumber_3And600And90000ShouldGiveFizz() {
        {
            replacements.put(3, "Fizz");
            replacements.put(5, "Buzz");
        }
        assertEquals("Fizz", fizzBuzz.replaceNumber(3, replacements));
        assertEquals("Fizz", fizzBuzz.replaceNumber(603, replacements));
        assertEquals("Fizz", fizzBuzz.replaceNumber(90003, replacements));
    }

    @Test
    public void replaceNumber_5And500And100000ShouldGiveBuzz() {
        {
            replacements.put(3, "Fizz");
            replacements.put(5, "Buzz");
        }
        assertEquals("Buzz", fizzBuzz.replaceNumber(5, replacements));
        assertEquals("Buzz", fizzBuzz.replaceNumber(500, replacements));
        assertEquals("Buzz", fizzBuzz.replaceNumber(100000, replacements));
    }

    @Test
    public void replaceNumber_15And2250And150000ShouldGiveBuzz() {
        {
            replacements.put(3, "Fizz");
            replacements.put(5, "Buzz");
        }
        assertEquals("FizzBuzz", fizzBuzz.replaceNumber(15, replacements));
        assertEquals("FizzBuzz", fizzBuzz.replaceNumber(2250, replacements));
        assertEquals("FizzBuzz", fizzBuzz.replaceNumber(150000, replacements));
    }

    @Test
    public void replaceNumber_11And901And150001ShouldGiveBuzz() {
        {
            replacements.put(3, "Fizz");
            replacements.put(5, "Buzz");
        }
        assertEquals("", fizzBuzz.replaceNumber(11, replacements));
        assertEquals("", fizzBuzz.replaceNumber(901, replacements));
        assertEquals("", fizzBuzz.replaceNumber(150001, replacements));
    }
}
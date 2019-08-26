package pl.rengreen.fizzbuzzwithtests;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //input
        int minNumber = 1;
        int maxNumber = 100;

        //any number of replacements is possible
        //it works best if selected numbers are not divisors or multiples of other selected numbers
        Map<Integer, String> replacements = new HashMap<>();
        replacements.put(3, "Fizz");
        replacements.put(5, "Buzz");

        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> replacedList = fizzBuzz.getReplacedList(minNumber, maxNumber, replacements);

        replacedList.forEach(System.out::println);
    }
}

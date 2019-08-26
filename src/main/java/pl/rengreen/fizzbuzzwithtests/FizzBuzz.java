package pl.rengreen.fizzbuzzwithtests;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class FizzBuzz {

    List<String> getReplacedList(int minNumber, int maxNumber, Map<Integer, String> replacements) {
        List<String> results = new ArrayList<>();

        for (int i = minNumber; i <= maxNumber; i++) {
            String textToPrint = replaceNumber(i, replacements);

            if (textToPrint.equals("")) {
                textToPrint += i;
            }
            results.add(textToPrint);
        }
        return results;
    }

    String replaceNumber(int i, Map<Integer, String> replacements) {
        StringBuilder text = new StringBuilder();
        for (int number : replacements.keySet()) {
            if (i % number == 0) {
                text.append(replacements.get(number));
            }
        }
        return text.toString();
    }
}

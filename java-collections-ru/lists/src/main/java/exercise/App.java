package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {

    public static boolean scrabble(String first, String second) {
        boolean result;
        var counter = 0;
        var one = first.toLowerCase().toCharArray();
        var two = second.toLowerCase().toCharArray();
        for (var i = 0; i < one.length;) {
            for (var j = 0; j < two.length; j++) {
                if (one[i] == two[j]) {
                    counter++;
                    break;
                }
            }
            i++;
        }
        if (counter == two.length) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
//END

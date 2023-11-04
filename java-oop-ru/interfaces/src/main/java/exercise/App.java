package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// BEGIN
public class App {

    List<Home> apartments = new ArrayList<>(List.of(
            new Flat(41, 3, 10),
            new Cottage(125.5, 2),
            new Flat(80, 10, 2),
            new Cottage(150, 3)
    ));

    public static List<String> buildApartmentsList(List<Home> apartments, int count) {
        List<String> list = apartments.stream()
                .sorted(Home::compareTo)
                .limit(count)
                .map(Home::toString)
                .toList();
        return list;
    }

}
// END

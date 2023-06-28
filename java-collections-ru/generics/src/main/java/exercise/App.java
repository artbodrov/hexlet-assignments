package exercise;

import java.util.*;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {

        List<Map<String, String>> list = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            
            if(books.get(i).values().containsAll(where.values())){
                list.add(books.get(i));
            }

        }
        return list;
    }
}
//END

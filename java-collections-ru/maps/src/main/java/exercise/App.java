package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        String[] subStr;
        String delimeter = " ";
        subStr = sentence.split(delimeter);

        for (int i = 0; i < subStr.length; i++) {
            int counter = 0;
            for (int j = 0; j < subStr.length; j++) {
                if (subStr[j].equals(subStr[i])) {
                    counter++;
                }
            }
            map.put(subStr[i], counter);
        }
        return map;
    }

    public static String toString(Map<String, Integer> map) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\n");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            stringBuilder.append("  "+entry.getKey()+": "+entry.getValue()+"\n");

        }
        stringBuilder.append("}");
        String s = String.valueOf(stringBuilder);

        return s;

    }
}
//END

package lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TopWords {
    public static void main(String[] args) {
        String fileName = "text.txt";
        File file = new File(fileName);

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        }
        Map<String, Integer> map = new HashMap<String, Integer>();
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }
            else {
                map.put(word, 1);
            }
        }
        scanner.close();

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (int i = 0; i <= 10; i ++) {
            if (i < list.size()) {
                Map.Entry<String, Integer> entry = list.get(i);
                System.out.println(i + 1 + " место: слово " + entry.getKey() + " встречается " + entry.getValue() + " раз(а).");
            }
        }
    }
}

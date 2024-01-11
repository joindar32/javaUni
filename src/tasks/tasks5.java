package tasks;

import java.util.*;

public class tasks5 {
    public static void main(String[] args) {
        //1.	Создайте функцию, которая возвращает true, если две строки имеют один и тот же буквенный шаблон,
        //      и false в противном случае.

        System.out.printf("Task41\nsameLetterPattern(\"ABAB\", \"CDCD\") -> %s\n", sameLetterPattern("ABAB", "CDCD"));
        System.out.printf("sameLetterPattern(\"ABCBA\", \"BCDCB\") -> %s\n", sameLetterPattern("ABCBA", "BCDCB"));
        System.out.printf("sameLetterPattern(\"FFGG\", \"CDCD\") -> %s\n", sameLetterPattern("FFGG", "CDCD"));
        System.out.printf("sameLetterPattern(\"FFFF\", \"ABCD\") -> %s\n", sameLetterPattern("FFFF", "ABCD"));

        //2.	Паутина определяется кольцами, пронумерованными от 0 до 4 от центра,
        //      и радиалами, помеченными по часовой стрелке сверху как A-H.

        System.out.printf("\nTask42\nspiderVsFly(\"H3\", \"E2\") -> %s\n", spiderVsFly("H3", "E2"));
        System.out.printf("spiderVsFly(\"A4\", \"B2\") -> %s\n", spiderVsFly("A4", "B2"));
        System.out.printf("spiderVsFly(\"A4\", \"C2\") -> %s\n", spiderVsFly("A4", "C2"));

        //3.	Создайте функцию, которая будет рекурсивно подсчитывать количество цифр числа.
        //      Преобразование числа в строку не допускается, поэтому подход является рекурсивным.

        System.out.printf("\nTask43\ndigitsCount(4666) -> %d\n", digitsCount(4666));
        System.out.printf("digitsCount(544) -> %d\n", digitsCount(544));
        System.out.printf("digitsCount(121317) -> %d\n", digitsCount(121317));
        System.out.printf("digitsCount(0) -> %d\n", digitsCount(0));
        System.out.printf("digitsCount(12345) -> %d\n", digitsCount(12345));
        System.out.printf("digitsCount(1289396387328L) -> %d\n", digitsCount(1289396387328L));

        //4.	Игроки пытаются набрать очки, формируя слова, используя буквы из 6-буквенного скремблированного слова.
        //      Они выигрывают раунд, если им удается успешно расшифровать слово из 6 букв.

        System.out.printf("\nTask44\ntotalPoints([\"cat\", \"create\", \"sat\"], \"caster\") -> %s\n",
                totalPoints(new String[]{"cat", "create", "sat"}, "caster"));
        System.out.printf("totalPoints([\"trance\", \"recant\"], \"recant\") -> %s\n",
                totalPoints(new String[]{"trance", "recant"}, "recant"));
        System.out.printf("totalPoints([\"dote\", \"dotes\", \"toes\", \"set\", \"dot\", \"dots\", \"sted\"], \"tossed\")  -> %s\n",
                totalPoints(new String[]{"dote", "dotes", "toes", "set", "dot", "dots", "sted"}, "tossed"));

        //5.	Создайте функцию, которая получает каждую пару чисел из массива, который суммирует до восьми,
        //      и возвращает его как массив пар (отсортированный по возрастанию).

        System.out.printf("\nTask45\nsumsUp([1, 2, 3, 4, 5]) -> %s\n", Arrays.deepToString(sumsUp(new int[]{1, 2, 3, 4, 5})));
        System.out.printf("sumsUp([1, 2, 3, 7, 9]) -> %s\n", Arrays.deepToString(sumsUp(new int[]{1, 2, 3, 7, 9})));
        System.out.printf("sumsUp([10, 9, 7, 2, 8]) -> %s\n", Arrays.deepToString(sumsUp(new int[]{10, 9, 7, 2, 8})));
        System.out.printf("sumsUp([1, 6, 5, 4, 8, 2, 3, 7]) -> %s\n", Arrays.deepToString(sumsUp(new int[]{1, 6, 5, 4, 8, 2, 3, 7})));

        //6.	Какой процент вы можете набрать на тесте, который в одиночку снижает средний балл по классу на 5%?
        //      Учитывая массив оценок ваших одноклассников, создайте функцию, которая возвращает ответ.
        //      Округлите до ближайшего процента.

        System.out.printf("\nTask46\ntakeDownAverage([\"95%%\", \"83%%\", \"90%%\", \"87%%\", \"88%%\", \"93%%\"]) -> %s\n",
                takeDownAverage(new String[]{"95%", "83%", "90%", "87%", "88%", "93%"}));
        System.out.printf("takeDownAverage([\"10%%\"]) -> %s\n", takeDownAverage(new String[]{"10%"}));
        System.out.printf("takeDownAverage([\"53%%\", \"79%%\"]) -> %s\n", takeDownAverage(new String[]{"53%", "79%"}));

        //7.	Создайте функцию, которая будет шифровать и дешифровать сообщения с использованием шифра Цезаря.
        //      Шифр Цезаря – это метод шифрования, в котором каждая буква в сообщении сдвигается
        //      на фиксированное количество позиций в алфавите.

        System.out.printf("\nTask47\ncaesarCipher(\"encode\", \"hello world\", 3) -> %s\n", caesarCipher("encode", "hello world", 3));
        System.out.printf("caesarCipher([\"decode\", \"almost last task!\", 4]) -> %s\n", caesarCipher("decode", "almost last task!", 4));

        //8.	Создайте метод для рекурсивного вычисления количества различных способов как можно разместить
        //      k элементов из множества из n элементов без повторений.

        System.out.printf("\nTask48\nsetSetup(5, 3) -> %s\n", setSetup(5, 3));
        System.out.printf("setSetup(7, 3) -> %s\n", setSetup(7, 3));

        //9.	В этой задаче цель состоит в том, чтобы вычислить, сколько времени сейчас в двух разных городах.

        System.out.printf("\nTask49\ntimeDifference(\"Los Angeles\", \"April 1, 2011 23:23\", \"Canberra\") -> %s\n",
                timeDifference("Los Angeles", "April 1, 2011 23:23", "Canberra"));
        System.out.printf("timeDifference(\"London\", \"July 31, 1983 23:01\", \"Rome\") -> %s\n",
                timeDifference("London", "July 31, 1983 23:01", "Rome"));
        System.out.printf("timeDifference(\"New York\", \"December 31, 1970 13:40\", \"Beijing\") -> %s\n",
                timeDifference("New York", "December 31, 1970 13:40", "Beijing"));

        //10.   Напишите функцию, которая принимает неотрицательное целое число и возвращает true,
        //      если целое число является новым числом, и false, если это не так.

        System.out.printf("\nTask50\nisNew(3) -> %s\n", isNew(3));
        System.out.printf("isNew(30) -> %s\n", isNew(30));
        System.out.printf("isNew(321) -> %s\n", isNew(321));
        System.out.printf("isNew(123) -> %s\n", isNew(123));
    }
    public static boolean sameLetterPattern(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] pattern1 = new int[str1.length()];
        int[] pattern2 = new int[str2.length()];

        for (int i = 0; i < str1.length(); i++) {
            pattern1[i] = str1.indexOf(str1.charAt(i));
            pattern2[i] = str2.indexOf(str2.charAt(i));
        }

        for (int i = 0; i < str1.length(); i++) {
            if (pattern1[i] != pattern2[i]) {
                return false;
            }
        }

        return true;
    }

    static String spiderVsFly(String spider, String fly) {
        String path = "";
        double L = 2 * Math.sin(Math.toRadians(22.5));

        int spiderRing = Character.getNumericValue(spider.charAt(1));
        int flyRing = Character.getNumericValue(fly.charAt(1));

        char spiderRad = spider.charAt(0);
        char flyRad = fly.charAt(0);
        int diffRing = Math.abs(spiderRing - flyRing);
        int diffRad = Math.abs(spiderRad - flyRad) % 8;

        if (spiderRad == flyRad) {
            while (spiderRing != flyRing) {
                path = path + spiderRad + spiderRing + '-';
                if (spiderRing > flyRing) spiderRing -= 1;
                else spiderRing += 1;
            }
            path = path + spiderRad + spiderRing;
            return path;
        }

        if ((flyRing * L * diffRad + diffRing) > (spiderRing + flyRing)) {
            while (spiderRing > 0) {
                path = path + spiderRad + spiderRing + '-';
                spiderRing--;
            }
            while (spiderRing < flyRing) {
                spiderRad = flyRad;
                if (spiderRing == 0) spiderRad = 'A';
                path = path + spiderRad + spiderRing + '-';
                spiderRing++;
            }
            path = path + spiderRad + spiderRing;
            return path;
        }

        int tempSpiderRad = spiderRad;
        int tempLen = 0;

        while (tempSpiderRad != flyRad) {
            if ((char) (tempSpiderRad - 1) > 'A') {
                tempSpiderRad--;
            } else {
                tempSpiderRad = 'H';
            }
            tempLen += 1;
        }

        if (spiderRing > flyRing)
        {
            while (spiderRing != flyRing) {
                path = path + spiderRad + spiderRing + '-';
                spiderRing -= 1;
            }
            path = path + spiderRad + spiderRing + '-';
            if (diffRad == tempLen){
                while (spiderRad != flyRad) {
                    if ((char) (spiderRad - 1) > 'A') {
                        spiderRad--;
                    } else {
                        spiderRad = 'H';
                    }
                    if (spiderRad != flyRad) {
                        path = path + spiderRad + spiderRing + '-';
                    } else {
                        path = path + spiderRad + spiderRing;
                    }
                }
            }
            else {
                while (spiderRad != flyRad) {
                    if ((char) (spiderRad + 1) < 'H') {
                        spiderRad++;
                    } else {
                        spiderRad = 'A';
                    }
                    if (spiderRad != flyRad) {
                        path = path + spiderRad + spiderRing + '-';
                    } else {
                        path = path + spiderRad + spiderRing;
                    }

                }
            }
        }
        if (spiderRing < flyRing) {
            path = path + spiderRad + spiderRing + '-';
            if (diffRad == tempLen){
                while (spiderRad != flyRad) {
                    if ((char) (spiderRad - 1) > 'A') {
                        spiderRad--;
                    } else {
                        spiderRad = 'H';
                    }
                    if (spiderRad != flyRad) {
                        path = path + spiderRad + spiderRing + '-';
                    }
                }
            }
            else {
                while (spiderRad != flyRad) {
                    if ((char) (spiderRad + 1) < 'H') {
                        spiderRad++;
                    } else {
                        spiderRad = 'A';
                    }
                    if (spiderRad != flyRad) {
                        path = path + spiderRad + spiderRing + '-';
                    }
                }
            }
            while (spiderRing != flyRing) {
                path = path + spiderRad + spiderRing + '-';
                spiderRing += 1;
            }
            path = path + spiderRad + spiderRing;
        }
        return path;
    }

    public static int digitsCount(long n) {
        if (n > -10 && n < 10) {
            return 1;
        }
        else {
            return digitsCount(n / 10) + 1;
        }
    }

    public static int totalPoints(String[] guessedWords, String decryptedWord) {
        int totalPoints = 0;

        for (String word : guessedWords) {
            boolean isValid = true;
            char[] wordChars = word.toCharArray();
            String temp = decryptedWord;

            for (char c : wordChars) {

                if (!temp.contains(String.valueOf(c))) {
                    isValid = false;
                }
                else {
                    temp = temp.replace(c, '$');
                }
            }

            if (isValid) {
                if (word.length() == 3) totalPoints += 1;
                if (word.length() == 4) totalPoints += 2;
                if (word.length() == 5) totalPoints += 3;
                if (word.length() == 6) totalPoints += 4;
                if (word.length() == decryptedWord.length()) totalPoints += 50;
            }
        }

        return totalPoints;
    }

    public static int[][] sumsUp(int[] arr) {
        List<List<Integer>> pairs = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                count += 1;
                if (arr[i] + arr[j] == 8) {
                    List<Integer> pairWCount = new ArrayList<>();
                    pairWCount.add(count);
                    pairWCount.add(Math.min(arr[i], arr[j]));
                    pairWCount.add(Math.max(arr[i], arr[j]));
                    pairs.add(pairWCount);
                }
            }
        }

        pairs.sort(Comparator.comparing(l -> l.get(0)));

        List<List<Integer>> res = new ArrayList<>();
        for (List<Integer> pair : pairs) {
            List<Integer> pairWOCount = new ArrayList<>();
            pairWOCount.add(pair.get(1));
            pairWOCount.add(pair.get(2));
            res.add(pairWOCount);
        }

        return res.stream()
                .map(subList -> subList.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
    }

    public static String takeDownAverage(String[] arr) {
        int n = arr.length;
        int sum = 0;

        for (String i : arr) {
            sum += Integer.parseInt(i.substring(0, i.length() - 1));
        }

        float avg = (float) sum / n;
        float targetSum = (avg - 5) * (n + 1);
        int targetScore = Math.round(targetSum - sum);

        return targetScore + "%";
    }

    public static String caesarCipher(String mode, String str, int key) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        str = str.toUpperCase();
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            if (alphabet.contains(String.valueOf(str.charAt(i)))) {
                int charPos = alphabet.indexOf(str.charAt(i));
                int newKey = 0;
                if (mode.equals("encode")) {
                    newKey = (key + charPos) % 26;
                }
                else if (mode.equals("decode")) {
                    newKey = (charPos - key) % 26;
                    if (newKey < 0) newKey += 26;
                }
                res += alphabet.charAt(newKey);
            }
            else res += str.charAt(i);
        }

        return res;
    }

    static int setSetup(int n, int k) {
        if (k == 0) return 1;
        else return n * setSetup(n - 1, k - 1);
    }

    public static String timeDifference(String cityA, String timestamp, String cityB) {
        timestamp = timestamp.replace(",", "").replace(':', ' ');

        int cityAGMTHours = 0, cityBGMTHours = 0;
        int cityAGMTMinutes = 0, cityBGMTMinutes = 0;

        switch (cityA) {
            case "Los Angeles" -> cityAGMTHours = -8;
            case "New York" -> cityAGMTHours = -5;
            case "Caracas" -> {
                cityAGMTHours = -4;
                cityAGMTMinutes = -30;
            }
            case "Buenos Aires" -> cityAGMTHours = -3;
            case "London" -> { }
            case "Rome" -> cityAGMTHours = 1;
            case "Moscow" -> cityAGMTHours = 3;
            case "Tehran" -> {
                cityAGMTHours = 3;
                cityAGMTMinutes = 30;
            }
            case "New Delhi" -> {
                cityAGMTHours = 5;
                cityAGMTMinutes = 30;
            }
            case "Beijing" -> cityAGMTHours = 8;
            case "Canberra" -> cityAGMTHours = 10;
        }

        switch (cityB) {
            case "Los Angeles" -> cityBGMTHours = -8;
            case "New York" -> cityBGMTHours = -5;
            case "Caracas" -> {
                cityBGMTHours = -4;
                cityBGMTMinutes = -30;
            }
            case "Buenos Aires" -> cityBGMTHours = -3;
            case "London" -> { }
            case "Rome" -> cityBGMTHours = 1;
            case "Moscow" -> cityBGMTHours = 3;
            case "Tehran" -> {
                cityBGMTHours = 3;
                cityBGMTMinutes = 30;
            }
            case "New Delhi" -> {
                cityBGMTHours = 5;
                cityBGMTMinutes = 30;
            }
            case "Beijing" -> cityBGMTHours = 8;
            case "Canberra" -> cityBGMTHours = 10;
        }

        int hoursAdd = 0, daysAdd = 0, monthAdd = 0, yearAdd = 0, maxDate = 0;
        String[] timestampArr = timestamp.split(" ");

        int minutes = Integer.parseInt(timestampArr[4]);
        minutes -= cityAGMTMinutes;
        minutes += cityBGMTMinutes;
        if (minutes % 60 >= 0) hoursAdd += minutes / 60;
        minutes %= 60;

        int hours = Integer.parseInt(timestampArr[3]);
        hours -= cityAGMTHours;
        hours += cityBGMTHours;
        hours += hoursAdd;
        if (hours % 24 >= 0) daysAdd += hours / 24;
        hours %= 24;

        boolean isLeap = false;
        int year = Integer.parseInt(timestampArr[2]);
        if (year % 4 == 0) isLeap = true;

        int month = 0;
        switch (timestampArr[0]) {
            case "January" -> {
                month = 1;
                maxDate = 31;
            }
            case "February" -> {
                month = 2;
                if (isLeap) maxDate = 29;
                else maxDate = 28;
            }
            case "March" -> {
                month = 3;
                maxDate = 31;
            }
            case "April" -> {
                month = 4;
                maxDate = 30;
            }
            case "May" -> {
                month = 5;
                maxDate = 31;
            }
            case "June" -> {
                month = 6;
                maxDate = 30;
            }
            case "July" -> {
                month = 7;
                maxDate = 31;
            }
            case "August" -> {
                month = 8;
                maxDate = 31;
            }
            case "September" -> {
                month = 9;
                maxDate = 30;
            }
            case "October" -> {
                month = 10;
                maxDate = 31;
            }
            case "November" -> {
                month = 11;
                maxDate = 30;
            }
            case "December" -> {
                month = 12;
                maxDate = 31;
            }
        }

        int date = Integer.parseInt(timestampArr[1]);
        date += daysAdd;
        if (date % maxDate >= 0) monthAdd += date / maxDate;
        date %= maxDate;
        if (date == 0) date = 1;

        month += monthAdd;
        if (month % 12 >= 0) yearAdd += month / 12;
        month %= 12;
        if (month == 0) month = 1;

        year += yearAdd;

        String hoursStr = "";
        if (hours < 10) hoursStr = "0" + hours;
        else hoursStr = String.valueOf(hours);

        String minutesStr = "";
        if (minutes < 10) minutesStr = "0" + minutes;
        else minutesStr = String.valueOf(minutes);

        return year + "-" + month + "-" + date + " " + hoursStr + ":" + minutesStr;
    }

    public static boolean isNew(int n) {
        String strN = Integer.toString(n);
        char[] arr = (strN).toCharArray();
        Arrays.sort(arr);

        if (arr[0] == '0') {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != '0') {
                    arr[0] = arr[i];
                    arr[i] = '0';
                    break;
                }
            }
        }

        return Integer.parseInt(new String(arr)) == n;
    }
}

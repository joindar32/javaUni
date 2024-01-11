package tasks;

import java.util.*;

public class tasks6 {
    public static void main(String[] args) {
        //
        //1.	Напишите функцию, чтобы найти анаграмму второй строки, вложенную где-то в первую строку
        //

        System.out.printf("Task51\nhiddenAnagram([\"My world evolves in a beautiful space called Tesh.\", " +
                "\"sworn love lived\"]) -> %s\n", hiddenAnagram("My world evolves in a beautiful space called Tesh.",
                "sworn love lived"));
        System.out.printf("hiddenAnagram(\"An old west action hero actor\", \"Clint Eastwood\") -> %s\n",
                hiddenAnagram("An old west action hero actor", "Clint Eastwood"));
        System.out.printf("hiddenAnagram(\"Mr. Mojo Rising could be a song title\", \"Jim Morrison\") -> %s\n",
                hiddenAnagram("Mr. Mojo Rising could be a song title", "Jim Morrison"));
        System.out.printf("hiddenAnagram(\"Banana? margaritas\", \"ANAGRAM\") -> %s\n",
                hiddenAnagram("Banana? margaritas", "ANAGRAM"));
        System.out.printf("hiddenAnagram(\"D  e b90it->?$ (c)a r...d,,#~\", \"bad credit\") -> %s\n",
                hiddenAnagram("D  e b90it->?$ (c)a r...d,,#~", "bad credit"));
        System.out.printf("hiddenAnagram(\"Bright is the moon\", \"Bongo mirth\") -> %s\n",
                hiddenAnagram("Bright is the moon", "Bongo mirth"));

        //
        //2.	Напишите функцию, которая возвращает массив строк, заполненных из срезов символов n-длины данного слова
        //

        System.out.printf("\nTask52\ncollect(\"intercontinentalisationalism\", 6) -> %s\n",
                Arrays.deepToString(collect("intercontinentalisationalism", 6)));
        System.out.printf("collect(\"strengths\", 3) -> %s\n",
                Arrays.deepToString(collect("strengths", 3)));
        System.out.printf("collect(\"pneumonoultramicroscopicsilicovolcanoconiosis\", 15) -> %s\n",
                Arrays.deepToString(collect("pneumonoultramicroscopicsilicovolcanoconiosis", 15)));

        //
        //3.	Создайте функцию, которая принимает два аргумента, message и key, и возвращает сообщение в шифре Nico.
        //

        System.out.printf("\nTask53\nnicoCipher(\"myworldevolvesinhers\", \"tesh\") -> %s\n",
                nicoCipher("myworldevolvesinhers", "tesh"));
        System.out.printf("nicoCipher(\"andiloveherso\", \"tesha\") -> %s\n",
                nicoCipher("andiloveherso", "tesha"));
        System.out.printf("nicoCipher(\"mubashirhassan\", \"crazy\") -> %s\n",
                nicoCipher("mubashirhassan", "crazy"));
        System.out.printf("nicoCipher(\"edabitisamazing\", \"matt\") -> %s\n",
                nicoCipher("edabitisamazing", "matt"));
        System.out.printf("nicoCipher(\"iloveher\", \"612345\") -> %s\n",
                nicoCipher("iloveher", "612345"));

        //
        //4.	Создайте метод, который принимает массив arr и число n и возвращает
        //      массив из двух целых чисел из arr, произведение которых равно числу n
        //

        System.out.printf("\nTask54\ntwoProduct([1, 2, 3, 9, 4, 5, 15], 45) -> %s\n",
                Arrays.toString(twoProduct(new int[] {1, 2, 3, 9, 4, 5, 15}, 45)));
        System.out.printf("twoProduct([1, 2, 3, 9, 4, 15, 3, 5], 45) -> %s\n",
                Arrays.toString(twoProduct(new int[] {1, 2, 3, 9, 4, 15, 3, 5}, 45)));
        System.out.printf("twoProduct([1,  2, -1,  4,  5,  6,  10, 7], 20) -> %s\n",
                Arrays.toString(twoProduct(new int[] {1,  2, -1,  4,  5,  6,  10, 7}, 20)));
        System.out.printf("twoProduct([1, 2, 3, 4, 5,  6, 7, 8, 9, 10], 10) -> %s\n",
                Arrays.toString(twoProduct(new int[] {1, 2, 3, 4, 5,  6, 7, 8, 9, 10}, 10)));
        System.out.printf("twoProduct([100, 12, 4, 1, 2], 15) -> %s\n",
                Arrays.toString(twoProduct(new int[] {100, 12, 4, 1, 2}, 15)));

        //
        //5.	Создайте рекурсивную функцию, которая проверяет, является ли число точной верхней границей факториала n.
        //

        System.out.printf("\nTask55\nisExact(6) -> %s\n", Arrays.toString(isExact(6)));
        System.out.printf("isExact(24) -> %s\n", Arrays.toString(isExact(24)));
        System.out.printf("isExact(125) -> %s\n", Arrays.toString(isExact(125)));
        System.out.printf("isExact(720) -> %s\n", Arrays.toString(isExact(720)));
        System.out.printf("isExact(1024) -> %s\n", Arrays.toString(isExact(1024)));
        System.out.printf("isExact(40320) -> %s\n", Arrays.toString(isExact(40320)));

        //
        //6.	Создайте функцию, которая принимает десятичную дробь в строковой форме с повторяющейся частью
        //      в круглых скобках и возвращает эквивалентную дробь в строковой форме и в наименьших членах.
        //

        System.out.printf("\nTask56\nfractions(\"0.(6)\") -> %s\n", fractions("0.(6)"));
        System.out.printf("fractions(\"1.(1)\") -> %s\n", fractions("1.(1)"));
        System.out.printf("fractions(\"3.(142857)\") -> %s\n", fractions("3.(142857)"));
        System.out.printf("fractions(\"0.19(2367)\") -> %s\n", fractions("0.19(2367)"));
        System.out.printf("fractions(\"0.1097(3)\") -> %s\n", fractions("0.1097(3)"));

        //
        //7.	Преобразуйте строку в серию слов (или последовательности символов), разделенных одним пробелом,
        //      причем каждое слово имеет одинаковую длину, заданную первыми 15 цифрами десятичного представления числа Пи
        //

        System.out.printf("\nTask57\npilishString(\"33314444\") -> %s\n", pilishString("33314444"));
        System.out.printf("pilishString(\"TOP\") -> %s\n", pilishString("TOP"));
        System.out.printf("pilishString(\"X\") -> %s\n", pilishString("X"));
        System.out.printf("pilishString(\"\") -> %s\n", pilishString(""));

        //
        //8.	Создайте функцию, которая будет вычислять результат математических выражений, предоставленных в виде строки.
        //

        System.out.printf("\nTask58\ngenerateNonconsecutive(\"3 + 5 * (2 - 6)\") -> %s\n", generateNonconsecutive("3 + 5 * (2 - 6)"));
        System.out.printf("generateNonconsecutive(\"6 – 18 / (-1 + 4)\") -> %s\n", generateNonconsecutive("6 - 18 / (-1 + 4)"));

        //
        //9.	Шерлок считает строку действительной, если все символы строки встречаются одинаковое количество раз.
        //      Также допустимо, если он может удалить только 1 символ из 1 индекса в строке, а остальные символы будут
        //      встречаться одинаковое количество раз. Для данной строки str определите, действительна ли она.
        //      Если да, верните «ДА», в противном случае верните «НЕТ».
        //

        System.out.printf("\nTask59\nisValid(\"aabbcd\") -> %s\n", isValid("aabbcd"));
        System.out.printf("isValid(\"aabbccddeefghi\") -> %s\n", isValid("aabbccddeefghi"));
        System.out.printf("isValid(\"abcdefghhgfedecba\") -> %s\n", isValid("abcdefghhgfedecba"));

        //
        //10.	Создайте функцию, которая будет находить наибольшую общую подпоследовательность (LCS) для двух строк.
        //

        System.out.printf("\nTask60\nfindLCS(\"abcd\", \"bd\") -> %s\n", findLCS("abcd", "bd"));
        System.out.printf("findLCS(\"aggtab\", \"gxtxamb\") -> %s\n", findLCS("aggtab", "gxtxamb"));

    }

    public static String hiddenAnagram(String sentence, String anagram) {
        sentence = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();
        anagram = anagram.replaceAll("[^a-zA-Z]", "").toLowerCase();

        char[] anagramArr = anagram.toCharArray();
        Arrays.sort(anagramArr);

        for (int i = 0; i <= sentence.length() - anagram.length(); i++) {
            for (int j = i + anagram.length(); j <= sentence.length(); j++) {
                String substring = sentence.substring(i, j);
                char[] substringArray = substring.toCharArray();
                Arrays.sort(substringArray);

                if (Arrays.equals(anagramArr, substringArray)) {
                    return substring;
                }
            }
        }

        return "notfound";
    }

    public static String[] collect(String str, int n) {
        if (n > str.length()) {
            return new String[0];
        }

        if (n == str.length()) {
            return new String[]{str};
        }

        String[] res = collect(str.substring(n), n);
        res = Arrays.copyOf(res, res.length + 1);
        res[res.length - 1] = str.substring(0, n);

        Arrays.sort(res);
        return res;
    }

    public static String nicoCipher(String message, String key) {
        int[] alphabetIndexArr = new int[key.length()];

        try {
            int n = Integer.parseInt(message);
            String temp = Integer.toString(n);
            for (int i = 0; i < temp.length(); i++)
            {
                alphabetIndexArr[i] = temp.charAt(i);
            }
        } catch (Exception e) {
            for (int i = 0; i < key.length(); i++) {
                alphabetIndexArr[i] = key.charAt(i) - 'a' + 1;
            }

            int[] sortedAlphabetIndexArr = Arrays.copyOf(alphabetIndexArr, alphabetIndexArr.length);
            Arrays.sort(sortedAlphabetIndexArr);

            for (int i = 0; i < alphabetIndexArr.length; i++) {
                alphabetIndexArr[i] = findIndex(sortedAlphabetIndexArr, alphabetIndexArr[i]) + 1;
            }

            for (int i = 0; i < alphabetIndexArr.length - 1; i++) {
                if (alphabetIndexArr[i] == alphabetIndexArr[i + 1]) alphabetIndexArr[i + 1] += 1;
            }
        }

        String cipherMessage = "";

        for (int i = 0; i < (int) Math.ceil((double) message.length() / key.length()); i++) {
            if (message.length() - cipherMessage.length() < key.length()) {
                for (int k = 0; k <= (message.length() - cipherMessage.length()) % key.length(); k++) {
                    message += " ";
                }
            }

            String substring = message.substring(i * key.length(), (i + 1) * key.length());
            char[] substringArr = substring.toCharArray();
            char[] substringResultingArr = new char[substringArr.length];
            for (int j = 0; j < substringArr.length; j++) {
                substringResultingArr[alphabetIndexArr[j] - 1] = substringArr[j];
            }
            cipherMessage += String.valueOf(substringResultingArr);
        }

        return cipherMessage;
    }
    public static int findIndex(int[] arr, int t)
    {
        if (arr == null) {
            return -1;
        }

        int len = arr.length;
        int i = 0;

        while (i < len) {
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
    public static int[] twoProduct(int[] arr, int n) {
        List<List<Integer>> pairs = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                count += 1;
                if (arr[i] * arr[j] == n) {
                    List<Integer> pairWCount = new ArrayList<>();
                    pairWCount.add(count);
                    pairWCount.add(arr[i]);
                    pairWCount.add(arr[j]);
                    pairs.add(pairWCount);
                }
            }
        }

        pairs.sort(Comparator.comparing(l -> l.get(0)));

        try {
            int[] res = new int[2];
            res[0] = (pairs.get(0).get(1));
            res[1] = (pairs.get(0).get(2));
            return res;
        }
        catch (Exception e) {
            return new int[0];
        }
    }
    public static int[] isExact(int n) {
        int[] res = new int[2];

        res[0] = n;
        res[1] = isExactBacktrack(n, 1);

        if (res[1] != 0) {
            return res;
        }
        return new int[0];
    }
    public static int isExactBacktrack(double n, int i) {
        n = n / i;
        if (n == 1) {
            return i;
        }
        if (n < 1) {
            return 0;
        }
        i++;
        return isExactBacktrack(n, i);
    }
    public static String fractions(String str) {
        int startIndex = str.indexOf("(");
        int endIndex = str.indexOf(")");

        String nonRepeatingPart = str.substring(0, startIndex).replace(".", "");
        String nonRepeatingFractionalPart = str.substring(str.indexOf(".") + 1, startIndex);
        String repeatingPart = str.substring(startIndex + 1, endIndex);

        int denominator = Integer.parseInt("9".repeat(repeatingPart.length())  + "0".repeat(nonRepeatingFractionalPart.length()));
        int numerator = Integer.parseInt(nonRepeatingPart + repeatingPart) - Integer.parseInt(nonRepeatingPart);

        int gcd = findGCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        return numerator + "/" + denominator;
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
    public static String pilishString(String str) {
        if (str.isEmpty()) return "";

        int[] pi = new int[] {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9};
        String res = "";

        try {
            res += str.substring(0, pi[0]) + " ";
        } catch (Exception e) {
            for (int k = 0; k <= str.length() % pi[0]; k++) {
                str += str.charAt(str.length() - 1);
            }
            res += str.substring(0, pi[0]) + " ";
        }

        int resLen = 3;
        int piLen = 3;

        for (int i = 0; i < pi.length - 1; i++) {
            try {
                res += str.substring(resLen, resLen + pi[i + 1]) + " ";
                resLen += pi[i + 1];
                piLen += pi[i + 1];
                if (resLen >= str.length() && resLen == piLen) return res;
            }
            catch (Exception e) {
                for (int k = 0; k <= (str.length() - res.length()) % (resLen + pi[i + 1]); k++) {
                    str += str.charAt(str.length() - 1);
                }
            }
        }

        return res;
    }
    public static int generateNonconsecutive(String str) {
        str = str.replaceAll(" ", "");

        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        boolean operatorJustPushed = false;
        boolean negativeNum = false;

        try {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch == '-' && operatorJustPushed) {
                    negativeNum = true;
                    continue;
                }

                if (Character.isDigit(ch)) {
                    operatorJustPushed = false;
                    StringBuilder operand = new StringBuilder();

                    while (i < str.length() && Character.isDigit(str.charAt(i))) {
                        operand.append(str.charAt(i++));
                    }
                    i--;

                    int num = Integer.parseInt(operand.toString());
                    if (negativeNum) {
                        num *= -1;
                        negativeNum = false;
                    }
                    operandStack.push(num);
                } else if (ch == '(') {
                    operatorStack.push(ch);
                    operatorJustPushed = true;
                } else if (ch == ')') {
                    while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                        int result = applyOperator(operatorStack.pop(), operandStack.pop(), operandStack.pop());
                        operandStack.push(result);
                    }

                    if (!operatorStack.isEmpty() && operatorStack.peek() == '(') {
                        operatorStack.pop();
                    } else {
                        throw new IllegalArgumentException("Invalid expression");
                    }
                } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                    while (!operatorStack.isEmpty() && hasPrecedence(operatorStack.peek(), ch)) {
                        int result = applyOperator(operatorStack.pop(), operandStack.pop(), operandStack.pop());
                        operandStack.push(result);
                    }

                    operatorStack.push(ch);
                    operatorJustPushed = true;

                } else {
                    throw new IllegalArgumentException("Invalid character: " + ch);
                }
            }

            while (!operatorStack.isEmpty()) {
                int result = applyOperator(operatorStack.pop(), operandStack.pop(), operandStack.pop());
                operandStack.push(result);
            }

            return operandStack.pop();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Integer.MIN_VALUE;
        }
    }

    private static int applyOperator(char operator, int b, int a) {
        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                if (b == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                yield a / b;
            }
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }

    private static boolean hasPrecedence(char operator1, char operator2) {
        if (operator2 == '(' || operator2 == ')') {
            return false;
        }
        return (operator1 == '*' || operator1 == '/') && (operator2 == '+' || operator2 == '-');
    }
    public static String isValid(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Integer val = map.get(c);
            if (val != null) {
                map.put(c, val + 1);
            }
            else {
                map.put(c, 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list);

        int freq = list.get(0);
        int count = 0;
        boolean flag = true;

        for (Integer i : list) {
            if (i == freq) {
                count++;
            }
            else if (flag) {
                count++;
                flag = false;
            }
        }

        if (count == str.length() / freq) {
            return "YES";
        }
        return "NO";
    }
    public static String findLCS(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        System.out.println(Arrays.deepToString(dp));

        StringBuilder lcs = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                System.out.println(s1.charAt(i - 1));
                lcs.insert(0, s1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return lcs.toString();
    }
}

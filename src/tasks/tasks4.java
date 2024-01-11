package tasks;

import java.util.*;

public class tasks4
{
    public static void main(String[] args)
    {
        //1.	Напишите рекурсивную функцию, которая принимает строку и удаляет из неё повторяющиеся символы.
        // Функция должна вернуть строку, в которой каждый символ встречается только один раз.

        System.out.printf("Task 31\nnonRepeatable(\"abracadabra\") -> %s\n", nonRepeatable("abracadabra"));
        System.out.printf("nonRepeatable(\"paparazzi\") -> %s\n", nonRepeatable("paparazzi"));

        //2.	Напишите функцию, которая генерирует все возможные правильные комбинации пар скобок для заданного числа n.
        //

        System.out.printf("\nTask 32\ngenerateBrackets(1) -> %s\n", generateBrackets(1));
        System.out.printf("generateBrackets(2) -> %s\n", generateBrackets(2));
        System.out.printf("generateBrackets(3) -> %s\n", generateBrackets(3));

        //3.	Напишите функцию, которая генерирует все возможные бинарные комбинации длины n,
        // в которых не может быть соседствующих нулей или единиц.

        System.out.printf("\nTask 33\nbinarySystem(3) -> %s\n", binarySystem(3));
        System.out.printf("binarySystem(4) -> %s\n", binarySystem(4));

        //4.	Реализуйте функцию, которая принимает строку и возвращает длину самого длинного
        // последовательного ряда в этом массиве. Последовательный ряд – это список соседних элементов,
        // идущих подряд в алфавитном порядке, который может быть как увеличивающимся, так и уменьшающимся.

        System.out.printf("\nTask 34\nalphabeticRow(\"abcdjuwx\") -> %s\n", alphabeticRow("abcdjuwx"));
        System.out.printf("alphabeticRow(\"klmabzyxw\") -> %s\n", alphabeticRow("klmabzyxw"));

        //5.	Напишите функцию, которая принимает строку и подсчитывает количество идущих подряд символов,
        // заменяя соответствующим числом повторяющиеся символы. Отсортируйте строку по возрастанию длины буквенного паттерна.

        System.out.printf("\nTask 35\ncharsInARow(\"aaabbcdd\") -> %s\n", charsInARow("aaabbcdd"));
        System.out.printf("charsInARow(\"vvvvaajaaaaa\") -> %s\n", charsInARow("vvvvaajaaaaa"));

        //6.	Напишите функцию, принимающую положительное целое число в строковом формате,
        // не превышающее 1000, и возвращающую его целочисленное представление.

        System.out.printf("\nTask 36\nconvertToNum(\"eight\") -> %s\n", convertToNum("eight"));
        System.out.printf("convertToNum(\"five hundred sixty seven\") -> %s\n", convertToNum("five hundred sixty seven"));
        System.out.printf("convertToNum(\"thirty one\") -> %s\n", convertToNum("thirty one"));

        //7.	Напишите функцию, принимающую строку цифр, выполняющую поиск подстроки максимальной длины
        // с уникальными элементами. Если найдено несколько подстрок одинаковой длины, верните первую.

        System.out.printf("\nTask 37\nuniqueSubstring(\"123412324\") -> %s\n", uniqueSubstring("123412324"));
        System.out.printf("uniqueSubstring(\"111111111\") -> %s\n", uniqueSubstring("111111111"));
        System.out.printf("uniqueSubstring(\"77897898\") -> %s\n", uniqueSubstring("77897898"));

        //8.	Напишите функцию поисковик наименьшего матричного пути. На вход поступает двумерный массив,
        // размера n x n, ваша задача найти путь с минимальной суммой чисел, передвигаясь только вправо или вниз.

        System.out.printf("\nTask 38\nshortestWay(\n" +
                "[[1, 3, 1],\n" +
                " [1, 5, 1],\n" +
                " [4, 2, 1]]) -> %s\n", shortestWay(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
        System.out.printf("shortestWay(\n" +
                "[[2, 7, 3],\n" +
                " [1, 4, 8],\n" +
                " [4, 5, 9]]) -> %s\n", shortestWay(new int[][]{{2, 7, 3}, {1, 4, 8}, {4, 5, 9}}));

        //9.	Создайте функцию, принимающую строку, содержащую числа внутри слов.
        // Эти числа представляют расположение слова для новой строящейся строки.

        System.out.printf("\nTask 39\nnumericOrder(\"t3o the5m 1One all6 r4ule ri2ng\") -> %s\n",
                numericOrder("t3o the5m 1One all6 r4ule ri2ng"));
        System.out.printf("numericOrder(\"re6sponsibility Wit1h gr5eat power3 4comes g2reat\") -> %s\n",
                numericOrder("re6sponsibility Wit1h gr5eat power3 4comes g2reat"));

        //10.	Напишите функцию, принимающую два числа, которая делает второе число максимально возможным
        // за счет замены своих элементов элементами первого числа. Брать цифру можно только один раз.

        System.out.printf("\nTask 40\nswitchNums(519, 723) -> %s\n", switchNums(519, 723));
        System.out.printf("switchNums(491, 3912) -> %s\n", switchNums(491, 3912));
        System.out.printf("switchNums(6274, 71259) -> %s\n", switchNums(6274, 71259));
    }

    public static String nonRepeatable(String str)
    {
        String res = "";
        char[] arr = str.toCharArray();
        for (char c : arr)
        {
            if (!res.contains(String.valueOf(c)))
            {
                res += c;
            }
        }
        return res;
    }

    public static List<String> generateBrackets(int n)
    {
        List<String> res = new ArrayList<>();
        backtrackForBrackets(res, "", n, n);
        return res;
    }

    public static void backtrackForBrackets(List<String> res, String str, int openN, int closedN){
        if (openN == 0 && closedN == 0)
        {
            res.add(str);
        }
        if (openN > 0)
        {
            backtrackForBrackets(res, str + "(", openN - 1, closedN);
        }
        if (closedN > openN)
        {
            backtrackForBrackets(res, str + ")", openN, closedN - 1);
        }
    }

    public static List<String> binarySystem(int n)
    {
        List<String> res = new ArrayList<>();
        backtrackBinarySystem(n, "", res);
        return res;
    }

    public static void backtrackBinarySystem(int n, String str, List<String> list)
    {
        if (str.length() == n)
        {
            list.add(str);
            return;
        }
        if (!str.isEmpty())
        {
            if (str.charAt(str.length() - 1) != '0')
            {
                backtrackBinarySystem(n, str + "0", list);
            }
        }
        else
        {
            backtrackBinarySystem(n, str + "0", list);
        }
        backtrackBinarySystem(n, str + "1", list);
    }

    public static String alphabeticRow(String str)
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String alphabetReverse = "zyxwvutsrqponmlkjihgfedcba";
        String res = "";
        String temp = "";
        int max = 0;
        char[] arr = str.toCharArray();
        for (char c : arr)
        {
            temp += c;
            if (alphabet.contains(temp) || alphabetReverse.contains(temp))
            {
                if (temp.length() >= max)
                {
                    res = temp;
                    max = temp.length();
                }
            }
            else
            {
                temp = String.valueOf(c);
            }
        }
        return res;
    }

    public static String charsInARow(String str)
    {
        String res = "";
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++)
        {
            int count = 1;
            while (i + 1 < arr.length && arr[i] == arr[i + 1])
            {
                i++;
                count++;
            }
            res += (arr[i] + String.valueOf(count));
        }

        char[] resArr = res.toCharArray();
        char tempchar, tempint;
        for (int i = 0; i < resArr.length; i++)
        {
            for (int j = 0; j < resArr.length - 3; j += 2)
            {
                if (resArr[j + 1] > resArr[j + 3])
                {
                    tempchar = resArr[j];
                    tempint = resArr[j + 1];
                    resArr[j] = resArr[j + 2];
                    resArr[j + 1] = resArr[j + 3];
                    resArr[j + 2] = tempchar;
                    resArr[j + 3] = tempint;
                }
            }
        }

        String result = "";
        for (char c : resArr)
        {
            result += c;
        }
        return result;
    }
    public static int convertToNum(String str)
    {
        int result = 0;
        int finalResult = 0;

        str = str.toLowerCase().replaceAll(" and ", " ");
        String[] splitArr = str.split(" ");

        for(String s : splitArr)
        {
            if (s.equalsIgnoreCase("zero"))
            {
                result += 0;
            }
            else if (s.equalsIgnoreCase("one"))
            {
                result += 1;
            }
            else if (s.equalsIgnoreCase("two"))
            {
                result += 2;
            }
            else if (s.equalsIgnoreCase("three"))
            {
                result += 3;
            }
            else if (s.equalsIgnoreCase("four"))
            {
                result += 4;
            }
            else if (s.equalsIgnoreCase("five"))
            {
                result += 5;
            }
            else if (s.equalsIgnoreCase("six"))
            {
                result += 6;
            }
            else if (s.equalsIgnoreCase("seven"))
            {
                result += 7;
            }
            else if (s.equalsIgnoreCase("eight"))
            {
                result += 8;
            }
            else if (s.equalsIgnoreCase("nine"))
            {
                result += 9;
            }
            else if (s.equalsIgnoreCase("ten"))
            {
                result += 10;
            }
            else if (s.equalsIgnoreCase("eleven"))
            {
                result += 11;
            }
            else if (s.equalsIgnoreCase("twelve"))
            {
                result += 12;
            }
            else if (s.equalsIgnoreCase("thirteen"))
            {
                result += 13;
            }
            else if (s.equalsIgnoreCase("fourteen"))
            {
                result += 14;
            }
            else if (s.equalsIgnoreCase("fifteen"))
            {
                result += 15;
            }
            else if (s.equalsIgnoreCase("sixteen"))
            {
                result += 16;
            }
            else if (s.equalsIgnoreCase("seventeen"))
            {
                result += 17;
            }
            else if (s.equalsIgnoreCase("eighteen"))
            {
                result += 18;
            }
            else if (s.equalsIgnoreCase("nineteen"))
            {
                result += 19;
            }
            else if (s.equalsIgnoreCase("twenty"))
            {
                result += 20;
            }
            else if (s.equalsIgnoreCase("thirty"))
            {
                result += 30;
            }
            else if (s.equalsIgnoreCase("forty"))
            {
                result += 40;
            }
            else if (s.equalsIgnoreCase("fifty"))
            {
                result += 50;
            }
            else if (s.equalsIgnoreCase("sixty"))
            {
                result += 60;
            }
            else if (s.equalsIgnoreCase("seventy"))
            {
                result += 70;
            }
            else if (s.equalsIgnoreCase("eighty"))
            {
                result += 80;
            }
            else if (s.equalsIgnoreCase("ninety"))
            {
                result += 90;
            }
            else if (s.equalsIgnoreCase("hundred"))
            {
                result *= 100;
            }
            else if (s.equalsIgnoreCase("thousand"))
            {
                result *= 1000;
                finalResult += result;
                result = 0;
            }
        }
        return finalResult += result;
    }
    public static String uniqueSubstring(String str)
    {
        String temp = "", max = "";
        for (int i = 0; i < str.length(); i++)
        {
            if (!temp.contains(String.valueOf(str.charAt(i))))
            {
                temp += str.charAt(i);
                if (temp.length() > max.length())
                {
                    max = temp;
                }
            }
            else
            {
                temp = String.valueOf(str.charAt(i));
            }
        }
        return max;
    }
    public static int shortestWay(int[][] arr)
    {
        int[][] editedArr = arr.clone();
        for (int col = 1; col < arr.length; col++)
        {
            editedArr[0][col] = editedArr[0][col] + arr[0][col - 1];
        }
        for (int row = 1; row < arr[0].length; row++)
        {
            editedArr[row][0] = editedArr[row][0] + arr[row - 1][0];
        }
        for (int row = 1; row < arr[0].length; row++)
        {
            for (int col = 1; col < arr.length; col++)
            {
                editedArr[row][col] = arr[row][col] + Math.min(arr[row][col - 1], arr[row - 1][col]);
            }
        }
        return editedArr[editedArr.length - 1][editedArr[0].length - 1];
    }
    public static String numericOrder(String str)
    {
        String res = "";
        String[] arr = str.split(" ");
        for (int i = 0; i < 100; i++)
        {
            for (String word : arr)
            {
                String editedWord = "";
                for (int j = 0; j < word.length(); j++)
                {
                    if (!"0123456789".contains(String.valueOf(word.charAt(j))))
                    {
                        editedWord += word.charAt(j);
                    }
                }
                if (word.contains(String.valueOf(i)))
                {
                    res += editedWord + " ";
                }
            }
        }
        return res;
    }
    public static int switchNums(int n1, int n2)
    {
        String strN1 = Integer.toString(n1), strN2 = Integer.toString(n2);
        char[] arr1 = (strN1).toCharArray();
        char[] arr2 = (strN2).toCharArray();
        Arrays.sort(arr1);
        char[] arrRes = new char[strN2.length()];
        for (int i = 0; i < strN2.length(); i++)
        {
            for (int j = strN1.length() - 1; j >= 0; j--)
            {
                if (arr2[i] < arr1[j])
                {
                    arrRes[i] = arr1[j];
                    arr1[j] = 0;
                    break;
                }
                else
                {
                    arrRes[i] = arr2[i];
                }
            }
        }
        return Integer.parseInt(new String(arrRes));
    }
}

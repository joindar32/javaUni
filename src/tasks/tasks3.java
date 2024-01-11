package tasks;

import java.util.*;

public class tasks3
{
    public static void main(String[] args)
    {
        System.out.printf("Task 21\nEven if you did this task not by yourself, you have to understand every single line of code. -> %s\n",
                replaceVowels("Even if you did this task not by yourself, you have to understand every single line of code."));

        System.out.printf("\nTask 22\nhello -> %s\n", stringTransform("hello"));
        System.out.printf("bookkeeper -> %s\n", stringTransform("bookkeeper"));

        System.out.printf("\nTask 23\ndoesBlockFit(1, 3, 5, 4, 5) -> %s\n", doesBlockFit(1, 3, 5, 4, 5));
        System.out.printf("doesBlockFit(1, 8, 1, 1, 1) -> %s\n", doesBlockFit(1, 8, 1, 1, 1));
        System.out.printf("doesBlockFit(1, 2, 2, 1, 1) -> %s\n", doesBlockFit(1, 2, 2, 1, 1));

        System.out.printf("\nTask 24\nnumCheck(243) -> %s\n", numCheck(243));
        System.out.printf("numCheck(52) -> %s\n", numCheck(52));

        System.out.printf("\nTask 25\ncountRoots([1, -3, 2]) -> %s\n", countRoots(new int[]{1, -3, 2}));
        System.out.printf("countRoots([2, 5, 2]) -> %s\n", countRoots(new int[]{2, 5, 2}));
        System.out.printf("countRoots([1, -6, 9]) -> %s\n", countRoots(new int[]{1, -6, 9}));

        System.out.println("\nTask 26\nsalesData([\n" +
                "[\"Apple\", \"Shop1\", \"Shop2\", \"Shop3\", \"Shop4\"],\n" +
                "[\"Banana\", \"Shop2\", \"Shop3\", \"Shop4\"],\n" +
                "[\"Orange\", \"Shop1\", \"Shop3\", \"Shop4\"],\n" +
                "[\"Pear\", \"Shop2\", \"Shop4\"]]) -> " + Arrays.toString(salesData(new String[][]
                {{"Apple", "Shop1", "Shop2", "Shop3", "Shop4"}, {"Banana", "Shop2", "Shop3", "Shop4"},
                        {"Orange", "Shop1", "Shop3", "Shop4"},{"Pear", "Shop2", "Shop4"}})));

        System.out.println("salesData([\n" +
                "[\"Fridge\", \"Shop2\", \"Shop3\"],\n" +
                "[\"Microwave\", \"Shop1\", \"Shop2\", \"Shop3\", \"Shop4\"],\n" +
                "[\"Laptop\", \"Shop3\", \"Shop4\"],\n" +
                "[\"Phone\", \"Shop1\", \"Shop2\", \"Shop3\", \"Shop4\"]]) -> " + Arrays.toString(salesData(new String[][]
                {{"Fridge", "Shop2", "Shop3"}, {"Microwave", "Shop1", "Shop2", "Shop3", "Shop4"},
                        {"Laptop", "Shop3", "Shop4"}, {"Phone", "Shop1", "Shop2", "Shop3", "Shop4"}})));

        System.out.printf("\nTask 27\nvalidSplit(\"apple eagle egg goat t\") -> %s\n", validSplit("apple eagle egg goat t"));
        System.out.printf("validSplit(\"cat dog goose fish\") -> %s\n", validSplit("cat dog goose fish"));

        System.out.printf("\nTask 28\nwaveForm([3, 1, 4, 2, 7, 5]) -> %s\n", waveForm(new int[]{3, 1, 4, 2, 7, 5}));
        System.out.printf("waveForm([1, 2, 3, 4, 5]) -> %s\n", waveForm(new int[]{1, 2, 3, 4, 5}));
        System.out.printf("waveForm([1, 2, -6, 10, 3]) -> %s\n", waveForm(new int[]{1, 2, -6, 10, 3}));

        System.out.printf("\nTask 29\ncommonVovel(Hello world) -> %s\n", commonVovel("Hello world"));
        System.out.printf("commonVovel(Actually actions speak louder than words.) -> %s\n", commonVovel("Actually actions speak louder than words."));

        System.out.println("\nTask 30\ndataScience([\n" +
                "[1, 2, 3, 4, 5],\n" +
                "[6, 7, 8, 9, 10],\n" +
                "[5, 5, 5, 5, 5],\n" +
                "[7, 4, 3, 14, 2],\n" +
                "[1, 0, 11, 10, 1]\n" +
                "])\n -> " + Arrays.deepToString(dataScience(new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {5, 5, 5, 5, 5}, {7, 4, 3, 14, 2}, {1, 0, 11, 10, 1}})));
        System.out.println("dataScience([\n" +
                "[6, 4, 19, 0, 0],\n" +
                "[81, 25, 3, 1, 17],\n" +
                "[48, 12, 60, 32, 14],\n" +
                "[91, 47, 16, 65, 217],\n" +
                "[5, 73, 0, 4, 21]\n" +
                "])\n) -> " + Arrays.deepToString(dataScience(new int[][]{{6, 4, 19, 0, 0}, {81, 25, 3, 1, 17}, {48, 12, 60, 32, 14}, {91, 47, 16, 65, 217}, {5, 73, 0, 4, 21}})));

    }
    public static String replaceVowels(String str)
    {
        StringBuilder res = new StringBuilder();
        char[] arr = str.toCharArray();
        for (char c : arr)
        {
            if ("eyuioa".contains(String.valueOf(c).toLowerCase()))
            {
                res.append("*");
            }
            else
            {
                res.append(c);
            }
        }
        return res.toString();
    }
    public static String stringTransform(String str)
    {
        StringBuilder res = new StringBuilder();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (String.valueOf(arr[i]).equalsIgnoreCase(String.valueOf(arr[i + 1])))
            {
                res.append("Double").append(String.valueOf(arr[i]).toUpperCase());
                i++;
            }
            else
            {
                res.append(arr[i]);
            }
        }
        res.append(arr[arr.length - 1]);
        return res.toString();
    }
    public static boolean doesBlockFit(int a, int b, int c, int w, int h)
    {
        return (a <= w && b <= h) || (a <= w && c <= h) || (b <= w && a <= h) || (b <= w && c <= h)
                || (c <= w && a <= h) || (c <= w && b <= h);
    }
    public static boolean numCheck(int n)
    {
        int sum = 0;
        int temp = n;
        while (temp != 0)
        {
            sum += (int) Math.pow(temp % 10, 2);
            temp /= 10;
        }
        return n % 2 == sum % 2;
    }
    public static short countRoots(int[] arr)
    {
        final double d = (Math.pow(arr[1], 2) - 4 * arr[0] * arr[2]);
        if (d > 0)
        {
            short res = 0;
            double x1 = (-arr[1] + Math.pow(d, 0.5)) / (2 * arr[0]);
            double x2 = (-arr[1] - Math.pow(d, 0.5)) / (2 * arr[0]);
            if (x1 % 1 == 0) res += 1;
            if (x2 % 1 == 0) res += 1;
            return res;
        }
        else if (d == 0)
        {
            return 1;
        }
        return 0;
    }
    public static String[] salesData(String[][] arr)
    {
        ArrayList<String> resList = new ArrayList<>();
        for (String[] strings : arr) {
            if (strings.length > 4) {
                if ((strings[1] + strings[2] + strings[3] + strings[4]).equals("Shop1Shop2Shop3Shop4")) {
                    resList.add(strings[0]);
                }
            }
        }
        String[] res = new String[resList.size()];
        resList.toArray(res);
        return res;
    }
    public static boolean validSplit(String str)
    {
        char[] arr = str.toLowerCase().toCharArray();
        for (int i = arr.length - 3; i >= 0; i--) {
            if (!(arr[i] == arr[i + 2]) && (arr[i + 1] == ' ')) {
                return false;
            }
        }
        return true;
    }

    public static boolean waveForm(int[] arr) {
        if (arr[0] < arr[1] && arr[1] > arr[2]) {
            for (int i = 1; i < arr.length - 1; i += 2) {
                if (!(arr[i - 1] < arr[i] && arr[i] > arr[i + 1])) {
                    return false;
                }
            }
            if (arr.length % 2 == 0) {
                return arr[arr.length - 1] > arr[arr.length - 2];
            }
        }
        else if (arr[0] > arr[1] && arr[1] < arr[2]) {
            for (int i = 1; i < arr.length - 1; i += 2) {
                if (!(arr[i - 1] > arr[i] && arr[i] < arr[i + 1])) {
                    return false;
                }
            }
            if (arr.length % 2 == 0) {
                return arr[arr.length - 1] < arr[arr.length - 2];
            }
        }
        else {
            return false;
        }
        return true;
    }
    public static char commonVovel(String str)
    {
        char[] arr = str.toLowerCase().toCharArray();
        char res = ' ';
        int maxFreq = 0;
        String vowels = "eyuioa";
        for (char i : arr) {
            if (vowels.contains(String.valueOf(i))) {
                int count = 0;
                for (char j : arr) {
                    if (j == i) {
                        count++;
                    }
                }
                if (count > maxFreq) {
                    res = i;
                    maxFreq = count;
                }
                vowels = vowels.replace(i, '$');
            }
        }
        return res;
    }
    public static int[][] dataScience(int[][] arr)
    {
        int[][] res = new int[arr[0].length][arr.length];
        for (int col = 0; col < arr.length; col++)
        {
            int avg, sum = 0;
            for (int row = 0; row < arr[col].length; row++)
            {
                if (row != col)
                {
                    sum += arr[row][col];
                }
            }
            avg = Math.round((float) sum / (arr.length - 1));
            for (int row = 0; row < arr[col].length; row++)
            {
                if (row == col)
                {
                    res[row][col] = avg;
                }
                else
                {
                    res[row][col] = arr[row][col];
                }
            }
        }
        return res;
    }
    public static String longestWord(String str) {
        String res = "";
        int maxLen = 0;
        String[] arrStr = str.split(" ");
        for (String i : arrStr) {
            if ((!i.equals(" ")) && i.length() > maxLen) {
                res = i;
                maxLen = i.length();
            }
        }
        return res;
    }
}

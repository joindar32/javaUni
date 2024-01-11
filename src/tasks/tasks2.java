package tasks;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class tasks2 {
    public static void main(String[] args) {
        System.out.printf("\nTask 11\nDonald -> %s\n", duplicateChars("Donald"));
        System.out.printf("Orange -> %s\n", duplicateChars("Orange"));

        System.out.printf("\nTask 12\nRyan Gosling -> %s\n", getInitials("Ryan Gosling"));
        System.out.printf("Barack Obama -> %s\n", getInitials("Barack Obama"));

        System.out.printf("\nTask 13\n[44, 32, 86, 19] -> %d\n", differenceEvenOdd(new int[]{44, 32, 86, 19}));
        System.out.printf("[22, 50, 16, 63, 31, 55] -> %d\n", differenceEvenOdd(new int[]{22, 50, 16, 63, 31, 55}));

        System.out.printf("\nTask 14\n[1, 2, 3, 4, 5] -> %b\n", evenToAvg(new int[]{1, 2, 3, 4, 5}));
        System.out.printf("[1, 2, 3, 4, 6] -> %b\n", evenToAvg(new int[]{1, 2, 3, 4, 6}));

        System.out.print("\nTask 15\n[1, 2, 3] -> " + Arrays.toString(indexMult(new int[]{1, 2, 3})));
        System.out.print("\n[3, 3, -2, 408, 3, 31] -> " + Arrays.toString(indexMult(new int[]{3, 3, -2, 408, 3, 31})));

        System.out.printf("\nTask 16\nHello World -> %s\n", reverse("Hello World"));
        System.out.printf("The quick brown fox. -> %s\n", reverse("The quick brown fox."));

        System.out.printf("\nTask 17\nTribonacci(7) -> %d\n", Tribonacci(7));
        System.out.printf("Tribonacci(11) -> %d\n", Tribonacci(11));

        System.out.printf("\nTask 18\nHash(5) -> %s\n", pseudoHash(5));
        System.out.printf("Hash(10) -> %s\n", pseudoHash(10));
        System.out.printf("Hash(0) -> %s\n", pseudoHash(0));

        System.out.printf("\nTask 19\nHello, I’m under the water, please help me -> %s\n",
                botHelper("Hello, I’m under the water, please help me"));
        System.out.printf("Two pepperoni pizzas please -> %s\n",
                botHelper("Two pepperoni pizzas please"));

        System.out.printf("\nTask 20\nlisten, silent -> %s\n", isAnagram("listen", "silent"));
        System.out.printf("eleven plus two, twelve plus one -> %s\n", isAnagram("eleven plus two", "twelve plus one"));
        System.out.printf("hello, world -> %s\n", isAnagram("hello", "world"));
    }
    public static boolean duplicateChars(String str)
    {
        str = str.toLowerCase();
        char[] myArray = str.toCharArray();
        for(int i = 0; i < myArray.length - 1; i++)
        {
            for (int j = i + 1; j < myArray.length; j++)
            {
                if(myArray[i] == myArray[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static String getInitials(String str)
    {
        String res = "";
        char[] arr = str.toCharArray();
        for (char c : arr)
        {
            if (Character.isUpperCase(c))
            {
                res += c;
            }
        }
        return res;
    }
    public static int differenceEvenOdd(int[] arr)
    {
        int even = 0, odd = 0;
        for (int i : arr)
        {
            if (i % 2 == 0)
            {
                even += i;
            }
            else
            {
                odd += i;
            }
        }
        return Math.abs(even - odd);
    }
    public static boolean evenToAvg(int[] arr)
    {
        float avg = (float) Arrays.stream(arr).sum() / arr.length;
        for (int i : arr)
        {
            if (avg == i)
            {
                return true;
            }
        }
        return false;
    }
    public static int[] indexMult(int[] arr)
    {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            res[i] = i * arr[i];
        }
        return res;
    }
    public static String reverse(String str)
    {
        String res = "";
        char[] arr = str.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--)
        {
            res += arr[i];
        }
        return res;
    }
    public static int Tribonacci(int n)
    {
        if (n < 3)
        {
            return n;
        }
        int a = 0, b = 0, c = 1, d;
        for (int i = n; i > 3; i--)
        {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }
    public static String pseudoHash(int n)
    {
        String str = "";
        Random rnd = new Random();
        for (int i = 0; i < n; i++)
        {
            int rndInt = rnd.nextInt(16);
            str += Integer.toHexString(rndInt);
        }
        return str;
    }
    public static String botHelperv2(String str)
    {
        str = str.toLowerCase();
        if(str.contains("help"))
        {
            return "Calling for a staff member";
        }
        return "Keep waiting";
    }
    public static String botHelper(String str)
    {
        str = str.toLowerCase().replace(',', ' ').replace('.', ' ').replace('!', ' ').replace('?', ' ').replace(':', ' ').replace(';', ' ');;
        String[] arr = str.split(" ");
        for (String i : arr)
        {
            if (Objects.equals(i, "help"))
            {
                return "Calling for a staff member";
            }
        }
        return "Keep waiting";
    }
    public static boolean isAnagram(String str1, String str2)
    {
        if (str1.length() != str2.length())
        {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}

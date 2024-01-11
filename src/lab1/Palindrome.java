package lab1;

public class Palindrome
{
    public static void main(String[] args)
    {
        for (int i = 0; i < args.length; i++)
        {
            if (isPalindrome((args[i])))
            {
                System.out.println(args[i]);
            }
        }
    }
    public static String reverseString(String str)
    {
        String res = "";
        char[] arr = str.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--)
        {
            res += arr[i];
        }
        return res;
    }
    public static boolean isPalindrome(String str)
    {
        String rStr = reverseString(str);
        return rStr.equals(str);
    }
}
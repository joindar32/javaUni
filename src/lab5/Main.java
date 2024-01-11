package lab5;

import java.io.IOException;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String textForNumberFinder = "This45.543543 is 654654 an --5.54 example of 34 text -20 with numbers";
        //String textForNumberFinder = "This is an example of text without numbers";

        String textForPasswordValidation = "dggRfd67fsd";
        //String textForPasswordValidation = "dggfgd777fsd";
        //String textForPasswordValidation = "dggваваы";
        //String textForPasswordValidation = "dgg";

        String textForReplaceURL = "Перейдите по ссылке https://www.example.com/asd/ зеркало: http://example/sad/";
        //String textForReplaceURL = "Перейдите по ссылке";

        String strForCheckIP = "100.123.234.0";

        String strForFindWordsStartingWith = "asdwqe A Rasd Asd Vdfs Wfd";

        try {
            numberFinder(textForNumberFinder);
            passwordValidation(textForPasswordValidation);
            replaceURL(textForReplaceURL);
            checkIP(strForCheckIP);
            findWordsStartingWIth(strForFindWordsStartingWith, 'a');
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void numberFinder(String text) throws IOException {
        String res = "";
        Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+|-{1}\\d+\\.\\d+|-{1}\\d+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            res += (matcher.group() + " ");
        }
        if (res.isBlank()) {
            throw new IOException("В строке нет чисел.");
        }
        else {
            System.out.println(res);
        }
    }

    public static void passwordValidation(String password) throws IOException {
        Pattern pattern = Pattern.compile(".{8,16}");
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {

            pattern = Pattern.compile("[A-Za-z0-9]{8,16}");
            matcher = pattern.matcher(password);

            if (matcher.matches()) {

                pattern = Pattern.compile("(?=.*[A-Z])(?=.*[\\d])[A-Za-z0-9]{8,16}");
                matcher = pattern.matcher(password);

                if (matcher.matches()) {
                    System.out.println("Пароль подходит.");
                }
                else {
                    throw new IOException("Пароль должен содержать хотя бы одну цифру и заглавную букву.");
                }
            }
            else {
                throw new IOException("Пароль должен состоять только из латинских букв и цифр.");
            }
        }
        else {
            throw new IOException("Пароль должен быть длиной от 8 до 16 символов.");
        }
    }

    public static void replaceURL (String text) throws IOException {
        String editedText = text.replaceAll("(https?://)?(www\\.)?([\\w]+\\.)+[\\w]{2,63}/?+([\\w]+/?)*", "<a href=\"$0\">$0</a>");
        if (text.equals(editedText)) {
            throw new IOException("В тексте нет ссылок.");
        }
        System.out.println(editedText);
    }

    public static void checkIP (String ip) throws IOException {
        if (ip.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")) {
            String[] parts = ip.split("\\.");
            for (String i : parts)
            {
                int num = Integer.parseInt(i);
                if (!(0 <= num && num <= 255)) {
                    throw new IOException("Числа, из которых состоит IP-адрес, должны находиться в диапазоне от 0 до 255.");
                }
            }
            System.out.println("IP-адрес введен корректно.");
        }
        else {
            throw new IOException("В строке нет IP-адреса.");
        }
    }

    public static void findWordsStartingWIth (String str, char c) throws IOException {
        String res = "";
        Pattern pattern = Pattern.compile("(?i)\\b" + c + "[a-z]*\\b");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            res += (matcher.group() + " ");
        }
        if (res.isBlank()) {
            throw new IOException("В строке нет слов, начинающихся на заданную букву.");
        }
        else {
            System.out.println(res);
        }
    }
}

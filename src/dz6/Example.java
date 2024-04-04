package dz6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.awt.SystemColor.text;

public class Example {
    public static void main(String[] args){
    String text = "Мой номер телефона +375-29-1234567. Мой ник в Телеграм @TheGodFather.";
        Pattern phonePattern = Pattern.compile("\\d{7}");
        Matcher phoneMatcher = phonePattern.matcher(text);
        if (phoneMatcher.find()) {
            String phoneNumber = phoneMatcher.group();
            System.out.println("Номер телефона : " + phoneNumber);
        }
        Pattern telegramPattern = Pattern.compile("(?<=@)[A-Za-z0-9_]+");
        Matcher telegramMatcher = telegramPattern.matcher(text);
        if (telegramMatcher.find()) {
            String telegramNick = telegramMatcher.group();
            System.out.println("Ник в Телеграм : " + telegramNick);
        }
    }
}
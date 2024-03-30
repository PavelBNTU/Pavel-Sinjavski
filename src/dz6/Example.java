package dz6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.awt.SystemColor.text;

public class Example {
    public static void main(String[] args) {
        final String regex = "1234567|[A-z]";
        final String string = "Мой номер телефона +375-29-1234567. Мой ник в Телеграм @TheGodFather.";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Полное соответствие: " + matcher.group(0));

            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Группа " + i + ": " + matcher.group(i));
            }
        }
    }
}
package dz6;

public class comparison {

    public static void main(String[] args) {
        String str1 = "Мама мыла раму";
        String str2 = "Мама" + " мыла " + "раму";

        boolean result = str1 == str2;
        System.out.println(result);
    }
}

package dz6;

public class simvol {
    public static void printStringCharByChar(String inputString) {
            for (int i = 0; i < inputString.length(); i++) {
                System.out.println(inputString.charAt(i));
            }
        }

        public static void main(String[] args) {
            String inputString = "Мама мыла рыбу!";
            printStringCharByChar(inputString);
        }

    }

package dz6.Voina;

public class Poisc {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\ёрш\\IdeaProjects\\test1\\dz1\\src\\dz6\\Voina\\Война и мир.txt";
        WordFrequencyCounter counter = new WordFrequencyCounter(filePath);

        String targetWord = "Война";
        int frequency = counter.countWordFrequency(targetWord);

        System.out.println("Слово '" + targetWord + "' повторяетя" + frequency + " раза в текстовом документк.");
    }

}

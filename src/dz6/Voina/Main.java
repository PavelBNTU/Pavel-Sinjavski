package dz6.Voina;

public class Main {
    public static void main(String[] args) {
        TextSearch stringSearch = new StringSearch();
        stringSearch.search("C:\\Users\\ёрш\\IdeaProjects\\test1\\dz1\\src\\dz6\\Voina\\Война и мир.txt", "Наполеон");

        TextSearch regexSearch = new RegexSearch();
        regexSearch.search("C:\\Users\\ёрш\\IdeaProjects\\test1\\dz1\\src\\dz6\\Voina\\Война и мир.txt", "\\b[Кк]нязь\\b");
    }
}

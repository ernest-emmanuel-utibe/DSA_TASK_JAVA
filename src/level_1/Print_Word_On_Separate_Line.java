package level_1;

public class Print_Word_On_Separate_Line {
    public static void printOutTheWordSemicolonOnASeparateLine() {
        String word = "SEMICOLON";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }

    public static void main(String[] args) {
        printOutTheWordSemicolonOnASeparateLine();
    }
}

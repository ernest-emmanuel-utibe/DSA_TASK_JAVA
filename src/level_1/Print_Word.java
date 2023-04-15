package level_1;

public class Print_Word {
    static void print_Word_Ventures() {
        String word = "VENTURES";
        for (int lineOfEachWord = 0; lineOfEachWord < word.length(); lineOfEachWord++) {
            System.out.println(word.charAt(lineOfEachWord) + " " + word.charAt(++lineOfEachWord));
        }
    }

    public static void main(String[] args) {
        print_Word_Ventures();
    }
}

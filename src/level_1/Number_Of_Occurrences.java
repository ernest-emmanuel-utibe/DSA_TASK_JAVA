package level_1;

public class Number_Of_Occurrences {
    public static void findOccurrences() {
        String word = "MISSISSIPPI";
        int countForS = 0;
        int countForI = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 's') {
                countForS++;
            }
            else if (word.charAt(i) == 'i') {
                countForI++;
            }
        }
        System.out.println("Number of 's': " + countForS);
        System.out.println("Number of 'i': " + countForI);
    }

    public static void main(String[] args) {
        findOccurrences();
    }
}

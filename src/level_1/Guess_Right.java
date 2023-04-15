package level_1;

import java.util.Scanner;

public class Guess_Right {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        guessMyYearOfBirth();
    }
    public static void guessMyYearOfBirth() {
        int myBirthday = 31;
        int myAnswer = 0;
        while (myAnswer != myBirthday) {
            System.out.println("Enter a guess: ");
            myAnswer = input.nextInt();
            if (myAnswer != myBirthday) System.out.println("Incorrect Guess :(! Guess again");
        }
        System.out.println("Wow!!! Correct Guess :)!");
    }
}

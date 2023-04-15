package level_1;

import java.util.Scanner;

public class Second_Largest_Number {
    public static void main(String[] args) {
        int maximum_numbers_to_be_inputted = 0, second_largest = 0, temporary_numbers, numbers_typed;
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        numbers_typed = input.nextInt();
        System.out.println("Enter numbers:");
        for (int count = 0; count < numbers_typed; count++) {
            if (count == 0) {
                maximum_numbers_to_be_inputted = input.nextInt();
            } else {
                temporary_numbers = input.nextInt();
                if (temporary_numbers > maximum_numbers_to_be_inputted) {
                    second_largest = maximum_numbers_to_be_inputted;
                    maximum_numbers_to_be_inputted = temporary_numbers;
                } else if (temporary_numbers > second_largest) {
                    second_largest = temporary_numbers;
                }
            }
        }
        input.close();
        System.out.println("Second max number is :" + second_largest);
    }
}

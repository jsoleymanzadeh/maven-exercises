import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringTransform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();
        if (StringUtils.isNumeric(userInput)) {
            System.out.println("You entered a number.");
        } else {
            System.out.println("You did not enter a number.");
        }
        System.out.printf("Your input's case inverted: %s\n", StringUtils.swapCase(userInput));
        System.out.printf("Your input reversed: %s\n", StringUtils.reverse(userInput));
    }
}
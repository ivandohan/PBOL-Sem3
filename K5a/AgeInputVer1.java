package K5a;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeInputVer1 {
    private static final String DEFAULT_MESSAGE = "Your age: ";
    private Scanner scanner;

    public AgeInputVer1(){
        scanner = new Scanner(System.in);
    }
    public int getAge() {
        return getAge(DEFAULT_MESSAGE);
    }
//    public int getAge(String prompt) throws InputMismatchException {
//        System.out.print(prompt);
//        int age;
//        age = scanner.nextInt();
//        return age;
//    }

    public int getAge(String prompt) {
        System.out.print(prompt);

        int age = 0;
        boolean isContinue = true;

        while (isContinue) {
            try {
                age = scanner.nextInt();
                isContinue = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Entry. Please enter digits only.");
            }
        }

        return age;
    }

}

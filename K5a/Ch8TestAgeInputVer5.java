package K5a;

import java.util.InputMismatchException;

public class Ch8TestAgeInputVer5 {
    public static void main(String[] args) throws Exception {

        int entrantAge;
        try {
            AgeInputVer5 input = new AgeInputVer5(25,50);
            entrantAge = input.getAge("Your Age:");
            System.out.println("Input Okay. Age = " + entrantAge);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
   
}



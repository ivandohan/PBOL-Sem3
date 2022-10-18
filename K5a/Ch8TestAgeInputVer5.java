package K5a;

public class Ch8TestAgeInputVer5 {
    public static void main(String[] args) throws Exception {

        int entrantAge;
        try
        {
            AgeInputVer5 input = new AgeInputVer5(25,50);
            entrantAge = input.getAge("Your Age:");
            System.out.println("Input Okay. Age = " + entrantAge);
        }catch(AgeInputException e)
        {
            System.out.println(
                    "Error: " + e.value() + " is entered. It is " +
                            "outside the valid range of [" + e.lowerBound() +
                            ", " + e.upperBound() + "]");
        }
    }

   
}



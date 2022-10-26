/*
*   Biasakan Tulis komen le
* */

import java.util.Scanner;

public class K1a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Your Name : ");
        String name = scan.nextLine();

        System.out.println("Hello, " + name);

        oodNumber(); 
    }

    public static void oodNumber() {
        for(int i = 0; i < 20; i++) {
            if(i % 2 != 0) {
                System.out.printf("%d, ", i);
            }
        }
    }
}

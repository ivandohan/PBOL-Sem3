import java.util.Scanner;

public class K1b {
    double radius;
    final double PI = 3.14;

    public static void main(String[] args) {
        K1b circle = new K1b();

        circle.radius = 7;
        System.out.printf("Keliling : %.2f\n", circle.hitungKeliling());
        System.out.printf("Luas : %.2f", circle.hitungLuas());

    }

    public double hitungLuas() {
        return PI * radius * radius;
    }

    public double hitungKeliling() {
        return PI * radius * 2;
    }
}

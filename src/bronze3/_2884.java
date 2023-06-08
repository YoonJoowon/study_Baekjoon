package bronze3;

import java.util.Scanner;

public class _2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A == 0 && B < 45) {
            System.out.println("23 " + (B + 15));
        } else if (B < 45) {
            System.out.println((A - 1) + " " + (B + 15));
        } else if (B >= 45) {
            System.out.println(A + " " + (B - 45));
        }
    }
}

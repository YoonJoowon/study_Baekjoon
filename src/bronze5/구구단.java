package bronze5;

import java.util.Scanner;

public class 구구단 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(a + " * " + i + " = " + (a * i));
        }
    }

}

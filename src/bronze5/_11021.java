package bronze5;

import java.util.Scanner;

public class _11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for (int i = 0; i < test; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println("Case #"+ (i+1) + ": " + (A+B));
        }
    }
}

package bronze5;

import java.util.Scanner;

public class _10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] array = new int[N];
        int num = 0;

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();

        }

        int dart = sc.nextInt();

        for (int j = 0; j < N; j++) {
            if (array[j] == dart) {
                num++;
            }
        }

        System.out.println(num);


    }
}

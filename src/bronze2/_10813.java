package bronze2;

import java.util.Scanner;

public class _10813 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] array = new int[N];

        for (int k = 0; k < N; k++){
            array[k] = k+1;
        }

        for (int i = 0; i < M; i++) {
            int first = sc.nextInt() -1;
            int second = sc.nextInt() -1;

            int a = array[first];
            int b = array[second];

            array[first] = b;
            array[second] = a;

        }
        for (int j = 0; j < N; j++) {
            System.out.print(array[j] + " ");
        }
    }
}

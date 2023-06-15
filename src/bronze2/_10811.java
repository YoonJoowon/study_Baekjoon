package bronze2;

import java.util.Scanner;

public class _10811 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] arr = new int[N];

            for (int k = 0; k < N; k++){
                arr[k] = k+1;
            }

            for (int i = 0; i < M; i++) {
                int first = sc.nextInt() -1;
                int second = sc.nextInt() -1;

                while (first < second) {
                    int temp = arr[first];
                    arr[first++] = arr[second];
                    arr[second--] = temp;
                }

            }
            for (int j = 0; j < N; j++) {
                System.out.print(arr[j] + " ");
            }
    }
}

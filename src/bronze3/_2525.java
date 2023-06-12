package bronze3;

import java.util.Arrays;
import java.util.Scanner;

public class _2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); //시
        int B = sc.nextInt();
        int C = sc.nextInt();

        int answerHour = A;
        int answerMin = B+C;

        answerHour += answerMin/60;
        answerMin %= 60;
        if(answerHour >=24) answerHour %= 24;

        System.out.println(answerHour + " " + answerMin);
    }

    public static class _10818 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            int[] array = new int[N];

            for (int i = 0; i < N; i++){
                array[i] = sc.nextInt();
            }

            Arrays.sort(array);

            System.out.println(array[0] + " " + array[N - 1]);


        }
    }
}

package bronze3;

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
}

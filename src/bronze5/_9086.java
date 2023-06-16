package bronze5;

import java.util.Scanner;

public class _9086 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++){
            String A = sc.next();
            int a = A.length();

            String str1 = String.valueOf(A.charAt(0)); // 문자를 문자열로 변환
            String str2 = String.valueOf(A.charAt(a-1));

            System.out.println(str1+str2);
        };

    }
}

package bronze5;

import java.util.Scanner;

public class _25304 {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int all=sc.nextInt();
        int N=sc.nextInt();

        int sum=0;

        for(int i=0;i<N; i++){

            int price=sc.nextInt();
            int count=sc.nextInt();

            sum+=price*count;

        }

        if(sum==all){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}

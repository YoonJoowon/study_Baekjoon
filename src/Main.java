import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] array = new double[N];
        double average = 0;


        for (int i = 0; i < N; i++) {
            int score = sc.nextInt();

            array[i] = score;
        }

        Arrays.sort(array);

//        System.out.println(array[N-1]);

        for (int j = 0; j < N; j++) {
            average += (array[j] / array[N - 1] * 100)/ N ;
        }

        System.out.println(average);
    }
}
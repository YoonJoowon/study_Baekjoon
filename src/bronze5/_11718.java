package bronze5;

import java.util.Scanner;

public class _11718 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String a = sc.nextLine();

            if (a.equals("false"))
                break;

            System.out.println(a);
        }
    }
}

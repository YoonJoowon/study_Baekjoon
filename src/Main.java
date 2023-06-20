import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        words = words.trim();
        String[] arr = words.split(" ");


        if (arr.length == 1 && arr[0].equals("")) {
            System.out.println(0);


        }else {
            System.out.println(arr.length);
        }
    }

}


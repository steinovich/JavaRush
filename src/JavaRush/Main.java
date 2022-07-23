package JavaRush;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int min2 = in.nextInt();
        int min = in.nextInt();
        int temp ;
        if (min > min2) {
            temp = min2;
            min2 = min;
            min = temp;
        }

        int x;
//        int i = 0;


        while (in.hasNextInt()) {
            x = in.nextInt();
            if (min == min2) {
                if (min > x) {
                    min = x;
                } else min2 = x;
                continue;
            }

            if (min > x) {
//                temp=min;
                min2 = min;
                min = x;
            } else if (min2 > x) min2 = x;
        }
        System.out.println(min2);
    }
}
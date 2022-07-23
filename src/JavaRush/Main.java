package JavaRush;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int x;
        while (in.hasNextInt()) {
            x = in.nextInt();
            if (min > x) min = x;
        }
        if (in.nextLine().length() == 1) System.out.println(Integer.MAX_VALUE);
        else System.out.println(min);
    }
}
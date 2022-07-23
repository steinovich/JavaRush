package JavaRush;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        if (max%2==1)max++;
        int maxOut=max;
        int x;

        while (in.hasNextInt()) {
            x = in.nextInt();
            if(x%2==0){
                if (max < x) max = x;
            }
        }
        if (in.nextLine().length() == 1||max == maxOut) System.out.println(Integer.MIN_VALUE);
        else System.out.println(max);
    }
}
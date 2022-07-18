package JavaRush;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i=1;
        int sum=0;
        while (i<=100) {
            i++;
            if (i%3==0)
                continue;
            sum+=i;
        }
        System.out.println(sum);
    }
}
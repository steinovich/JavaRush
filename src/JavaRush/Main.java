package JavaRush;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 0, j = 1;

//            System.out.pr
        while (i < 10) {
            j = 0;
            System.out.print("|||");
            while (j < 18) {
                if (i == 0 || i == 9) {
                    System.out.print("Б");
                    j++;
                } else {
                    System.out.print(" ");
                    j++;
                }
            }
            System.out.println("Б");
            i++;
        }
    }

}
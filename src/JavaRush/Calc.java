package JavaRush;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Calc {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int sum = 0;
            String input;
            String enter = "ENTER";
            boolean loop = true;
            while (loop) {
                input = in.nextLine();
                System.out.println(Integer.parseInt(input));
                if (isInt(input)) {
                    sum += Integer.parseInt(input);
                } else if (!input.equalsIgnoreCase("ENTER")) {
                    System.out.println("Введенное Вами выражение не является числом");
                } else loop = false;
                //    System.out.println(input=enter);
            }
            System.out.println("Сумма чисел равна:"+sum);
        }

        private static boolean isInt(String str) {
            return str != null && str.matches("[0-9.]+");

        }
}

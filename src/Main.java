import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String expression = in.nextLine();

        String[] signs = {"+", "-", "*", "/"};
        String[] signs2 = {"\\+", "-", "\\*", "/"};
        int sign = -1;
        for (int i = 0; i < 4; i++) {
            if (expression.contains(signs[i])) {
                sign = i;
            }
        }
        if (sign == -1) {
            System.out.println("ОШИБКА, вы не ввели знак действия!");
            return;
        }

        String[] numbs = expression.split(signs2[sign]);
        int length = numbs.length;

        if (length > 2) {
            System.out.println("ОШИБКА, вы ввели больше двух переменных!");
            return;
        }
        if (length < 2) {
            System.out.println("ОШИБКА, вы ввели меньше двух переменных!");
            return;
        }

        if (Check.convert(numbs[0]) == false && Check.convert(numbs[1]) == false) {
            int numb0 = Integer.parseInt(numbs[0]);
            int numb1 = Integer.parseInt(numbs[1]);
            switch (sign) {
                case 0: System.out.println(numb0 + numb1); break;
                case 1: System.out.println(numb0 - numb1); break;
                case 2: System.out.println(numb0 * numb1); break;
                case 3: System.out.println(numb0 / numb1); break;
            }
        }
        else if (Check.convert(numbs[0]) == true && Check.convert(numbs[1]) == true) {
            int a = Voz.Rim(numbs[0]);
            int b = Voz.Rim(numbs[1]);
            int c = 0;
            switch (sign) {
                case 0:
                    c = a + b;
                    break;
                case 1:
                    c = a - b;
                    break;
                case 2:
                    c = a * b;
                    break;
                case 3:
                    c = a / b;
                    break;
            }
            if (c < 1) {
                System.out.println("ОШИБКА, ответ меньше единицы!");
                return;
            }
            else {
                System.out.println(Voz.Rim1(c));
            }
        }
        else {
                System.out.println("ОШИБКА, разные системы счисления!");
        }
    }
}
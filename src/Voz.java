public class Voz {
    public static int Rim(String num) {
        char[] arr = num.toCharArray();
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            switch (arr[i]) {
                case 'I':
                    arr[i] = 1;
                    break;
                case 'V':
                    arr[i] = 5;
                    break;
                case 'X':
                    arr[i] = 10;
                    break;
                default:
                    System.out.println("Вы ввели не римский символ!");
                    return 0;
            }
        }

        int end = arr[length - 1];
        int result = end;
        for (int i = length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                result -= arr[i - 1];
            }
            else {
                result += arr[i - 1];
            }
        }
        return result;
    }

    public static String Rim1(int result) {
        String itog = "";
        int res2 = result;

        while (res2 != 0) {
            if (res2 >= 10) {
                itog += "X";
                res2 -= 10;
            }
            if (res2 == 9) {
                itog += "IX";
                res2 -= 9;
            }
            if (res2 < 9 && res2 >= 5) {
                itog += "V";
                res2 -= 5;
            }
            if (res2 == 4) {
                itog += "IV";
                res2 -= 4;
            }
            if (res2 < 4 && res2 >= 1) {
                itog += "I";
                res2 -= 1;
            }
        }
        return itog;
    }
}

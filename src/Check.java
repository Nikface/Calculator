public class Check {
    public static boolean convert(String numbs) {
        char[] num = numbs.toCharArray();
        int length = num.length;

        for (int i = 0; i < length; i++) {
            switch (num[i]) {
                case 'I':
                    break;
                case 'V':
                    break;
                case 'X':
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
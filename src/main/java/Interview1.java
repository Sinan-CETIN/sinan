public class Interview1 {
    public static void main(String[] args) {
        //int[] array = {1,2,3,4,1,5,1,2};
        //int[] array = {1,2,3,4,5};
        //int[] array = new int[0];
//        int[] array = {};
//        System.out.println(hasDuplicate(array));
//        String str = "asdgnasdgnierwgnwermgqp";
//        String unique = getUnique(str);
//        System.out.println(unique);
//        String sinan ="sinan";
//        String reverse = new StringBuilder(sinan).reverse().toString();
//        System.out.println(reverse);

        String a = "aaaabbbbccckkkdddllldddda";
        String result = "";
        int count = 1;
        for (int i = 0; i < a.length() - 1; i++) {
            char ch = a.charAt(i);
            if (a.charAt(i) == a.charAt(i + 1)) {
                count++;
            } else if (i == a.length() - 1 && (a.charAt(i) != a.charAt(i + 1))) {
                result += a.charAt(i + 1) + "" + count;
            } else {
                result += ch + "" + count;
                count = 1;
            }
        }
        System.out.println(result);
    }

    private static String getUnique(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.charAt(i) + "")) {
                result += str.charAt(i);
            }
        }
        char[] ch = new char[result.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = result.charAt(i);
        }

        result = order(ch);


        return result;
    }

    private static String order(char[] o) {
        for (int i = 0; i < o.length - 1; i++) {
            char min = o[i];
            int minIndex = i;
            for (int j = i + 1; j < o.length; j++) {
                if (min > o[j]) {
                    min = o[j];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                char temp = o[i];
                o[i] = o[minIndex];
                o[minIndex] = temp;

            }
        }
        String result = "";
        for (int i = 0; i < o.length; i++) {
            result += o[i];
        }
        return result;
    }

    public static boolean hasDuplicate(int[] array) {


        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;

    }
}

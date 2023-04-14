public class Soru1 {
    public static void main(String[] arhs) {

        String url = "https://www.google.com/";
        String reverseUrl = reversedURL(url);
        System.out.println(reverseUrl);
    }

    public static String reversedURL(String url) {
        String[] keywords = {".", "/", "https:"};
        String result = "";

        for (int i = 0; i < keywords.length; i++) {

            String[] splittedUrl = url.split(keywords[i]);
            if (i != keywords.length - 1) {
                result = sum(splittedUrl);
            } else {
                result = sumReverse(splittedUrl);
            }
            url = result;
            System.out.println(url);
        }
        return result;
    }

    public static String sum(String[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]);
        }
        return stringBuilder.toString();
    }

    public static String sumReverse(String[] arr) {
        StringBuilder builder = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            builder.append(arr[i]);
            builder.append(".");
        }
        return builder.toString();
    }


    public static int sum(int number1, int number2) {
        return number1 + number2;
    }


    public static int multiple(int num1, int num2) {
        return num1 * num2;
    }


}



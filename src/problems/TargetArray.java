package problems;

import java.util.Arrays;

public class TargetArray {


    public static void main(String[] args) {

        char[] array = {'a', ' ', 'b'};
        System.out.println(replaceSpecialChar(array));
        System.out.println(compress("aabcccccaaa"));
    }



    public static String replaceSpecialChar(char[] array) {
        String output = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                output += "%20";

            } else {
                output += array[i];
            }

        }
        return output;

    }

    public static String compress(String input) {
        int counter = 1;
        String results = "";
        if (input.length() == 0) return input;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1) && i+1 != input.length()-1) {
                counter++;
            } else {
                 results += input.charAt(i) + "" + counter;
                counter = 1;
            }
        }
        return input.length() > results.length() ? results : input;
    }
}

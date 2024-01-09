package problems;

import java.util.Arrays;

public class TargetArray {


    public static void main(String[] args) {
        String input = "aabcccccaaa";
        System.out.println("Text to compress: " + input +"\n");
        String output = compress(input);
        System.out.println("Compressing.....\nCompressed text: " + output+"\n" );

        System.out.println("Decompressing....\nDecompressed text: " + decompressText(output));
    }
    public static String replaceSpecialChar(char[] array) {
        StringBuilder output = new StringBuilder();

        int i = 0;
        while (i < array.length) {
            if (array[i] == ' ') {
                output.append("%20");

            } else {
                output.append(array[i]);
            }

            i++;
        }
        return output.toString();

    }
    public static String compress(String input) {
        int counter = 1;
        StringBuilder results = new StringBuilder();
        if (input.isEmpty()) return input;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1) && i+1 != input.length()-1) {
                counter++;
            } else {
                 results.append(input.charAt(i)).append(counter);
                counter = 1;
            }
        }
        return input.length() > results.length() ? results.toString() : input;
    }
    public static String decompressText(String text){
        String[] characters = text.split("(?<=\\d)");
        StringBuilder word = new StringBuilder();
        for (int i = 0, charactersLength = characters.length; i < charactersLength; i++) {
            String character = characters[i];
            int j = 0;
            while (j < Integer.parseInt(String.valueOf(character.charAt(1)))) {
                word.append(character.charAt(0));
                j++;
            }
        }
        return word.toString();
    }

}

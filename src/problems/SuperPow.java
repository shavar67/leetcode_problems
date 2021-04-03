package problems;

import java.util.Arrays;

public class SuperPow {


    public static int superPow(int a, int[] b) {
        return -1;
    }


    public static void main(String[] args) {
        String[] w1 = {"a", "b", " c"};
        String[] w2 = {"ab", "abdd"};
        System.out.println(arrayStringsAreEqual(w1, w2));
    }


    public static int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;

            } else {
                num -= 1;
            }
            steps++;
        }
        return steps;

    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean check = false;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String value : word1) {
            sb.append(value.trim());
        }
        System.out.println(sb);
        for (String s : word2) {
            sb2.append(s.trim());
        }
        return sb.toString().equalsIgnoreCase(sb2.toString());

    }

}

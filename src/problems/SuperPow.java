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
        System.out.println(numberOfSteps(7));
        System.out.println(calculateSteps(7,0));
    }


    /**
     * Description:
     * Given an initial number 'n', this code performs a series of operations:
     * 1. If n is odd (n%2 == 1), decrement n by 1.
     * 2. Increment a step counter.
     * 3. Divide n by 2.
     * 4. Repeat steps 1-3 until n becomes zero.
     *
     * Example:
     * For n = 7, the steps are as follows:
     * 1. 7%2 = 1, so n -= 1, step += 1, n = 6.
     * 2. 6%2 = 0, n = 6/2 = 3.
     * 3. 3%2 = 1, so n -= 1, step += 1, n = 2.
     * 4. 2%2 = 0, n = 2/2 = 1.
     * 5. 1%2 = 1, so n -= 1, step += 1, n = 0.
     * 6. Finally, 0%2 = 0, and the process ends. The result is the step count, which is 5 in this example.
     *
     * @param {number} n - Initial number
     * @return {number} - Step count
     */
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

    static int calculateSteps(int num, int steps) {
        return (num == 0) ? steps : ((num % 2 == 0) ? calculateSteps(num / 2, steps + 1) : calculateSteps(num - 1, steps + 1));
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

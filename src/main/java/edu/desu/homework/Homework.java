package edu.desu.homework;

public class Homework {
    /**
     * Given a non-negative int n, return the count of the occurrences of 7 as a digit,
     * so for example 717 yields 2. (no loops).
     * <p>
     * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),while divide (/)
     * by 10 removes the rightmost digit (126 / 10 is 12).
     */

    public static int count7(int n) {
        int answer = 0;
        if (n < 7) {
            return answer;
        }
        if (n % 10 == 0) {
            return 1;
        } else if (n % 10 == 7) {
            answer++;
        }
        return answer + count7(n / 10);
    }

    /**
     * Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
     * except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
     * <p>
     * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
     */

    public static int count8(int n) {
        int answer = 0;
        if (n < 8) {
            return answer;
        }
        if (n % 10 == 0) {
            return 1;
        }
        if ((n % 10) == 8 && (n / 10) == 8) {
            answer += 2;
        } else if (n % 10 == 8) {
            answer++;
        }
        return answer + count8(n / 10);
    }

        /**
         *
         Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power,
         so powerN(3, 2) is 9 (3 squared).
         */
        public static int powerN (int base, int n){
            int answer = base;
            n--;
            if (n == 0) {
                return answer;
            }
            //answer += base;
            return answer * powerN(base, n);

        }
    }

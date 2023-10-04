package org.example;

/**
 * Calculate distribution of outcomes when some number is divided without remainder
 * Used to select an appropriate set of divisors in conditions like:
 * if (i % 5 == 0) {
 *     doThis
 * } else if (i % 4 == 0) {
 *     doThat
 * } else if ...
 *
 * freqs[] shows how many times some action will occur per particular divisor
 */
public class RemainderFreqs {

    public static void main(String[] args) {
        int[] divisors = {0, 2, 3, 4, 5, 6, 7};
        int[] freqs = new int[divisors[divisors.length - 1] + 1];

        for (int i = 0; i < 1000; i++) {
            for (int j = divisors.length - 1; j >= 1; j--) {
                if (i % divisors[j] == 0) {
                    freqs[divisors[j]]++;
                    break;
                } else if (j == 1) {
                    freqs[0]++;
                }
            }
        }

        for (int i = freqs.length - 1; i >= 0; i--) {
            if (freqs[i] > 0) {
                System.out.println("Divisor: " + i + "; outcome freq: " + freqs[i]);
            }
        }
    }
}

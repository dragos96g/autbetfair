package courses.homeworks;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers lower than 1000000:");
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= 1000000; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        for (Integer prime : primes) {
            System.out.println(prime);
        }
    }
    private static boolean isPrime(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
        }
    }

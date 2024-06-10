import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int sum = add(4, 10);
        System.out.println("Sum:" + sum);

        Scanner scanner = new Scanner(System.in); // user input

        System.out.println("Enter a number: ");
        short number = scanner.nextShort(); // using short for smaller bytes

        System.out.println("The number is a multiple of 3 or 7:  " + checkMultiple(number));

        System.out.println("Prime list:  " + Arrays.toString(primeList()));

        System.out.println("Prime sum for the first 100 primes:  " + primeSum(primeList()));

        System.out.println("Total number of the three-digit-number is:  " + uniqueNumbers(4,3));

    }
        public static int add(int a, int b) {
            return a + b;
        }

        public static boolean checkMultiple(short num) {
            return num % 3 == 0 || num % 7 == 0;
        }

        public static int[] primeList(){
            ArrayList<Integer> primeList = new ArrayList<>();
            primeList.add(2);
            int number = 3;
            while (primeList.size() < 100){
                boolean isPrime = true;
                for (int prime: primeList){
                        if (number % prime == 0) {
                            isPrime = false;
                            break;
                        }
                }
                if (isPrime){
                    primeList.add(number);
                }
                number++;
            }
            int[] primesArray = new int[primeList.size()];
            for (int i = 0; i < primeList.size(); i++) {
                primesArray[i] = primeList.get(i);
            }

            return primesArray;
        }


        public static int primeSum(int[] list){
            int result = 0;
            for (int i: list){
                result += i;
            }
            return result;
        }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

        public static int uniqueNumbers(int n, int r){
            return factorial(n)/factorial(n-r );
        }

    }




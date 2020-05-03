import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        long longInput = scanner.nextLong();
        int number = 0;
        long fact = 1;

        do {
            fact = 1;
            number++;
            for (long i = 1; i <= number; i++) {
                fact = fact * i;
            }
        } while (fact <= longInput);
        System.out.println(number);
    }
}
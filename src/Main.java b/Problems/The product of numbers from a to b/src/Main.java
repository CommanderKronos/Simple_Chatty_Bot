import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        long product = 1;

        for (int i = start; i < end; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}
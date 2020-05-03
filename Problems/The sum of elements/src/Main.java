import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int sum = 0;
        boolean zero = false;
        while (!zero) {
            int x = scanner.nextInt();
            if (x == 0) {
                zero = true;
            } else {
                sum += x;
            }
        }
        System.out.println(sum);
    }
}
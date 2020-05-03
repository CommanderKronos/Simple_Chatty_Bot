import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int i = scanner.nextInt();
        System.out.print(i + " ");
        while (i != 1) {
            if (i % 2 == 0) {
                i /= 2;
            } else {
                i *= 3;
                i += 1;
            }
            System.out.print(i + " ");
        }
    }
}
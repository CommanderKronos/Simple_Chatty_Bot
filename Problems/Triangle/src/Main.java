import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean abc = a + b > c;
        boolean acb = a + c > b;
        boolean bca = b + c > a;

        if (abc && acb && bca) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
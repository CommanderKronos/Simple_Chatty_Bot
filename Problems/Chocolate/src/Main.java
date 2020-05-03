import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        boolean modulo = k % n == 0 || k % m == 0;
        boolean kFits = n * m > k;

        if (modulo && kFits) {
            System.out.println("YES");
        } else if ((n == 1 || m == 1) && (n >= k || m >= k)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

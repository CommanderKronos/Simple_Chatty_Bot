import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int busHeight = scanner.nextInt();
        int amountBridges = scanner.nextInt();
        int bridgeHeight = 0;

        for (int i = 1; true; i++) {
            bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= busHeight) {
                System.out.println("Will crash on bridge " + i);
                break;
            } else if (amountBridges == i) {
                System.out.println("Will not crash");
                break;
            }
        }
    }
}
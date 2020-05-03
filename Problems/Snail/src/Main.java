import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int height = scanner.nextInt();
        int dayTravel = scanner.nextInt();
        int nightFall = scanner.nextInt();

        boolean x = true;
        int currentTravel = 0;
        int dayCount = 1;

        while (x) {
            currentTravel += dayTravel;
            if (height <= currentTravel) {
                x = false;
                System.out.println(dayCount);
            }
            currentTravel -= nightFall;
            dayCount += 1;
        }
    }
}
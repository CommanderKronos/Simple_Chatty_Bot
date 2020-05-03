import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int amount = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean o1 = amount <= 20 && amount >= 10 && !weekend;
        boolean o2 = amount <= 25 && amount >= 15 && weekend;

        System.out.println(o1 || o2);
    }
}
import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        // write your code here
        int intCh = ch;
        // 65, 69, 73, 79, 85
        // 97, 101, 105, 111, 117
        if (intCh == 65 || intCh == 69 || intCh == 73 || intCh == 79 || intCh == 85|| intCh == 97 || intCh == 101 || intCh == 105 || intCh == 111 || intCh == 117) {
            return true;
        } else {
            return false;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
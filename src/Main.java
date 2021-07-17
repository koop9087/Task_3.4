import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();
        char[] chr = userChoice.toCharArray();
        for(int i = 0, j = 1; i < chr.length && j < chr.length; i++, j++) {
            if(Character.isDigit(chr[i]) && Character.isLetter(chr[j])) {
                count++;
            }
        }
        if(Character.isDigit(chr[chr.length - 1])) {
            count++;
        }
        System.out.println(count);
    }
}

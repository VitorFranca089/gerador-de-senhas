import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        StringBuffer sb = new StringBuffer();

        int sizePass = scanner.nextInt();

        final char[] ultimateChar = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%¨&*()-_=+,.;/".toCharArray();

        for(int i = 0; i < sizePass; i++){
            sb.append(ultimateChar[random.nextInt(ultimateChar.length)]);
        }

        String password = sb.toString();
        System.out.println(password);

    }
}
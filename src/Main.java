import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();

        int sizePass = scanner.nextInt();

        int[] options = new int[4];

        for(int i = 0; i < options.length; i++) options[i] = scanner.nextInt();

        char[][] charset = {
                "abcdefghijklmnopqrstuvwxyz".toCharArray(),
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray(),
                "1234567890".toCharArray(),
                "!@#$%¨&*()-_=+,.;/><?[]{}".toCharArray()
        };

        List<char[]> chosenCharset = new ArrayList<>();

        for(int i = 0; i < options.length; i++) if(options[i] == 1) chosenCharset.add(charset[i]);

        for(int i = 0; i < sizePass; i++){
            char[] charsetRand = chosenCharset.get(random.nextInt(chosenCharset.size()));
            int charRand = random.nextInt(charsetRand.length);
            stringBuffer.append(charsetRand[charRand]);
        }

        String password = stringBuffer.toString();
        System.out.println(password);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String userInput = scan.next();
        int i = userInput.length();
        System.out.println(userInput.substring(i-1,i) + userInput.substring(0, i-1) + "ay");

    }
}

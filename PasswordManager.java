import java.util.Scanner;

public class PasswordManager {

    public static void main(String[] args) {
        String input; 
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a password");
        input = keyboard.nextLine();

        if (!PasswordVerifier.isValid(input))
            System.out.println("Invalid password.");
        else
            System.out.println("Valid password");
            
            keyboard.close();
            
        System.exit(0);
    }
}
import java.util.Scanner;

public class AgeProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        
        int age = 2026 - birthYear;
        System.out.println("Hello " + name + ", your age is: " + age);
        
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
        
        scanner.close();
    }
}
// Program completed successfully

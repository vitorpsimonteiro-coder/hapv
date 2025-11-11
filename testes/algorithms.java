import java.util.*;
public class algorithms {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberA, numberB;
    
    System.out.print("Enter first number: ");
    numberA = scanner.nextInt();
    System.out.print("Enter second number: ");
    numberB = scanner.nextInt();

    if (numberA > numberB) {
        System.out.println("The larger number is: " + numberA);
    } else if (numberB > numberA) {
        System.out.println("The larger number is: " + numberB);
    } else {
        System.out.println("Both numbers are equal: " + numberA);
        
        scanner.close();
    }

}
}
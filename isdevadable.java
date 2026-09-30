import java.util.Scanner;
public class isdevadable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Введите число: ");
        int x = scanner.nextInt(); 
        if (x % 5 == 0 && x % 3 == 0) {
            System.out.println("Число делится на 3 и на 5");
        }
        else if (x % 3 == 0) {
            System.out.println("Число делится только на 3");
        }
        else if (x % 5 == 0) {
            System.out.println("Число делится только на 5");
        }
        else {
            System.out.println("Число не делится ни на 3, ни на 5.");
        }
        scanner.close();
    }
}

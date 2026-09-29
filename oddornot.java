import java.util.Scanner;
public class oddornot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Число четное");
        }
        else if (a % 2 == 1) {
            System.out.println("Число не четное");
        }
        scanner.close();
    }
}

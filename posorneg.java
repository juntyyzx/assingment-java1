import java.util.Scanner;
public class posorneg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println("Положительное");
        }
        else if (a == 0) {
            System.out.println("Число равно 0");
        }
        else {
            System.out.println("Отрицательное");
        }
        scanner.close();
    }
}

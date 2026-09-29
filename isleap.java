import java.util.Scanner;
public class isleap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("Високосный год");
        }
        else {
            System.out.println("Не високосный");
        }
        scanner.close();
    }
}

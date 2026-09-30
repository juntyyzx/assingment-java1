import java.util.Scanner;
public class operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Первое число: ");
        int a = scanner.nextInt();
        System.out.print("Оператор: ");
        char o = scanner.next().charAt(0);
        System.out.print("Второе число: ");
        int b = scanner.nextInt();
        if (o == '+') {
            System.out.print("Результат:");
            System.out.println(a + b);
        }
        else if (o == '-') {
            System.out.print("Результат:");
            System.out.println(a - b);
        }
        else if (o == '*') {
            System.out.print("Результат:");
            System.out.println(a * b);
        }
        else if (o == '/' && b != 0){
            System.out.print("Результат:");
            System.out.println(a / b);
        }
        scanner.close();
    }
}

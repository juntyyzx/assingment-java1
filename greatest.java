import java.util.Scanner; 
public class greatest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();
        if (a > b && a > c) {
            System.out.print("Максимальное число: ");
            System.out.println(a);
        }
        else if (b > a && b > c) {
            System.out.print("Максимальное число: ");
            System.out.println(b);   
        }
        else if (c > a && c > b) {
            System.out.print("Максимальное число: ");
            System.out.println(c);   
        }
        scanner.close();
    }
}

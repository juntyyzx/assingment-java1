import java.util.Scanner;
public class temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру:");
        int a = scanner.nextInt();
        if (a <= 0) {
            System.out.println("Очень холодно");
        }
        else if (a <= 10) {
            System.out.println("Холодно");
        }
        else if (a <= 20) {
            System.out.println("Прохладно");
        }
        else if (a <= 30) {
            System.out.println("Тепло");
        }
        else if (a > 30) {
            System.out.println("Жарко");
        }
        scanner.close();
    }
}

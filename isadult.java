import java.util.Scanner;
public class isadult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст:");
        int a = scanner.nextInt();
        if (a<0) {
            System.out.println("Недопустимый возраст");
        }
        else if (a<18) {
            System.out.println("Вы несовершеннолетний");
        }
        else {
            System.out.println("Вы совершеннолетний");
        }
        scanner.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите переменную 'x'");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("введена" + x);
        System.out.println(" дальше введите переменную 'y'");
        int y = scan.nextInt();
        System.out.println("введены " + x + " и " + y);
        System.out.println("Дальше введите требуемую операцию: + - * /");
        char operation = scan.next().charAt(0);
        if (operation == '+') {
            System.out.println(x + y);
        } else {
            if (operation == '-') {
                System.out.println(x - y);
            } else {
                if (operation == '*') {
                    System.out.println(x * y);
                } else {
                    if (operation == '/') {
                        System.out.println(x / y);
                    } else {
                        System.out.println("неизвестная операция");
                    }
                }
            }
        }
    }
}
import java.util.Scanner;

public class calculation {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        if (b != 0) {
            System.out.println((double)a / b);
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

}

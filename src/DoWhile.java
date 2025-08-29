import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int i = 1;
        if (num > 0) {
            do {
                System.out.println(i);
                i++;
            }
            while (i <= num);
        }
    }
}

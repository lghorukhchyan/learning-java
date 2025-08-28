import java.util.Scanner;

public class checkIf {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a > 0 ) {
            System.out.println("The number is greater than 0");
        }
        else if (a == 0 ) {
            System.out.println("The number is 0");
        }
        else {
        System.out.println("The number is less than 0");
        }
    }
    }


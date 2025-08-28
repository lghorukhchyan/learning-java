import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num >= 90 && num <= 100) {
            System.out.println("The grade is A");
        }
        else if (num >= 80 && num < 90) {
            System.out.println("The grade is B");
        }
        else if (num >= 70 && num < 80) {
            System.out.println("The grade is C");
        }
        else if (num >= 60 && num < 70) {
            System.out.println("The grade is D");
        }
        else if (num >= 0 && num < 60) {
            System.out.println("The grade is F");
        }
        else {
            System.out.println("Invalid grade");
        }
    }
}

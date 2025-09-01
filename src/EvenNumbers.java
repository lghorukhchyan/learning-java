import java.util.Scanner;

//Print all even numbers between 1 and 50
public class EvenNumbers {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

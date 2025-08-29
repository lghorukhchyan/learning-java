//  Print the sum of numbers from 1 to 100.
public class SumLoopFor {
    public static void main(String[] args) {
       int sum = 0;

       for (int i = 1; i <= 100; i++) {
           sum += i;
       }
       System.out.println("The sum is:" +sum);

    }
}

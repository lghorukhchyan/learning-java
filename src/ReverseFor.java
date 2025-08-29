import java.util.Scanner;

public class ReverseFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int j = num; j >= 1; j--){
            System.out.println(j);
        }
    }
}

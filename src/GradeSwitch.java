import java.util.Scanner;

public class GradeSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num < 0 || num > 100) {
            System.out.println("Invalid grade!");
            return;
        }
        switch (num / 10) {
            case 10:
            case 9:
                System.out.println("Grade A");
                break;
                case 8:
                    System.out.println("Grade B");
                    break;
                    case 7:
                        System.out.println("Grade C");
                        break;
                        case 6:
                        System.out.println("Grade D");
                        break;
                        default:
                            System.out.println("Grade F");
        }
    }
}

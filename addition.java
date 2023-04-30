import java.util.Scanner;
public class addition {
    public static void main(String[] args) {
        int num1, num2;
        System.out.print("Enter both the numbers to add: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("\nAddition = " + (num1+num2));
    }
}


import java.util.Scanner;
public class scannerImplementation {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num_1 = sc.nextInt();
        System.out.println("your number + 10 = "+(num_1+10));

    }
}

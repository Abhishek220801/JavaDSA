import java.util.Scanner;
public class loopProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int digits=0;
        while(n!=0){
            n/=10;
            digits++;
        }
        System.out.println("the number of digits in your numbers = "+digits);
    }
}

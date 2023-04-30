import java.util.*;
public class digitSum {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = n;
        for(int i=n1;i>0;i--){
            int digit = n1%10;
            sum+=digit;
            n1/=10;
        }
        System.out.println("The sum of digits in "+n+" = "+sum);
    }
}

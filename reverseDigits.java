import java.util.*;
public class reverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reverse = 0;
        int n = sc.nextInt();
        while(n>0){
            reverse= reverse*10+n%10;
            n/=10;
        }
        System.out.println("Reverse = "+reverse);
    }
}

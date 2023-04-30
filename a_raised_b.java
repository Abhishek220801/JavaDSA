import java.util.*;
public class a_raised_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 1;
        int a= sc.nextInt(),b=sc.nextInt();
        for(int i=1;i<=b;i++)
            ans*=a;
        System.out.println("answer = "+ans);
    }
}

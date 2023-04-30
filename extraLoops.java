import java.util.Scanner;
public class extraLoops {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num!=-1){
            sum+=num;
            num = sc.nextInt();
        }
        System.out.println(sum);
    }
}

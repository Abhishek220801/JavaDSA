import java.util.*;
public class break_continue{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of n: ");
        // int n = sc.nextInt();
        // for(int i=n;i<100;i++){
        //     if(i==10) break;
        //     System.out.println("i: "+i);
        // }
        // System.out.println("Loop complete.");

        int num = 1;
        while(true){
            if((num%5==0)&&(num%7==0)){
                System.out.println("Found ans: "+num);
                break;
            }
            num++;
        }
    }
}

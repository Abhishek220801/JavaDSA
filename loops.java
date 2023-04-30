import java.util.Scanner;
public class loops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* print 1 to n
        int num = 1;
        int n = sc.nextInt();
        while(num<=n){
            System.out.println(num);;
            num++;
        */

        int sum = 0;
        System.out.print("enter the number: ");
        int n = sc.nextInt();

        // sum of n natural numbers using while loop 
        while(num<=n){
            sum+=num;
            num++;
        }
        System.out.println("The sum of first "+n+" natural numbers = "+ sum);

        //sum of n natural numbers using for loop    
        for(int num=1;num<=n;num++){
            sum+=num;
        }
        System.out.println("The sum of first "+n+" natural numbers = "+ sum); 

        //reverse print 
        for(int num=n;num>=1;num-=2){
            System.out.print(num + " ");
        }

        

    }
}

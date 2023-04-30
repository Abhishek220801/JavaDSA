import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;
public class conditionals {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        /*
        System.out.print("Enter a number here: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Your number is even");
        }
        else{
            System.out.println("Your number is odd");
        */

        /* 
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age<12){
            System.out.println("Child");
        }
        else if(12<=age && age<=18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Adult");
        } 
        */ 

        /*
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        String result = (num%2==0)?"even":"odd";
        System.out.println(result);
         */

        /*
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int ans = ((num%2==0)&&(num%3==0))?num:null;
        System.out.println(num);
        */

        int value = sc.nextInt();
        int ans = ((value%3==0)||(value%5==0))?value:null;
        System.out.println("Found the answer - " + ans);
    }
}


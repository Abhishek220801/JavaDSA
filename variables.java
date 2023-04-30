import java.util.*;
public class variables{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //1.Average of 3 numbers 
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int average = (A+B+C)/3;
        System.out.print("The average of these numbers would be: ");
        System.out.println(average);
        
        //2.Area of square 
        float side = sc.nextInt();
        float area = side*side;
        System.out.print("Area of square = ");
        System.out.println(area);
        
        //3.Total Bill Cost 
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float totalCost = (float)((pencil + pen + eraser) + (pencil + pen + eraser)*0.18);
        System.out.println(totalCost);
        
        //4.which data type is result
        //double(the largest)
        
        //5.error or not?
        int abc$ = 24;
        System.out.println(abc$);
        //no error
        
    }
}
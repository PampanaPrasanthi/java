import java.io.*;
import java.util.*;
public class FactoriualofNumber{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value as positive number");
        int n = sc.nextInt();
        int fact=1;
        for(int i=2;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is "+ fact);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session1;

/**
 *
 * @author omar
 */
import java.util.*;
public class p4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 4 numbers to calculate average");
        double arr[] = new double[4];
        for(int i=0 ; i<arr.length ; i++)
            arr[i]=in.nextDouble();
        System.out.println("average = "+CalculateSum(arr));
    }
    public static double CalculateSum(double arr[])
    {
        double sum=0;
            
        for(int i=0 ; i<arr.length ; i++)
            sum += arr[i];
        
        return sum/arr.length;
    }
}

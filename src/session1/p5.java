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
public class p5 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("enter two number");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
        System.out.println(num1+" * "+num2+" = "+(num1*num2));
        try{
            System.out.println(num1+" mod "+num2+" = "+(num1%num2));
            System.out.println(num1+" divde by "+num2+" = "+(num1/num2));
        }catch(Exception e){
            System.out.println("can not divide by zero "+e.getLocalizedMessage());
        }
    }
}

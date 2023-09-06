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
public class p2 {
    public static void main(String[] args) {
        Number number = new Number();
        number.num1 = 10; number.num2 = 35;
        System.out.println("before ---> num1 = "+number.num1 +" , num2 = "+number.num2);
        Swap(number);
        System.out.println("after  ---> num1 = "+number.num1 +" , num2 = "+number.num2);
    }
    public static void Swap(Number num){
        int temp = num.num1;
        num.num1 = num.num2;
        num.num2 = temp;
    }
}
class Number{
    public int num1,num2;
}
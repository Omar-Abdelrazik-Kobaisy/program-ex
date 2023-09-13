/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session2;

/**
 *
 * @author omar
 */
public class p1 {
    public static void main(String[] args) {
        System.out.println(manipulateString("hello")); 
    }
    public static String manipulateString(String str){
        return str.charAt(0)+str+str.charAt(0);
    }
}

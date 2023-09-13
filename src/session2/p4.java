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
import java.util.*;
public class p4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter String");
        String str = in.next();
        System.out.println(str.length()<4 ? str.toUpperCase() : ":)");
    }
}

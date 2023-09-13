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
public class p6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secondes = input.nextInt();
        int hours , minutes;
        hours = secondes / 3600;
        minutes = (secondes % 3600)/60;
        secondes = (secondes%3600)%60;
        System.out.println("=>: "+ hours +" h : "+minutes+" m : "+secondes+" s");
        
    }
}

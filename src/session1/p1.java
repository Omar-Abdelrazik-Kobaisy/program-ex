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
public class p1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("please enter degree in celsius : ");
        double celsiusDegree = in.nextDouble();
        System.out.println(ConvertToFarhnhiet(celsiusDegree));
        System.out.println(ConvertToKelvin(celsiusDegree));
        }
    public static String ConvertToFarhnhiet(double celsiusDegree){
//        °F = °C × (9/5) + 32
        return celsiusDegree<=-271.15?
                "Temperature below absolute zero":
                "T = "+(celsiusDegree *9/5 + 32)+"°F";
    }
    
    public static String ConvertToKelvin(double celsiusDegree){
//        °F = °C + 273.15
        return "T = "+(celsiusDegree + 273.15)+"°K";
    }
}

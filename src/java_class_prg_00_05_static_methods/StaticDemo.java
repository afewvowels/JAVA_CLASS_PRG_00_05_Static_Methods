/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_class_prg_00_05_static_methods;

/**
 *
 * @author kbsmith01
 */
public class StaticDemo {
    public static void main (String[] args) {
        double a = 3.75;
        double b = squareRoot(a);
        
        // Really calling:
        b = StaticDemo.squareRoot(a);
        
        System.out.println("The square root of " + a + " is " + b);
    }
    
    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

/**
 *
 * @author Green
 */
public class Calculation {  
    
    public void Izvade(String a){
        System.out.println(a);
    }
    
    public double Sum(double a, double b){
        
        double sum = a + b;                
        return sum;
    }
    
    public double Minus(double a, double b){
        
        double minus = a - b;                
        return minus;
    }
    
    public double Multiply(double a, double b){
        
        double multiply = a * b;                
        return multiply;
    }
    
    public double Divide(double a, double b){
        
        double divide = a / b;                
        return divide;
    }
}

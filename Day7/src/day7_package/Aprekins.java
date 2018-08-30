/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7_package;

/**
 *
 * @author Green
 */
public class Aprekins {
    
    String result;
    
    public String Sum(double a, double b){
        result = String.valueOf(a + b);
        
        return result;
    }
    
    public String Minus(double a, double b){
        result = String.valueOf(a - b);
        
        return result;
    }
    
    public String Mult(double a, double b){
       result = String.valueOf(a * b);
        
        return result;
    }
    
    public String Div(double a, double b){
       result = String.valueOf(a / b);
        
        return result;
    }
    
    public String Kap(double a, double b){
        
        double res = 1;
        
        for(int i = 0; i < b; i++){                       
            res = res * a;
        }        
        result = String.valueOf(res);
        
        return result;
    }
}

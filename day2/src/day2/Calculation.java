
package day2;

public class Calculation {
    
    public double Plus(double no1, double no2){
        double sum = no1 + no2;
        System.out.println("Skaitļu summa ir " + sum);
        return sum;        
    }
    
    public double Minus(double no1, double no2){
        double min = no1 - no2;
        System.out.println("Skaitļu starpība ir " + min);
        return min;
    }
    
    public double Multiply(double no1, double no2){
        double mult = no1 * no2;
        System.out.println("Skaitļu reizinājums ir " + mult);
        return mult;
    }
    
    public double Divide(double no1, double no2){
        double div = no1 / no2;
        System.out.println("Skaitļu dalījums ir " + div);
        return div;
    }
}

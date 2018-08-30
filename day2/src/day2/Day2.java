package day2;

import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) {
        Calculation calc = new Calculation();
        Scanner obj = new Scanner(System.in);
                
        System.out.println("Ievadi darbību (+;-;*;/): ");
        String oper = obj.nextLine();
        System.out.println("Ievadi 1. skaitli: ");
        double no1 = obj.nextDouble();
        System.out.println("Ievadi 2. skaitli: ");
        double no2 = obj.nextDouble();
               
        if(oper.equals("+")){
            double sum = calc.Plus(no1, no2);            
        }else if(oper.equals("-")){
            double min = calc.Minus(no1, no2);            
        }else if(oper.equals("*")){
            double mult = calc.Multiply(no1, no2);            
        }else if(oper.equals("/")){
            double div = calc.Divide(no1, no2);            
        }else{
            System.out.println("Ievadītā darbība neatbilst prasībām!");
        }
                
        /*
        
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Ievadi skaitli: ");
        int skaitlis = obj.nextInt();
        
        if(skaitlis <= 5){
            System.out.println("#");
        }else{
            System.out.println("##");
        }
        
        */
    }    
}

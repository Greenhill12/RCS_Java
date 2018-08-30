package day1;

import java.util.Scanner;

public class Day1 {
    
    public static void main(String[] args) {        
        Calculation calc = new Calculation();
        Scanner sc = new Scanner(System.in);
        
        /*
        calc.Izvade("Hello Green!");
        calc.Izvade("Ko dari?");
        */
        
        System.out.print("Ievadi pirmo skaitli: ");
        double num1 = sc.nextDouble();
        System.out.print("Ievadi otro skaitli: ");
        double num2 = sc.nextDouble();
        
        double sum = calc.Sum(num1, num2);
        double minus = calc.Minus(num1, num2);
        double multiply = calc.Multiply(num1, num2);
        double divide = calc.Divide(num1, num2);
        
        System.out.println("Skaitlu summa ir " + sum);
        System.out.println("Skaitlu starpība ir " + minus);
        System.out.println("Skaitlu reizinājums ir " + multiply);
        System.out.println("Skaitlu dalījums ir " + divide);
        
        System.out.println("");
        
        
        
        
        
        
        /*
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ievadi savu vardu: ");
        String vards = sc.nextLine();
        
        int gads, gadsNow;
        
        System.out.print("Ievadi pasreizejo gadu: ");
        gadsNow = sc.nextInt();
        System.out.print("Ievadi savu dzimsanas gadu: ");
        gads = sc.nextInt();
        
        //vards = String.valueOf(gads);     //no int uz String
        //gads = Integer.valueOf(vards);    //no String uz int
                
        String vecums = String.valueOf(gadsNow - gads);
              
        System.out.println();
        System.out.println("Hello " + vards + "!");
        System.out.println("Tavs vecums ir " + vecums + " gadi");
        */
    }    
}

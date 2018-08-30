package day3;

import java.util.Scanner;

public class Day3 {

    public static void main(String[] args) {
        Zvaigznes zv = new Zvaigznes();
        
        System.out.println(zv.Piramida());
        
        // Piemēri par cikliem
        /*
        for(int i = 0; i < 5; i++){
            
        }
        for(int i = 5; i > 0; i--){
            
        }
        
        // sākumā jautā, tad dara
        int sk = 0;
        
        while(sk != 5){
            sk++;
            
        }        
        
        // sākumā dara, tad jautā
        do{
            sk++;
        }while(sk!=5);
        */

        
        // Klasē izstrādātais variants V3
        /*
        Daudzsturis figura = new Daudzsturis();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ievadi malu skaitu (no 3 līdz 5): ");
        figura.maluSkaits = sc.nextInt();
        System.out.println("Ievadi malu garumu: ");
        figura.malasGarums = sc.nextDouble();
        
        if(figura.Daudzsturis().equals("kļūda")){
            System.out.println("Nepareiza ievade");
        }else{       
            System.out.println("Figūra ir " + figura.Daudzsturis() + ", perimetrs ir " + figura.Perimetrs());             
        }
        */
        
        
        // Variants ar private mainīgajiem V2
        /*        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ievadi malu skaitu (no 3 līdz 5): ");
        int malas = sc.nextInt();
        System.out.println("Ievadi malu garumu: ");
        double garums = sc.nextDouble();  
        
        Daudzsturis figura = new Daudzsturis(malas, garums);
        
        System.out.println(figura.Rezultats());
        */ 
        
        
        // Varsija ar public mainīgajiem V1        
        /*       
        Daudzsturis figura = new Daudzsturis();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ievadi malu skaitu (no 3 līdz 5): ");
        figura.maluSkaits = sc.nextInt();
        System.out.println("Ievadi malu garumu: ");
        figura.malasGarums = sc.nextDouble();            
               
        System.out.println(figura.Daudzsturis());
        */
        
        
        // Variants ar public mainīgajiem V0
        /*        
        Daudzsturis figura1 = new Daudzsturis();
        figura.maluSkaits = 3;
        figura.malasGarums = 12;              
        
        Daudzsturis figura2 = new Daudzsturis();
        figura.maluSkaits = 4;
        figura.malasGarums = 16;
        */
    }
    
}

package day5;

import java.util.Scanner;

public class Piemers {
    
    public void Divdimensiju(){
        
        // Viendimensiju matrica
        int[] OneD = new int[5];
        
        // Divdimsnesiju matrica        
        Scanner sc = new Scanner(System.in);
        int[][]TwoD = new int[3][3];
        
        /*
        123
        567
        876
        */
        
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Ievadi masīva " + i + "." + j + " elementu");
                TwoD[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Tavs divdimensiju masīvs ir:");
        
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(TwoD[i][j] + " ");
            }
            System.out.println();
        }        
    }    
}

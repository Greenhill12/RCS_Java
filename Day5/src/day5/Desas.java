package day5;

import java.util.Scanner;

public class Desas {
    
    Scanner sc = new Scanner(System.in);
    
    
    public void Desas(){ 
                
        // Uztaisīt tā, lai mainītos spēlētājs, kas ievada X vai O. Katrs var ievadīt tikai vienu.
        System.out.println("ak - augšā pa kreisi");
        System.out.println("av - augšā pa vidu");
        System.out.println("al - augšā pa labi");
        System.out.println("vk - vidū pa kreisi");
        System.out.println("vv - vidū pa vidu");
        System.out.println("vl - vidū pa labi");
        System.out.println("lk - lejā pa kreisi");
        System.out.println("lv - lejā pa vidu");
        System.out.println("ll - lejā pa labi");
        System.out.println();
                
        String[][] laukums = new String[3][3];
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                laukums[i][j] = "-";
            }
        }
                
        String spO = "O";
        String spX = "X";
        
        
        boolean gameOver = false;
        
        
        while(gameOver == false){
            boolean result = false;
            boolean result2 = false;
            
           if(laukums[0][0] == "X" && laukums[0][1] == "X" && laukums[0][2] == "X" ||
            laukums[1][0] == "X" && laukums[1][1] == "X" && laukums[1][2] == "X" ||
            laukums[2][0] == "X" && laukums[2][1] == "X" && laukums[2][2] == "X" ||
            laukums[0][0] == "X" && laukums[1][0] == "X" && laukums[2][0] == "X" ||
            laukums[0][1] == "X" && laukums[1][1] == "X" && laukums[2][1] == "X" ||
            laukums[0][2] == "X" && laukums[1][2] == "X" && laukums[2][2] == "X" ||
            laukums[0][0] == "X" && laukums[1][1] == "X" && laukums[2][2] == "X" ||
            laukums[0][2] == "X" && laukums[1][1] == "X" && laukums[2][0] == "X" ||
            laukums[0][0] == "O" && laukums[0][1] == "O" && laukums[0][2] == "O" ||
            laukums[1][0] == "O" && laukums[1][1] == "O" && laukums[1][2] == "O" ||
            laukums[2][0] == "O" && laukums[2][1] == "O" && laukums[2][2] == "O" ||
            laukums[0][0] == "O" && laukums[1][0] == "O" && laukums[2][0] == "O" ||
            laukums[0][1] == "O" && laukums[1][1] == "O" && laukums[2][1] == "O" ||
            laukums[0][2] == "O" && laukums[1][2] == "O" && laukums[2][2] == "O" ||
            laukums[0][0] == "O" && laukums[1][1] == "O" && laukums[2][2] == "O" ||
            laukums[0][2] == "O" && laukums[1][1] == "O" && laukums[2][0] == "O"){
                gameOver = true;
            }
           
           
           
            if(gameOver == true){
                System.out.println("Spēle beigusies! Uzvarēja 2. spēlētājs!");
                break;
            }           
            
            while(result == false){
                System.out.println("1. spēlētājs izvēlas vietu, kur ielikt 'O'");
                String sp1 = sc.next();
                System.out.println();
                
/*                
                if(laukums[0][0] != "-" ||
                   laukums[0][1] != "-" ||
                   laukums[0][2] != "-" ||
                   laukums[1][0] != "-" ||
                   laukums[1][1] != "-" ||
                   laukums[1][2] != "-" ||
                   laukums[2][0] != "-" ||
                   laukums[2][1] != "-" ||
                   laukums[2][2] != "-") {
                    System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!"); 
                }
                */
               
                switch(sp1){
                    case "ak":
                        if(laukums[0][0] != "-"){
                            System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                            System.out.println();
                            break;
                        }else{
                            laukums[0][0] = spO;
                            result = true;
                            break;
                        }                        
                    case "av":
                        if(laukums[0][1] != "-"){
                            System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                            System.out.println();
                            break;
                        }else{
                            laukums[0][1] = spO;
                            result = true;
                            break;
                        }
                    case "al":
                        if(laukums[0][2] != "-"){
                            System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                            System.out.println();
                            break;
                        }else{
                            laukums[0][2] = spO;
                            result = true;
                            break;
                        }
                    case "vk":
                        if(laukums[1][0] != "-"){
                            System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                            System.out.println();
                            break;
                        }else{
                            laukums[1][0] = spO;
                            result = true;
                            break;
                        }
                    case "vv":
                        if(laukums[1][1] != "-"){
                            System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                            System.out.println();
                            break;
                        }else{
                            laukums[1][1] = spO;
                            result = true;
                            break;
                        }
                    case "vl":
                        if(laukums[1][2] != "-"){
                            System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                            System.out.println();
                            break;
                        }else{
                            laukums[1][2] = spO;
                            result = true;
                            break;
                        }
                    case "lk":
                        if(laukums[2][0] != "-"){
                            System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                            System.out.println();
                            break;
                        }else{
                            laukums[2][0] = spO;
                            result = true;
                            break;
                        }
                    case "lv":
                        if(laukums[2][1] != "-"){
                            System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                            System.out.println();
                            break;
                        }else{
                            laukums[2][1] = spO;
                            result = true;
                            break;
                        }
                    case "ll":
                        if(laukums[2][2] != "-"){
                            System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                            System.out.println();
                            break;
                        }else{
                            laukums[2][2] = spO;
                            result = true;
                            break;
                        }
                    default:
                        System.out.println("Ievadītā pozīcija ir ārpus spēles laukuma! Ievadi vietas saīsinājumu vēlreiz:");
                        result = false;
                } 
            }
            
            for(int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    System.out.print(laukums[i][j] + " ");
                }
            System.out.println();
            } 
            
            if(laukums[0][0] == "X" && laukums[0][1] == "X" && laukums[0][2] == "X" ||
                laukums[1][0] == "X" && laukums[1][1] == "X" && laukums[1][2] == "X" ||
                laukums[2][0] == "X" && laukums[2][1] == "X" && laukums[2][2] == "X" ||
                laukums[0][0] == "X" && laukums[1][0] == "X" && laukums[2][0] == "X" ||
                laukums[0][1] == "X" && laukums[1][1] == "X" && laukums[2][1] == "X" ||
                laukums[0][2] == "X" && laukums[1][2] == "X" && laukums[2][2] == "X" ||
                laukums[0][0] == "X" && laukums[1][1] == "X" && laukums[2][2] == "X" ||
                laukums[0][2] == "X" && laukums[1][1] == "X" && laukums[2][0] == "X" ||
                laukums[0][0] == "O" && laukums[0][1] == "O" && laukums[0][2] == "O" ||
                laukums[1][0] == "O" && laukums[1][1] == "O" && laukums[1][2] == "O" ||
                laukums[2][0] == "O" && laukums[2][1] == "O" && laukums[2][2] == "O" ||
                laukums[0][0] == "O" && laukums[1][0] == "O" && laukums[2][0] == "O" ||
                laukums[0][1] == "O" && laukums[1][1] == "O" && laukums[2][1] == "O" ||
                laukums[0][2] == "O" && laukums[1][2] == "O" && laukums[2][2] == "O" ||
                laukums[0][0] == "O" && laukums[1][1] == "O" && laukums[2][2] == "O" ||
                laukums[0][2] == "O" && laukums[1][1] == "O" && laukums[2][0] == "O"){
                gameOver = true;
            }
            if(gameOver == true){
                System.out.println("Spēle beigusies! Uzvarēja 1. spēlētājs!");
                break;
            }
            
            while(result2 == false){
                System.out.println("2. spēlētājs izvēlas vietu, kur ielikt 'X'");
                String sp2 = sc.next();
                System.out.println();

                switch(sp2){
                     case "ak":
                        if(laukums[0][0] != "-"){
                            System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                            System.out.println();
                            break;
                        }else{
                            laukums[0][0] = spX;
                            result2 = true;
                            break;
                        }                        
                    case "av":
                        if(laukums[0][1] != "-"){
                            System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                            System.out.println();
                            break;
                        }else{
                            laukums[0][1] = spX;
                            result2 = true;
                            break;
                        }
                    case "al":
                        if(laukums[0][2] != "-"){
                            System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                            System.out.println();
                            break;
                        }else{
                            laukums[0][2] = spX;
                            result2 = true;
                            break;
                        }
                    case "vk":
                        if(laukums[1][0] != "-"){
                            System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                            System.out.println();
                            break;
                        }else{
                            laukums[1][0] = spX;
                            result2 = true;
                            break;
                        }
                    case "vv":
                        if(laukums[1][1] != "-"){
                            System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                            System.out.println();
                            break;
                        }else{
                            laukums[1][1] = spX;
                            result2 = true;
                            break;
                        }
                    case "vl":
                        if(laukums[1][2] != "-"){
                            System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                            System.out.println();
                            break;
                        }else{
                            laukums[1][2] = spX;
                            result2 = true;
                            break;
                        }
                    case "lk":
                        if(laukums[2][0] != "-"){
                            System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                            System.out.println();
                            break;
                        }else{
                            laukums[2][0] = spX;
                            result2 = true;
                            break;
                        }
                    case "lv":
                        if(laukums[2][1] != "-"){
                            System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                            System.out.println();
                            break;
                        }else{
                            laukums[2][1] = spX;
                            result2 = true;
                            break;
                        }
                    case "ll":
                        if(laukums[2][2] != "-"){
                            System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                            System.out.println();
                            break;
                        }else{
                            laukums[2][2] = spX;
                            result2 = true;
                            break;
                        }
                    default:
                        System.out.println("Ievadītā pozīcija ir ārpus spēles laukuma!");
                        result2 = false;
                }
            }
                
            for(int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    System.out.print(laukums[i][j] + " ");
                }
            System.out.println();
            }
            
            
        }   
    }
}
    
   /*
    
    static String Laukums[][] = new String[3][3];
    
    public void Laukums(String[][] args){
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                Laukums[i][j] = "-";
            }
        }
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(Laukums[i][j] + " ");
            }
        System.out.println();
        }    
    }
    
    public boolean Parbaude(){
    
        boolean check = true;
        
        if(Laukums[0][0] == "X" && Laukums[0][1] == "X" && Laukums[0][2] == "X" ||
           Laukums[1][0] == "X" && Laukums[1][1] == "X" && Laukums[1][2] == "X" ||
           Laukums[2][0] == "X" && Laukums[2][1] == "X" && Laukums[2][2] == "X" ||
           Laukums[0][0] == "X" && Laukums[1][0] == "X" && Laukums[2][0] == "X" ||
           Laukums[0][1] == "X" && Laukums[1][1] == "X" && Laukums[2][1] == "X" ||
           Laukums[0][2] == "X" && Laukums[1][2] == "X" && Laukums[2][2] == "X" ||
           Laukums[0][0] == "X" && Laukums[1][1] == "X" && Laukums[2][2] == "X" ||
           Laukums[0][2] == "X" && Laukums[1][1] == "X" && Laukums[2][0] == "X" ||
           Laukums[0][0] == "O" && Laukums[0][1] == "O" && Laukums[0][2] == "O" ||
           Laukums[1][0] == "O" && Laukums[1][1] == "O" && Laukums[1][2] == "O" ||
           Laukums[2][0] == "O" && Laukums[2][1] == "O" && Laukums[2][2] == "O" ||
           Laukums[0][0] == "O" && Laukums[1][0] == "O" && Laukums[2][0] == "O" ||
           Laukums[0][1] == "O" && Laukums[1][1] == "O" && Laukums[2][1] == "O" ||
           Laukums[0][2] == "O" && Laukums[1][2] == "O" && Laukums[2][2] == "O" ||
           Laukums[0][0] == "O" && Laukums[1][1] == "O" && Laukums[2][2] == "O" ||
           Laukums[0][2] == "O" && Laukums[1][1] == "O" && Laukums[2][0] == "O"){
            
            check = false;
        }
        
        return check;
    }  
}


        
        
        
        // Ja ievada kaut ko citu, tad paprasīt vēlreiz
        
        // Pārbaudīt uzvaras nosacījumus un beigt spēli, ja masīvs ir aizpildīts
        
        // Drīkst izpildīt gājienu tikai brīvajā vietā

    
    
    
    /*
    public void JaunaSpele(){
        
        char jSpele = ' ';
        System.out.println("Vai vēlies sākt jaunu spēli ('j'/'n')");
        jSpele = sc.next().charAt(0);
         
    }
*/
    


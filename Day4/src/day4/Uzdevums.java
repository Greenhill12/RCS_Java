package day4;

import java.util.Scanner;

public class Uzdevums { 
    
    Scanner sc = new Scanner(System.in);
            
    public void Interfeiss(){
                
        String funkc = "";
                
        while(!funkc.equals("exit")) {
            System.out.println("---");
            System.out.println("Izvēlies funkciju, kuru vēlies izsaukt: ");
            System.out.println("1 - kapinasana");
            System.out.println("2 - masivaIzvade");
            System.out.println("3 - masivaIevade");
            System.out.println("4 - Piramida");
            System.out.println("5 - Rombs");
            System.out.println("6 - Cipari");
            System.out.println("Ja vēlies beigt, raksti 'exit'");
            funkc = sc.next();
            System.out.println("---");
            
            switch(funkc){
                case "1":
                    System.out.println("Ievadi lūdzu skaitli, kuru vēlies kāpināt: ");

                    int sk = sc.nextInt();
                    System.out.println("Ievadi lūdzu kāpinātaju: ");
                    int pak = sc.nextInt();

                    System.out.println("Rezultāts ir " + kapinasana(sk, pak));
                    break;
                case "2":
                    masivaIzvade();
                    break;
                case "3":
                    masivaIevade();
                    break;
                case "4":
                    Piramida();
                    break;
                case "5":
                    Rombs();
                    break;
                case "6":
                    Cipari();
                    break;
                default:
                    System.out.println("Ievadītā vērtība nav definēta!");
                    break;
            }
        }   
    }
    
    private int kapinasana(int skaitlis, int pakape){
        int rezultats = 1;

        for(int i = 0; i < pakape; i++){
            rezultats = rezultats * skaitlis;
        }
        return rezultats;
    }
    
    private void masivaIzvade(){
        
        int[] masivs = new int[5];
        masivs[0] = 4;
        masivs[1] = 3;
        masivs[2] = 2;
        masivs[3] = 7;
        masivs[4] = 10;
        
        //System.out.println(masivs[0]);
        
        for(int i = 0; i < masivs.length; i++){
            System.out.println(masivs[i]);
        }
    }
    
    private void masivaIevade(){
        
        int[] masivs = new int[5];
        
        for(int i = 0; i < masivs.length; i++){
            System.out.println("Ievadi masīva " + i + ". elementu: ");
            masivs[i] = sc.nextInt();
        }
        System.out.println("");
        
        for(int i = 0; i < masivs.length; i++){
            System.out.println(masivs[i]);
        }
    }
    
    private void Piramida(){
        
        System.out.println("Ievadi skaitli, cik lielu piramīdu vēlies: ");
        int count = sc.nextInt();
        System.out.println();
        
        String[] masivs = new String[count];
        
        String zv = "";
        
        for(int i = 0; i < masivs.length; i++){
            zv = zv + "*";
            masivs[i] = zv;            
        }
                
        for(int i = 0; i < masivs.length; i++){
            System.out.println(masivs[i]);
        }
                
        for(int i = masivs.length - 2; i >= 0; i--){
            System.out.println(masivs[i]);
        }
    }
    
    private void Rombs(){
        
        System.out.println("Ievadi skaitli, cik lielu rombu vēlies: ");
        int count = sc.nextInt();
        System.out.println();
        
        String[] masivs = new String[count];
        String[] masivs2 = new String[count];
                
        String zv = "";
        String tuk = "";
        
        for(int i = 0; i < masivs.length; i++){
            zv = zv + "**";
            masivs[i] = zv;            
        }
        
        for(int i = 0; i < masivs2.length; i++){
            tuk = tuk + " ";
            masivs2[i] = tuk;            
        }
        
        for(int i = 0; i < masivs.length; i++){
            System.out.print(masivs2[masivs.length - 1 - i]);
            System.out.println(masivs[i]);
        }
                
        for(int i = masivs.length - 2; i >= 0; i--){
            System.out.print(masivs2[masivs.length - 1 - i]);
            System.out.println(masivs[i]);
        }
    }
    
    private void Cipari(){
        
        System.out.println("Ievadi skaitli, cik lielu ciparu virkni vēlies: ");
        int count = sc.nextInt();
        System.out.println();
        
        int[] cip = new int[count];
                        
        for(int i = 0; i < cip.length; i++){
            cip[i] = i + 1;            
        }
                
        for(int i = 0; i < cip.length; i++){
            
            for(int r = cip.length; r > i; r--){
                                
                System.out.print(cip[cip.length - r]);               
            }
            System.out.println();
        }
    }
}

package day5;

import java.util.Scanner;

public class TikTakToe {
    
    Scanner sc = new Scanner(System.in);
    
    private String[][] field = new String[3][3];
    
    private int playerInput;
    
    public void Play(){
        
        boolean player = true;
        
        Intro();
        InitArray();
        Draw();
        for (int i = 0; i < 9; i++){
            Game(player);
            player = !player;
            Draw();
        }
        System.out.println("Spēle beidzās neizšķirti!");    
    }
    
    private void InitArray(){
    
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                field[i][j] = "-";
            }
        }       
    }
    
    private void Draw(){
        
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    private void Intro(){
        
        System.out.println("1 - lejā pa kreisi");
        System.out.println("2 - lejā pa vidu");
        System.out.println("3 - lejā pa labi");
        System.out.println("4 - vidū pa kreisi");
        System.out.println("5 - vidū pa vidu");
        System.out.println("6 - vidū pa labi");
        System.out.println("7 - augšā pa kreisi");
        System.out.println("8 - augšā pa vidu");
        System.out.println("9 - augšā pa labi");
        System.out.println();
    }
    
    private boolean Player(int a){
        
        boolean result = false;
                
        String playerO = "O";
        String playerX = "X";
        String player = "";
        
        if(a == 1){
            player = playerO;
        }else{
            player = playerX;
        }
        
        switch(playerInput){
            case 1:
                if(!field[2][0].equals("-")){
                    System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                    System.out.println();
                }else{
                    field[2][0] = player;
                    result = true;
                }
                break;
            case 2:
                if(!field[2][1].equals("-")){
                    System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                    System.out.println();
                }else{
                    field[2][1] = player;
                    result = true;
                }                
                break;
            case 3:
                if(!field[2][2].equals("-")){
                    System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                    System.out.println();
                }else{
                    field[2][2] = player;
                    result = true;
                }
                break;
            case 4:
                if(!field[1][0].equals("-")){
                    System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                    System.out.println();
                }else{
                    field[1][0] = player;
                    result = true;
                }
                break;
            case 5:
                if(!field[1][1].equals("-")){
                    System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                    System.out.println();
                }else{
                    field[1][1] = player;
                    result = true;
                }
                break;
            case 6:
                if(!field[1][2].equals("-")){
                    System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                    System.out.println();
                }else{
                    field[1][2] = player;
                    result = true;
                }
                break;
            case 7:
                if(!field[0][0].equals("-")){
                    System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                    System.out.println();
                }else{
                    field[0][0] = player;
                    result = true;
                }
                break;
            case 8:
                if(!field[0][1].equals("-")){
                    System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                    System.out.println();
                }else{
                    field[0][1] = player;
                    result = true;
                }
                break;
            case 9:
                if(!field[0][2].equals("-")){
                    System.out.println("Šī vieta jau ir aizņemta. Izvēlies citu vietu!");
                    System.out.println();
                }else{
                    field[0][2] = player;
                    result = true;
                }
                break;
            default:
                System.out.println("Ievadītā pozīcija ir ārpus spēles laukuma! Ievadi vietas saīsinājumu vēlreiz:");
                result = false;
        }
        return result;
    }
    
    private void Game(boolean player){
        
        boolean gameOver = false;        
        
        while(gameOver == false){
            
            if(player == true){
                System.out.println("1. spēlētājs ievada vietu, kur vēlas ievietot 'O'");
                playerInput = sc.nextInt();
                
                Player(1);
                
                System.out.println();
                
            }else{
                System.out.println("2. spēlētājs ievada vietu, kur vēlas ievietot 'X'");
                playerInput = sc.nextInt();
                
                Player(2);
                
                System.out.println();
                
            }
        }
    } 
}

package day3;

public class Daudzsturis {
    
    // Variants ar private mainīgajiem V2
    
    private int maluSkaits;
    private double malasGarums;
        
    public Daudzsturis(int malas, double garums){
        malas = maluSkaits;
        garums = malasGarums;
    }
    
    public double Perimetrs(){
        double perimetrs = maluSkaits * malasGarums;
        return perimetrs;
    }
    
    public String Rezultats(){
        String fig = "";
        
        switch (maluSkaits) {
            case 3:
                fig = "trīsstūris";
                break;
            case 4:
                fig = "četrstrūtis";
                break;
            case 5:
                fig = "piecstūris";
                break;
            default:
                fig = "kļūda";
                break;
        }
        
        return fig;
    }    
    
    
    
    // Klasē izstrādātais variants V3
    /*
    public int maluSkaits;
    public double malasGarums;
    
    public double Perimetrs(){
        double perimetrs = maluSkaits * malasGarums;
        return perimetrs;
    }
    
    public String Daudzsturis(){
        String figura = "";
        
        switch (maluSkaits) {
            case 3:
                figura = "trīsstūris";
                break;
            case 4:
                figura = "četrstrūtis";
                break;
            case 5:
                figura = "piecstūris";
                break;
            default:
                figura = "kļūda";
                break;
        }
        
        return figura;
    }
    */
    
    
    // Variants ar public mainīgajiem V1
    /*    
    public int maluSkaits;
    public double malasGarums;
    
    public double Perimetrs(){
        double perimetrs = maluSkaits * malasGarums;
        return perimetrs;
    }
    
    public String Daudzsturis(){
        if(maluSkaits == 3){
            String fig = "Trīsstūris ar perimetru " + Perimetrs();
            return fig;
        }else if(maluSkaits == 4){
            String fig = "Četrstrūtis ar perimetru " + Perimetrs();
            return fig;
        }else if(maluSkaits == 5){
            String fig = "Piecstūris ar perimetru " + Perimetrs();
            return fig;
        }else{
            String fig = "Ievadītais malu skaits nav definēts!";
            return fig;
        }
    }    
    */
        
}

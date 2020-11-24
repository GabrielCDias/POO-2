package prova;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;
    
    public void Hora(int h, int m, int s){
    
        
    if(h >= 0 && h <= 24 && m >= 0 && m <= 59 && s >= 0 && s <= 59){
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }else{throw new RuntimeException("Hora inválida");}
        
    }
}

package prova;

public class Data {
 
    public int dia;
    public int mes;
    public int ano;
    
    public void Data(int dia, int mes, int ano){
    
        
    if(dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }else{throw new RuntimeException("Data inválida");}
        
    }
    
}

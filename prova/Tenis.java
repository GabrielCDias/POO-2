package prova;

public class Tenis {
    private int tamanho;
    private String tipo;
    private String modelo;
    
    public void Tenis (int tam,String tipo, String modelo ){
   
        this.tamanho = tam;
        this.tipo = tipo;
        this.modelo = modelo;
   
    }
    
    public void trocaModelo(String modelo){
    
        this.modelo = modelo;
        
    }
    
    public void retornaTenis (){
        System.out.println("Tamanho: " + tamanho +" Tipo: " + tipo + " Modelo: " + modelo );
    
    }
    
    
    
    
}

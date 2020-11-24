package prova;

public class Camisa extends Roupa {
    
    private String tamanho;
    private String cor;
    private String tipo;
    
    public void Camisa (String tam, String cor, String tipo ){
   
        this.cor = cor;
        this.tipo = tipo;
        
        if(tam == "G" || tam == "M" || tam == "P"){
        this.tamanho = tam;
        }
        else { throw new RuntimeException("Tamanho inválido");}
   
    }
    
    
    public void mudaCor (String cor){
       this.cor = cor;
    }
    
    public void retornaCamisa (){
        System.out.println("Tamanho: " + tamanho +" Cor: " + cor + " Tipo: " + tipo );
    
    }
}

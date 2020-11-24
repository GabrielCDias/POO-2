package prova;

public class Roupa {
    private int codigo;
    private String fabricante;
    private double preco;

    public void novaRoupa (int cod, String fab, double preco ){
        
        if(cod >= 0 && preco > 0){
        this.codigo = cod;
        this.preco = preco;
        this.fabricante = fab;
        
        }else{throw new RuntimeException("Preço ou Código Inválidos");}
   
    }
    
    public void descontaPreco (double desconto){
        
        this.preco = this.preco - desconto;
    }
    
    public void retornaRoupa (){
        System.out.println("A roupa de código: " + codigo + " Fabricante: " + fabricante +" Custa: " + preco);
    }
    
}

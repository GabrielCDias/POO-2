package minhabiblioteca;

public class MinhaBiblioteca {

    public static void main(String[] args) {
       
    Livro p1 = new Livro();
        
    p1.setLivro("Peter Pan");
    p1.setnCap(10);
    
    System.out.println("Informações do Livro 1");
    System.out.println(p1.toString());
}
}

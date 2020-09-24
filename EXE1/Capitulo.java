package minhabiblioteca;

public class Capitulo {
    
    private String nome;
    private int pg;
    private Livro livro;
    
    public Capitulo (String nome, int pg) {
        this.nome = nome;
        this.pg = pg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPg() {
        return pg;
    }

    public void setPg(int pg) {
        this.pg = pg;
    }
    
    
    
}
    


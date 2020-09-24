/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhabiblioteca;

public class Livro {
    
     private String livro;  
     private Biblioteca biblioteca;
     private Autor autor;
     private int nCap;
     
     public Livro() {
        this.livro = "";
    }
     
     public Livro (String livro){
         this.livro = livro;
     }
     
     public Livro (int nCap){
         
         this.nCap = nCap;
     }

    public int getnCap() {
        return nCap;
    }

    public void setnCap(int nCap) {
        this.nCap = nCap;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
     
    public String toString() {
    
        return "Nome: " + this.livro + " - Capitulos: " + this.nCap + "";
    }
}

package meubaralho;

import java.util.ArrayList;

public class Baralho {
    
   private ArrayList<Cartas> cartas;

    public Baralho() {
        cartas = new ArrayList<>();
        iniciarBaralho();
    }

    private void iniciarBaralho() {
        
        String numeros[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String naipe[] = {"Espadas","Copas","Ouros","Paus"};

        for(int nai=0; nai<naipe.length;nai++){
            for(int num=0; num<numeros.length;num++){
                adicionaCarta(numeros[num], naipe[nai]);
            }
        }
    }

    public void adicionaCarta(String numero, String naipe) {

        Cartas novaCarta = new Cartas(numero, naipe);
        cartas.add(novaCarta);
    }

    public String toString() {
        String retorno = "[ ";
        for(Cartas c: cartas) {
            retorno += c.toString() + " , ";
        }
        return retorno + " ]";
    }
}

package ex1.aula13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex1Aula13 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n;
    int saida;
    
    Set<Integer> A = new HashSet<>();
    
    while(true){
        System.out.println("Digite um número: ");
        n = sc.nextInt();
        A.addAll(Arrays.asList(n));
        
        System.out.println("Deseja inserir mais números digite [1] Deseja sair digite [0] ");
        saida = sc.nextInt();
        
        if(saida == 0) break;
    }
    
    Iterator<Integer> it = A.iterator();
    while(it.hasNext()){
        int e = it.next();
        System.out.print(e);
    }
    
    }
    
}

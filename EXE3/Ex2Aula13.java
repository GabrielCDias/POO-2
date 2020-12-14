package ex2.aula13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex2Aula13 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Map<String,String> hm = new HashMap<>();
        String nome = "";
        String tel = "";
        String prefixo = "";
        
        while(!nome.equals("*")){
            System.out.println("Digite um nome ('*' para finalizar)");
            nome = sc.nextLine();
            if(nome.equals("*")) continue;
            System.out.println("Digite o telefone ('*' para finalizar)");
            tel = sc.nextLine();
            hm.put(nome, tel);
            System.out.println(hm);
        }
        
        System.out.println("Digite [1] para buscar telefone");
        System.out.println("Digite [2] para filtrar usuários");
        int menu = sc.nextInt();
        
            if(menu == 1){
                do{
            
                System.out.println("Digite o nome da pessoa que está prcurando ('*' para finalizar)");
                nome = sc.nextLine();
                if(nome.equals("*")) continue;
                if(hm.containsKey(nome)){
                System.out.println(tel);
                }
                    
               }while(!nome.equals("*"));
       
            }
            
            else if(menu == 2){
                do{

                System.out.println("Digite o prefixo da pessoa que está prcurando ('*' para finalizar)");
                prefixo = sc.nextLine();
                if(nome.equals("*")) continue;
        
                if(hm.get(nome).startsWith(prefixo)){
                System.out.println(hm);
                }
        
               }while(!nome.equals("*"));
            
            }
            
            }
               
        sc.close();
    }
    
}

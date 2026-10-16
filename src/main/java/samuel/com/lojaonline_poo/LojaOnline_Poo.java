/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package samuel.com.lojaonline_poo;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Samuel
 */
public class LojaOnline_Poo {

    public static void main(String[] args) {
     
   
        
        List<Roupa> lista = new ArrayList<>();
        
        lista.add (new Roupa("Camisa",25.99f, 111, "Azul","G", 15)); //nome, preco, codigo, cor, tamanho e e estoque
        lista.add (new Roupa("Calça",30.80f, 222, "Jeans","P", 3));
        lista.add (new Roupa("Calça",25.99f, 333, "Preta","G", 35));
        lista.add (new Roupa("Camisa",14.99f, 444, "Vermelha","M", 5));
        lista.add (new Roupa("Camisa",25, 555, "Preta","P", 10));
        
        List<Eletronico>lista2 = new ArrayList<>();
        
        lista2.add(new Eletronico("Celular", 3.000f,1111,10,12));//nome, preco, codigo, estoque e mesGarantia
        lista2.add(new Eletronico("Computador", 2.500f,2222,2,10));
        lista2.add(new Eletronico("Liquidificador", 399.99f,3333,5,6));
        lista2.add(new Eletronico("Fone", 10.99f,4444,80,3));
        lista2.add(new Eletronico("TV", 6.999f,5555,14,12));
        
        List <Alimento> lista3= new ArrayList<>();
         
        
        lista3.add(new Alimento ("Pão",4.99f,666, 2027,300 )); //nome, preco, codigo, ano, estoque
        lista3.add(new Alimento ("Leite",5.99f,777, 2028,600 )); 
        lista3.add(new Alimento ("Maça",13.99f,888, 2026,3000 ));
        lista3.add(new Alimento ("Farinha",4.99f,999, 2027,60 )); 
        lista3.add(new Alimento ("Milho em lata",2.59f,111, 2030,40 )); 
        
        linha();
        System.out.println("Roupas");
        for (Roupa r : lista){
            r.exibirDetalhes();
            
        }
        
        linha();
        System.out.println("Eletronicos");
        for (Eletronico e : lista2){
            e.exibirDetalhes();
            
        }
        linha();
        System.out.println("Alimentos");
        for (Alimento a : lista3){
            a.exibirDetalhes();            
        }
    
    }    
        public static void linha(){
            System.out.println("-".repeat(30));  
        }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samuel.com.lojaonline_poo;

/**
 *
 * @author Samuel
 */
public class Alimento extends Produto{
        
    private int anoVencimento;

    public Alimento(String nome, float preco, int codigo,int anoVencimento, int estoque) {
        super(nome, preco, codigo, estoque);
        
    this.anoVencimento = anoVencimento;
    }
    
            
    @Override
    public void calcularDesconto() {
           setPreco(getPreco() - (getPreco()* 5)/100);
        }
    
    @Override
    public void exibirDetalhes() {
        System.out.println("Alimentos: " + getNome()+
                "| Preço: " + getPreco()+
                "| Código: " + getCodigo()+ 
                "| Estoque: " + getEstoque() + 
                "| Vencimento:  ano de " + getAnoVencimento());
    }

    public int getAnoVencimento() {
        return anoVencimento;
    }

    public void setAnoVencimento(int anoVencimento) {
        this.anoVencimento = anoVencimento;
    }

    @Override
    public String toString() {
        return "Alimento{" + "anoVencimento: " + anoVencimento + '}';
    }    
    
 }   
    
    


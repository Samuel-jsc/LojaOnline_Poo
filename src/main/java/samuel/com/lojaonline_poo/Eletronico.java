/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samuel.com.lojaonline_poo;

/**
 *
 * @author Samuel
 */
public class Eletronico extends Produto{
    
    private int mesGarantia;
    
    public Eletronico(String nome, float preco, int codigo, int estoque,int mesGarantia) {
        super(nome, preco, codigo, estoque);
        
     this.mesGarantia = mesGarantia;
     
    }

    @Override
    public void calcularDesconto() {
        setPreco((getPreco() - (getPreco() * 15) / 100)) ;
        
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Eletronico: " + getNome()+
                "| Preço: " + getPreco()+
                "| Código: " + getCodigo()+ 
                "| Estoque: " + getEstoque() + 
                "| Garantia: " + mesGarantia + " Meses");
            
    }

    public int getMesGarantia() {
        return mesGarantia;
    }

    public void setMesGarantia(int mesGarantia) {
        if(mesGarantia <0){
            System.out.println("Precisa de Garantia valida");
            return;
        }        
        this.mesGarantia = mesGarantia;
    }

    @Override
    public String toString() {
        return "Eletronico{" + "mesGarantia: " + mesGarantia + '}';
    }
    
    
}

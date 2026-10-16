/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samuel.com.lojaonline_poo;

/**
 *
 * @author Samuel
 */
public class Roupa extends Produto {
    
    private String cor;
    private String tamanho;

    public Roupa(String nome, float preco, int codigo,String cor, String tamanho, int estoque) {
        super(nome, preco, codigo, estoque);
        //nome, preco, codigo, cor, tamanhoe e estoque
    this.tamanho = tamanho;  
    this.cor = cor;
    }

    @Override
    public void calcularDesconto() {
        setPreco((getPreco() - (getPreco() * 15) / 100)) ;
        
    }
    @Override
    public void exibirDetalhes() {
        System.out.println("Roupas: " + getNome()+
                "| Preço: " + getPreco()+
                "| Código: " + getCodigo()+ 
                "| Cor: " + getCor()+
                "| Tamanho: " + getTamanho()+
                "| Estoque: " + getEstoque());
              
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String t) {
        if (t.equalsIgnoreCase("P")||t.equalsIgnoreCase("M")|| t.equalsIgnoreCase("G")){
            this.tamanho = t ;
        }else{
            System.out.println("tamanho não permitido");
            return;
        }
              
    }

    @Override
    public String toString() {
        return "Roupa{" + "cor: " + cor + ", tamanho: " + tamanho + '}';
    }
    
    
}

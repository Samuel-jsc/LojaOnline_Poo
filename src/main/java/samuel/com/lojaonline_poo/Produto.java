/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samuel.com.lojaonline_poo;

/**
 *
 * @author Samuel
 */
public abstract class Produto {
    
    private String nome;
    private float preco;
    private int codigo;
    private int estoque;

    public Produto(String nome, float preco, int codigo, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
        this.estoque = estoque;
    }
    
    
    public abstract void calcularDesconto();
    public abstract void exibirDetalhes();
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco <0){
            System.out.println("Preço Inválido! Não pode ser negativo ");
            return;
        }
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEstoque() {
            return estoque;
        }

   public void setEstoque(int estoque) {
            this.estoque = estoque;
        }

    @Override
    public String toString() {
        return "\nProduto" + "\n nome:  " + nome + "\n  " + preco + " \n codigo:  " + codigo + "\n estoque: " + estoque;
    }
   
    
}  
   
    
    
    

   


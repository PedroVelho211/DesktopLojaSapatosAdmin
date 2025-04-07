/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table (name = "produto_tamanhos")
public class produtoTamanhos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tamanhos")
    int id;
    
    @Column(name = "tamanho")
    int tamanho;
    
    @Column(name = "quantidade")
    int quantidade;
    
    

    @ManyToOne
    @JoinColumn(name = "id_produto", referencedColumnName = "id_produto") // Match column names
    private Produto produto;


    
    
    //Constructors
    
    public produtoTamanhos() {
    }

    
    public produtoTamanhos(int tamanho, int quantidade, Produto produto) {
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    
    
    //Getters and Setters
    
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
}

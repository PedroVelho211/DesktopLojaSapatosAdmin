package Beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "marca")
    private String marca;

    @Column(name = "preco")
    private double preco;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "genero")
    private String genero;

//    @Column(name = "emEstoque")
//    private String emEstoque;

    //Constructors
    public Produto() {
    }

    public Produto(String nome, String marca, double preco, String categoria, String genero) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.categoria = categoria;
        this.genero = genero;

    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

//    public Boolean getEmEstoque() {
//        return emEstoque;
//    }
//
//    public void setEmEstoque(Boolean emEstoque) {
//        this.emEstoque = emEstoque;
//    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}

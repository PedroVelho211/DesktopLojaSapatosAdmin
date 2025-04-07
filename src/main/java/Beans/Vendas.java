/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class Vendas {
    
    Date data;
    Double valorTotal;
    Cliente cliente;
    
    ArrayList<Produto> produtosDescricao;

    
    
    //Constructors
    
    public Vendas() {
    }

    public Vendas(Date data, Double valorTotal , ArrayList<Produto> produtosDescricao, Cliente cliente) {
        this.data = data;
        this.valorTotal = valorTotal;
        
        this.produtosDescricao = produtosDescricao;
        this.cliente = cliente;
    }
    
    
    //Getters and Setters
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }


    public ArrayList<Produto> getProdutos() {
        return produtosDescricao;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtosDescricao = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
}

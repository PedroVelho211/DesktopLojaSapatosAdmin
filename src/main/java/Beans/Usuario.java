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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table (name = "usuarios")
public class Usuario {
    
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY) 
    @Column (name = "id_usuario")
    int id;
    
    @Column (name = "login")
    String login;   
    
    @Column (name = "senha")
    String senha;   
    
    @Column (name = "tipo")
    String tipo;    //administrador caixa pesquisa
    
    @OneToOne
    @JoinColumn(name = "id_funcionario", referencedColumnName = "id_funcionario") // Ensure column names match the database
    private Funcionario funcionario;

   

    
    
    //Constructors
    
    public Usuario() {
    }

    public Usuario(Funcionario funcionario, String login, String senha, String tipo) {
        this.login = funcionario.getCpf();
        this.senha = senha;
        this.tipo = tipo;
    }

    
    //Getters and Setters
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}

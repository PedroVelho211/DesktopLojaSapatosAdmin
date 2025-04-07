package Beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 *
 * @author User
 */
@Entity
@Table (name = "funcionarios")
public class Funcionario {

    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY) 
    @Column (name = "id_funcionario")
    private int id;
    
    @Column (name = "nome")
    private String nome;
    
    @Column (name = "cpf")
    private String cpf;
    
    @Column (name = "telefone")
    private String telefone;
    
    @Column (name = "salario")
    private double salario;

    
    
    //Constructors
    
    public Funcionario() {
    }

    public Funcionario(int id, String nome, String cpf, String telefone, double salario) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}

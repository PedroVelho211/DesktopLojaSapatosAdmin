package Beans;

/**
 *
 * @author User
 */
public class Cliente {

    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String status;   // Premium , Normal

    
    
    //Constructors
    
    public Cliente() {
    }

    public Cliente(int id, String nome, String cpf, String telefone, String status) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.status = status;
    }

    // Getters and setters
    
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}

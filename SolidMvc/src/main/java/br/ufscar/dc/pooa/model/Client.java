package br.ufscar.dc.pooa.model;

// Classe domain resposavelpor  encapsulamento dos valores de Client, utilizada 
// como definicao do tipo generico da implementacao de IDAO por ClientDAO.
public class Client {
    private int id;
    private String cpf;
    private String nome;
    private String email;
    
    public Client(int id, String cpf, String nome, String email){
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }
    
    public Client(){
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return this.email;
    }
}

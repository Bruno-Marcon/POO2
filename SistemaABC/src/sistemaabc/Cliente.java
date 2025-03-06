package sistemaabc;

public class Cliente {
    private String Nome;
    private String Telefone;
    private String Endereco;
    private String cpf;

    public Cliente(String Nome, String Telefone, String Endereco, String cpf) {
        this.Nome = Nome;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
        this.cpf = cpf;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}

import javax.swing.JOptionPane;

public class Pessoa{
    public String nome;
    public String cpf;
    public String email;

    public String getNome(){return this.nome;}
    public String getCpf(){return this.cpf;}
    public String getEmail(){return this.email;}

    public void setNome(){this.nome = JOptionPane.showInputDialog("Nome");}
    public void setCPF(){this.cpf = JOptionPane.showInputDialog("CPF");}
    public void setEmail(){this.email = JOptionPane.showInputDialog("Email");}
    
}

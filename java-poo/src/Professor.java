import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Professor extends Pessoa{
    
    private String salario;
    private String formacaoAcademica;


    public String getSalario(){return this.salario;}
    public String getFormacaoAcademica(){return this.formacaoAcademica;}

    public void setSalario(){this.salario = JOptionPane.showInputDialog("Salario deste professor");}
    public void setFormacaoAcademica(){this.formacaoAcademica = JOptionPane.showInputDialog("Formaçao academica deste professor");}

    Object ListagemProfessor(ArrayList<Professor> listprof)
    {
        if(listprof.size()==0){
            JOptionPane.showMessageDialog(null, "Ainda não existe Professores Cadastrados, acesse a opção ADICIONAR PROFESSOR para Cadastrar");
            return null;
        }
        Object[] al = new String[100] ;
        for(int i = 0; i < listprof.size(); i++)
        {
            al[i] = listprof.get(i).nome;
        }
        Object opt_professors = JOptionPane.showInputDialog(null,"Escolha um Professor","Professores", JOptionPane.INFORMATION_MESSAGE, null, al, al[0]);
        return opt_professors;
    }
    
    @Override
    public void MostrarInfo()
    {
        JOptionPane.showMessageDialog(null,"Nome: " + this.nome + 
                "\nCPF: " + this.cpf +
                "\nEmail: " + this.email +
                "\nSalário: " + this.salario +
                "\nFormação Acadêmica: " + this.formacaoAcademica);
    }
}

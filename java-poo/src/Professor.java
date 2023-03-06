import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Professor extends Pessoa{
    
    private String salario;
    private String formacaoAcademica;


    public String getSalario(){return this.salario;}
    public String getFormacaoAcademica(){return this.formacaoAcademica;}

    public void setSalario(){this.salario = JOptionPane.showInputDialog("Salario deste professor");}
    public void setFormacaoAcademica(){this.formacaoAcademica = JOptionPane.showInputDialog("Formaçao academica deste professor");}

    String ListagemProfessores(ArrayList<Professor> listProfs)
    {
        Object[] al = new String[100] ;
        for(int i = 0; i < listProfs.size(); i++)
        {
            al[i] = listProfs.get(i).nome;
        }
        Object opt_prof = JOptionPane.showInputDialog(null,"Escolha um Professor","Professores", JOptionPane.INFORMATION_MESSAGE, null, al, al[0]);
        
        return opt_prof;
    }
}

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Aluno {
    private String nome;
    private String cpf;
    private String matricula;
    private String email;
    private ArrayList<Disciplina> disciplinas;


    public String getNome(){return this.nome;}
    public String getCpf(){return this.cpf;}
    public String getMatricula(){return this.matricula;}
    public String getEmail(){return this.email;}

    public void setNome(){this.nome = JOptionPane.showInputDialog("Nome do aluno");}
    public void setCPF(){this.cpf = JOptionPane.showInputDialog("CPF");}
    public void setMatricula(){this.matricula = JOptionPane.showInputDialog("Numero de matricula do aluno");}
    public void setEmail(){this.email = JOptionPane.showInputDialog("Email do aluno");}
    public void setDici(){
        
    Object[] options = {1,2,3,4,5,6,7,8,9};
    Object op = JOptionPane.showInputDialog(null,"Escolha quantas disciplinas deseja cadastrar:","Opções",JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
    Disciplina disciplina= new Disciplina();
    ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    int opint = op.hashCode();
    for(int i=0;i<opint;i++){
        disciplina.setNomeDisciplina();
        disciplina.setNota();
        disciplina.setFaltas();
        disciplinas.add(disciplina);
    }
    this.disciplinas = disciplinas;
    }

    Object ListagemAlunos(ArrayList<Aluno> listAlun)
    {
        Object[] al = new String[100] ;
        for(int i = 0; i < listAlun.size(); i++)
        {
            al[i] = listAlun.get(i).nome;
        }
        Object opt_alunos = JOptionPane.showInputDialog(null,"Escolha um aluno","Alunos", JOptionPane.INFORMATION_MESSAGE, null, al, al[0]);
        return opt_alunos;
    }

    void MostrarInfo()
    {
        JOptionPane.showMessageDialog(null,"Nome: " + this.nome + 
                "\nCPF: " + this.cpf +
                "\nMatricula: " + this.matricula +
                "\nEmail: " + this.email);
        
        for(int i=0;i<this.disciplinas.size();i++){
            int aux=i+1;
            JOptionPane.showMessageDialog(null,"Disciplina "+aux+": "+this.disciplinas.get(i).getNomeDisciplina() +
            "\nNúmero de faltas: " + this.disciplinas.get(i).getFaltas() +
            "\nNota: " + this.disciplinas.get(i).getNota());
        }
    }
}



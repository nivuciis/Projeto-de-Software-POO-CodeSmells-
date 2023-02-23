import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Aluno {
    private String nome;
    private String cpf;
    private String matricula;
    private String email;
    private ArrayList<Disciplina> discipinas;


    public String getNome(){return this.nome;}
    public String getCpf(){return this.cpf;}
    public Long getMatricula(){return this.matricula;}
    public String getEmail(){return this.email;}

    Scanner input = new Scanner(System.in);
    
    public void setNome(){
        this.nome = JOptionPane.showInputDialog("Nome do aluno");
    }

    public void setCPF(){

        this.cpf = JOptionPane.showInputDialog("CPF");
    }

    public void setMatricula(){
        this.matricula = JOptionPane.showInputDialog("Numero de matricula do aluno");
    }

    public void setEmail(){
        this.email = JOptionPane.showInputDialog("Email do aluno");
    }

    public void setDici(){
        System.out.println("-----------------------");
        System.out.println("Digite o NÚMERO DE DISCIPLINAS desse aluno:");
        int num_dici=input.nextInt();
        Disciplina disciplina= new Disciplina();
        for(int i=0;i<num_dici;i++){
            disciplina.setNomeDisciplina();
            disciplina.setNota();
            disciplina.setFaltas();
            this.discipinas.add(disciplina);
        }
        
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
                "\nEmail: " + this.email );
    }
}



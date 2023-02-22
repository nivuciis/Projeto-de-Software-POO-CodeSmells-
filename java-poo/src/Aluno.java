import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private String cpf;
    private long matricula;
    private String email;
    private ArrayList<Disciplina> discipinas;


    public String getNome(){return this.nome;}
    public String getCpf(){return this.cpf;}
    public Long getMatricula(){return this.matricula;}
    public String getEmail(){return this.email;}

    Scanner input = new Scanner(System.in);
    public void setNome(){
        System.out.println("-----------------------");
        System.out.println("Digite o NOME do aluno:");
        this.nome = input.next();
    }

    public void setCPF(){
        System.out.println("-----------------------");
        System.out.println("Digite o CPF:");
        this.cpf = input.next();
    }

    public void setMatricula(){
        System.out.println("-----------------------");
        System.out.println("Digite o número de MATRÍCULA:");
        this.matricula = input.nextLong();
    }

    public void setEmail(){
        System.out.println("-----------------------");
        System.out.println("Digite o E-MAIL desse aluno:");
        this.email = input.next();
        System.out.println("-----------------------");
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
    public void addAluno(){
        setNome();
        setCPF();
        setMatricula();
        setEmail();
    }
}



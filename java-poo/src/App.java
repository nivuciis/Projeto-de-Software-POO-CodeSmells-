import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        ArrayList<Aluno> Alunos = new ArrayList<Aluno>();
        Aluno mat = new Aluno();
        while(true){
            System.out.println("-------------- Bem vindo ao sistema de cadastro! -------------");
            System.out.println();
            System.out.println("-----> MENU <-----");
            System.out.println();
            System.out.println("Opções:\n"
                + "\n 1.Matricular um aluno no sistema." 
                + "\n 2.Remover um aluno." //NAO REFEITO AINDA
                + "\n 3.Adicionar Nota." //NAO REFEITO AINDA
                + "\n 4.Alterar Nota." //NAO REFEITO AINDA 
                + "\n 5.Adicionar Faltas." //NAO REFEITO AINDA 
                + "\n 6.Alterar dados de um aluno." //NAO REFEITO AINDA 
                + "\n 7.Mostrar informações de um aluno." //NAO REFEITO AINDA
                + "\n 8.Alterar Faltas." //NAO REFEITO AINDA
                + "\n 9.Adicionar Disciplinas." //NAO REFEITO AINDA
                + "\n 10.Remover Disciplinas." //NAO REFEITO AINDA
                + "\n 0.Sair\n");
            Scanner input = new Scanner(System.in);
            Object[] options = {"Matricular Aluno","Remover Aluno", "Alterar Nota","Alterar Dados", "Mostrar Informações", "Alterar Faltas", "Adicionar Notas", "Adicionar Faltas", "Adicionar Disciplinas", "Remover Disciplinas"};
            
            Object op = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(op=="Matricular Aluno"){ // 1.Matricular um aluno no sistema."
                    Aluno novoAluno = new Aluno();
                    novoAluno.setNome();
                    novoAluno.setCPF();
                    novoAluno.setMatricula();
                    novoAluno.setEmail();
                    Alunos.add(novoAluno);
                }else if(op == "Remover Aluno")
                {
                    break;

                }else if(op == "Adicionar Notas")
                {
                    break;

                }else if(op == "Alterar Nota")
                {
                    break;

                }else if(op == "Adicionar Faltas")
                {
                    break;

                }else if(op == "Alterar Dados")
                {
                    break;

                }else if(op == "Mostrar Informações") //7.Mostrar informações de um aluno."
                {
                    Object opt_alunos = mat.ListagemAlunos(Alunos);
                    for(int i = 0; i < Alunos.size(); i++)
                    {
                        if(opt_alunos == null) {break;}
                        else if(opt_alunos == Alunos.get(i).getNome())
                        {
                            Alunos.get(i).MostrarInfo();
                            break;
                        }
                    }    

                }else if(op== "Alterar Faltas")
                {
                    break;

                }else if(op == "Adicionar Disciplinas")
                {
                    break;

                }else if(op == "Remover Disciplinas")
                {
                    break;
                }

                else if(op == null)
                {
                    break;
                }
            }
        }
}



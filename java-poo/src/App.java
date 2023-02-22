import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args){
        ArrayList<Aluno> Alunos = new ArrayList<Aluno>();

        System.out.println("-------------- Bem vindo ao sistema de cadastro! -------------");
        System.out.println();
        while(true){
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
            Scanner opt = new Scanner(System.in);
            System.out.println("Digite uma opção (Nº INTEIRO): ");
            String op="";
            while(op==""){
                op=opt.nextLine();
                if(op==""){
                    System.out.println();
                    System.out.println("---NECESSARIO DIGITAR ALGUMA OPÇAO---");
                    System.out.println();
                }
            }
            
            if(isInteger(op)){
                if(Integer.parseInt(op) == 1) // OPCAO MATRICULAR UM ALUNO
                {
                    Aluno novoAluno = new Aluno();
                    System.out.println();
                    System.out.println("-> OPÇÃO ATUAL : 1) MATRICULAR UM ALUNO NO SISTEMA <-");
                    System.out.println();
                    novoAluno.setNome();
                    novoAluno.setCPF();
                    novoAluno.setMatricula();
                    novoAluno.setEmail();
                    Alunos.add(novoAluno);
                    System.out.println();
                    System.out.println("-----> DADOS SALVOS COM SUCESSO!! <-----");
                    System.out.println();

                }else if(Integer.parseInt(op) == 0){
                    break;

                }
            }else{break;}
        }
    }
private static boolean isInteger(String str) 
    {
        return str != null && str.matches("[0-9]*");
    }
}
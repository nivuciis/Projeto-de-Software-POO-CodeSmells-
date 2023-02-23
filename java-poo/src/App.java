import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        ArrayList<Aluno> Alunos = new ArrayList<Aluno>();
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
            System.out.println("Digite uma opção (Nº INTEIRO): ");
            int op = input.nextInt();
            if(op==1){ // 1.Matricular um aluno no sistema."
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

                }else if(op == 2)
                {
                    break;

                }else if(op == 3)
                {
                    break;

                }else if(op == 4)
                {
                    break;

                }else if(op == 5)
                {
                    break;

                }else if(op == 6)
                {
                    break;

                }else if(op == 7) //7.Mostrar informações de um aluno."
                {
                    if(Alunos.isEmpty()){
                        System.out.println();
                        System.out.println("-------------------------------");
                        System.out.println("Realize o cadastro primeiro.");
                        System.out.println("-------------------------------");
                        System.out.println();
                    }else{
                        System.out.println();
                        System.out.println("-> OPÇÃO ATUAL : 7) MOSTRAR INFORMACOES DE UM ALUNO <-");
                        System.out.println();
                        System.out.println("----ALUNOS CADASTRADOS:----");
                        System.out.println();
                    }        
                }else if(op== 8)
                {
                    break;

                }else if(op == 9)
                {
                    break;

                }else if(op == 10)
                {
                    break;
                }

                else if(op == 0)
                {
                    break;
                }
            }
        }
}



import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        ArrayList<Aluno> Alunos = new ArrayList<Aluno>();
        Aluno mat = new Aluno();
        while(true){
            Object[] options = {"Matricular Aluno","Remover Aluno", "Alterar Nota","Alterar Dados", "Mostrar Informações", "Alterar Faltas", "Adicionar Notas", "Adicionar Faltas", "Adicionar Disciplinas", "Remover Disciplinas"};
            
            Object op = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(op=="Matricular Aluno"){ // 1.Matricular um aluno no sistema."
                    Aluno novoAluno = new Aluno();
                    novoAluno.setNome();
                    novoAluno.setCPF();
                    novoAluno.setMatricula();
                    novoAluno.setEmail();
                    Alunos.add(novoAluno);
                    JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso.");
                }else if(op == "Remover Aluno")
                {
                    Object opt_alunos = mat.ListagemAlunos(Alunos);
                    for(int i = 0; i < Alunos.size(); i++)
                    {
                        if(opt_alunos == null) {break;}
                        else if(opt_alunos == Alunos.get(i).getNome())
                        {
                            Alunos = deleteAluno(Alunos,i);
                            JOptionPane.showMessageDialog(null, "Aluno Excluído com sucesso.");
                            break;
                        }
                    }    

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
                    Object opt_alunos = mat.ListagemAlunos(Alunos);
                    for(int i = 0; i < Alunos.size(); i++)
                    {
                        if(opt_alunos == null) {break;}
                        else if(opt_alunos == Alunos.get(i).getNome())
                        {
                            Alunos.get(i).setDici();
                            break;
                        }
                    }    

                }else if(op == "Remover Disciplinas")
                {
                    Object opt_alunos = mat.ListagemAlunos(Alunos);
                    for(int i = 0; i < Alunos.size(); i++)//navegar pelos alunos
                    {
                        if(opt_alunos == null) {break;}
                        else if(opt_alunos == Alunos.get(i).getNome())
                        {
                            ArrayList<Disciplina> d  = Alunos.get(i).getDici(); 
                            Object opt_d = Alunos.get(i).ListagemDici(d);
                            for(int j = 0; j < d.size(); j++)//navegar pelas disciplinas
                            {
                                if(opt_d == null) {break;}
                                else if(opt_d == d.get(j).getNomeDisciplina())
                                {
                                    d.remove(j);
                                    break;
                                }
                            }
                            break;
                        }
                    }
                }

                else if(op == null)
                {
                    break;
                }
            }
        }

    public static ArrayList<Aluno> deleteAluno(ArrayList<Aluno> Alunos,int aluno_remover){
        Alunos.remove(aluno_remover);
        return Alunos;
    }
}



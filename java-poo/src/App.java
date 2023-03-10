import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        ArrayList<Aluno> Alunos = new ArrayList<Aluno>();
        ArrayList<Professor> Professores = new ArrayList<Professor>();
        Aluno mat = new Aluno();
        Professor prof = new Professor();
        Pessoa pes = new Pessoa();
        while(true){
            Object[] options = {"Matricular Aluno","Remover Pessoa", "Alterar Nota","Alterar Dados", "Mostrar Informações", "Adicionar Professor", "Adicionar Notas", "Undo/redo ", "Adicionar Disciplinas", "Remover Disciplinas"};
            
            Object op = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(op=="Matricular Aluno"){ // 1.Matricular um aluno no sistema."
                    Aluno novoAluno = new Aluno();
                    novoAluno.setNome();
                    novoAluno.setCPF();
                    novoAluno.setMatricula();
                    novoAluno.setEmail();
                    pes.setNumAlunos();
                    Alunos.add(novoAluno);
                    JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso.");
            }else if(op == "Remover Pessoa")
            {
                Object [] alunoprof = {"ALUNO", "PROFESSOR"};
                Object opalunoprof = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, alunoprof, alunoprof[0]);

                if(opalunoprof=="ALUNO"){
                    Object opt_alunos = mat.ListagemAlunos(Alunos);
                    for(int i = 0; i < Alunos.size(); i++)
                    {
    
                        if(opt_alunos == null) {break;}
                        else if(opt_alunos == Alunos.get(i).getNome())
                        {
                            Alunos = deleteAluno(Alunos,i);
                            JOptionPane.showMessageDialog(null, "Aluno Excluído com sucesso.");
                            pes.delNumAlunos();
                            break;
                        }
                    }    
                }else if(opalunoprof=="PROFESSOR"){
                    Object opt_professor = prof.ListagemProfessor(Professores);
                    for(int i = 0; i < Professores.size(); i++)
                    {
                        if(opt_professor == null) {break;}
                        else if(opt_professor == Professores.get(i).getNome())
                        {
                            Professores = deleteProfessor(Professores, i);
                            JOptionPane.showMessageDialog(null, "Professor Excluído com sucesso.");
                            pes.delNumProf();
                            break;
                        }
                    }    
                }
                

            }else if(op == "Adicionar Notas")
            {
                break;

            }else if(op == "Alterar Nota")
            {
                break;

            }else if(op == "Adicionar Professor")
            {
                Professor novoProfessor = new Professor();
                novoProfessor.setNome();
                novoProfessor.setCPF();
                novoProfessor.setEmail();
                novoProfessor.setSalario();
                novoProfessor.setFormacaoAcademica();
                pes.setNumProf();
                Professores.add(novoProfessor);
                JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso.");

            }else if(op == "Alterar Dados")
            {
                break;

            }else if(op == "Mostrar Informações") //7.Mostrar informações de um aluno."
            {
                Object [] aluno_prof = {"ALUNO", "PROFESSOR","DADOS GERAIS"};
                Object op_aluno_prof = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, aluno_prof, aluno_prof[0]);
                if (op_aluno_prof == "ALUNO"){ 
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
                }else if(op_aluno_prof == "PROFESSOR"){
                    Object opt_professor = prof.ListagemProfessor(Professores);
                    for(int i = 0; i < Professores.size(); i++)
                    {
                        if(opt_professor == null) {break;}
                        else if(opt_professor == Professores.get(i).getNome())
                        {
                            Professores.get(i).MostrarInfo();
                            break;
                        }
                    }    
                
                }else if(op_aluno_prof == "DADOS GERAIS"){
                    pes.MostrarInfo();
                }
                
            }else if(op== "Undo/redo")
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
                        Alunos.get(i).setDici(Professores);
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

    public static ArrayList<Professor> deleteProfessor(ArrayList<Professor> Professores,int prof_remover){
        Professores.remove(prof_remover);
        return Professores;
    }
    
}



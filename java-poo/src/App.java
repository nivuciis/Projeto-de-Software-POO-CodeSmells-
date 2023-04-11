import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        ArrayList<Aluno> Alunos = new ArrayList<Aluno>();
        ArrayList<Professor> Professores = new ArrayList<Professor>();
        ArrayList<Pessoa> Pessoas = new ArrayList<Pessoa>();
        Aluno mat = new Aluno();
        Professor prof = new Professor();
        Pessoa pes = new Pessoa();
        while(true){ 
            Object[] options = {"Matricular Aluno","Remover Pessoa","Alterar Dados", "Mostrar Informações", "Adicionar Professor", "Undo/redo ", "Adicionar Disciplinas", "Remover Disciplinas"};
            
            Object op = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(op=="Matricular Aluno"){ // 1.Matricular um aluno no sistema."
                    Aluno novoAluno = new Aluno();
                    novoAluno.setNome();
                    novoAluno.setCPF();
                    if(novoAluno.getCpf()==0){continue;}
                    novoAluno.setMatricula();
                    if(novoAluno.getMatricula()==0){continue;}
                    novoAluno.setEmail();
                    novoAluno.setCurso();
                    pes.setNumAlunos();
                    Alunos.add(novoAluno);
                    Pessoas.add(novoAluno);
                    JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso.");
            }else if(op == "Remover Pessoa")//2.Remover um Aluno ou Professor do Sistema
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
            }else if(op == "Adicionar Professor") // 5.Adiciona um professor no sistema
            {
                Professor novoProfessor = new Professor();
                novoProfessor.setNome();
                novoProfessor.setCPF();
                novoProfessor.setEmail();
                novoProfessor.setSalario();
                novoProfessor.setFormacaoAcademica();
                pes.setNumProf();
                Professores.add(novoProfessor);
                Pessoas.add(novoProfessor);
                JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso.");

            }else if(op == "Alterar Dados")//6.Altera os dados de um Aluno ou Professor
            {
                Object [] aluno_prof = {"ALUNO", "PROFESSOR"};
                Object op_aluno_prof = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, aluno_prof, aluno_prof[0]);
                if(op_aluno_prof == "ALUNO"){
                    Object opt_alunos = mat.ListagemAlunos(Alunos);
                    for(int i = 0; i < Alunos.size(); i++)
                    {
                        if(opt_alunos == null) {break;}
                        else if(opt_alunos == Alunos.get(i).getNome())
                        {
                            Object[] dados_aluno = {"Nome","CPF","Email","Número de Matricula","Disciplinas", "Curso"};
                            Object dado_selecionado = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, dados_aluno,dados_aluno[0]);
                            if(dado_selecionado == "Nome"){Alunos.get(i).resetNome();}
                            else if(dado_selecionado == "CPF"){Alunos.get(i).resetCPF();}
                            else if(dado_selecionado == "Email"){Alunos.get(i).resetEmail();}
                            else if(dado_selecionado == "Número de Matricula"){Alunos.get(i).resetMatricula();}
                            else if(dado_selecionado == "Curso"){Alunos.get(i).resetCurso();}
                            else if(dado_selecionado == "Disciplinas")
                            {
                                ArrayList<Disciplina> d  = Alunos.get(i).getDici();
                                Object opt_d = Alunos.get(i).ListagemDici(d);                                
                                for(int j = 0; j < d.size(); j++)//navegar pelas disciplinas
                                {
                                    if(opt_d == null) {break;}
                                    else if(opt_d == d.get(j).getNomeDisciplina())
                                    {
                                        Object[] opcoes = {"Nome da disciplina", "Professor responsável", "Nota"};
                                        Object opcaoSelecionada = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
                                        if(opcaoSelecionada == "Nome da disciplina"){d.get(j).resetNomeDisciplina();}
                                        else if(opcaoSelecionada == "Nota"){d.get(j).resetNota();}
                                        else if(opcaoSelecionada == "Professor responsável"){d.get(j).setProfessor(Professores);}
                                        break;
                                    }
                                }   
                            }
                            JOptionPane.showMessageDialog(null, "Dados Atualizados com sucesso.");

                            break;
                        }
                    }  
                }
                else if(op_aluno_prof == "PROFESSOR"){
                    Object opt_prof = prof.ListagemProfessor(Professores);
                    for(int i = 0; i < Professores.size(); i++)
                    {
                        if(opt_prof == null) {break;}
                        else if(opt_prof == Professores.get(i).getNome())
                        {
                            Object[] dados_prof = {"Nome","CPF","Email","Salário", "Formação acadêmica"};
                            Object dado_selecionado = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, dados_prof,dados_prof[0]);
                            if(dado_selecionado == "Nome"){Professores.get(i).resetNome();}
                            else if(dado_selecionado == "CPF"){Professores.get(i).resetCPF();}
                            else if(dado_selecionado == "Email"){Professores.get(i).resetEmail();}
                            else if(dado_selecionado == "Salário"){Professores.get(i).resetSalario();}
                            else if(dado_selecionado == "Formação acadêmica"){Professores.get(i).resetFormacaoAcademica();}
                            break;
                        }
                    }
                }

            }else if(op == "Mostrar Informações") //7.Mostrar informações de um aluno, um professor ou os dados gerais do sistema
            {
                Object [] aluno_prof = {"ALUNO", "PROFESSOR","DADOS GERAIS"};
                Object op_aluno_prof = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, aluno_prof, aluno_prof[0]);
                if (op_aluno_prof == "ALUNO"){ 
                    Object opt_alunos = mat.ListagemAlunos(Alunos);
                    for(int i = 0; i < Pessoas.size(); i++)
                    {
                        if(opt_alunos == null) {break;}
                        else if(opt_alunos == Pessoas.get(i).getNome())
                        {
                            Pessoas.get(i).MostrarInfo();
                            break;
                        }
                    }    
                }else if(op_aluno_prof == "PROFESSOR"){
                    Object opt_professor = prof.ListagemProfessor(Professores);
                    for(int i = 0; i < Pessoas.size(); i++)
                    {
                        if(opt_professor == null) {break;}
                        else if(opt_professor == Pessoas.get(i).getNome())
                        {
                            Pessoas.get(i).MostrarInfo();
                            break;
                        }
                    }    
                
                }else if(op_aluno_prof == "DADOS GERAIS"){
                    pes.MostrarInfo();
                }
                
            }else if(op== "Undo/redo")
            {
                break;

            }else if(op == "Adicionar Disciplinas")//9.Adiciona uma determinada quantidade de disciplinas para um aluno
            {
                if(Professores.size() != 0)
                {
                    Object opt_alunos = mat.ListagemAlunos(Alunos);
                    for(int i = 0; i < Alunos.size(); i++)
                    {
                        if(opt_alunos == null) {break;}
                        else if(opt_alunos == Alunos.get(i).getNome())
                        {
                            Alunos.get(i).setDici(Professores);
                             JOptionPane.showMessageDialog(null, "Disciplina cadastrada com sucesso.");
                            
                            break;
                        }
                    }    
                }else{
                    JOptionPane.showMessageDialog(null, "Não há nenhum professor no sistema!" +
                                         "\nCadastre um professor antes de adicionar disciplinas");
                }
            }else if(op == "Remover Disciplinas")//10.Remove uma determinada disciplina que um aluno está matriculado
                {
                    Object opt_alunos = mat.ListagemAlunos(Alunos);
                    for(int i = 0; i < Alunos.size(); i++)//navegar pelos alunos
                    {
                        if(opt_alunos == null) {break;}
                        else if(opt_alunos == Alunos.get(i).getNome())
                        {
                            ArrayList<Disciplina> d  = Alunos.get(i).getDici(); 
                            Object opt_d = Alunos.get(i).ListagemDici(d);
                            if(d!=null){
                                for(int j = 0; j < d.size(); j++)//navegar pelas disciplinas
                                {
                                    if(opt_d == null) {break;}
                                    else if(opt_d == d.get(j).getNomeDisciplina())
                                    {
                                        d.remove(j);
                                        JOptionPane.showMessageDialog(null, "Disciplina removida com sucesso.");

                                        break;
                                    }
                                }
                            }else{continue;}
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



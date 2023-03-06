import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Disciplina {
    private String nomedisciplina;
    private String nomeprofessor;
    private String nota;


    public String getNomeDisciplina(){return this.nomedisciplina;}
    public String getNota(){return this.nota;}
    public String getNomeprofessor(){return this.nomeprofessor;}

Scanner input = new Scanner(System.in);
    
    public void setNomeDisciplina(){
        this.nomedisciplina = JOptionPane.showInputDialog("Nome da disciplina:");

    }
    public void setNota(){
        this.nota = JOptionPane.showInputDialog("Digite a nota da disciplina:");
    }

    public void setNomeprofessor(){
        this.nomeprofessor="NENHUM";
    }
}
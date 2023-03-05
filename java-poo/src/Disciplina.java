import java.util.Scanner;
import javax.swing.JOptionPane;

public class Disciplina {
    private String nomedisciplina;
    private String nota;
    private String faltas;


    public String getNomeDisciplina(){return this.nomedisciplina;}
    public String getNota(){return this.nota;}
    public String getFaltas(){return this.faltas;}

    public void setNomeDisciplina(){
        this.nomedisciplina = JOptionPane.showInputDialog("Nome da disciplina:");

    }
    public void setNota(){
        this.nota = JOptionPane.showInputDialog("Digite a nota da disciplina:");
    }

    public void setFaltas(){

        this.faltas = JOptionPane.showInputDialog("Digite o número de faltas:");

    }



}
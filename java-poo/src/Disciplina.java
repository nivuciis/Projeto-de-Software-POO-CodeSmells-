import java.util.Scanner;
public class Disciplina {
    private String nomedisciplina;
    private Double nota;
    private int faltas;


    public String getNomeDisciplina(){return this.nomedisciplina;}
    public Double getNota(){return this.nota;}
    public int getFaltas(){return this.faltas;}

Scanner input = new Scanner(System.in);

    public void setNomeDisciplina(){
        System.out.println("-----------------------");
        System.out.println("Digite o NOME da disciplina:");
        this.nomedisciplina = input.next();
    }

    public void setNota(){
        System.out.println("-----------------------");
        System.out.println("Digite a nota da disciplina:");
        this.nota = input.nextDouble();
    }

    public void setFaltas(){
        System.out.println("-----------------------");
        System.out.println("Digite o Numero de faltas:");
        this.faltas = input.nextInt();
    }



}
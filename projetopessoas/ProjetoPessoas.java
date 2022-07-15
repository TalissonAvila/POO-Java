/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetopessoas;

/**
 *
 * @author talisson
 */
public class ProjetoPessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programa principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p1.setSexo("Masculino");
        p1.setIdade(30);
        
        p2.setNome("Maria");
        p2.setCurso("Informatica");
        p2.setSexo("Feminino");
        p2.setIdade(20);
        p2.setMatricula(1239481);
        
        p3.setNome("Claudio");
        p3.setSexo("Masculino");
        p3.setIdade(40);
        p3.setEspecialidade("Mestre");
        p3.setSalario(2500.75);
        p3.receberAumento(200.89);
        
        p4.setNome("Fabiana");
        p4.setSetor("Estoque");
        p4.setSexo("Feminino");
        p4.setIdade(50);
        p4.mudaTrabalho();
        
        System.out.println(p1.toString());
        System.out.println("----------");
        System.out.println(p2.toString());
        System.out.println("curso=" + p2.getCurso() + " ,matricula= " + p2.getMatricula());
        
        System.out.println(p3.toString());
        System.out.println(p3.getSalario());
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoescola;

/**
 *
 * @author talisson
 */
public class ProjetoEscola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Visitante v1 = new Visitante();
        v1.setNome("Pedro");
        v1.setIdade(30);
        v1.setSexo("Masculino");
        v1.fazerAniversario();
        System.out.println(v1.toString());
        Aluno a1 = new Aluno();
        a1.setNome("Maria");
        a1.setIdade(15);
        a1.setSexo("Feminino");
        a1.setCurso("Letras Portugues/Ingles");
        a1.setMatricula(1234);
        System.out.println(a1.toString());
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Joao");
        b1.setBolsa(53.55);
        b1.pagarMensalidade();
        
        Tecnico t1 = new Tecnico();
        t1.praticar();
                
        
    }
    
}

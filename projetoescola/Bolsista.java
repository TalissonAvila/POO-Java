/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoescola;

/**
 *
 * @author talisson
 */
public class Bolsista extends Aluno {
    private double bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovado a bolsa de " + this.nome + " com sucesso");
    }
    
    @Override
    public void pagarMensalidade(){
        double desconto = 100.0 - this.getBolsa();
        System.out.print(this.nome + " aluno bolsista. Bolsa de " + this.getBolsa() +"%.\t");
        System.out.println("Custo da Mensalidade de " + desconto + "% do valor.");
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
    
    
}

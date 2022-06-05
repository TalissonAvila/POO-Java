/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05;

/**
 *
 * @author talisson
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco("Jubileu");
        conta1.abrirConta("CC");
        conta1.setNumConta(1234);
        conta1.depositar(300);
        conta1.pagarMensalidade();
        conta1.statusConta();
        
        System.out.println("");
        
        ContaBanco conta2 = new ContaBanco("Creusa");
        conta2.abrirConta("CP");
        conta2.setNumConta(4321);
        conta2.depositar(500);
        conta2.sacar(100);
        conta2.pagarMensalidade();
        conta2.statusConta();
    }
    
}

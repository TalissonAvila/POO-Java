/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02;

/**
 *
 * @author talisson
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5f;
        caneta1.carga = 100;
        caneta1.modelo = "Bic";
        caneta1.destampar();
        caneta1.status();
        caneta1.rabiscar();
        
        System.out.println("");
        
        Caneta caneta2 = new Caneta();
        caneta2.cor = "Preta";
        caneta2.ponta = 0.7f;
        caneta2.carga = 67;
        caneta2.modelo = "Compactor";
        caneta2.tampar();
        caneta2.status();
        caneta2.rabiscar();
    }
    
}

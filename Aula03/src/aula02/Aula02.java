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
        caneta1.modelo = "BIC Cristal";
        caneta1.cor = "Azul";
        //caneta1.ponta = 0.5;
        caneta1.carga = 50;
        caneta1.tampar();
        caneta1.status();
        caneta1.rabiscar();
    }
    
}

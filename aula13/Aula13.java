/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula13;

/**
 *
 * @author talisson
 */
public class Aula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cachorro c1 = new Cachorro();
        System.out.println("\n---------Frase--------------");
        c1.reagir("toma comida");
        c1.reagir("sai");
        c1.reagir("ola");
        System.out.println("\n----------Dono-------------");
        c1.reagir(true);
        c1.reagir(false);
        System.out.println("\n-----------Idade e Peso------------");
        c1.reagir(2, 8.17);
        c1.reagir(9, 7.85);
        c1.reagir(3, 14.12);
        c1.reagir(11, 12);
        System.out.println("\n-----------Hora e Minuto------------");
        c1.reagir(10, 30);
        c1.reagir(14, 28);
        c1.reagir(20, 01);
    }
    
}

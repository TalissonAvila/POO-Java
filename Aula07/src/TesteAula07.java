/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author talisson
 */
public class TesteAula07 {

    public static void main(String[] args) {
        Lutador lutador[] = new Lutador[6];

        lutador[0] = new Lutador("Pretty Boy", "França", 31, 175, 62.9, 11, 2, 1);
        lutador[1] = new Lutador("Putscript", "Brasil", 29, 168, 57.8, 14, 2, 3);
        lutador[2] = new Lutador("Snapshadow", "Estados Unidos", 35, 165, 80.9, 12, 2, 1);
        lutador[3] = new Lutador("Death Code", "Australia", 28, 193, 81.3, 13, 0, 2);
        lutador[4] = new Lutador("UFOCobol", "Brasil", 37, 170, 119.3, 5, 4, 3);
        lutador[5] = new Lutador("Nerdaart", "Estados Unidos", 30, 181, 105.3, 12, 2, 4);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(lutador[3], lutador[2]);
        
        

       

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02.exercicio1;

/**
 *
 * @author talisson
 */
public class Aula02Ex1 {
    public static void main(String[] args) {
        Garrafa garrafa1 = new Garrafa();
        garrafa1.cor = "Branca";
        garrafa1.material = "Inox";
        garrafa1.carga = 2;
        garrafa1.liquido = "Água";
        garrafa1.tamanho = 500;
        garrafa1.destampar();
        garrafa1.status();
        garrafa1.beber();
        
        
    }
}

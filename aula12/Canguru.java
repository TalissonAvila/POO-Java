/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author talisson
 */
public class Canguru extends Mamifero{
    public void unsarBolsa(){
        System.out.println("Usando Bolsa");
    }
    
    @Override
    public void locomover(){
        System.out.println("Pulando");
    }
}

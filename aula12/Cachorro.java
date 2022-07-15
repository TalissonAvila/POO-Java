/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author talisson
 */
public class Cachorro extends Mamifero{
    public void enterrarOsso(){
        System.out.println("Osso enterrado");
    }
    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Latindo");
    } 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12;

/**
 *
 * @author talisson
 */
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamifero mamifero1 = new Mamifero();
        Reptil reptil1 = new Reptil();
        Peixe peixe1 = new Peixe();
        Ave ave1 = new Ave();
        Tartaruga tartaruga1 = new Tartaruga();
        Cachorro cachorro1 = new Cachorro();
        Canguru canguru1 = new Canguru();
        Goldfish peixeDourado1 = new Goldfish();
        
        mamifero1.locomover();
        reptil1.locomover();
        peixe1.locomover();
        ave1.locomover();
        canguru1.locomover();
        cachorro1.emitirSom();
        peixe1.emitirSom();
        peixeDourado1.emitirSom();
                
    }
    
}

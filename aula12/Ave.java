/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author talisson
 */
public class Ave extends Animal{
    private String corDaPena;
    
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }

    public String getCorDaPena() {
        return corDaPena;
    }

    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo insetos");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    
    
}

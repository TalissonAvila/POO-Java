/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author talisson
 */
public class Peixe extends Animal{
    private String corDaEscama;
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha. Bloob"); 
                
    }

    public String getCorDaEscama() {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }
    
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo particulas"); 
               
    }

    @Override
    public void emitirSom() {
        System.out.println("Sem som");
    }
    
}

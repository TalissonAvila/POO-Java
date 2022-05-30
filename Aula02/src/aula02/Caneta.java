/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

/**
 *
 * @author talisson
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Uma caneta de cor " + this.cor);
        System.out.println("A caneta está tampada? " + this.tampada);
        System.out.println("O modelo da caneta é o " + this.modelo);
        System.out.println("A ponta da caneta é ." + this.ponta);
        System.out.println("A carga da caneta é " + this.carga +"%");
    }
    void rabiscar(){
        if(tampada == true){
            System.out.println("A caneta está tampada. Não pode rabiscar.");
        } else{
            System.out.println("Rabiscando");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}

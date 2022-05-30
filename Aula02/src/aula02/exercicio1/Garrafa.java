/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02.exercicio1;

/**
 *
 * @author talisson
 */
public class Garrafa {
    String material;
    int tamanho;
    int carga;
    boolean fechada;
    String cor;
    String liquido;
    
    void status(){
        System.out.println("O material da garrafá é o " + this.material);
        System.out.println("O tamanho da garrafa é de " +this.tamanho +"ml");
        System.out.println("A garrafa está com " + this.carga +"% de " + this.liquido);
        System.out.println("A cor da garrafa é " +this.cor);
    }
    
    void beber(){
        if(fechada == true){
            System.out.println("A garrafa está fechada. Não pode beber " + this.liquido);
        } else{
            System.out.println("Bebendo " + this.liquido);
          }    
    }
    void tampar(){
        this.fechada = true;
    }
    void destampar(){
        this.fechada = false;
    }
}

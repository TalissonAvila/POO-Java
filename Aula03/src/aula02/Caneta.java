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
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Uma caneta de cor " + this.cor);
        System.out.println("A caneta esta tampada? " + this.tampada);
        System.out.println("O modelo da caneta = " + this.modelo);
        System.out.println("A ponta da caneta = " + this.ponta);
        System.out.println("A carga da caneta = " + this.carga +"%");
    }
    public void rabiscar(){
        if(tampada == true){
            System.out.println("A caneta está tampada. Não pode rabiscar.");
        } else{
            System.out.println("Rabiscando");
        }
    }
   public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}

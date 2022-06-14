/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author talisson
 */
public class TesteControle {

    public static void main(String[] args) {
        ControleRemoto controle1 = new ControleRemoto();

        //controle1.abrirMenu();
        controle1.ligar();
        controle1.maisVolume();
        controle1.play();
        controle1.maisVolume();
        controle1.abrirMenu();
        controle1.fecharMenu();
        System.out.println("");
        controle1.ligarMudo();
        controle1.ligarMudo();
        controle1.abrirMenu();
        controle1.fecharMenu();
        System.out.println("");
        controle1.desligar();
        controle1.abrirMenu();
        controle1.fecharMenu();
    }
}

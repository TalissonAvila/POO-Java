/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoescola;

/**
 *
 * @author talisson
 */
public class Tecnico extends Aluno{
    private int registroProfissional;
    
    public void praticar(){
        System.out.println("Praticando.\t---\t---\t---\nPratica concluida com sucesso.");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    
}

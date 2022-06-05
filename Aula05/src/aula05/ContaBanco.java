/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;
/**
 *
 * @author talisson
 */

public class ContaBanco {
    // Atributos
    public Integer numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
        // Construtor
    public ContaBanco(String nome){
        this.setDono(nome);
        this.setStatus(false);
        this.setSaldo(0);
        this.numConta = 0;
    }
    
        //Métodos Personalizados
    public void abrirConta(String tipo){
        
        this.setTipo(tipo);
        this.setStatus(true);
        if("CC".equals(tipo)){
            this.setSaldo(50);
        } else if("CP".equals(tipo)){
            this.setSaldo(150);
        }
        System.out.println("Conta de " + this.dono + " aberta com sucesso.\nSaldo de = "  + this.saldo + "\n");
    }
    
    public void fecharConta(){
       if(saldo > 0){
           System.out.println("Conta com dinheiro.");
       } else if(saldo < 0){
           System.out.println("Conta em debito.");
       } else {
           this.setStatus(false);
           System.out.println("Conta fechada com sucesso. ");
       }
    }
    
    public void depositar(double valor){
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
        } else{
            System.out.println("Impossivel depositar.");
        }
    }
    
    public void sacar(double valor){
        if(this.isStatus()){
            if(valor <= this.getSaldo()){
                this.setSaldo(this.getSaldo() - valor );
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Valor de saque maior que o saldo.");
            }
        } else{
            System.out.println("Impossivel sacar.");
        }
    }
    
    public void pagarMensalidade(){
        double mensalidade = 0;
        if("CC".equals(this.getTipo())){
            mensalidade = 12;
        } else if("CP".equals(this.getTipo())){
            mensalidade = 20;
        }
        if(this.isStatus()){
            if(this.getSaldo() >= mensalidade){
                this.setSaldo(this.getSaldo() - mensalidade);
            }
        } else{
            System.out.println("Impossivel pagar mensalidade.");
        }
        
    }

        // Métodos Getters & Setters
    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void statusConta(){
        System.out.println("Status da conta de: " + this.getDono());
        System.out.println("A conta esta aberta? " + this.isStatus());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Saldo da conta: " + this.getSaldo());
    }
    
}

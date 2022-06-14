
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author talisson
 */
public class Luta {

    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Metodos
    public void marcarLuta(Lutador lutador1, Lutador lutador2) {
        if (lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2) {
            this.setAprovada(true);
            this.desafiado = lutador1;
            this.desafiante = lutador2;
            System.out.println("Luta marcada com sucesso.");
        } else {
            System.out.println("Luta não aprovada!");
            this.setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void Lutar() {
        if (this.isAprovada()) {
            System.out.println("O desafiado");
            this.desafiado.Apresentar();
            System.out.println("O desafiante");
            this.desafiante.Apresentar();
            Random gerador = new Random();
            int vencedor = gerador.nextInt(3);
            switch (vencedor) {
                case 0 -> {
                    System.out.println("");
                    System.out.println("Luta empatada.");
                    this.desafiado.EmpatarLuta();
                    this.desafiante.EmpatarLuta();
                    break;
                }
                case 1 -> {
                    System.out.println("");
                    System.out.println("O vencedor = " + this.desafiado.getNome());
                    this.desafiado.GanharLuta();
                    this.desafiante.PerderLuta();
                    break;
                }
                case 2 -> {
                    System.out.println("");
                    System.out.println("O vencedor = " + this.desafiante.getNome());
                    this.desafiado.PerderLuta();
                    this.desafiante.PerderLuta();
                    break;
                }
                default -> {
                }

            }
        } else {
            System.out.println("Luta não pode acontecer.");
        }
    }
    //Getters and Setters

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}

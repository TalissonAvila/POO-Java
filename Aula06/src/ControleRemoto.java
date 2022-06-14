
/**
 *
 * @author talisson
 */
public class ControleRemoto implements Controlador {

    // Atributos
    private Integer volume;
    private boolean ligado;
    private boolean tocando;

    // Metodos Especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        this.setTocando(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println(">>>>> Menu <<<<<");
        System.out.println("O controle está ligado? " + this.isLigado());
        System.out.println("O controle está tocnado? " + this.isTocando());
        System.out.print("Volume em " + this.getVolume() + "  ");
        for (int i = 0; i < this.getVolume(); i += 10) {
            System.out.print("| ");
        }
            System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println(">>> Fechando Menu <<<");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 10);
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - 10);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(this.getVolume() - this.getVolume());
        } else {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        }
    }

}

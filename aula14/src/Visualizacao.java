public class Visualizacao {
    private Gafanhoto esppectador;
    private Video filme;

    // contrutor
    public Visualizacao(Gafanhoto esppectador, Video filme) {
        this.esppectador = esppectador;
        this.filme = filme;
        this.esppectador.setTotalAssistindo(this.esppectador.getTotalAssistindo() + 1);
        this.filme.setViews(this.filme.getViews()+1 );
    }
        // getters e setters
    public Gafanhoto getEsppectador() {
        return esppectador;
    }

    public void setEsppectador(Gafanhoto esppectador) {
        this.esppectador = esppectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }


    @Override
    public String toString() {
        return "Visualizacao [esppectador=" + esppectador + ", filme=" + filme + "]";
    }

    public void avaliar(){
        this.filme.setAvaliacao(3);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(double percentual){
        int total;
        if (percentual < 30) {
            total = 2;
        } else if (percentual < 50) {
            total = 5;
        } else if (percentual < 80) {
            total = 7;
        } else {
            total = 10;
        }
        this.filme.setAvaliacao(total);
    }
}


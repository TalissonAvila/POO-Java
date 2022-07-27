public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

        // construtor
        public Video(String titulo) {
            this.titulo = titulo;
            this.avaliacao = 0;
            this.views = 0;
            this.curtidas = 0;
            this.reproduzindo = false;
        }
        // metodos implementados da interface
    @Override
    public void play() {
        this.reproduzindo = true;
    }
    @Override
    public void pause() {
        this.reproduzindo = false;
    }
    @Override
    public void like() {
        this.curtidas += 1;
    }
        // getters e setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        double media;
        media = (this.avaliacao + avaliacao)/this.views;
        this.avaliacao = (int) media;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean isReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }


    @Override
    public String toString() {
        return "Video [titulo=" + titulo + ", views=" + views + ", avaliação=" + avaliacao +", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo +"]";
    }

    
}

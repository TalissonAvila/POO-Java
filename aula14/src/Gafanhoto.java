public class Gafanhoto extends Pessoa {
    private String login;
    private double totalAssistindo;

    // construtor
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.totalAssistindo = 0;
        this.login = login;
    }
    

    public void viuMaisUm(){
        this.totalAssistindo += 1;
    }

            //getters e setters
    public String getLogin() {
        return login;
    }


    public void setLogin(String login) {
        this.login = login;
    }


    public double getTotalAssistindo() {
        return totalAssistindo;
    }


    public void setTotalAssistindo(double totalAssistindo) {
        this.totalAssistindo = totalAssistindo;
    }


    @Override
    public String toString() {
        return "Gafanhoto[ " +super.toString() + "\n[login=" + login + ", totalAssistindo=" + totalAssistindo + "]";
    }

    
    
}

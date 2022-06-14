
/**
 *
 * @author talisson
 */
public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private int altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Construtor
    public Lutador(String nome, String nacionalidade, int idade, int altura,
            double peso, int vitorias, int derrotas, int empates){
       this.nome = nome;
       this.nacionalidade = nacionalidade;
       this.altura = altura;
       this.idade = idade;
        this.setPeso(peso); 
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
       // Métodos 
       public void Apresentar(){
           System.out.println("_______________________________");
           System.out.println("Recebam o lutador " + this.getNome());
           System.out.println("Pais: " + this.getNacionalidade());
           System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + " cm");
           System.out.println("Pesando " + this.getPeso() + " quilos");
           System.out.println("Possui um cartel de => " + this.getVitorias() + " Vitorias\t" +this.getDerrotas() + " Derrotas\t" + this.getEmpates() + " Empates");
       }
       
       public void Status(){
           System.out.println(this.getNome() + " é um peso " + this.categoria);
           System.out.println("Com: " + this.getVitorias() + " Vitorias\t" +this.getDerrotas() + " Derrotas\t" + this.getEmpates() + " Empates");
       }
       public void GanharLuta(){
           this.setVitorias(this.getVitorias() + 1);
       }
       public void EmpatarLuta(){
           this.setEmpates(this.getEmpates()+ 1);   
       }
       public void PerderLuta(){
           this.setDerrotas(this.getDerrotas() + 1);
       }
    
     // Getters and Setters   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (getPeso() < 52.2) {
            this.categoria = "Inválido";
        } else if (getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (getPeso() <= 83.9) {
            this.categoria = "Medio";
        } else if (getPeso() <= 120.2){
            this.categoria = "Pesado";
        } else{
            this.categoria = "Inválido";
        }
    }
    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
       this.derrotas = derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}

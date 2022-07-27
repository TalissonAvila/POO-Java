public class App {
    public static void main(String[] args) throws Exception {
        Video v1[] = new Video[3];
        v1[0] = new Video("Primeiro Video do canal");
        v1[1] = new Video("Segundo Video");
        v1[2] = new Video("Fim do canal");

        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("Gus", 48, "Masculino", "gusfanhoto");
        g[1] = new Gafanhoto("Maria", 15, "Feminino", "15maria15");
        g[2] = new Gafanhoto("Kleber", 23, "Masculino", "Kleber23k");

        Visualizacao visu[] = new Visualizacao[10];
        visu[0] = new Visualizacao(g[0], v1[2]);
        visu[0].avaliar(58.91);
        visu[1] = new Visualizacao(g[0], v1[1]);
        visu[0].avaliar(2);
        System.out.println(visu[0].toString());
    }
}

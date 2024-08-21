// Classe principal
public class Main {
    public static void main(String[] args) {
        // objetos 
        Serie serie1 = new Serie("Breaking Bad", 5);
        SerieDocumental doc1 = new SerieDocumental("Planeta Terra", 1, "Natureza");

        // Polimorfismo
        Serie[] series = {serie1, doc1};
        for (Serie s : series) {
            s.exibirDetalhes();
        }

        // Manipulação de arquivos 
        Arquivo.salvarSerie(serie1);
        Arquivo.carregarSerie();
    }
}

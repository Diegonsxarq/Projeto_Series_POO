// Classe Serie
class Serie {
    private String nome;
    private int temporadas;

    public Serie(String nome, int temporadas) {
        this.nome = nome;
        this.temporadas = temporadas;
    }

    public String getNome() {
        return nome;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void exibirDetalhes() {
        System.out.println("Série: " + nome + ", Temporadas: " + temporadas);
    }
}

// Classe SerieDocumental (herança de Serie)
class SerieDocumental extends Serie {
    private String tema;

    public SerieDocumental(String nome, int temporadas, String tema) {
        super(nome, temporadas);
        this.tema = tema;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Documentário: " + getNome() + ", Temporadas: " + getTemporadas() + ", Tema: " + tema);
    }
}

// Interface 
interface Persistencia {
    void salvar();
    void carregar();
}

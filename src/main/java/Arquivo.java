// Classe Arquivo (implementa Persistencia)
class Arquivo implements Persistencia {
    public static void salvarSerie(Serie serie) {
        // Implementação para salvar a série em um arquivo
        System.out.println("Salvando série: " + serie.getNome());
    }

    public static void carregarSerie() {
        // Implementação para carregar a série de um arquivo
        System.out.println("Carregando série...");
    }

    @Override
    public void salvar() {
        // Implementação do método salvar
    }

    @Override
    public void carregar() {
        // Implementação do método carregar
    }
}
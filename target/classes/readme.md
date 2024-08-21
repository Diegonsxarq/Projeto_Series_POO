# Gerenciamento de Séries em Java

Este projeto é um exemplo de aplicação dos conceitos fundamentais da programação orientada a objetos (POO) em Java, utilizando o tema de gerenciamento de séries.

## Objetivo

O objetivo deste projeto é demonstrar a aplicação de conceitos como classes, objetos, encapsulamento, herança, polimorfismo, sobrecarga e sobrescrita de métodos, classes abstratas, interfaces, coleções e manipulação de arquivos.

## Estrutura do Projeto

- **Classe Principal**: `Main`
- **Classe Série**: `Serie`
- **Classe de Herança**: `SerieDocumental` (herda de `Serie`)
- **Interface**: `Persistencia`
- **Classe de Manipulação de Arquivos**: `Arquivo`

## Funcionalidades

1. **Classes e Objetos**: Criação de classes para representar séries e documentários.
2. **Encapsulamento**: Proteção dos atributos das classes, acessíveis apenas por métodos públicos.
3. **Herança**: Estabelecimento de relações de especialização entre classes.
4. **Polimorfismo**: Tratamento uniforme de objetos de diferentes classes.
5. **Sobrecarga e Sobrescrita de Métodos**: Implementação de diferentes versões de um método na mesma classe e modificação de comportamento herdado em subclasses.
6. **Classes Abstratas e Interfaces**: Representação de conceitos genéricos e definição de contratos que as classes devem implementar.
7. **Coleções**: Uso de coleções Java para armazenar e manipular grupos de objetos.
8. **Manipulação de Arquivos**: Funcionalidades para salvar e carregar dados, garantindo persistência entre execuções.

## Exemplo de Código

```java
// Classe principal
public class Main {
    public static void main(String[] args) {
        // Criação de objetos 
        Serie serie1 = new Serie("Breaking Bad", 5);
        SerieDocumental doc1 = new SerieDocumental("Planet Earth", 1, "Natureza");

        // Polimorfismo
        Serie[] series = {serie1, doc1};
        for (Serie s : series) {
            s.exibirDetalhes();
        }

        // Manipulação de arquivos (
        Arquivo.salvarSerie(serie1);
        Arquivo.carregarSerie();
    }
}

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

//  (herança de Serie)
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

// Interface Persistencia
interface Persistencia {
    void salvar();
    void carregar();
}

// Classe Arquivo (implementa Persistencia)
class Arquivo implements Persistencia {
    public static void salvarSerie(Serie serie) {
        // Salvamento em arquivo
        System.out.println("Salvando série: " + serie.getNome());
    }

    public static void carregarSerie() {
        // Carregamento de arquivo
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
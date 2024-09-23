package julioapm.ex1_biblioteca;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class AcervoImplMemoria implements AcervoRepository {
    private List<Livro> livros;

    public AcervoImplMemoria() {
        livros = new ArrayList<>();
        livros.add(new Livro(1, "O Senhor dos Anéis", "J. R. R. Tolkien", 1954));
        livros.add(new Livro(2, "Dom Quixote", "Miguel de Cervantes", 1605));
        livros.add(new Livro(3, "Cem Anos de Solidão", "Gabriel García Márquez", 1967));
    }

    public List<Livro> getAll() {
        return livros;
    }

    public List<Livro> getLivrosDoAutor(String autor) {
        return livros.stream().filter(l -> l.getAutor().equals(autor)).toList();
    }

    public List<String> getAutores() {
        return livros.stream().map(Livro::getAutor).distinct().toList();
    }

    public List<String> getTitulos() {
        return livros.stream().map(Livro::getTitulo).toList();
    }

    public List<Livro> getLivrosTitulo(String titulo) {
        return livros.stream().filter(l -> l.getTitulo().equals(titulo)).toList();
    }

    public boolean cadastraLivroNovo(Livro livro) {
        return livros.add(livro);
    }

    @Override
    public boolean removeLivro(int codigo) {
        return livros.removeIf(l -> l.getId() == codigo);
    }
}

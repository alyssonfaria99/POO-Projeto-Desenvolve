import java.util.Date;
import Model.Artigo;
import Model.Autor;
import Model.Emprestimo;
import Model.EstrategiaPublicacaoArtigo;
import Model.EstrategiaPublicacaoLivro;
import Model.Livro;
import Model.Usuario;

public class Main {
    public static void main(String[] args){
        Autor autor = new Autor("Alysson","Brasileiro", true, new EstrategiaPublicacaoArtigo());

        Livro livro = new Livro("Java for Begginers",autor,"Tecnologia",false);
        livro.validarDisponibilidade();

        Usuario usuario = new Usuario("Lucas Rafael",25);

        Emprestimo emprestimo = new Emprestimo(new Date(), new Date(), livro, usuario);

        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);
        
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolução: " + emprestimo.getDataDevolucao());
        System.out.println("Artigo: " + artigo.getTitulo());

        autor.publicar();
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        autor.publicar();
    }
}
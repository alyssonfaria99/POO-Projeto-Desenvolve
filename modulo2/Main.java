import java.util.Date;

public class Main {
    public static void main(String[] args){
        Autor autor = new Autor("Alysson","Brasileiro");

        Livro livro = new Livro("Java for Begginers",autor,"Tecnologia",false);
        livro.validarDisponibilidade();

        Usuario usuario = new Usuario("Lucas Rafael",25);

        Emprestimo emprestimo = new Emprestimo(new Date(), new Date(), livro, usuario);

        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolução: " + emprestimo.getDataDevolucao());
    }
}
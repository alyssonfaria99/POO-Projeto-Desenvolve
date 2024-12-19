import org.junit.Test;

import Model.Artigo;
import Model.Autor;
import Model.EstrategiaPublicacaoArtigo;
import Model.EstrategiaPublicacaoLivro;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class ArtigoTest {
    @Test
    public void testGetTitulo(){
        Autor autor = new Autor ("Alysson", "Brasileiro", true, new EstrategiaPublicacaoArtigo());
        Artigo artigo = new Artigo("Harry Potter", autor, "Ficção", true);
        assertEquals("Harry Potter", artigo.getTitulo());
    }
    public void testGetGenero(){
        Autor autor = new Autor ("Alysson", "Brasileiro", true, new EstrategiaPublicacaoArtigo());
        Artigo artigo = new Artigo("Harry Potter", autor, "Ficção", true);
        assertEquals("Ficção", artigo.getGenero());
    }
    public void testGetAutor(){
        Autor autor = new Autor ("Alysson", "Brasileiro", true, , new EstrategiaPublicacaoArtigo());
        Artigo artigo = new Artigo("Harry Potter", autor, "Ficção", true);
        assertEquals(autor, artigo.getAutor());
    }
    public void testGetIsPublicado(){
        Autor autor = new Autor ("Alysson", "Brasileiro", true, , new EstrategiaPublicacaoArtigo());
        Artigo artigo = new Artigo("Harry Potter", autor, "Ficção", true);
        assertEquals(true, artigo.isPublicado());
    }
    
    public void testSetTitulo(){
        Autor autor = new Autor ("Alysson", "Brasileiro", true, , new EstrategiaPublicacaoArtigo());
        Artigo artigo = new Artigo("Harry Potter", autor, "Ficção", true);
        artigo.setTitulo("O senhor dos anéis");
        assertEquals("O senhor dos anéis",artigo.getTitulo());
    }
    public void testSetGenero(){
        Autor autor = new Autor ("Alysson", "Brasileiro", true, new EstrategiaPublicacaoArtigo());
        Artigo artigo = new Artigo("Harry Potter", autor, "Ficção", true);
        artigo.setGenero("Mitologia");
        assertEquals("Mitologia",artigo.getGenero());
    }
    public void testSetAutor(){
        Autor autor1 = new Autor ("Alysson", "Brasileiro", true, new EstrategiaPublicacaoArtigo());
        Autor autor2 = new Autor ("Joana", "Brasileiro", false, new EstrategiaPublicacaoArtigo());
        Artigo artigo = new Artigo("Harry Potter", autor1, "Ficção", true);
        artigo.setAutor(autor2);
        assertEquals(autor2,artigo.getAutor());
    }
    public void testSetIsPublicado(){
        Autor autor = new Autor ("Alysson", "Brasileiro", true, new EstrategiaPublicacaoArtigo());
        Artigo artigo = new Artigo("Harry Potter", autor, "Ficção", true);
        artigo.setIsPublicado(false);
        assertEquals(false,artigo.isPublicado());
    }

    public void test setEstrategiaPublicacao(){
        Autor autor = new Autor ("Alysson", "Brasileiro", true, new EstrategiaPublicacaoArtigo());
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        assertEquals(new EstrategiaPublicacaoLivro(), autor.estrategiaPublicacao);
    }
}

import org.junit.Test;

import Model.Autor;
import Model.Livro;

import static org.junit.Assert.assertEquals;

public class LivroTest {
    @Test
    public void testGetTitulo(){
        Autor autor = new Autor("Jess", "Brasileira",true);
        Livro livro = new Livro("Java para iniciantes", autor, "Tecnologia", true);
        assertEquals("Java para iniciantes", livro.getTitulo());
    }

    @Test
    public void testSetTitulo(){
        Autor autor = new Autor("Jess", "Brasileira",true);
        Livro livro = new Livro("Java para iniciantes", autor, "Tecnologia", true);
        livro.setTitulo("Java Intermediário");
        assertEquals("Java Intermediário", livro.getTitulo());
    }

    @Test
    public void testGetAutor(){
        Autor autor = new Autor("Jess", "Brasileira",true);
        Livro livro = new Livro("Java para iniciantes", autor, "Tecnologia", true);
        assertEquals(autor, livro.getAutor());
    }

    @Test
    public void testSetAutor(){
        Autor autor1 = new Autor("Jess", "Brasileira",true);
        Autor autor2 = new Autor("Alysson", "Brasileiro",true);
        Livro livro = new Livro("Java para iniciantes", autor1, "Tecnologia", true);
        livro.setAutor(autor2);
        assertEquals(autor2, livro.getAutor());
    }

    @Test
    public void testGetGenero(){
        Autor autor = new Autor("Jess", "Brasileira", true);
        Livro livro = new Livro("Java para iniciantes", autor, "Tecnologia", true);
        assertEquals("Tecnologia", livro.getGenero());
    }

    @Test
    public void testSetGenero(){
        Autor autor = new Autor("Jess", "Brasileira",true);
        Livro livro = new Livro("Java para iniciantes", autor, "Tecnologia", true);
        livro.setGenero("Romance");
        assertEquals("Romance", livro.getGenero());
    }

    @Test
    public void testIsDisponivel(){
        Autor autor = new Autor("Jess", "Brasileira",true);
        Livro livro = new Livro("Java para iniciantes", autor, "Tecnologia", true);
        assertEquals(true, livro.isDisponivel());
    }

}

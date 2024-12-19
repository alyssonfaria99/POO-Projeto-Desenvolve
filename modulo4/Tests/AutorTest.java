import org.junit.Test;

import Model.Autor;
import Model.Livro;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.beans.Transient;

public class AutorTest {
    @Test
    public void testGetNacionalidade(){
        Autor autor = new Autor("Jess", "Brasileira", true);
        assertEquals("Brasileira", autor.getNacionalidade());
    }

    @Test
    public void testSetNacionalidade(){
        Autor autor = new Autor("Jess", "Brasileira", true);
        autor.setNacionalidade("Argentina");
        assertEquals("Argentina", autor.getNacionalidade());
    }

    @Test
    public void testGetObrasPublicadas(){
        Autor autor = new Autor("Jess", "Brasileira", true);
        Livro[] livros = new Livro[2];
        livros[0] = new Livro("Java avançado", autor, "Tecnologia", false);
        livros[1] = new Livro("Java iniciante", autor, "Tecnologia", true);
        autor.setObrasPublicadas(livros);

        assertArrayEquals(livros, autor.getObrasPublicadas());
    }

    @Test
    public void testSetObrasPublicadas(){
        Autor autor = new Autor("Jess", "Brasileira", true);
        Livro[] livros = new Livro[2];
        livros[0] = new Livro("Java avançado", autor, "Tecnologia", false);
        livros[1] = new Livro("Java iniciante", autor, "Tecnologia", true);
        autor.setObrasPublicadas(livros);

        assertArrayEquals(livros, autor.getObrasPublicadas());
    }

    @Test
    public void getIsUsuario(){
        Autor autor = new Autor("Jess", "Brasileira", true);
        assertEquals(true, autor.getIsUsuario());
    }

    @Test
    public void setIsUsuario(){
        Autor autor = new Autor("Jess", "Brasileira", true);
        autor.setIsUsuario(false);
        assertEquals(false, autor.getIsUsuario());
    }
}

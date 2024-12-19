package Model;
public class Artigo {
    private String titulo;
    private Autor autor;
    private String genero;
    private Boolean isPublicado;

    public Artigo(String titulo, Autor autor, String genero, Boolean isPublicado){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.isPublicado = isPublicado;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getGenero(){
        return genero;
    }

    public Autor getAutor(){
        return autor;
    }

    public Boolean isPublicado(){
        return isPublicado;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public void setIsPublicado(Boolean isPublicado){
        this.isPublicado = isPublicado;
    }

}

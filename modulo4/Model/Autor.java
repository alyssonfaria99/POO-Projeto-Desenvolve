package Model;
public class Autor extends Pessoa {
    private String nacionalidade;
    private Boolean isUsuario;

    public Autor(String nome, String nacionalidade, Boolean isUsuario){
        super(nome);
        this.nacionalidade = nacionalidade;
        this.isUsuario = isUsuario;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    private Livro[] obrasPublicadas;

    public Livro[] getObrasPublicadas(){
        return obrasPublicadas;
    }

    public void setObrasPublicadas(Livro[] livro){
        this.obrasPublicadas = livro;
    }

    public Boolean getIsUsuario() {
        return isUsuario;
    }

    public void setIsUsuario(Boolean isUsuario){
        this.isUsuario = isUsuario;
    }
}
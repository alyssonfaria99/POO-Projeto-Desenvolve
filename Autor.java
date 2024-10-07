public class Autor extends Pessoa {
    private String nacionalidade;

    public Autor(String nome, String nacionalidade){
        super(nome);
        this.nacionalidade = nacionalidade;
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
}
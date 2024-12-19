package Model;
import Interface.PublicavelInterface;

public class Autor extends Pessoa {
    private String nacionalidade;
    private Boolean isUsuario;
    public PublicavelInterface estrategiaPublicacao;

    public Autor(String nome, String nacionalidade, Boolean isUsuario, PublicavelInterface estrategiaPublicacao){
        super(nome);
        this.nacionalidade = nacionalidade;
        this.isUsuario = isUsuario;
        this.estrategiaPublicacao = estrategiaPublicacao;
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

    public void publicar() {
        if (estrategiaPublicacao == null) {
            System.out.println("Nenhuma estratégia de publicação definida para o usuário ");
        } else {
            estrategiaPublicacao.publicar();
        }
    }

    public void setEstrategiaPublicacao(PublicavelInterface estrategia) {
        this.estrategiaPublicacao = estrategia;
    }
}
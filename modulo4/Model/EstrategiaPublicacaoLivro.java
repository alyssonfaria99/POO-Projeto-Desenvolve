package Model;
import Interface.PublicavelInterface;

public class EstrategiaPublicacaoLivro implements PublicavelInterface{
    @Override
    public void publicar(){
        System.out.println("Publicando Artigo...");
    }
}
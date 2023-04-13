//Nome : Luiz Gustavo do Carmo RA : 2209993

public class Manga{
    private String Nome = "Naruto";
    private String Autor = "Kishimoto";
    private String Artista = "Kishimoto";
    private String CodNome;

    

    public void setNome(String Nome){
        this.Nome = Nome;
    }
    public void setAutor(String Autor){
        this.Autor = Autor;
    }
    public void setArtista(String Artista){
        this.Artista = Artista;
    }
    public void setCodNome(String CodNome){
        this.CodNome = CodNome;
    }
    public String getNome(){
        return Nome;
    }
    public String getAutor(){
        return Autor;
    }
    public String getArtista(){
        return Artista;
    }
    public String getCodNome(){
        return CodNome;
    }
}
//Nome: Luiz Gustavo do Carmo  RA : 2209993 
public class Estoque extends Manga{
    private int NumEstoque;             // Quantidade no estoque
    private int quantVol;               // Quantidade de Volumes
    private String Genero;
    private boolean Disp;               // Disponivel pra leitura
    private int CodProdut;              //Codigo do Produto

    public Estoque(){
        NumEstoque = 5;
        setNome("Naruto");
        setAutor("Masashi Kishimoto");
        setArtista("Masashi Kishimoto");
        Disp = true;
        Genero = "Artes Marcias";
        quantVol = 72;
        CodProdut = 001;
    }
    public void setNumEstoque(int NumEstoque){
        this.NumEstoque = NumEstoque;
    }
    public void setDisponivel(boolean Disp){
        this.Disp = Disp;
    }
    public void setGenero(String Genero){
        this.Genero = Genero;
    }
    public void setquantVol(int quantVol){
        this.quantVol = quantVol;
    }
    public void setCodProdut(int CodProdut){
        this.CodProdut = CodProdut;
    }
    
    public int getNumEstoque(){
        return NumEstoque;
    }
    public int getquantVol(){
        return quantVol;
    }
    public boolean getDisponivel(){
        return Disp;
    }
    public String getGenero(){
        return Genero;
    }


}
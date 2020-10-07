
package gerenciador.Interfaces;


//para o leilao pegar as informações independente do tipo/subtipo do objeto
public interface ObjetoVenda {
    
   
    public String getNome();

    public String getTipo();

    public Double getValor();
    
    public int getIdade();
    
    public String getSubTIpo();
    
    public String getDescricao();    
    
    
}

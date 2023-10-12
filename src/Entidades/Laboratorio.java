
package Entidades;

/* Rodrigo Fazzito */
public class Laboratorio {
    private int idLaboratorio;
    private int Cuit;
    private String NomLaboratorio;
    private String Pais;
    private String DomComercial;
    private int StockVacuna;

    public Laboratorio() {
    }

    public Laboratorio(int Cuit, String NomLaboratorio, String Pais, String DomComercial, int StockVacuna) {
        this.Cuit = Cuit;
        this.NomLaboratorio = NomLaboratorio;
        this.Pais = Pais;
        this.DomComercial = DomComercial;
        this.StockVacuna = StockVacuna;
    }

    public Laboratorio(int idLaboratorio, int Cuit, String NomLaboratorio, String Pais, String DomComercial, int StockVacuna) {
        this.idLaboratorio = idLaboratorio;
        this.Cuit = Cuit;
        this.NomLaboratorio = NomLaboratorio;
        this.Pais = Pais;
        this.DomComercial = DomComercial;
        this.StockVacuna = StockVacuna;
    }

    public int getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public int getCuit() {
        return Cuit;
    }

    public void setCuit(int Cuit) {
        this.Cuit = Cuit;
    }

    public String getNomLaboratorio() {
        return NomLaboratorio;
    }

    public void setNomLaboratorio(String NomLaboratorio) {
        this.NomLaboratorio = NomLaboratorio;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getDomComercial() {
        return DomComercial;
    }

    public void setDomComercial(String DomComercial) {
        this.DomComercial = DomComercial;
    }

    public int getStockVacuna() {
        return StockVacuna;
    }

    public void setStockVacuna(int StockVacuna) {
        this.StockVacuna = StockVacuna;
    }

    @Override
    public String toString() {
        return "Laboratorio{" + "idLaboratorio=" + idLaboratorio + ", Cuit=" + Cuit + ", NomLaboratorio=" + NomLaboratorio + ", Pais=" + Pais + ", DomComercial=" + DomComercial + ", StockVacuna=" + StockVacuna + '}';
    }
    
    
}

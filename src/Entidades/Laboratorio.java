
package Entidades;

/* Rodrigo Fazzito */
public class Laboratorio {
    private int Cuit;
    private String NomLaboratorio;
    private String Pais;
    private String DomComercial;

    public Laboratorio() {
    }

    public Laboratorio(int Cuit, String NomLaboratorio, String Pais, String DomComercial) {
        this.Cuit = Cuit;
        this.NomLaboratorio = NomLaboratorio;
        this.Pais = Pais;
        this.DomComercial = DomComercial;
    }

    public Laboratorio(String NomLaboratorio, String Pais, String DomComercial) {
        this.NomLaboratorio = NomLaboratorio;
        this.Pais = Pais;
        this.DomComercial = DomComercial;
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

    @Override
    public String toString() {
        return "Laboratorio{" + "Cuit=" + Cuit + ", NomLaboratorio=" + NomLaboratorio + ", Pais=" + Pais + ", DomComercial=" + DomComercial + '}';
    }
    
}

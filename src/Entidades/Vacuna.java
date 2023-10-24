
package Entidades;

import java.time.LocalDate;

/* Rodrigo Fazzito */
public class Vacuna {
    private long NumSerie;
    private String Marca;
    private Double Medida;
    private LocalDate FechaCaduca;
    private boolean Colocada;
    private Laboratorio laboratorio;

    public Vacuna() {
    }

    public Vacuna(long NumSerie, String Marca, Double Medida, LocalDate FechaCaduca, boolean Colocada, Laboratorio laboratorio) {
        this.NumSerie = NumSerie;
        this.Marca = Marca;
        this.Medida = Medida;
        this.FechaCaduca = FechaCaduca;
        this.Colocada = Colocada;
        this.laboratorio = laboratorio;
    }

    public long getNumSerie() {
        return NumSerie;
    }

    public void setNumSerie(long NumSerie) {
        this.NumSerie = NumSerie;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public Double getMedida() {
        return Medida;
    }

    public void setMedida(Double Medida) {
        this.Medida = Medida;
    }

    public LocalDate getFechaCaduca() {
        return FechaCaduca;
    }

    public void setFechaCaduca(LocalDate FechaCaduca) {
        this.FechaCaduca = FechaCaduca;
    }

    public boolean isColocada() {
        return Colocada;
    }

    public void setColocada(boolean Colocada) {
        this.Colocada = Colocada;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    
   
    @Override
    public String toString() {
        return Marca + " " + Medida;
    }

    public void setMedida(String medidaSeleccionada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}

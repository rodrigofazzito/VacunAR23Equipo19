
package Entidades;

import java.time.LocalDate;

/* Rodrigo Fazzito */
public class Vacuna {
    private int NumSerie;
    private String Marca;
    private Double Medida;
    private LocalDate FechaCaduca;
    private boolean Colocada;
    Laboratorio laboratorio;

    public Vacuna() {
    }

    public Vacuna(int NumSerie, String Marca, Double Medida, LocalDate FechaCaduca, boolean Colocada, Laboratorio laboratorio) {
        this.NumSerie = NumSerie;
        this.Marca = Marca;
        this.Medida = Medida;
        this.FechaCaduca = FechaCaduca;
        this.Colocada = Colocada;
        this.laboratorio = laboratorio;
    }

    public int getNumSerie() {
        return NumSerie;
    }

    public void setNumSerie(int NumSerie) {
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
        return "Vacuna{" + "NumSerie=" + NumSerie + ", Marca=" + Marca + ", Medida=" + Medida + ", FechaCaduca=" + FechaCaduca + ", Colocada=" + Colocada + ", laboratorio=" + laboratorio + '}';
    }

   
    
}

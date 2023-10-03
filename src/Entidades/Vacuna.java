
package Entidades;

import java.time.LocalDate;

/* Rodrigo Fazzito */
public class Vacuna {
    private int NumSerieDosis;
    private String Marca;
    private Double Medida;
    private LocalDate FechaCaduc;
    private boolean Colocada;
    Laboratorio laboratorio;

    public Vacuna() {
    }

    public Vacuna(int NumSerieDosis, String Marca, Double Medida, LocalDate FechaCaduc, boolean Colocada, Laboratorio laboratorio) {
        this.NumSerieDosis = NumSerieDosis;
        this.Marca = Marca;
        this.Medida = Medida;
        this.FechaCaduc = FechaCaduc;
        this.Colocada = Colocada;
        this.laboratorio = laboratorio;
    }

    public Vacuna(String Marca, Double Medida, LocalDate FechaCaduc, boolean Colocada, Laboratorio laboratorio) {
        this.Marca = Marca;
        this.Medida = Medida;
        this.FechaCaduc = FechaCaduc;
        this.Colocada = Colocada;
        this.laboratorio = laboratorio;
    }

    public int getNumSerieDosis() {
        return NumSerieDosis;
    }

    public void setNumSerieDosis(int NumSerieDosis) {
        this.NumSerieDosis = NumSerieDosis;
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

    public LocalDate getFechaCaduc() {
        return FechaCaduc;
    }

    public void setFechaCaduc(LocalDate FechaCaduc) {
        this.FechaCaduc = FechaCaduc;
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
        return "Vacuna{" + "NumSerieDosis=" + NumSerieDosis + ", Marca=" + Marca + ", Medida=" + Medida + ", FechaCaduc=" + FechaCaduc + ", Colocada=" + Colocada + ", laboratorio=" + laboratorio + '}';
    }

    
    
}

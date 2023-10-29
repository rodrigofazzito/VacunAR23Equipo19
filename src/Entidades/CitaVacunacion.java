
package Entidades;

import java.time.LocalDate;

/* Rodrigo Fazzito */
public class CitaVacunacion {
    private int Codcita;
    Ciudadano ciudadano;
    Vacuna vacuna;
    private int dosis;
    private String HoraCita;
    private String CentroVacuna;
    private LocalDate fechaColoca;
    private boolean cancelada;
    

    public CitaVacunacion() {
    }

    public CitaVacunacion(int Codcita, Ciudadano ciudadano, Vacuna vacuna, int dosis, String HoraCita, String CentroVacuna, LocalDate fechaColoca) {
        this.Codcita = Codcita;
        this.ciudadano = ciudadano;
        this.vacuna = vacuna;
        this.dosis = dosis;
        this.HoraCita = HoraCita;
        this.CentroVacuna = CentroVacuna;
        this.fechaColoca = fechaColoca;
    }

    public CitaVacunacion(Ciudadano ciudadano, Vacuna vacuna, int dosis, String HoraCita, String CentroVacuna, LocalDate fechaColoca, boolean cancelada) {
        this.ciudadano = ciudadano;
        this.vacuna = vacuna;
        this.dosis = dosis;
        this.HoraCita = HoraCita;
        this.CentroVacuna = CentroVacuna;
        this.fechaColoca = fechaColoca;
        this.cancelada = cancelada;
    }

    public CitaVacunacion(int Codcita, Ciudadano ciudadano, Vacuna vacuna, int dosis, String HoraCita, String CentroVacuna, LocalDate fechaColoca, boolean cancelada) {
        this.Codcita = Codcita;
        this.ciudadano = ciudadano;
        this.vacuna = vacuna;
        this.dosis = dosis;
        this.HoraCita = HoraCita;
        this.CentroVacuna = CentroVacuna;
        this.fechaColoca = fechaColoca;
        this.cancelada = cancelada;
    }

    public CitaVacunacion(Ciudadano ciudadano, Vacuna vacuna, int dosis, String HoraCita, String CentroVacuna, LocalDate fechaColoca) {
        this.ciudadano = ciudadano;
        this.vacuna = vacuna;
        this.dosis = dosis;
        this.HoraCita = HoraCita;
        this.CentroVacuna = CentroVacuna;
        this.fechaColoca = fechaColoca;
    }

   

    public int getCodcita() {
        return Codcita;
    }

    public void setCodcita(int Codcita) {
        this.Codcita = Codcita;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    public Vacuna getVacuna() {
        return vacuna;
    }

    public void setVacuna(Vacuna vacuna) {
        this.vacuna = vacuna;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    public String getHoraCita() {
        return HoraCita;
    }

    public void setHoraCita(String HoraCita) {
        this.HoraCita = HoraCita;
    }

    public String getCentroVacuna() {
        return CentroVacuna;
    }

    public void setCentroVacuna(String CentroVacuna) {
        this.CentroVacuna = CentroVacuna;
    }

    public LocalDate getFechaColoca() {
        return fechaColoca;
    }

    public void setFechaColoca(LocalDate fechaColoca) {
        this.fechaColoca = fechaColoca;
    }

    public boolean isCancelada() {
        return cancelada;
    }

    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }

    @Override
    public String toString() {
       return  CentroVacuna + " , " + dosis+" dosis aplicadas";
    } 
}
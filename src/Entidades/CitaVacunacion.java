
package Entidades;

import java.time.LocalDate;

/* Rodrigo Fazzito */
public class CitaVacunacion {
    Ciudadano ciudadano;
    Vacuna vacuna;
    private int Codcita;
    private int CodRefuerzo;
    private String HoraCita;
    private String CentroVacuna;
    private LocalDate fechaColoca;//+2 month

    public CitaVacunacion() {
    }

    public CitaVacunacion(Ciudadano ciudadano, Vacuna vacuna, int Codcita, int CodRefuerzo, String HoraCita, String CentroVacuna, LocalDate fechaColoca) {
        this.ciudadano = ciudadano;
        this.vacuna = vacuna;
        this.Codcita = Codcita;
        this.CodRefuerzo = CodRefuerzo;
        this.HoraCita = HoraCita;
        this.CentroVacuna = CentroVacuna;
        this.fechaColoca = fechaColoca;
    }

    public CitaVacunacion(Ciudadano ciudadano, Vacuna vacuna, int CodRefuerzo, String HoraCita, String CentroVacuna, LocalDate fechaColoca) {
        this.ciudadano = ciudadano;
        this.vacuna = vacuna;
        this.CodRefuerzo = CodRefuerzo;
        this.HoraCita = HoraCita;
        this.CentroVacuna = CentroVacuna;
        this.fechaColoca = fechaColoca;
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

    public int getCodcita() {
        return Codcita;
    }

    public void setCodcita(int Codcita) {
        this.Codcita = Codcita;
    }

    public int getCodRefuerzo() {
        return CodRefuerzo;
    }

    public void setCodRefuerzo(int CodRefuerzo) {
        this.CodRefuerzo = CodRefuerzo;
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

    @Override
    public String toString() {
        return "CitaVacunacion{" + "ciudadano=" + ciudadano + ", vacuna=" + vacuna + ", Codcita=" + Codcita + ", CodRefuerzo=" + CodRefuerzo + ", HoraCita=" + HoraCita + ", CentroVacuna=" + CentroVacuna + ", fechaColoca=" + fechaColoca + '}';
    }
    

    
}

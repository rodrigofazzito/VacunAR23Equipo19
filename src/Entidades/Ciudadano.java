
package Entidades;

/* Rodrigo Fazzito */
public class Ciudadano {
    private int Dni;
    private String NombreComp;
    private String Email;
    private int Celular;
    private String Patologia;
    private String AmbitoTrabajo;
    public Ciudadano() {
    }

    public Ciudadano(int Dni, String NombreComp, String Email, int Celular, String Patologia, String AmbitoTrabajo) {
        this.Dni = Dni;
        this.NombreComp = NombreComp;
        this.Email = Email;
        this.Celular = Celular;
        this.Patologia = Patologia;
        this.AmbitoTrabajo = AmbitoTrabajo;
    }

    public Ciudadano(String NombreComp, String Email, int Celular, String Patologia, String AmbitoTrabajo) {
        this.NombreComp = NombreComp;
        this.Email = Email;
        this.Celular = Celular;
        this.Patologia = Patologia;
        this.AmbitoTrabajo = AmbitoTrabajo;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public String getNombreComp() {
        return NombreComp;
    }

    public void setNombreComp(String NombreComp) {
        this.NombreComp = NombreComp;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int Celular) {
        this.Celular = Celular;
    }

    public String getPatologia() {
        return Patologia;
    }

    public void setPatologia(String Patologia) {
        this.Patologia = Patologia;
    }

    public String getAmbitoTrabajo() {
        return AmbitoTrabajo;
    }

    public void setAmbitoTrabajo(String AmbitoTrabajo) {
        this.AmbitoTrabajo = AmbitoTrabajo;
    }

    @Override
    public String toString() {
        return "Ciudadano{" + "Dni=" + Dni + ", NombreComp=" + NombreComp + ", Email=" + Email + ", Celular=" + Celular + ", Patologia=" + Patologia + ", AmbitoTrabajo=" + AmbitoTrabajo + '}';
    }


    
}

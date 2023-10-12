
package Entidades;

/* Rodrigo Fazzito */
public class Ciudadano {
    private int Dni;
    private String NombreComp;
    private String Email;
    private int Celular;
    private String nota;
    private boolean esencial;
    private boolean sintomas;
    public Ciudadano() {
    }

    public Ciudadano(int Dni, String NombreComp, String Email, int Celular, String nota, boolean esencial, boolean sintomas) {
        this.Dni = Dni;
        this.NombreComp = NombreComp;
        this.Email = Email;
        this.Celular = Celular;
        this.nota = nota;
        this.esencial = esencial;
        this.sintomas = sintomas;
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

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public boolean isEsencial() {
        return esencial;
    }

    public void setEsencial(boolean esencial) {
        this.esencial = esencial;
    }

    public boolean isSintomas() {
        return sintomas;
    }

    public void setSintomas(boolean sintomas) {
        this.sintomas = sintomas;
    }

    @Override
    public String toString() {
        return "Ciudadano{" + "Dni=" + Dni + ", NombreComp=" + NombreComp + ", Email=" + Email + ", Celular=" + Celular + ", nota=" + nota + ", esencial=" + esencial + ", sintomas=" + sintomas + '}';
    }


    
}

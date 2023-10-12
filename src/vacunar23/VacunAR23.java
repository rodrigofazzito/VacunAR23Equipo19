package vacunar23;

import Acceso_A_Datos.CitaVacunaData;
import Acceso_A_Datos.CiudadanoData;
import Acceso_A_Datos.LaboratorioData;
import Acceso_A_Datos.VacunaData;
import Entidades.CitaVacunacion;
import Entidades.Ciudadano;
import Entidades.Laboratorio;
import Entidades.Vacuna;
import Vistas.Login;
import java.time.LocalDate;
import javax.swing.JOptionPane;


/* Rodrigo Fazzito */
public class VacunAR23 {

    public static void main(String[] args) {
        
//        Login log = new Login();
//        log.setVisible(true);
        
        
//        //Ciudadano ciu = new Ciudadano(12345678,"GerardoSofovich","gerardo@gmail.com",12345,"se vacuna","no trabaja");
//        CiudadanoData ciuData = new CiudadanoData();
        VacunaData vacData = new VacunaData();
//        CitaVacunaData cita = new CitaVacunaData();
//        //CitaVacunacion citaV = new CitaVacunacion(ciu, vac, 123, "2:30", "salita", LocalDate.now());
//        LaboratorioData labData = new LaboratorioData();
//        //ciuData.GuardarCiudadano(ciu);
//        labData.GuardarLaboratorio(lab);
        
//        //cita.GuardarCita(citaV);
        LaboratorioData labo = new LaboratorioData();
        CitaVacunaData cita = new CitaVacunaData();
        CiudadanoData ciuData = new CiudadanoData();
        Laboratorio lab = new Laboratorio(3,2045678912,"Sputnik","Rusia","Vladimir",80);
        //labo.GuardarLaboratorio(lab);
        Vacuna vac = new Vacuna(0223,"Sputnik",0.9,LocalDate.now(),true,lab);
       //vacData.GuardarVacuna(vac);
       //int Dni, String NombreComp, String Email, int Celular, String nota, boolean esencial, boolean sintomas
        Ciudadano ciu = new Ciudadano(12345678,"Gerardo Sofovich","gerardo@gmail.com",12345,"se vacuna",false,false);
        //ciuData.GuardarCiudadano(ciu);
        //Ciudadano ciudadano, Vacuna vacuna, int CodRefuerzo, int dosis, String HoraCita, String CentroVacuna, LocalDate fechaColoca
        //CitaVacunacion citaV = new CitaVacunacion(ciu, vac, 0,"2:30", "salita", LocalDate.now());
        //cita.GuardarCita(citaV);
//        if(vac.isColocada() == true){
//            labo.ReducirStock(lab);
//            JOptionPane.showMessageDialog(null, "Reduccion exitosa");}
         CitaVacunacion citaV = new CitaVacunacion(7,ciu, vac, 0, "2:30", "salita", LocalDate.now());
         for(CitaVacunacion c : cita.obtenerCita(12345678)){
             JOptionPane.showMessageDialog(null, c);
         }
         //cita.cancelarCita(citaV);
         //cita.GuardarCita(citaV);
//       if(vac.isColocada()){
//       cita.modificardosis(citaV);
//      }
//        for(Laboratorio c : labo.listaLaboratorio()){
//            JOptionPane.showMessageDialog(null, c);
//        }
        
        
        //Laboratorio lab = new Laboratorio(2045678912, "laboratorioferr", "Argentina", "America");
//        Vacuna vac = new Vacuna(12, "Bago", 0.3, LocalDate.now(), true, lab);
//        //Ciudadano ciu = new Ciudadano(12345678,"GerardoSofovich","gerardo@gmail.com",12345,"se vacuna","no trabaja");
//        CiudadanoData ciuData = new CiudadanoData();
//        VacunaData vacData = new VacunaData();
//        CitaVacunaData cita = new CitaVacunaData();
//        //CitaVacunacion citaV = new CitaVacunacion(ciu, vac, 123, "2:30", "salita", LocalDate.now());
//        LaboratorioData labData = new LaboratorioData();
//        //ciuData.GuardarCiudadano(ciu);
//        labData.GuardarLaboratorio(lab);
//        vacData.GuardarVacuna(vac);
//        //cita.GuardarCita(citaV);

    }

}

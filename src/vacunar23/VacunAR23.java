package vacunar23;

import Entidades.Laboratorio;
import Vistas.Login;


/* Rodrigo Fazzito */
public class VacunAR23 {

    public static void main(String[] args) {
        
        Login log = new Login();
        log.setVisible(true);
        
        
        
        Laboratorio lab = new Laboratorio(2045678912, "laboratorioferr", "Argentina", "America");
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

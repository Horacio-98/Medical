import java.util.ArrayList;
import java.util.Date;

public class doctor {

    // Atributos 
    static int id = 0; // Prevalece mas alla de la instanciacion de un objeto
    private String name; 
    private String email; 
    private String speciality; 


    // Constructor --- Datos necesarios
    public doctor(String name,String speciality){
        id++; 
        this.name = name; 
        this.speciality = name; 
    }


    // Comportamientos - Methods
    public void showName(){
        System.out.println(id + "." + " Nombre del medico : " + name);
    }

    // Crea citas nuevas usando la clase anidada
    ArrayList<AvailableAppointment> appointments = new ArrayList<>();
    public void addAvailableAppoinment(Date date, String time){
        appointments.add(new AvailableAppointment(date, time)); 
    }


    // Devuelve las citas  que tenemos en el ArrayList 
    public ArrayList<AvailableAppointment> getAppointments(){
        return appointments; 
    }




    // Clase Anidada - Independiente 
    public static class AvailableAppointment{
        private int id_Appoinment; 
        private Date date; 
        private String time; 

        public AvailableAppointment(Date date, String time){
            this.date = date; 
            this.time = time; 
        }

        public int getId_Appoinment() {
            return id_Appoinment;
        }

        public Date getDate() {
            return date;
        }

        public String getTime() {
            return time;
        }

        public void setId_Appoinment(int id_Appoinment) {
            this.id_Appoinment = id_Appoinment;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public void setTime(String time) {
            this.time = time;
        }

        
    }


}

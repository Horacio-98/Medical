import java.util.ArrayList;
import java.util.Date;

// Numerations 

public class doctor {

    /* 
    // ENUMERATIONS - EXAMPLE WITH DAYS OF THE WEEK 

    public enum Day{
        MONDAY("Lunes"),
        TUESDAY("Martes"),
        WEDNESDAY("Miercoles"),
        THURSDAY("Jueves"),
        FRIDAY("Viernes"),
        SATURDAY("Sabado"),
        SUNDAY("Domingo");  

        private String spanish; 

        private Day(String s){
            spanish=s; 
        }

        public String getSpanish(){
            return spanish; 
        }
    }
    */


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
        System.out.println("Doctor asignado : " + name);
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


    // Regresa la citas disponibles
    public void regresaAppointments(){
        for (AvailableAppointment availableAppointment : appointments) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        } 
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

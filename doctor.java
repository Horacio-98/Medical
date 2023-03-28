import java.util.ArrayList;
import java.util.Date;

// CLASE HIJA DE USER
public class doctor extends user {

    // Atributos extras
        private String speciality; 
        

    // Constructor incluye la herencia por " SUPER "
    public doctor(String name,String email){
        super(name, email); 
        System.out.println("Doctor asignado : " + name);
        this.speciality = speciality; 
    }
    

    // Getters and Setters

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
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

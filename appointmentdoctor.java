import java.util.Date;

public class appointmentdoctor implements IScheduleable {
    private int id;
    private patient patient; 
    private doctor doctor; 
    private Date date; 
    private String time;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public patient getPatient() {
        return patient;
    }
    public void setPatient(patient patient) {
        this.patient = patient;
    }
    public doctor getDoctor() {
        return doctor;
    }
    public void setDoctor(doctor doctor) {
        this.doctor = doctor;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }


    // IMPLEMENT METHOD SCHEDULE - INTERFACE
    @Override
    public void schedule(Date date, String time) {
        
    } 


    
    
    
    
    
}

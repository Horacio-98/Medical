import java.util.Date;

public class appointmentnurse implements IScheduleable {
    private int id;
    private patient patient; 
    private nurse nurse; 
    private Date date; 
    private String time;



    // GETTERS AND SETTERS

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

    public nurse getNurse() {
        return nurse;
    }

    public void setNurse(nurse nurse) {
        this.nurse = nurse;
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

public class nurse extends user {
    String speciality; 

    // CONSTRUCTOR CON HERENCIA 
    public nurse(String name, String email){
        super(name, email); 
    }


    // Getter and Setters

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}

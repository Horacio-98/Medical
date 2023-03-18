import java.util.Date;

public class Main {
    public static void main(String[] args) {
        doctor myDoctor_1 = new doctor("Abel Granados", "General");  
        doctor myDoctor_2 = new doctor("Jeanett Argumedo", "General"); 
        //patient patient_1 = new patient("Horacio Granados", "granadoshoracio2@gmail.com"); 
        //patient patient_2 = new patient("Beatriz Granados", "betyga@gmail.com");


        myDoctor_1.addAvailableAppoinment(new Date(), "9:00 am");
        myDoctor_1.addAvailableAppoinment(new Date(), "11:00 am");
        myDoctor_2.addAvailableAppoinment(new Date(), "13:00 pm");
        myDoctor_2.addAvailableAppoinment(new Date(), "18:00 pm");

        for (doctor.AvailableAppointment AA : myDoctor_1.getAppointments()) {
            System.out.println(AA.getDate() + " " + AA.getTime());
        }
        

        //uiMenu.showMenu(); 

    }
}
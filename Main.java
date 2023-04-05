import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // COLLECTIONS 
        Map<Integer,String> mapa = new HashMap<Integer,String>();
        Map<Integer,String> treemap = new TreeMap<Integer,String>();
        Map<Integer,String> link = new LinkedHashMap<Integer,String>(); 
        //doctor myDoctor_1 = new doctor("Abel Granados", "General");  
        doctor myDoctor_2 = new doctor("Jeanett Argumedo", "j_argumedo2271@gmail.com"); 
        patient patient_1 = new patient("Horacio Granados", "granadoshoracio2@gmail.com"); 
        //patient patient_2 = new patient("Beatriz Granados", "betyga@gmail.com");

        myDoctor_2.addAvailableAppoinment(new Date(), "13:00 pm");
        myDoctor_2.addAvailableAppoinment(new Date(), "18:00 pm");
        // myDoctor_2.regresaAppointments();
        System.out.println(myDoctor_2);

        //uiMenu.showMenu(); 

    }
}
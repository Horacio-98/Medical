import java.util.ArrayList;
import java.util.Scanner;

public class uiMenu {

    public static final String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"}; 
    public static doctor doctorlogged;
    public static patient patientlogged; 

    public static void showMenu(){
        System.out.println("--------Welcome to My Appointments--------");
        System.out.println("\nSelecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0; 
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }


    // METHOD TO LOG IN AS DOCTOR OR PATIENT
    private static void authUser(int userType){
        // userType = 1 - Doctor
        // userType = 2 - Patient

        ArrayList<doctor> doctors = new ArrayList<>(); 
        doctors.add(new doctor("Jeanett Argumedo", "j_argumedo@gmail.com"));
        doctors.add(new doctor("Abel Granados", "islamicmedicagg@gmail.com")); 
        doctors.add(new doctor("Gilberto Barranco", "gilbarrancogg@gmail.com")); 

        ArrayList<patient> patients = new ArrayList<>();
        patients.add(new patient("Horacio Granados", "granadosh@gmail.com"));
        patients.add(new patient("Beatriz Granados", "betyga@gmail.com"));
        patients.add(new patient("Fernanda Albither", "feram@gmail.com"));

        boolean emailCorrect = false; 
        do {
            System.out.println("Insert your emai : [asdad@gmail.com]");
            Scanner input = new Scanner(System.in); 
            String email = input.nextLine(); 

            if(userType == 1){
                for (doctor d : doctors) {
                    if (d.getEmail().equals(email) ) {
                        emailCorrect = true; 
                        // Get the loggued user 
                        doctorlogged = d; 
                        // Show doctor menu
                    }
                }
            }
            if(userType == 2 ){
                for (patient p : patients) {
                    if (p.getEmail().equals(email)) {
                        emailCorrect = true; 
                        // Get the loggued user
                        patientlogged = p; 
                        // Show patient menu
                    }
                }
            }

        } while (!emailCorrect);
    }



    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}



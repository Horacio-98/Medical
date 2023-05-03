import java.util.Scanner;

public class UIDcoctorMenu {

    public static void showDoctorMenu(){
        int response = 0; 
        do {
            System.out.println("\n\n");
            System.out.println("Welcome" + uiMenu.doctorlogged.getName());
            System.out.println("1. Add Available Appintment");
            System.out.println("2. My Schedule Appintments");
            System.out.println("0. Logout ");

            Scanner sc = new Scanner(System.in); 
            response = Integer.valueOf(sc.nextLine()); 

            switch(response){

                case 1: 
                    break;
                    
                case 2: 
                    break;

                case 0: 
                    uiMenu.showMenu();
                    break; 
            }

        } while (response != 0);
    }

    // >   <

    private static void showAddAvailableAppointmentsMenu(){
        int response = 0; 
        do {
            System.out.println(":: Add Available Appointment");
            System.out.println(":: Select a month");

            for (int i = 0; i < 3; i++) {
                int j = i+1; 
                System.out.println(j + ". " + uiMenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in); 
            response = Integer.valueOf(sc.nextLine()); 

            if (response > 0  && response < 4) {
                // 1,2,3
                int montSelected = response; 
                System.out.println(montSelected + " . " + uiMenu.MONTHS[montSelected]);

                System.out.println("Insert the date :  [dd/mm/yy]");
                String date = sc.nextLine(); 

                System.out.println("Your date is : " + date );
                System.out.println("\n1. Correct\n2.Change Date");

            }else if(response == 0){
                showDoctorMenu();
            }


        } while (response != 0);
    }
    
}

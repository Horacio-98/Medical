import javax.print.attribute.IntegerSyntax;

public class Main {
    public static void main(String[] args) {
        //doctor myDoctor_1 = new doctor("Abel Granados", "General");  
        //doctor myDoctor_2 = new doctor("Jeanett Argumedo", "General"); 
        patient patient_1 = new patient("Horacio Granados", "granadoshoracio2@gmail.com"); 
        patient patient_2 = new patient("Beatriz Granados", "betyga@gmail.com");

        patient_1.setHeight(1.70);
        patient_1.setWeight(70);
        patient_1.setPhone("56756864");
        patient_1.setEmail("Prueba");
        System.out.println("Altura : " + patient_1.getHeight());
        System.out.println("Peso : " + patient_1.getWeight());
        System.out.println("Telefono : " + patient_1.getPhone());
        System.out.println("Email : " + patient_1.getEmail());


        //uiMenu.showMenu(); 

    }
}
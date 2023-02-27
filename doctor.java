public class doctor {

    // Atributos 
    static int id = 0; // Prevalece mas alla de la instanciacion de un objeto
    String name; 
    String speciality; 

    // Constructor
    public doctor(String name,String speciality){
        id++; 
        this.name = name; 
        this.speciality = name; 
    }

    // Comportamientos - Methods
    public void showName(){
        System.out.println(id + "." + " Nombre del medico : " + name);
    }
}

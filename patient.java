// CLASE HIJA DE USER
public class patient extends user{

    // Atributos

    private String birthday;
    private double weight; 
    private double height; 
    private String blood; 


    // Constructor
    public patient(String name, String email){
        super(name, email); 
    }


    // Getters and Setters

    public String getBirthday() {
        return birthday;
    }

    public String getWeight() {
        return this.weight + " kg";
    }

    public String getHeight() {
        return this.height + " m";
    }

    public String getBlood() {
        return blood;
    }


    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }


    // SOBREESCRIBIENDO METODO DE CLASE PADRE USER  + AÑADIMOS OTROS COMPORTAMIENTOS
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\n" + "Weight : " + getWeight() + "\n" +  "Height : " + getHeight()
                + "\n" +  "Blood : " + blood ;
    }

    
    @Override
    public void showDataUser() {
        // TODO Auto-generated method stub
        System.out.println("Paciente");
        System.out.println("Historial Completo");
    }
    


    
}

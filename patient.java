public class patient {

    // Atributos

    private String name; 
    private String email; 
    private String address; 
    private String phone; 
    private String birthday;
    private double weight; 
    private double height; 
    private String blood; 


    // Constructor

    public patient(String name, String email){
        this.name = name; 
        this.email = email; 
    }


    // Getters and Setters

    public String getName(){
        return name; 
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        }
        else {
            System.out.println("El formato no es valido para un correo");
            System.out.println("El correo no se ha cambiado");
        }
        
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        if (phone.length() == 8){
            this.phone = phone;
        }
        else{
            System.out.println("El telefono debe contener 8 digitos");
        }
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

    

    


    
}

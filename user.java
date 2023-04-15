// CLASE PADRE

public abstract class user {
    private int id; 
    private String name; 
    private String email; 
    private String address; 
    private String phone; 

    public user(String name, String email){
        this.name = name;
        this.email = email;        
    }

    public int getId() {
        return id;
    }

    public String getName() {
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

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // METODO SOBREESCRITO EN CLASE PADRE
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "User : " + name + "\n" + "Email : " + email + "\n" +
                "Adrdress : " + address + "\n" + "Phone : " + phone;
    }


    // METODO ABSTRACTO QUE OBLIGATORIAMENTE SE IMPLEMENTA EN LAS CLASES HIJAS  
    public abstract void showDataUser(); 


}

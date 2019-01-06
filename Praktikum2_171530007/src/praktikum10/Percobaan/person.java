
package praktikum10.Percobaan;

public class person {
    protected String name;
    protected String address;
    
    /**
     * Default Constructor
     */
    
    public person(){
        System.out.println("Inside Person : Constructor");
        name="";
        address="";
    }
    
    /**
     * Constructor dengan dua parameter
     */
    public person(String vname, String vaddress){
        this.name = vname;
        this.address = vaddress;
    }
    /**
     * Method accessor
     */
    public String getName() {
        return name;
    }
    
    public String detAddress(){
        return address;
    }
    
    public void setName(String vname){
        this.name = vname;
    }
    
    public void setAddress(String vaddress){
        this.name = vaddress;
    }
}

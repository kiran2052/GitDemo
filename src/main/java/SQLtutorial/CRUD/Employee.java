package SQLtutorial.CRUD;



public class Employee {
    private int  Id;
    private String name;
    private String address;

    public Employee(int id, String name, String address) {
        this. Id = id;
        this.name = name;
        this.address = address;
    }
    public Employee(int id){
        this.Id=id;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
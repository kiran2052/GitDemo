package SQLtutorial.CRUD;

import java.sql.SQLException;
import java.util.Scanner;

public class RunCrud {
    static EmployeeService employeeService;
    static {
        try {
            employeeService = new EmployeeService() {


                @Override
                public void deleteEmployee(int Id) throws SQLException {

                }

                @Override
                public void updateEmployee(int Id, String Name, String Address) {

                }
            };
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws SQLException {
        while(true) {
            System.out.println("1. Show database");
            System.out.println("2. Add data");
            System.out.println("3. Delete data");
            System.out.println("4. Update data");
            System.out.println("ANy other number to exit");

            performOperation();









        }
    }
    private static void performOperation()throws SQLException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose From Option");
        int opt=sc.nextInt();
        switch(opt){
            case 1:
                employeeService.listEmployee();
                break;

            case 2:
                try {
                    System.out.println("To add Student");

                    System.out.println("Enter Name");
                    String name = new Scanner(System.in).nextLine();

                    System.out.println("Enter address");
                    String address = new Scanner(System.in).nextLine();
                    Employee emp = new Employee(0, name, address);
                    employeeService.addEmployee(emp);

                    System.out.println("Successfully Added");
                    break;
                }catch (Exception e){
                    e.printStackTrace();
                    break;
                }
            case 3:
                try{
                    System.out.println("Enter Id to delete");
                    int Id=sc.nextInt();

                    Employee emp= new Employee(Id, null, null);
                    employeeService.deleteEmployee(emp);
                    System.out.println("Deleted successfully");
                    break;

                }catch (Exception e){
                    e.printStackTrace();
                }


            case 4:
                try{
                    System.out.println("Enter Id to update data");
                    int Id=sc.nextInt();
                    System.out.println("set name to  ");
                    String name= sc.next();
                    System.out.println("set address to ");
                    String address =sc.next();
                    Employee emp= new Employee(Id, name, address );
                    employeeService.updateEmployee(emp);
                    System.out.println("Updated successfully");
                    break;


                }catch (Exception e){
                    e.printStackTrace();
                }


            default:
                break;

        }
    }





}





package SQLtutorial.CRUD;


import java.sql.*;

public abstract class EmployeeService implements EmployeeImpl, EmployeeService1, EmployeeService11 {
    String  dbUser = "admin";
    String dbPass = "Houston123";
    String connString = "jdbc:mysql://localhost:3306/Employee?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
    Connection con = DriverManager.getConnection(connString, dbUser, dbPass);
    Statement stmt = con.createStatement();

    public EmployeeService() throws SQLException {

    }


    @Override
    public void listEmployee() {
        System.out.println("Employees List ...... \n");
        System.out.println("ID\t\tNAME\t\tADDRESS");
        try {
            ResultSet rs = stmt.executeQuery("select * from new_table");
            while (rs.next())
                System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @Override
    public void addEmployee(Employee emp) {
        try{

            //(null,'n','add')
          String sql="INSERT INTO `Employee`.`new_table` Values (null,'"+emp.getName()+"','"+emp.getAddress()+"')";
            System.out.println(sql);
            stmt.executeUpdate(sql);

        }catch(Exception e){
            System.out.println(e);

        }



    }


    public void deleteEmployee(Employee emp) throws SQLException {
        try{
            //DELETE FROM `Employee`.`new_table` WHERE (`Id` = '37');


            String sql=" Delete from new_table where Id = '"+emp.getId()+"'";
            System.out.println(sql);
            stmt.executeUpdate(sql);

        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public void updateEmployee(Employee emp) {
        try{
            String sql ="UPDATE `Employee`.`new_table` SET name= ' "+emp.getName()+" ' , address= ' "+emp.getAddress()+" '  where (Id = "+emp.getId()+")";
            System.out.println(sql);
            stmt.executeUpdate(sql);


        }catch (Exception e ){
            e.printStackTrace();
        }




    }


}





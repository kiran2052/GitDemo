package SQLtutorial;

import java.sql.*;

public class sqlEmployeeConn {
    public static void main(String[] args) {
        String conString="jdbc:mysql://localhost:3306/Employee?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
        try {
            Connection Con = DriverManager.getConnection(conString, "admin", "Houston123");
            Statement stat = Con.createStatement();
            ResultSet myRs = stat.executeQuery("SELECT * from new_table");
            while (myRs.next()) {
                System.out.println(myRs.getString("Id") + "\t" + myRs.getString("Name") + "\t\t" + myRs.getString("Address"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}

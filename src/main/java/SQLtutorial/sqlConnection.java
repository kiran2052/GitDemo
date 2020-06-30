package SQLtutorial;

import javax.naming.Name;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

public class sqlConnection {
    public static void main(String[] args) {
        String connString="jdbc:mysql://localhost:3306/SchoolMis?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";


        try {


            Connection con = DriverManager.getConnection(connString, "root", "Kiran2052");
            Statement stat = con.createStatement();
            ResultSet myRs = stat.executeQuery("select * from Student");
            while (myRs.next()) {
                System.out.println(myRs.getString("ID") + " \t\t" +myRs.getString("Name")+"\t\t "+myRs.getString("Address")+ "\t\t "+myRs.getString("Email"));
            }

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

}


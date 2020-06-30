package SQLtutorial.CRUD;

import java.sql.SQLException;

public interface EmployeeImpl {
    void listEmployee();

    void addEmployee(Employee emp);

    void deleteEmployee(int Id) throws SQLException;

    void updateEmployee(int Id, String Name, String Address);

}



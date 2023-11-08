package registrationone.demofivetwo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registrationone.demofivetwo.Entity.Employee;
import registrationone.demofivetwo.Repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee registerEmployee(String empNO, String empName) {
        // Validate input parameters
        if (empNO == null || empName == null) {
            throw new IllegalArgumentException("Employee number and name must not be null.");
        }

        // Create an Employee object
        Employee employee = new Employee();
        employee.setEmpNO(empNO);
        employee.setEmpName(empName);

        // Save to the database
        return employeeRepository.save(employee);
    }
    public Employee getEmployeeByEmpNO(String empNO) {
        // Retrieve an employee by empNO
        return employeeRepository.findByEmpNO(empNO);
    }
}


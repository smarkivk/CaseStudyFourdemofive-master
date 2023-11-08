package registrationone.demofivetwo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import registrationone.demofivetwo.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findByEmpNO(String empNO);
}


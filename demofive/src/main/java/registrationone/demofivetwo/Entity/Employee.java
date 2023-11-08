package registrationone.demofivetwo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//identity to auto changed last
    private Long id;

    @NotBlank(message = "Employee name is required")
    private String empName;

    @NotBlank(message = "Employee number is required")
    private String empNO;

    public Employee(Long id, String empName, String empNO) {
        this.id = id;
        this.empName = empName;
        this.empNO = empNO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
// Getters and setters

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpNO() {
        return empNO;
    }

    public void setEmpNO(String empNO) {
        this.empNO = empNO;
    }

    public Employee() {
    }


}



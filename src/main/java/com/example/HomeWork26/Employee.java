import java.util.Objects;

public class Employee {
    private final Integer id;
    private final String fullName;
    private Integer salary;
    private Integer departmentId;

    private static Integer idCounter = 1;

    public Employee(String fullName, Integer salary, Integer departmentId) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.salary = salary;
        this.departmentId = departmentId;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(getId(), employee.getId()) && Objects.equals(getFullName(), employee.getFullName()) && Objects.equals(getSalary(), employee.getSalary()) && Objects.equals(getDepartmentId(), employee.getDepartmentId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFullName(), getSalary(), getDepartmentId());
    }

    @Override
    public String toString() {
        return "сотрудник | id: " + id +
                ", Ф.И.О.: - '" + fullName +
                ", зарплата:" + salary +
                ", отдел: " + departmentId;
    }
}


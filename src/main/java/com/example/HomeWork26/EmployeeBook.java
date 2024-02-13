import java.util.Arrays;

public class EmployeeBook {

    //Базовый уровень сложности

    private Employee[] employees;

    public EmployeeBook() {
        employees = new Employee[10];
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public Employee minSalary() {
        Employee res = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < res.getSalary()) {
                res = employee;
            }
        }
        return res;
    }

    public Employee maxSalary() {
        Employee res = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > res.getSalary()) {
                res = employee;
            }
        }
        return res;
    }

    public float midlSumSalary() {
        return sumSalary() / employees.length;
    }

    public void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    // Повышенный уровень сложности

    public void indSalary(int percent) {
        for (Employee employee : employees) {
            int currentSalary = employee.getSalary();
            employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
        }
    }

    public Employee minSalaryDepatmentID(int departamentId) {
        int minSalary = Integer.MAX_VALUE;
        Employee res = null;
        for (Employee employee : employees) {
            if (employee.getDepartmentId() != departamentId) {
                continue;
            }
            if (employee.getSalary() < minSalary) {
                res = employee;
                minSalary = employee.getSalary();
            }
        }
        return res;
    }

    public Employee maxSalaryDepatmentID(int departamentId) {
        int maxSalary = Integer.MIN_VALUE;
        Employee res = null;
        for (Employee employee : employees) {
            if (employee.getDepartmentId() != departamentId) {
                continue;
            }
            if (employee.getSalary() > maxSalary) {
                res = employee;
                maxSalary = employee.getSalary();
            }
        }
        return res;
    }

    public int sumSalaryDepartment(int departamentId) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartmentId() == departamentId)
                sum += employee.getSalary();
        }
        return sum;
    }

    public float averageSumSalary(int departamentId) {
        float sum = 0;
        int membersCount = 0;
        for (Employee employee : employees) {
            if (employee.getDepartmentId() == departamentId) {
                sum += employee.getSalary();
                membersCount++;
            }
        }
        return sum / membersCount;
    }

    public void increaseSalaryOfDepartment(int percent, int departmentId) {
        for (Employee employee : employees) {
            if (employee.getDepartmentId() == departmentId) {
                int currentSalary = employee.getSalary();
                employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
            }
        }
    }

    public void printEmployeesOfDepartment(int departmentId) {
        for (Employee employee : employees) {
            if (employee.getDepartmentId() == departmentId) {
                System.out.println(employee);
            }
        }
    }

    public void printEmployeesWithMore(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println(employee.getId() + " "
                        + employee.getFullName() + " "
                        + employee.getSalary());
            }
        }
    }

    public void printEmployeesWithLess(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println(employee.getId() + " "
                        + employee.getFullName() + " "
                        + employee.getSalary());
            }
        }
    }

    //Очень сложный уровень

    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                System.out.println("добавлен сотрудник " + employee);
                break;
            }
        }
    }

    public void deleteEmployeeId(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getId() == id) {
                    System.out.println("сотрудник удален - " + employees[i]);
                    employees[i] = null;
                }
            }
        }
    }

    public void deleteEmployeeName(String fullName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getFullName().equals(fullName)) {
                    System.out.println("сотрудник удален - " + employees[i]);
                    employees[i] = null;
                }
            }
        }
    }

    public void setEmployee(String fullName, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getFullName().equals(fullName)) {
                    employees[i].setSalary(salary);
                    System.out.println("сотрудник изменен - " + employees[i]);
                }
            }
        }
    }

//    public void printEmployeesInGroup(int id, String fullName, int salary, int departmentID) {
//        for (Employee employee : employees) {
//            System.out.println(employee);
//                    Arrays.sort(departmentID);
//
//                    for (int number : departmentID) {
//                        System.out.print(number + " ");
//                    }
//                }
//            }
//        }
//    }

}

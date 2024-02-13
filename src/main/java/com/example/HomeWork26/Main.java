public class Main {

    private static int[] generateRandomSalary() {
        java.util.Random random = new java.util.Random();
        int[] salary = new int[30];
        for (int i = 0; i < salary.length; i++) {
            salary[i] = random.nextInt(100000) + 100000;
        }
        return salary;
    }

    private static int[] generateRandomDepartmentID() {
        java.util.Random random = new java.util.Random();
        int[] departmentID = new int[30];
        for (int i = 0; i < departmentID.length; i++) {
            departmentID[i] = random.nextInt(5) + 1;
        }
        return departmentID;
    }

    public static void main(String[] args) {
        System.out.println("------------------------------");
        System.out.println("Базовый уровень");
        System.out.println("------------------------------");
        EmployeeBook employeeBook = new EmployeeBook();
        Employee employee1 = new Employee("Мостолыгин Алексей Сергеевич", generateRandomSalary()[0], generateRandomDepartmentID()[0]);
        Employee employee2 = new Employee("Костылев Андрей Валентинович", generateRandomSalary()[1], generateRandomDepartmentID()[1]);
        Employee employee3 = new Employee("Тогашева Анастасия Валентиновна", generateRandomSalary()[2], generateRandomDepartmentID()[2]);
        Employee employee4 = new Employee("Симочкин Владислав Викторович", generateRandomSalary()[3], generateRandomDepartmentID()[3]);
        Employee employee5 = new Employee("Симонова Юлия Витальевна", generateRandomSalary()[4], generateRandomDepartmentID()[4]);
        Employee employee6 = new Employee("Порядина Дарья Дминтриевна", generateRandomSalary()[5], generateRandomDepartmentID()[5]);
        Employee employee7 = new Employee("Лоскутов Сергей Алексеевич", generateRandomSalary()[6], generateRandomDepartmentID()[6]);
        Employee employee8 = new Employee("Соловьев Игорь Романивич", generateRandomSalary()[7], generateRandomDepartmentID()[7]);
        Employee employee9 = new Employee("Петров Павел Валентинович", generateRandomSalary()[8], generateRandomDepartmentID()[8]);
        Employee employee10 = new Employee("Кожеин Дмитрий Игоревич", generateRandomSalary()[9], generateRandomDepartmentID()[9]);
        Employee employee11 = new Employee("Кожеин Дмитрий Игоревич", generateRandomSalary()[9], generateRandomDepartmentID()[9]);
        employeeBook.addEmployee(employee1);
        employeeBook.addEmployee(employee2);
        employeeBook.addEmployee(employee3);
        employeeBook.addEmployee(employee4);
        employeeBook.addEmployee(employee5);
        employeeBook.addEmployee(employee6);
        employeeBook.addEmployee(employee7);
        employeeBook.addEmployee(employee8);
        employeeBook.addEmployee(employee9);
        employeeBook.addEmployee(employee10);
        employeeBook.addEmployee(employee11);
        System.out.println("---------------");
        System.out.println(employeeBook.sumSalary());
        System.out.println("---------------");
        System.out.println(employeeBook.minSalary());
        System.out.println("---------------");
        System.out.println(employeeBook.maxSalary());
        System.out.println("---------------");
        System.out.println(employeeBook.midlSumSalary());
        System.out.println("------------------------------");
        System.out.println("Повышенный уровень");
        System.out.println("------------------------------");
        employeeBook.printFullNames();
        employeeBook.indSalary(5);
        System.out.println("---------------");
        employeeBook.printEmployees();
        System.out.println("---------------");
        System.out.println(employeeBook.minSalaryDepatmentID(3));
        System.out.println("---------------");
        System.out.println(employeeBook.maxSalaryDepatmentID(2));
        System.out.println("---------------");
        System.out.println(employeeBook.sumSalaryDepartment(4));
        System.out.println("---------------");
        System.out.println(employeeBook.averageSumSalary(1));
        System.out.println("---------------");
        employeeBook.increaseSalaryOfDepartment(5, 5);
        employeeBook.printEmployeesOfDepartment(5);
        System.out.println("---------------");
        employeeBook.printEmployeesWithMore(150000);
        System.out.println("---------------");
        employeeBook.printEmployeesWithLess(150000);
        System.out.println("------------------------------");
        System.out.println("Очень сложный уровень");
        System.out.println("------------------------------");
        employeeBook.deleteEmployeeId(7);
        employeeBook.deleteEmployeeName("Кожеин Дмитрий Игоревич");
        System.out.println("---------------");
        employeeBook.setEmployee("Симонова Юлия Витальевна",generateRandomSalary()[4]);
        System.out.println("---------------");
        employeeBook.printEmployees();
        System.out.println("---------------");

    }
}

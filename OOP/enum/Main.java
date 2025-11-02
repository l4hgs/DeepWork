class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ricco", Employee.Role.MANAGER);
        Employee e2 = new Employee("Lara", Employee.Role.DEVELOPER);
        Employee e3 = new Employee("Jay", Employee.Role.INTERN);

        e1.printInfo();
        e2.printInfo();
        e3.printInfo();
    }
}

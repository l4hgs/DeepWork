public class Employee {
    private String name;
    private Role role;

    // Enum with custom fields and constructor
    public enum Role {
        MANAGER("Leads a team"),
        DEVELOPER("Writes code"),
        INTERN("Learns and assists");

        private String description;

        Role(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    public Employee(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Description: " + role.getDescription());
        System.out.println();
    }
}


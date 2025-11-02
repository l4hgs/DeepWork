public class Person {
    // Private fields (cannot be accessed directly outside this class)
    private String name;
    private int age;


    // Getter for name
    public String getName() {
        return name;
    }
    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    // Setter for age
    public void setAge(int age) {
        // Validation: only allow positive ages
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}

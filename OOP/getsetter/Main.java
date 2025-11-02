public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        // Using setters
        person.setName("Ricco");
        person.setAge(18);

        // Using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

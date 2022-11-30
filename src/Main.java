public class Main {
    public static void main(String[] args) {
        Persona person = new Persona();
        person.setAge(20);
        person.setName("Alvaro");
        person.setPhone("829-817-4805");
        System.out.println("Age: "+person.getAge());
        System.out.println("Name: "+person.getName());
        System.out.println("Phone: "+person.getPhone());
    }
}
public class Main {
    public static void main(String[] args) {

        Person person = new Person();

        person.setFirstName("");
        person.setLastName("");
        person.setAge(-5);

        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        person.setFirstName("mai");
        person.setAge(18);


        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        person.setLastName("vijay");
        System.out.println("fullName= " + person.getFullName());
    }
}

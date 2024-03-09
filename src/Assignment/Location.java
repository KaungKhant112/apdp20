package Assignment;

public class Location {
    public static void main(String[] args) {
        Address address = new Address("Thiri Minglar", "Yangon");
        Person person= new Person("Kyaw Kyaw", address);

        System.out.println("Name: "+person.getName());
        System.out.println("Address: " + person.getAddress().getStreet() + ", " + person.getAddress().getCity());


    }
}

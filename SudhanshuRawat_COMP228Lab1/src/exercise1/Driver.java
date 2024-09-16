package exercise1;

public class Driver {
    public static void main(String[] args) {
        // Create Singer object using the no-argument constructor
        Singer singer1 = new Singer();

        // Display default values
        System.out.println("Default Singer Details:");
        System.out.println("ID: " + singer1.getId());
        System.out.println("Name: " + singer1.getName());
        System.out.println("Address: " + singer1.getAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Number of Albums Published: " + singer1.getNumAlbumsPublished());

        // Set values using setters
        singer1.setId(101);
        singer1.setName("Sudhanshu Rawat");
        singer1.setAddress("Toronto, ON, CA");
        singer1.setDateOfBirth("Feb 24, 2005");
        singer1.setNumAlbumsPublished(5);

        // Display updated values
        System.out.println("\nUpdated Singer Details:");
        System.out.println("ID: " + singer1.getId());
        System.out.println("Name: " + singer1.getName());
        System.out.println("Address: " + singer1.getAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Number of Albums Published: " + singer1.getNumAlbumsPublished());
    }
}

package exercise1;

public class Singer {
    // Instance variables
    private int id;
    private String name;
    private String address;
    private String dateOfBirth;
    private int numAlbumsPublished;

    // No-argument constructor
    public Singer() {
        this.id = 0;
        this.name = "Unknown";
        this.address = "Unknown";
        this.dateOfBirth = "Unknown";
        this.numAlbumsPublished = 0;
    }

    // Constructor with 1 argument
    public Singer(int id) {
        this.id = id;
    }

    // Constructor with 2 arguments
    public Singer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructor with 3 arguments
    public Singer(int id, String name, String address) {
        this(id, name);
        this.address = address;
    }

    // Constructor with 4 arguments
    public Singer(int id, String name, String address, String dateOfBirth) {
        this(id, name, address);
        this.dateOfBirth = dateOfBirth;
    }

    // Constructor with 5 arguments
    public Singer(int id, String name, String address, String dateOfBirth, int numAlbumsPublished) {
        this(id, name, address, dateOfBirth);
        this.numAlbumsPublished = numAlbumsPublished;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumAlbumsPublished() {
        return numAlbumsPublished;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setNumAlbumsPublished(int numAlbumsPublished) {
        this.numAlbumsPublished = numAlbumsPublished;
    }

    // Setter to set all values at once
    public void setAll(int id, String name, String address, String dateOfBirth, int numAlbumsPublished) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.numAlbumsPublished = numAlbumsPublished;
    }
}

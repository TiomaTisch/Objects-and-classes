public class Author {

    private String firstName;
    private String lastName;

    public Author (String lastName, String firstName, String middleName){
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

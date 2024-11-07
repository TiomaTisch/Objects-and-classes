public class Author {

    private String firstName;
    private String middleName;
    private String lastName;
    private String fullName;

    public Author (String lastName, String firstName, String middleName){
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.fullName = lastName + " " + firstName + " " + middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }
}

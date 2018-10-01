package ro.jademy.carrental;

public class Salesman extends Person {

    // Q: how can we avoid duplicate code in the salesman and the customer classes?

    //private String firstName;
    //private String lastName;
    private String username;
    private String password;

    public Salesman(String firstName, String lastName,String username, String password ){

        super(firstName, lastName);
        this.username = username;
        this.password = password;

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}

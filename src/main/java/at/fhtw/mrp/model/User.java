package at.fhtw.mrp.model;

public class User {

    private Integer id;
    private String username;
    private String passwordHash;
    private String token;

    public User(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public String getToken() {
        return token;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

}

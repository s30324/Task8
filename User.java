public class User {
    private String name;
    private String lname;
    private String eMail;
    private String password;
    private boolean isGuestAccount;
    public User(String name, String lname, String eMail, String password) {
        this.name = name;
        this.lname = lname;
        this.eMail = eMail;
        this.password = password;
        this.isGuestAccount = false;
    }
    public User(String eMail) {
        this.eMail = eMail;
        this.isGuestAccount = true;
    }
    public void guestToUser(String name, String lname, String password) {
        if (isGuestAccount) {
            this.name = name;
            this.lname = lname;
            this.password = password;
            this.isGuestAccount = false;
        }
    }
    public String getName() {
        return name;
    }
    public String getLname() {
        return lname;
    }
    public String geteMail() {
        return eMail;
    }
    public String getPassword() {
        return password;
    }
}

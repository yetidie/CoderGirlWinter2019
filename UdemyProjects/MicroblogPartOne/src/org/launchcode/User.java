package org.launchcode;

public class User {

    //public static Object userName;
    private String userName;
    private String user;
    private String email;
    private String url;
    private String firstName;
    private String lastName;


    public User() { }

    public User (String user, String email) {
        this.user = user;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.url = url;
    }



    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }


    public void setFirstName(String s){
        this.firstName = firstName;
    }

    public String getfirstName() {
        return firstName;
    }


    public void setLastName(String s){
        this.lastName = lastName;
    }


    public String getlastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public String getUrl(){
        return this.url;

    }

    @Override
    public String toString() {
        return getUserName ();
    }
}

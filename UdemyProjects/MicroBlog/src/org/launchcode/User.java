package org.launchcode;

public class User {

    public static String name;
    private String user;
    private String realName;
    private String email;
    private String url;

    public User() { }

    public User (String user, String email) {
        this.user = user;
        this.realName = realName;
        this.email = email;
        this.url = url;
    }



    public void setUser(String user) {
        this.user = user;
    }
    public String getUser(){
        return this.user;
    }
    public void setRealName(String realName){
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
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


}
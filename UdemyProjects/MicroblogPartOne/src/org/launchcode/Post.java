package org.launchcode;

public class Post {
    private static int postCount = 1;
    private int id;
    private User user;
    private String postTitle;
    private String postText;


    public Post() {
        this.postCount++;
        this.id = postCount;

    }

    public Post(User user, String postTitle, String postText) {
        this.postCount++;
        this.id = postCount;
        this.user = user;
        this.postTitle = postTitle;
        this.postText = postText;

    }

    public String getUser() {
        return String.valueOf ( user );
    }

    public void setUser(User user) {
        user = user;
    }


    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }



    @Override
    public String toString() {
        return "Post Number: " + this.id + "\n" +
                "Username: " + this.getUser () + "\n" +
                "Real Name:" + this.user.getfirstName () + "\n" + this.user.getlastName () +
                "URL: " + this. user.getUrl() + "\n" +
                this.postTitle + "\n" +
                "Post: " + this.postText + "\n" ;

    }





}

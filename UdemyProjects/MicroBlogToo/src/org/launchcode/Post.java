package org.launchcode;

public class Post {

    private static int postCount = 1;
    private int id;
    //private User user;
    private User userName;
    private String postTitle;
    private String postText;
    private String url;


    public Post() {
        this.postCount++;
        this.id = postCount;

    }

    public Post(User user, String postTitle, String postText) {
        this.postCount++;
        this.id = postCount;
        this.userName = userName;
        this.postTitle = postTitle;
        this.postText = postText;

    }

    public void setUserName(User user) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }

    @Override
    public String toString() {
        return "Post Number: " + this.id + "\n" +
                "Username: " + this.getUserName () + "\n" +
                "Real Name: " + this.user.getRealName() + "\n" +
                "URL: " + this.getUrl() + "\n" +
                this.postTitle + "\n" +
                "Post: " + this.postText + "\n" ;

    }


}

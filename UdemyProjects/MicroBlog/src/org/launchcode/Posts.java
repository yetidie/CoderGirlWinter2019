package org.launchcode;

public class Posts {

    //String userName
    private static int postCount = 1;
    private int id;
    private Posts posts;
    private String postTitle;
    private String postText;


    public Posts(){
        this.postCount++;
        this.id = postCount;

    }


    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle){
        this.postTitle = postTitle;
    }



    public void setPostText(String postText){
        this.postText = postText;
    }

    public void postCreate(){

    }
    public static void postAll(){

    }

    public void postUser(){
        // Show the user who posted it

    }

    public void postOrder(){
//the order in which it was posted
    }

    public void postContent(){
        //the contents of the post

    }

    public void postWebAddress(){
        //a web address to a site they linked

    }


}

package org.launchcode;
import java.util.Scanner;

public class Creator {
    private Scanner keyboard;

    public Creator(){
        this.keyboard = new Scanner(System.in);
    }

    public Post createPost(){
        User user = createUser();
        String validate;
        Post newPost;
        do{
            newPost = createPost(user);
            System.out.println("\n" + newPost.toString() + "\n");
            System.out.println("Is this correct? (Enter \"y\" for yes)");
            validate = keyboard.nextLine();
        }while(!validate.toLowerCase().equals("y"));
        return newPost;
    }

    public User createUser(){
        User user = new User();
        System.out.println("What is your User Name?");
        user.setUser(keyboard.nextLine());
        System.out.println("What is your first and last name?");
        user.setRealName(keyboard.nextLine());
        System.out.println("What is your email?");
        user.setEmail(keyboard.nextLine());
        System.out.println ("What is your URL?");
        user.setUrl (keyboard.nextLine ());
        return user;
    }

    public Post createPost(User user){
        Post post = new Post();
        post.setUser(user);
        System.out.println("How would you like to title your post?");
        post.setPostTitle(keyboard.nextLine());
        System.out.println("What is your post?");
        post.setPostText(keyboard.nextLine());
        return post;
    }


}

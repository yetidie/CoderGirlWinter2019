package org.launchcode;
import java.util.Scanner;

public class Creator {
    private Scanner keyboard;
    //private Object ArrayList;

    public Creator(){

        this.keyboard = new Scanner(System.in);
       
    }



    public Post createPost(){
        User user = createUser ();
        String validate;
        Post newPost ;
        do{


            newPost = createPost(changeUser(user));
            System.out.println("\n" + newPost.toString() + "\n");
            System.out.println("Is this correct? (Enter \"y\" for yes)");
            validate = keyboard.nextLine();
        }while(!validate.toLowerCase().equals("y"));
        return newPost;
    }



    public User createUser(){
        User user = new User();
        System.out.println("What is your User Name?");
        user.setUserName (keyboard.nextLine());
        System.out.println("What is your first and last name?");
        user.setRealName(keyboard.nextLine());
        System.out.println("What is your email?");
        user.setEmail(keyboard.nextLine());

        return user;
    }

    public Post createPost(User user){
        Post post = new Post();
        post.setUserName(user);
        System.out.println("How would you like to title your post?");
        post.setPostTitle(keyboard.nextLine());
        System.out.println("What is your post?");
        post.setPostText(keyboard.nextLine());
        System.out.println ("What URL, if any, would you like to add?");
        post.setUrl ( keyboard.nextLine () );
        return post;
    }

        public User changeUser(User user) {
            System.out.println ( "Log in as:" );
            String username = keyboard.nextLine ();
            if (username.equals ( createUser () )) {
                return user;
            }

            return user;
        }
}

package org.launchcode;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

    private ArrayList<Post> postLog;
    private ArrayList<User> userLog;


    public Menu(){
        this.postLog = new ArrayList();
        this.userLog = new ArrayList();
    }

    public void run(){


        int selection;
        Scanner keyboard = new Scanner(System.in);
        do{
            System.out.println("Main Menu: \n");
            System.out.println ( "1) Create a new user" );
            System.out.println ( "2) Create a post as a current user" );
            System.out.println ( "3) Print all Posts" );
            System.out.println ( "4) Print all users" );
            //System.out.println ( "5) Log in" );
            selection = keyboard.nextInt();
            keyboard.skip("\n");
            if(selection != 0){
                processSelection(selection);
            }
        }while(selection != 0);

        System.out.println("You are logged in as " + User.name);
    }


    private void processSelection(int selection) {
        switch (selection){
            case 1:
                Creator createUser = new Creator();
                User user = createUser.createUser();
                this.userLog.add(user);
                break;
            case 2:
                Creator createPost = new Creator ();
                Post post = createPost.createPost();
                //a for loop for listing the current users
                //for ()
                this.postLog.add(post);
                break;
            case 3:
                postAll ();
                break;
            case 4:
                listUser ();
                break;
           //case 5:
            //    User.userSignin;
            //    break;
        }
    }

    private void postAll(){
        for(Post post : postLog){
            System.out.println("------------------------------------------");
            System.out.println ("User: " + post.getUserName ());
            System.out.println("Title: " + post.getPostTitle ());
            System.out.println ("\n" + post.getPostText () + "\n" );
            System.out.println ("URL: " + post.getUrl ());
        }
        System.out.println("------------------------------------------");
        System.out.println("");
    }

    private void listUser(){
        for(User user: userLog){
            System.out.println("------------------------------------------");
            System.out.println("User: " + user.getUserName ());
            System.out.println ("Name: " + user.getRealName ());
            System.out.println ("E-mail: " + user.getEmail ());
        }
        System.out.println("------------------------------------------");
        System.out.println("");
    }


}

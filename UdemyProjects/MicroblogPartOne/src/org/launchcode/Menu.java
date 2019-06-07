package org.launchcode;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

        private ArrayList<Post> postLog;
        private ArrayList<User> userLog;
        private User currentUser;

        public Menu(){
            this.postLog = new ArrayList();
            this.userLog = new ArrayList();
            this.currentUser = null;
        }

        public void run(){
            welcome();

            int selection;
            Scanner keyboard = new Scanner(System.in);
            do{
                System.out.println("Main Menu: \n");
                System.out.println ( "1) Create a new user" );
                System.out.println ( "2) Create a post as a current user" );
                System.out.println ( "3) Print all Posts" );
                System.out.println ( "4) Print all users" );
                System.out.println ( "5) Log in" );
                selection = keyboard.nextInt();
                keyboard.skip("\n");
                if(selection != 0){
                    processSelection(selection);
                }
            }while(selection != 0);

            //System.out.printf ( "You are logged in as: " + User.userName );
        }

        private void welcome() {
            System.out.println("Hello! Welcome to the Posts Department!");
        }
        private User processSelection(int selection) {
            switch (selection) {
                case 1:
                    Creator createUser = new Creator ();
                    User user = createUser.createUser ();
                    this.userLog.add ( user );
                    break;
                case 2:
                    Creator createPost = new Creator ();
                    System.out.println ("About to create a post with user " + this.currentUser.getUserName ());
                    Post post = createPost.createPost (this.currentUser);
                    this.postLog.add ( post );
                    break;
                case 3:
                    postAll ();
                    break;
                case 4:
                    listUser ();
                    break;
                case 5:
                    //    User.userSignin;
                    //this.currentUser = null;
                    Scanner keyboard = new Scanner ( System.in );
                    int userSelection;
                    for (int i = 0; i < userLog.size(); i++) {
                        System.out.println ( i + ") " + userLog.get ( i ) );
                    }
                    System.out.println ( "Who do you want to log in as?" );
                    userSelection = keyboard.nextInt ();
                    keyboard.skip ( "\n" );
                    //if (userSelection <= 0) {
                        currentUser = userLog.get ( userSelection );
                        return currentUser;
                    //}
                    //break;
            }

         return null;
        }

        private void postAll(){
            for(Post post : postLog){
                System.out.println("------------------------------------------");
                System.out.println(post.toString());
            }
            System.out.println("------------------------------------------");
            System.out.println("");
        }

        private void listUser(){
            for(User user: userLog){
                System.out.println("------------------------------------------");
                System.out.println(user.toString());
            }
            System.out.println("------------------------------------------");
            System.out.println("  ");
        }

   }

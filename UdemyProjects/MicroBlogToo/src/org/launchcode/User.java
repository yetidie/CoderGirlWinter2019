package org.launchcode;

public class User {

    public static String name;
        private String user;
        private String userName;
        private String realName;
        private String email;


        public User() { }

        public User (String user, String email) {
            this.user = user;
            this.userName = userName;
            this.realName = realName;
            this.email = email;

        }



        public void setUserName(String userName) {
            this.userName = userName;
        }
        public String getUserName(){
            return userName;
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



        //public changeUser(user){

        //}


}

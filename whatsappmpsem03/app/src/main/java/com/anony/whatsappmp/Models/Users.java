package com.anony.whatsappmp.Models;

public class Users {
    String profilepic , userName , mail , password , userId, lastMessage;

    public Users(String profilepioc, String userName, String mail, String password, String userId, String lastMessage) {
        this.profilepic = profilepic;
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.userId = userId;
        this.lastMessage = lastMessage;
    }

    public Users(){}

    //SignUp Constructor
    public Users(String userName, String mail, String password){

        this.userName = userName;
        this.mail = mail;
        this.password = password;

    }

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepioc) {
        this.profilepic = profilepioc;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId(String key) {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}

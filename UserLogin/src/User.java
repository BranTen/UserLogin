/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandon
 */
public class User {
    String name;
    String username;
    String password;
    public User(String name, String username, String password) {
        this.name = name;
        this.password = password;
        this.username = username;
}
    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }
    public String getUsername(){
        return username;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String toString(){
        return getName() + "  Username: "  + getUsername() + "  Password: " + getPassword();
    }
}

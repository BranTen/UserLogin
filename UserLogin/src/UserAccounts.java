

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Brandon
 */
public class UserAccounts {
            Scanner in = new Scanner(System.in);

            private UserNode first;
    User user;
    public UserAccounts(){
        first = null;
    }
    public UserAccounts(User u){
        user = u;
    }
    public boolean isEmpty(){

        return first == null;
    }
    public String findPassword(String un){
        UserNode ptr = findUser(un);
        return ptr.getUser().getPassword();
    }
    public void changePassword(String un, String pass, String newPass){
        UserNode ptr = findUser(un);
        if(ptr.getUser().getPassword().equals(un)){
            ptr.getUser().setPassword(newPass);
        }
            
    }
    public void addUser(String name, String username, String password){
        User u = new User(name, username, password);  
        UserNode ptr = new UserNode(u, getLast());

    }
    
    public void deleteUser(String us){
        UserNode ptr = findUser(us);
        
        if(ptr ==first){
            first = first.getNext();
        }else{
            UserNode prev_ptr = getPrevious(ptr);
            prev_ptr.setNext(ptr.getNext());
        }
    }
    private boolean isLastNode(UserNode ptr){
        return ptr.getNext() == null;
    }
    private UserNode getLast(){
        UserNode ptr = first;
        
        while(ptr.getNext() != null)
            ptr = ptr.getNext();
        
        return ptr;
    }
    
    private UserNode getPrevious(UserNode ptr){
        UserNode ptr_prev = first;
        
        while(ptr_prev != ptr)
            ptr_prev = ptr_prev.getNext();
        
        return ptr;
    }
    private UserNode findUser(String name){
        UserNode ptr = first;
        
        while(ptr != null && !ptr.getName().equals(name))
            ptr = ptr.getNext();
        
        if(ptr != null)
            return ptr;
        
        return ptr;
    }
    public void printUsers(){
        UserNode ptr = first;
        
        while(ptr != null){
            System.out.println(ptr.getUser());
            ptr = ptr.getNext();
        }
    }
}

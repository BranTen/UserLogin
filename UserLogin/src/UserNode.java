/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandon
 */
public class UserNode {

    Node head;
    User user;
    private User info;
    private UserNode next;

    public UserNode(User user, UserNode next) {
        info = user;
        this.next = next;
    }
    public User getUser(){
        return info;
    }

    public UserNode getNext() {
        return next;
    }

    public String getName() {
        return user.getName();
    }

    public void setNext(UserNode next) {
     next = new UserNode(next.getUser(), next);   }

    class Node {

        User user;
        Node next;

        Node(User u) {
            user = u;
            next = null;
        }
    }

    public void setUser(User u) {
        info = u;
    }

    public UserNode getNode() {
        return next;
    }

    public void printList() {
        Node n = head;

        while (n != null) {

            n = n.next;
        }

    }
}

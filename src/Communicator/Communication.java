/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Communicator;

/**
 *
 * @author Shelly.Baltazar
 */
public interface Communication {
    public void connect(); //connects to the server
    public void send(String msg); //send the input of the user to everyone
    public String recieve(); //get input from user
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Commands.CLI;

/**
 *
 * @author Shelly.Baltazar
 */
public class Application {

    public static void main(String[] args) {
        CLI cli = new CLI();
        
        String result;
        while(true){ //while it hasn't exited
        result = cli.scanString(cli.nextString());
        System.out.println("Echo>  " + result);
        
        }
    }
}

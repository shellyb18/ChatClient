/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



/**
 *
 * @author Shelly.Baltazar
 */
public class CLI {
    
    public static List<String> list = new ArrayList();
    public static Map<String,Command> comMap = new HashMap();
    public static List<Command> commands = new ArrayList();
    static String userName = "Root";
    Scanner scan = new Scanner(System.in);
    public static char commandChar = '!';
    
    static{
        commands.add(new Exit());
        
        for(Command com : commands){
            for(int i = 0; i < com.getKeys().length; i++){
                comMap.put(com.getKeys()[i], com);
            }
           
        }
    }
    
//    public void processString(String line){
//        try{
//        
//        }catch{
//        
//        
//        }
//    
//    
//    }
        public String nextString() {
        System.out.print(userName + ">  ");
        return scan.nextLine();
    }

    public void scanString(String str) {
        boolean comPresent = false;
        boolean done = false;
        int length = str.length();
        String[] words = str.split(" ");
        String[] foundCommands;

        while (done == false) {
            for (int i = words.length; i > 0; i--) {
                for (int j = words[i].length(); j > 0; j--) {
                    String w = words[i];
                    if (w.charAt(j) == commandChar) {
                        //add commands to string array
                        

                    }

                }

            }
        }
    }

}

//    public void findCommand(String msg) {
//        
//        if("exit".equals(msg.substring(1,msg.length()))){
//            Exit exit = new Exit();
//            exit.getName();
//            exit.response;
//            exit.getKeys();
//        }
//    }

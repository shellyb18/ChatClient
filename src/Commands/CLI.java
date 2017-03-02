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
    public static Map<String, Command> comMap = new HashMap();
    public static List<Command> commands = new ArrayList();
    static String userName = "Root";
    Scanner scan = new Scanner(System.in);
    public static char commandChar = '!';

    static {
        commands.add(new Exit());

        for (Command com : commands) {
            for (int i = 0; i < com.getKeys().length; i++) {
                comMap.put(com.getKeys()[i], com);
            }

        }
    }

    
    public String nextString() {
        System.out.print(userName + ">  ");
        return scan.nextLine();
    }

    public String scanString(String str) {
        boolean done = false;
        List<String> foundCommands = new ArrayList<>();
        String comInMap [] = null;
//        int length = str.length();
        String words[] = str.split(" ");
        int index = str.indexOf(commandChar);
        if (index >= 0) {
            while (done == false) {
                for (int i = words.length - 1; i >= 0; i--) {

                    String w = words[i].toLowerCase().trim();
                    if (w.charAt(0) == commandChar) {
                        //add commands to string array
                        foundCommands.add(w.substring(1));
                    }

                    for (String eachCommand : foundCommands) {
                        int l = 0;
                        if(comMap.containsKey(eachCommand)){
                            comInMap[l] = eachCommand;
                        }
                    }
                    done = true;

                }
            }
        }
//        System.out.println("found commands: " + foundCommands);

        return str;

    }
}









//                            cmd.response(Arrays.copyOfRange(words,i,words.length));
//                            String response = args + y and replace " !" with "(!)"
//cmd.response((Arrays.copyOfRange(words, i,
//                                    words.length)).replaceAll(" " + commandChar, "(" + commandChar + ")"));
//                            System.out.println(response);
//                            return scanString(response);
                            //copy old array into new arra
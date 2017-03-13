/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

/**
 *
 * @author Shelly.Baltazar
 */
public class Help implements Command{

    @Override
    public String getName() {
        return "Help";
    }

    @Override
    public String response(String[] args) {
        String result = "";
        String keys = "";
        for (Command command : CLI.commands) {
            for (int i = 0; i < command.getKeys().length; i++) {
                keys += command.getKeys()[i] + " | ";
            }
            result += ("Name: " + command.getName() + ", Keys: " + keys + "\n");
            keys = "";
        }
        System.out.print(result);
        return result;
    }

    @Override
    public String[] getKeys() {
        return new String[]{"h", "help"};
    }

}

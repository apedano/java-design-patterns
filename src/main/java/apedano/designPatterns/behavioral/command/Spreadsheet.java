package apedano.designPatterns.behavioral.command;

/**
 * Receiver class
 */
public class Spreadsheet {

    public void setText(String cell, String text){
        System.out.printf("Spreadsheet: text[%s] for cell [%s]\n", text, cell);
    }


}

package apedano.designPatterns.behavioral.command;

/**
 * Created by Alex on 17/04/2018.
 */
public class SpreadSheetCommand3 implements SpreadSheetCommand {

    public Spreadsheet spreadsheet;

    public SpreadSheetCommand3(Spreadsheet spreadsheet){
        this.spreadsheet = spreadsheet;
    }

    @Override
    public void execute() {
        System.out.println("Setting text 'example2' in the cell A");
        spreadsheet.setText("A", "exampler2");
    }
}

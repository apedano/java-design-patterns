package apedano.designPatterns.behavioral.command;

/**
 * Created by Alex on 17/04/2018.
 */
public class SpreadSheetCommand2 implements SpreadSheetCommand {

    public Spreadsheet spreadsheet;

    public SpreadSheetCommand2(Spreadsheet spreadsheet){
        this.spreadsheet = spreadsheet;
    }

    @Override
    public void execute() {
        System.out.println("Deleting text in the cell A");
        spreadsheet.setText("A", "");
    }
}


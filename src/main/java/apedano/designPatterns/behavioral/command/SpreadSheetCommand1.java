package apedano.designPatterns.behavioral.command;

/**
 * Created by Alex on 17/04/2018.
 */
public class SpreadSheetCommand1 implements SpreadSheetCommand {

    public Spreadsheet spreadsheet;

    public SpreadSheetCommand1(Spreadsheet spreadsheet){
        this.spreadsheet = spreadsheet;
    }

    @Override
    public void execute() {
        System.out.println("Setting text 'example1' in the cell A");
        spreadsheet.setText("A", "exampler1");
    }
}

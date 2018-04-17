package apedano.designPatterns.behavioral.command;

/**
 * The Client - the business logic that mixes components.
 */
public class Client {

    private Spreadsheet mySpreadsheetReceiver = new Spreadsheet();
    private HistoryInvoker historyInvoker = new HistoryInvoker();

    public void run(){
        historyInvoker.execute(new SpreadSheetCommand1(mySpreadsheetReceiver));
        historyInvoker.execute(new SpreadSheetCommand2(mySpreadsheetReceiver));
        historyInvoker.execute(new SpreadSheetCommand3(mySpreadsheetReceiver));
        historyInvoker.undo();
        historyInvoker.undo();
        historyInvoker.undo();


    }


}

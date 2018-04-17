package apedano.designPatterns.behavioral.command;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Invoker implementation
 */
public class HistoryInvoker {

    int maxHistory = 10;
    int currentIndex = 0;
    private List<SpreadSheetCommand> history = new LinkedList<SpreadSheetCommand>();

    public void execute(SpreadSheetCommand spreadSheetCommand){
        if(history.size() == maxHistory){
            history.remove(0);
        }
        history.add(spreadSheetCommand);
        spreadSheetCommand.execute();
        currentIndex = history.size();
    }

    public void undo(){
        System.out.println("Undo");
        if(currentIndex == 0){
            System.out.println("History base limit reached!");
        } else {
            history.get(--currentIndex).execute();
        }
    }

    public void redo(){
        System.out.println("Redo");
        if(currentIndex ==  maxHistory -1){
            System.out.println("History max limit reached!");
        }
        history.get(currentIndex).execute();
        currentIndex++;
    }
}

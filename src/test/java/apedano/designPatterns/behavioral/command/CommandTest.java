package apedano.designPatterns.behavioral.command;

import org.junit.Test;

/**
 * Created by Alex on 17/04/2018.
 */
public class CommandTest {

    @Test
    public void commandTest(){
        Client client = new Client();
        client.run();
    }
}

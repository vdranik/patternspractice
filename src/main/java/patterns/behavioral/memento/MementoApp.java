package patterns.behavioral.memento;

import java.util.Date;

public class MementoApp  {

    public static void main(String[] args) throws InterruptedException {

        Game game = new Game();
        game.setState("level_1", new Date());
        System.out.println(game);

        File file = new File();
        file.setSave(game.save());

        Thread.sleep(5000);

        //bad save
        game.setState("level_2", new Date());
        System.out.println(game);

        //load good save
        game.load(file.getSave());
        System.out.println(game);

    }
}

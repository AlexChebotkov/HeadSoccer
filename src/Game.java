import java.awt.*;

public class Game {

    private final Field field = new Field();//создает поле
    private final int countsPerFrame = 200;//создает мяч
    private final double g = 0.2;
    private final Ball ball = new Ball(field, 50, g);//создает игроков
    private final Player[] players = {new Player(field, new Point(80, 120), true, g), new Player(field, new Point(80, 120), false, g)};

    private final GameLogic gameLogic = new GameLogic(ball, players, field, countsPerFrame);//создает логику игры

    public void run() {
        Frame frame = new Frame(gameLogic, 1200, 1000, 60);//создает окошко
    }
}
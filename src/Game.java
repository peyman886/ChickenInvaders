import MyGraphic.MyPanel;

public class Game {

    private GameFrame gameFrame ;
    private MyPanel gamePanel;

    private static Game ourInstance = new Game();

    public static Game getInstance() {
        return ourInstance;
    }

    private Game() {
        this.gamePanel = new MenuPanel();
        GameFrame newGameFrame = new GameFrame(gamePanel);
        this.gameFrame = newGameFrame;

    }



    public GameFrame getGameFrame() {
        return gameFrame;
    }

    public void setGamePanel(MyPanel gamePanel) {
        this.gamePanel = gamePanel;
    }
}

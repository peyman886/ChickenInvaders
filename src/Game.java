import MyGraphic.MyPanel;

public class Game {
    private GameFrame gameFrame ;
    private MyPanel gamePanel;

    private static Game ourInstance = new Game(new MenuPanel());

    public static Game getInstance() {
        return ourInstance;
    }

    private Game(MyPanel gamePanel) {
        this.gamePanel =gamePanel;
        GameFrame newGameFrame = new GameFrame(gamePanel);
        this.gameFrame = newGameFrame;
    }
    public GameFrame getGameFrame() {
        return gameFrame;
    }

    public void setGamePanel(MyPanel gamePanel) {
        this.gamePanel = gamePanel;
        ourInstance.gameFrame.setVisible(false);
        ourInstance.gameFrame = new GameFrame(gamePanel);
    }
}

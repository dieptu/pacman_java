import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        //size of the frame    
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        //Create the frame of the game
        JFrame frame = new JFrame("Pac Man");
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel where the game happens
        PacMan pacmanGame = new PacMan();
        frame.add(pacmanGame);
        frame.pack();
        // set the frame visible after all the components are visible in the game
        frame.setVisible(true);
        // JFrame frame = new JFrame("PacMan Game");
        // PacMan gamePanel = new PacMan();  // ← this is your custom JPanel

        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.getContentPane().add(gamePanel);
        // frame.pack();  // sizes the frame to fit the preferred size of PacMan
        // frame.setLocationRelativeTo(null);  // centers the window
        // frame.setVisible(true);
    }
}

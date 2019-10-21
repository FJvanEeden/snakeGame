package snakeGame;

// Imports all external packages used within the class.
import java.awt.EventQueue;
import javax.swing.JFrame;

// Creates class and implements the JFrame package.
public class Snake extends JFrame {
    public Snake() {
        
        initUI();
    }
    
    // Function to create the user interface upon application launch.
    private void initUI() {
    	
        add(new Board());
               
        setResizable(false);
        pack();
        
        setTitle("Classic Snake Game");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    // Main Class that creates JFrame and calls the snake class.
    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}

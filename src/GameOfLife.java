import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GameOfLife extends JFrame implements ActionListener {

    private JPanel panel;           // JPanel to hold the buttons
    private JButton[][] buttons;    // 2D array of JButtons to represent the cells
    private Timer timer;            // Timer to update the game state periodically
    private boolean[][] cells;      // 2D array of booleans to represent the state of the cells
    private int rows;               // Number of rows in the grid
    private int cols;               // Number of columns in the grid
    private int delay;              // Delay between updates in milliseconds

    public GameOfLife(int rows, int cols, int delay, int i) {
        this.rows = rows;
        this.cols = cols;
        this.delay = delay;
        cells = new boolean[rows][cols];
        buttons = new JButton[rows][cols];
        panel = new JPanel(new GridLayout(rows, cols)); // Create a JPanel with a GridLayout
        add(panel);
        setSize(cols * 10, rows * 10); // Set the size of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the window when the user clicks the close button
        initialize();  // Initialize the cells and buttons
        setVisible(true);  // Make the window visible
    }

    private void initialize() {
        Random random = new Random(); // Create a random number generator
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j] = random.nextBoolean();  // Set the initial state of the cells randomly
                buttons[i][j] = new JButton();  // Create a new JButton
                buttons[i][j].setBackground(cells[i][j] ? Color.MAGENTA : Color.WHITE);// Set the background color based on the state of the cell
                buttons[i][j].setPreferredSize(new Dimension(10, 10));// Set the size of the button
                panel.add(buttons[i][j]);// Add the button to the panel
            }
        }
        timer = new Timer(delay, this);// Create a new timer that will call actionPerformed every 'delay' milliseconds
        timer.start();   // Start the timer
    }

    private int countNeighbors(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < rows && j >= 0 && j < cols && !(i == row && j == col) && cells[i][j]) {
                    // Check if the cell is within the grid and not the center cell, and if it's alive
                    count++; // Increment the count
                }
            }
        }
        return count; // Return the count
    }

    private void update() {
        boolean[][] newCells = new boolean[rows][cols]; // Create a new array to hold the new state of the cells
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                int neighbors = countNeighbors(i, j); // Count the number of live neighbors
                if (cells[i][j] && (neighbors == 2 || neighbors == 3)) {  // If the cell is alive
                    newCells[i][j] = true;  // If it has fewer than 2 or more than 3 live neighbors
                } else if (!cells[i][j] && neighbors == 3) {
                    newCells[i][j] = true;
                } else {
                    newCells[i][j] = false;
                }
                buttons[i][j].setBackground(newCells[i][j] ? Color.MAGENTA : Color.WHITE);
            }
        }
        cells = newCells;
    }


    public void actionPerformed(ActionEvent e) {
        update();
    }

    public static void main(String[] args) {
        new GameOfLife(50,     60, 100, 100);
    }
}
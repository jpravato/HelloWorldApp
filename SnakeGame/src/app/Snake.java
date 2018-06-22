package app;


import java.awt.EventQueue;
import javax.swing.JFrame;

public class Snake extends JFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }

    public Snake() {
        initUI();
    }

    private void initUI() {
        Board board = new Board();
        board.initBoard();

        add(board);

        setResizable(false);
        pack();

        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

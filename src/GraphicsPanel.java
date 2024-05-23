import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class GraphicsPanel extends JPanel implements KeyListener, MouseListener, ActionListener {

    private ArrayList<Chip> playerOneChips;
    private ArrayList<Chip> playerTwoChips;
    private BufferedImage background;
    private Chip[][] board;
    public GraphicsPanel() {
        try {
            background = ImageIO.read(new File("src/background.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        playerOneChips = new ArrayList<Chip>();
        playerTwoChips = new ArrayList<Chip>();
        board = new Chip[6][7];
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

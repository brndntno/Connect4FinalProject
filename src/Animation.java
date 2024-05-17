import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class Animation {
    private ArrayList<BufferedImage> frames;
    private Timer timer;
    private int currentFrame;

    public Animation(ArrayList<BufferedImage> frames, int delay) {
        this.frames = frames;
        currentFrame = 0;
        timer = new Timer(delay, (ActionListener) this);
        timer.start();
    }
}
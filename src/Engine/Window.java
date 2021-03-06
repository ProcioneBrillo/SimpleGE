package Engine;

import javax.swing.JFrame;
import java.awt.Insets;

public class Window extends JFrame{
    public final int w, h;
    public final Insets bounds;
    private static Window instance;

    public Window(int w, int h){
        this.w = w;
        this.h = h;
        this.setSize(w, h);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        bounds = this.getInsets();
    }

    // Key input listener, got this from Engine, generated by KeyMapping
    void addKeyMapping(KeyMap map){
        this.addKeyListener(map);
    }

    public static Window get(int w, int h){
        if(instance==null){
            instance = new Window(w, h);
        }
        return instance;
    }

    @Override
    public String toString(){
        return String.format("Window[%d,%d]", w, h);
    }
}

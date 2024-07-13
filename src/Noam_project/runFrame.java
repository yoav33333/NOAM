package Noam_project;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

public class runFrame extends Frame {

    public runFrame(){
        Frame();
    }

    public void Frame(){
        setTitle("Graphing system");
        setBounds(0,0,1920,1080);
        setVisible(true);
        setBackground(new Color(0, 19, 74, 199));
        setLayout(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

    }
}

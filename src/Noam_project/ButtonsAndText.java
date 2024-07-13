package Noam_project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ButtonsAndText extends runFrame{
    Button addB = new Button("הוספה");
    static Label label = new Label("");
    Button check = new Button("בדיקה");
    TextField textField = new TextField("שם הספר");
    static String ifRead = "נקרא";
    static String ifNotRead = "לא נקרא";



    public ButtonsAndText(){
        addB.setBounds(300, 810, 100, 60);
        check.setBounds(1520, 810, 100, 60);
        textField.setBounds(960-100, 500, 200, 80);
        label.setBounds(960-25, 600, 70, 30);
        addB.setBackground(Color.black);
        check.setBackground(Color.black);
        check.setForeground(Color.white);
        addB.setForeground(Color.white);
        textField.setBackground(Color.black);
        textField.setForeground(Color.white);
        label.setForeground(Color.white);

        add(addB);
        add(check);
        add(textField);
        add(label);
        check.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Check(textField.getText());
            }
        });
        addB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Add(textField.getText());
            }
        });
    }
    public static void Check(String NewBook){
        if (textFile.logic(NewBook.toLowerCase())){
            label.setText(ifRead);
            return;
        }
        label.setText(ifNotRead);
    }
    public static void Add(String NewBook){
        textFile.write(NewBook.toLowerCase());
        label.setText("הוסף בהצלחה");
    }


}

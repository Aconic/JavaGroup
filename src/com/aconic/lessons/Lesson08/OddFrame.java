package com.aconic.lessons.Lesson08;
import javax.swing.JFrame;


public class OddFrame extends JFrame
{
    public OddFrame()
    {
        setTitle("App for odd calculation");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200, 150, 500, 450);
        add( new OddPanel() );
        setVisible(true);
    }
}

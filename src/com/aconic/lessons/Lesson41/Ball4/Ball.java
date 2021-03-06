package com.aconic.lessons.Lesson41.Ball4;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Ball extends JPanel implements Imove
{
    int dx;
    int dy;
    Color col;
    public Ball()
    {}

    public Ball(Point p)
    {
        setLocation(p);
        setSize(30, 30);
        Random rnd = new Random();
        col = new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        dx = rnd.nextInt(10) - 5;
        dy = rnd.nextInt(10) - 5;
    }

    @Override
    public void paint(Graphics g)
    {
        Graphics2D gg = (Graphics2D) g;
        gg.setColor(col);
        gg.fillOval(1, 1, 28, 28);
    }

    public void move()
    {
        JPanel pp = (JPanel) getParent();
        if(getX() <= 0 || getX() >=  pp.getWidth()-30)
            dx *= -1;
        if(getY() <= 0 || getY() >=  pp.getHeight()-30)
            dy *= -1;

        Point p = getLocation();
        p.translate(dx, dy);
        setLocation(p);
    }







}


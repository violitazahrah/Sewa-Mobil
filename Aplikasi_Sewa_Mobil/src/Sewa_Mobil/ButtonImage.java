/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sewa_Mobil;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author ACER
 */
public class ButtonImage extends JButton {
     private Paint glass;
    private boolean over;
    
     public ButtonImage(){
        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setForeground(Color.WHITE);
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(3, 3, 3, 3));
        addMouseListener(new MouseAdapter() {
          @Override
            public void mouseEntered(MouseEvent e) {
                setOver(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setOver(false);
            }
        });
    }
   
     public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
        repaint();
    }
   
    
    protected void paintComponent(Graphics g) {
       
        Graphics2D gd = (Graphics2D) g.create();
       
        glass = new GradientPaint(0, 0, new Color (1F,1F,1F,0.01F),0,getHeight(),new Color (1F,1F,1F,0F));
        if(isOver()){
             glass = new GradientPaint(0, 0, new Color(1F, 1F, 1F, 0F), 0, getHeight(), new Color(1F, 1F, 1F, 0.5F));
        }else{
             glass = new GradientPaint(0, 0, new Color(1F, 1F, 1F, 0.5F), 0, getHeight(), new Color(1F, 1F, 1F, 0F));
        }
       
        gd.setPaint(glass);
        gd.fillRoundRect(0, 0, getWidth(), getHeight(), 50, 50);

        gd.dispose();
        super.paintComponent(g);
    }
    
}

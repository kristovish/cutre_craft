package platform;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.Timer;
import javax.swing.*;

import javax.swing.JPanel;

public class Platformain extends JPanel{
	
	int x = 0, y = 0, velx = 0, vely = 0;
	
	private static final long serialVersionUID = 1L;
	private static final KeyEvent KeyEvent = null;
	private int keyCode;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		player(g);
	}
	
    public static void main(String[] args) {
    	Platformain plat = new Platformain();
    	JFrame frame = new JFrame();
        frame.setSize(1088, 704);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Platformer");
        frame.getLocation(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(plat);
        
    }
    
    public void player (Graphics g){
    	g.setColor(Color.RED);
    	g.fillOval(x, y, 32, 32);
    	
    }
    
    public void actionPerformed(ActionEvent e) {
    	repaint();
    	x += velx;
    	y += vely;
    }
    public void keyPressed(KeyEvent e) {
    	int code = e.getKeyCode();
    	if (code == java.awt.event.KeyEvent.VK_KP_LEFT) {
    		vely = 0;
        	velx = -5;
    	}
    	if (code == java.awt.event.KeyEvent.VK_KP_RIGHT) {
    		vely = 0;
        	velx = 5;
    	}
    	if (code == java.awt.event.KeyEvent.VK_SPACE) {
    		vely = 15;
        	velx = 0;
    	} else {
    		vely = -5;
        	velx = 0;
    	}
    }
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
    
    
}
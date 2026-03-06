/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener{

        JLabel l1;
        JButton b1;
        
        public HotelManagementSystem() {

            setSize(1366,565);
            setLocationRelativeTo(null);
            setVisible(true);

		l1 = new JLabel("");
                b1 = new JButton("Next");
            b1.setBounds(1150,480,150,50);
            b1.setBackground(new Color(212,175,55));
            b1.setForeground(Color.BLACK);
            b1.setFont(new Font("Arial", Font.BOLD,16));


            ImageIcon i1 = new ImageIcon("C:\\intelji\\new photo\\first.jpg");
            Image i3 = i1.getImage().getScaledInstance(1366, 565, Image.SCALE_SMOOTH);
            ImageIcon i2 = new ImageIcon(i3);
            l1 = new JLabel(i2);
                
                JLabel lid=new JLabel("HOTEL MANAGEMENT SYSTEM");
                lid.setBounds(30,450,1500,100);
                lid.setFont(new Font("serif",Font.PLAIN,50));
            lid.setForeground(Color.WHITE);            l1.add(lid);


            l1.setBounds(0,0,1366,565);
                
                l1.add(b1);
		add(l1);
 
                b1.addActionListener(this);
                setVisible(true);
                
                while(true){
                        lid.setVisible(false); // lid =  j label
                    try{
                        Thread.sleep(500); //1000 = 1 second
                    }catch(Exception e){} 
                        lid.setVisible(true);
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){}
                }
	}
        
        public void actionPerformed(ActionEvent ae){
                new Login().setVisible(true);
                this.setVisible(false);
                
        }
        
        public static void main(String[] args) {
                HotelManagementSystem window = new HotelManagementSystem();
                window.setVisible(true);			
	}
}

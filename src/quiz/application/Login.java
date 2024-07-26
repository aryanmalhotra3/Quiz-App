package quiz.application;

import javax.swing.*; //jframe class is under swing package so we have to import it
import java.awt.*; //to use color
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{ //to display frame we us (extends jframe) and for onClick function (ActionListener)
     
    JButton rules,back;  //to use it globally
    JTextField tfname; //to use it globbaly as we will extract it and use it in rules
    Login(){ //constructor
        
       // Set the frame background color
        getContentPane().setBackground(Color.WHITE);
        
        // Disable the default layout manager
        setLayout(null);

        
          // Add image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500); // left, top, length, width
        add(image);
        
        // Heading
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750, 30, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254)); // RGB color we create object
        add(heading);
        
         // Name label
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810, 150, 200, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        name.setForeground(new Color(128,128,128));
        add(name);
        
        // Text box
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add(tfname);
        
        // Rules Button
         rules = new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        // Back Button
        //we have used JButton globally so we dont have to use it here
         back = new JButton("Back");
        back.setBounds(910,270,125,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        // Frame settings
        setSize(1200, 500);
        setLocation(200, 150); // left, top
        setVisible(true); // show frame
        
                
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false); //close the current frame
            new Rules(name);
        }else if(ae.getSource()==back){
            setVisible(false);
        }
        
    }
    
    public static void main(String[] args){
       new Login(); //this is called as ananomus object
    }
}

package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame {
    Main_class(){
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
    Image i2= i1.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel img = new JLabel(i3);
    img.setBounds(0,0,1120,630);
    add(img);

    JLabel heading =new JLabel("Employee Management System");
   heading.setBounds(340,155,400,40);
    heading.setFont(new Font("Raleway",Font.BOLD,25));
   img.add(heading);


   JButton add = new JButton("Add employee");
   add.setBounds(300,270,150,40);
   add.setForeground(Color.white);
   add.setBackground(Color.black);
   add.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
new Addemployee();
       }
   });
   img.add(add);

        JButton view = new JButton("View Employee");
        view.setBounds(500,270,150,40);
        view.setForeground(Color.white);
        view.setBackground(Color.black);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        img.add(view);

        JButton rem = new JButton("Remove Employee");
        rem.setBounds(450,370,150,40);
        rem.setForeground(Color.white);
        rem.setBackground(Color.black);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        img.add(rem);

        setSize(1120,630);
        setLocation(250,100);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Main_class();
    }
}

package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame  implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;
    String formno;
    Signup3(String formno){
        this.formno = formno;

        JLabel l1 =new JLabel("page 3:");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2 =new JLabel("Account Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,70,400,40);
        add(l2);

        JLabel l3 =new JLabel("Account Type:");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,140,200,30);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(new Color(184,183,181));
        r1.setBounds(100,180,150,30);
        add(r1);

        r2 = new JRadioButton("Current Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(new Color(184,183,181));
        r2.setBounds(350,180,300,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l4 =new JLabel("Card Number:");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,300,400,30);
        add(l4);

        JLabel l5 =new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,330,200,20);
        add(l5);

        JLabel l6 =new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway",Font.BOLD,12));
        l6.setBounds(330,300,250,20);
        add(l6);

        JLabel l7 =new JLabel("(It would appear on ATM card/checkbook and Statements)");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(330,330,500,20);
        add(l7);

        JLabel l8 =new JLabel("PIN:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,500,20);
        add(l8);

        JLabel l9 =new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(330,370,500,20);
        add(l9);

        JLabel l10 =new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(100,400,200,20);
        add(l10);

        JLabel l11 =new JLabel("Service Required:");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,450,500,20);
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raileway",Font.BOLD,16));
        c1.setBackground(new Color(184,183,181));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raileway",Font.BOLD,16));
        c2.setBackground(new Color(184,183,181));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raileway",Font.BOLD,16));
        c3.setBackground(new Color(184,183,181));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4 = new JCheckBox("Email Alert");
        c4.setFont(new Font("Raileway",Font.BOLD,16));
        c4.setBackground(new Color(184,183,181));
        c4.setBounds(350,550,200,30);
        add(c4);

        c5 = new JCheckBox("Check Book");
        c5.setFont(new Font("Raileway",Font.BOLD,16));
        c5.setBackground(new Color(184,183,181));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raileway",Font.BOLD,16));
        c6.setBackground(new Color(184,183,181));
        c6.setBounds(350,600,200,30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by declares that the above entered details correct to the best of my knowledge.",true);
        c7.setFont(new Font("Raileway",Font.BOLD,12));
        c7.setBackground(new Color(184,183,181));
        c7.setBounds(100,670,600,20);
        add(c7);

        JLabel l12 = new JLabel("Form No: ");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);

        s = new JButton("Submit");
        s.setFont(new Font("Raileway",Font.BOLD,14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(250,720,100,30);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Raileway",Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(420,720,100,30);
        c.addActionListener(this);
        add(c);

        JLabel l20 =new JLabel(" ");
        l20.setFont(new Font("Raleway",Font.BOLD,22));
        l20.setBounds(280,40,400,40);
        add(l20);


        getContentPane().setBackground(new Color(184,183,181));
        setSize(850,800);
        setLocation(400,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String atype = null;
       if(r1.isSelected()){
           atype = "Saving Account";
       } else if (r2.isSelected()){
           atype = "Current Account";

       }
        Random ran = new Random();
       long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
       String cardno ="" + Math.abs(first7);

       long first3 = (ran.nextLong() % 9000L) + 1000L;
       String pin ="" + Math.abs(first3);

       String fac = "";
       if (c1.isSelected()){
           fac = fac+ "ATM CARD";
       } else if (c2.isSelected()) {
           fac = fac + "Internet Banking";
       }else if (c3.isSelected()){
           fac = fac+ "Mobile Banking";
       }else if (c4.isSelected()){
           fac = fac+ "Email-Alerts";
       }else if (c5.isSelected()){
           fac = fac+ "Cheque Book";
       }else if (c6.isSelected()){
           fac = fac+ "E-Statement";
       }
       try{
           if (e.getSource()==s){
               if (atype.equals("")){
                   JOptionPane.showMessageDialog(null,"Fill all the fields");
               }else{
                   Con c1 = new Con();
                   String q1 ="insert into signupthree values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                   String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                   c1.statement.executeUpdate(q1);
                   c1.statement.executeUpdate(q2);
                   JOptionPane.showMessageDialog(null,"Card Number : " +cardno+ "\n Pin : "+pin );
                   new Deposit(pin);
                   setVisible(false);
               }
           }else if (e.getSource()==c){
               System.exit(0);
           }

       }catch(Exception E){
           E.printStackTrace();
       }
    }

    public static void main(String[] args) {
        new Signup3("");
    }
}

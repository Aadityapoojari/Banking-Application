package bank.managment.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame  implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JButton next;

    JTextField textName, textFname,textEmail, textMs,textAdd,textSta,textCity,textPin;
    JDateChooser dateChooser;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) +1000;
    String first = " " + Math.abs(first4);

    Signup(){
        super("APPLICATION FORM");
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png."));
//        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(25, 10, 150, 100);
//        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." +first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        label2.setBounds(370,65,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Ralway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("NAME :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelFname = new JLabel("FATHER NAME :");
        labelFname.setFont(new Font("Raleway",Font.BOLD,20));
        labelFname.setBounds(100,240,200,30);
        add(labelFname);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add(textFname);


        JLabel DOB = new JLabel("DATE OF BIRTH :");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(172, 168, 168));
        dateChooser.setBounds(300,340,100,30);
        add(dateChooser);

        JLabel labelG = new JLabel("GENDER");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        r1 = new JRadioButton("MALE");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(172, 168, 168));
        r1.setBounds(300,290,80,30);
        add(r1);

        r2 = new JRadioButton("FEMALE");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(172,168,168));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("EMAIL ID :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelMs = new JLabel("MARRITAL STATUS :");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

        r3 = new JRadioButton("MARRIED");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(172, 168, 168));
        r3.setBounds(310,440,100,30);
        add( r3);

        r4 = new JRadioButton("UNMARRIED");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(172, 168, 168));
        r4.setBounds(450,440,130,30);
        add(r4);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);

        JLabel labelAdd = new JLabel("ADDRESS :");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        JLabel labelSta = new JLabel("STATE :");
        labelSta.setFont(new Font("Raleway",Font.BOLD,20));
        labelSta.setBounds(100,540,200,30);
        add(labelSta);

        textSta = new JTextField();
        textSta.setFont(new Font("Raleway",Font.BOLD,14));
        textSta.setBounds(300,540,400,30);
        add( textSta);

        JLabel labelCity = new JLabel("CITY :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,590,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,590,400,30);
        add(textCity);

        JLabel labelPin = new JLabel("PIN CODE :");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(100,640,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,640,400,30);
        add(textPin);

        next = new JButton("NEXT");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(175, 171, 171));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        String email = textEmail.getText();
        String martial = null;
        if (r3.isSelected()) {
            martial = "married";
        } else if (r4.isSelected()) {
            martial = "Unmarried";
        }
        String address = textAdd.getText();
        String state = textSta.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();

        try{
           if (textName.getText().equals("")) {
               JOptionPane.showMessageDialog(null,"Fill all the fields");
           } else{
               Con con1 = new Con();
               String q = "insert into signup value('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+martial+"','"+address+"','"+state+"','"+city+"','"+pincode+"')";
               con1.statement.executeUpdate(q);
               new Signup2(formno);
               setVisible(false);

           }
        }catch(Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Signup();

    }
}

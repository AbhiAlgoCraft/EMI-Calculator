package Emiapp;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View extends JFrame implements ActionListener{
    
    JLabel lbPrincipal, lbRate, lbTime, lbDisplay;
    JTextField tfPrincipal, tfRate, tfTime;
    JButton calcEmi;

    public View(){
        this.setTitle("EMI Calculator");
        this.setLayout(new GridLayout(4,2,3,3));
        this.setSize(380,300);

        this.lbPrincipal= new JLabel("Enter Principal Amount : ");
        this.add(lbPrincipal);
        lbPrincipal.setHorizontalAlignment(SwingConstants.CENTER);

        this.tfPrincipal= new JTextField(25);
        this.add(tfPrincipal);

        this.lbRate= new JLabel("Enter The Annual Intrest Rate : ");
        this.add(lbRate);
        lbRate.setHorizontalAlignment(SwingConstants.CENTER);

        this.tfRate= new JTextField(25);
        this.add(tfRate);
        
        this.lbTime= new JLabel("Enter The Loan Tenure : ");
        this.add(lbTime);
        lbTime.setHorizontalAlignment(SwingConstants.CENTER);

        this.tfTime= new JTextField(25);
        this.add(tfTime);

        this.calcEmi =  new JButton("Calculate EMI");
        calcEmi.addActionListener(this);
        this.add(calcEmi);

        this.lbDisplay = new JLabel("EMI will be Displayed Here");
        lbDisplay.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(lbDisplay);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
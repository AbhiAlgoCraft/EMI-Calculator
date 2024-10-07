package Emiapp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    Model m;
    View v;
   

    public Controller(Model model, View view){
        this.m = model;
        this.v = view;
    }

    public void setResult(){

        v.calcEmi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                m.setPrincipal(Double.parseDouble(v.tfPrincipal.getText()));
                m.setAnualRate(Double.parseDouble(v.tfRate.getText()));
                m.setLoanTenure(Integer.parseInt(v.tfTime.getText()));
                m.setEmi(m.getPrincipal(), m.getAnualRate(), m.getLoanTenure());
                int result = (int)m.getEmi();
                v.lbDisplay.setText(String.valueOf(result) + " ₹");
            }
        });
    }
}

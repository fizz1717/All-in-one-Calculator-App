
package sc;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TaxCalculator extends JFrame{
JLabel taxL;
JLabel priceL;
JLabel tipL;
JLabel totalL;
JLabel rewardL;

JTextField taxTF;
JTextField priceTF;
JTextField tipTF;
JTextField totalTF;
JTextField rewardTF;


JButton CalculateB;
JButton ExitB;

CalculateButtonHandler cbHandler;
ExitButtonHandler ebHandler;

public TaxCalculator(){
    taxL = new JLabel("Enter the tax percent: ", JLabel.RIGHT);
    priceL = new JLabel("Enter the price: ", JLabel.RIGHT);
    tipL = new JLabel("Tip: ", JLabel.RIGHT);
    totalL = new JLabel("Total: ", JLabel.RIGHT);
    rewardL = new JLabel("Reward Points Gained: ", JLabel.RIGHT);
    
    
    taxTF = new JTextField(12);
    priceTF = new JTextField(12);
    totalTF = new JTextField(12);
    rewardTF = new JTextField(12);
    tipTF = new JTextField(12);
    
    CalculateB = new JButton("Calculate");
    cbHandler = new CalculateButtonHandler();
    CalculateB.addActionListener(cbHandler);
    
    ExitB = new JButton("Exit");
    ebHandler = new ExitButtonHandler();
    ExitB.addActionListener(ebHandler);
    
    Container pane = getContentPane();
    pane.setLayout(new GridLayout(6,2));
    
    pane.add(taxL);
    pane.add(taxTF);
    pane.add(priceL);
    pane.add(priceTF);
    pane.add(tipL);
    pane.add(tipTF);
    pane.add(totalL);
    pane.add(totalTF);
    pane.add(rewardL);
    pane.add(rewardTF);
    pane.add(CalculateB);
    pane.add(ExitB);
    
    setTitle("Price Calculator");
    setSize(500, 400);
    setVisible(true);
}

public class CalculateButtonHandler implements ActionListener{
    public void actionPerformed (ActionEvent e){
        double price, tax, tip, sum,tip_amount,final_price, tax_rate, total, reward;
        
        price = Double.parseDouble(taxTF.getText());
        tax_rate = Double.parseDouble(priceTF.getText());
        tip_amount = Double.parseDouble(tipTF.getText());
        tax = price * tax_rate / 100;
        total = price + tip_amount + tax;
        reward = 0;
        
        totalTF.setText("" + total);
        rewardTF.setText("" + reward);
    }
}

public class ExitButtonHandler implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
}

public static void main(String[] args){
    TaxCalculator rectangle = new TaxCalculator();
}}

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Sorteggio extends JFrame implements ActionListener{
	
    ArrayList<String> parole= new ArrayList<String>();
    Random rand = new Random();
    JButton b1, b2,b3;
    JTextField f1;
    JLabel l;
    JLabel l1,l3;
    JTextArea a1;
    JPanel panel1;
    Sorteggio(){


        l1=new JLabel();

        l3=new JLabel();

        l1.setText("INSERISCI UNA PAROLA");
        l1.setForeground(Color.red);
        l1.setBounds(50,15,180,20);
        this.add(l1);

        l3.setText("PAROLA ESTRATTA: ");
        l3.setForeground(Color.red);
        l3.setBounds(150, 120, 180,20);
        this.add(l3);

        f1= new JTextField();
        f1.setBounds(50, 45, 140, 20);
        this.add(f1);

        a1= new JTextArea();
        a1.setBounds(150, 140, 120, 20);
        a1.setEditable(false);
        this.add(a1);

        b1=new JButton("INSERISCI");
        b1.setBounds(50, 75, 90, 25);
        this.add(b1);
        b1.addActionListener(this);

        b2=new JButton("RESET");
        b2.setBounds(155, 75, 80, 25);
        this.add(b2);
        b2.addActionListener(this);

        b3=new JButton("ESTRAI");
        b3.setBounds(50, 130, 90, 25);
        this.add(b3);
        b3.addActionListener(this);

        l= new JLabel();
        this.add(l);

        this.setTitle("SORTEGGIO PAROLE");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(320, 250);
        this.setResizable(false);
        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1){
            parole.add(f1.getText());
            f1.setText("");

        }else if(e.getSource()==b2){
            parole.clear();
            a1.setText(null);

        }else if(e.getSource()==b3){

            int temp= parole.size();
            int cont=rand.nextInt(temp);
            a1.setText(parole.get(cont));

            }
        }
    }

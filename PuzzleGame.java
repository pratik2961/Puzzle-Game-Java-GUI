package Puzzle;
import Puzzle.*;
// import demo_gui.MyFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PuzzleGame extends Frame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int actionNo = 0;
    PuzzleGame(Frame myFrame)
    {
        super();
        //Declaration of Button
        b1 = new JButton("6");
        b2 = new JButton("2");
        b3 = new JButton("8");
        b4 = new JButton("3");
        b5 = new JButton("1");
        b6 = new JButton("4");
        b7 = new JButton("5");
        b8 = new JButton("");
        b9 = new JButton("7");

        //setLayot
        myFrame.setLayout(new GridLayout(3,3));

        //addButton in frame
        myFrame.add(b1);
        myFrame.add(b2);
        myFrame.add(b3);
        myFrame.add(b4);
        myFrame.add(b5);
        myFrame.add(b5);
        myFrame.add(b6);
        myFrame.add(b7);
        myFrame.add(b8);
        myFrame.add(b9);

        //set listener in buttons
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        //pack frame
        myFrame.pack();

        //setVisible in frame
        myFrame.setVisible(true);


    }
   

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            String label = b1.getText();
            if (b2.getText().equals(""))
            {
                b1.setText("");
                b2.setText(label);
            }
            if (b4.getText().equals(""))
            {
                b1.setText("");
                b4.setText(label);
            }
        }
        //endif

        if(e.getSource() == b2)
        {
            String label = b2.getText();
            if(b1.getText().equals(""))
            {
                b2.setText("");
                b1.setText(label);
            }
            if(b5.getText().equals(""))
            {
                b2.setText("");
                b5.setText(label);
            }
            if(b3.getText().equals(""))
            {
                b2.setText("");
                b3.setText(label);
            }
        }
        //endif

        if(e.getSource() == b3)
        {
            String label = b3.getText();
            if(b2.getText().equals(""))
            {
                b3.setText("");
                b2.setText(label);
            }
            if(b5.getText().equals(""))
            {
                b3.setText("");
                b5.setText(label);
            }
            if(b6.getText().equals(""))
            {
                b3.setText("");
                b6.setText(label);
            }
        }
        //endif

        if(e.getSource() == b4)
        {
            String label = b4.getText();
            if(b1.getText().equals(""))
            {
                b4.setText("");
                b1.setText(label);
            }
            if(b5.getText().equals(""))
            {
                b4.setText("");
                b5.setText(label);
            }
            if(b7.getText().equals(""))
            {
                b4.setText("");
                b7.setText(label);
            }
        }
        //endif

        if (e.getSource() == b5)
        {
            String label = b5.getText();
            if(b2.getText().equals(""))
            {
                b5.setText("");
                b2.setText(label);
            }
            if(b4.getText().equals(""))
            {
                b5.setText("");
                b4.setText(label);
            }
            if(b6.getText().equals(""))
            {
                b5.setText("");
                b6.setText(label);
            }
            if(b8.getText().equals(""))
            {
                b5.setText("");
                b8.setText(label);
            }
        }
        //endif

        if (e.getSource() == b6)
        {
            String label = b6.getText();
            if(b3.getText().equals(""))
            {
                b6.setText("");
                b3.setText(label);
            }
            if(b5.getText().equals(""))
            {
                b6.setText("");
                b5.setText(label);
            }
            if(b9.getText().equals(""))
            {
                b6.setText("");
                b9.setText(label);
            }
        }
        //endif

        if (e.getSource()==b7)
        {
            String label = b7.getText();
            if(b4.getText().equals(""))
            {
                b7.setText("");
                b4.setText(label);
            }
            if(b8.getText().equals(""))
            {
                b7.setText("");
                b8.setText(label);
            }
        }
        //endif

        if (e.getSource()==b8)
        {
            String label = b8.getText();
            if(b7.getText().equals(""))
            {
                b8.setText("");
                b7.setText(label);
            }
            if(b5.getText().equals(""))
            {
                b8.setText("");
                b5.setText(label);
            }
            if(b9.getText().equals(""))
            {
                b8.setText("");
                b9.setText(label);
            }
        }
        //endif

        if (e.getSource()==b9)
        {
            String label = b9.getText();
            if(b6.getText().equals(""))
            {
                b9.setText("");
                b6.setText(label);
            }
            if(b8.getText().equals(""))
            {
                b9.setText("");
                b8.setText(label);
            }
        }
        //endif

        actionNo = actionNo + 1;
        //code for game win
        if(b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel().equals("3") && b4.getLabel().equals("4") && b5.getLabel().equals("5") && b6.getLabel().equals("6") && b7.getLabel().equals("7") && b8.getLabel().equals("8") && b9.getLabel().equals("")){
            String totalAction = Integer.toString(actionNo);
            String msg = "Congratulations for win the game you need "+totalAction+" move";


            JOptionPane.showMessageDialog(null,msg,"Congratulation",JOptionPane.INFORMATION_MESSAGE,null);
            System.out.println(actionNo);
            System.exit(0);
        }

    }
    public static void main(String args[])
    {
        Frame myFrame = new Frame("PuzzleGame");
        PuzzleGame pg = new PuzzleGame(myFrame);
    }
}


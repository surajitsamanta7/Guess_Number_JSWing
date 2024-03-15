import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;
import java.util.Random;

public class Guess {
    int tempno=0;
    static String playcon;
    Guess(){
        //Create Jframe
        JFrame jf=new JFrame();
        jf.setSize(500,556);
        jf.setTitle("Number Game....");
        jf.setLayout(null);
        jf.setVisible(true);
        jf.getContentPane().setBackground(Color.cyan);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
   

        
        //Create JLabel
        JLabel jlab=new JLabel();
        jlab.setText("Enter guessing number between 1 to 100..");
        jlab.setBounds(31,25,440,39);
        jf.add(jlab);
        
        JTextArea jta=new JTextArea();
        jta.setBounds(116,95,252,67);
        jta.setBackground(Color.white);
        jta.setForeground(Color.BLUE);
        
        jf.add(jta);
//create Button
        JButton jb=new JButton();
        jb.setBounds(174,195,117,42);
        jb.setText("Guess");
        jf.add(jb);
//create play again -------------
    // Label for playagain
    JLabel play=new JLabel();
    play.setText("Play Again ?(Choose Yes Or No)");
    play.setBounds(14,429,391,40);
    
    // jf.add(play);

    //Text area
    JTextArea parea=new JTextArea();
    parea.setBounds(20,500,170,35);
    parea.setBackground(Color.white);
    parea.setForeground(Color.BLUE);
    //Button
    JButton pyes=new JButton();
    pyes.setBounds(224,501,113,42);
    pyes.setText("OK");
    
    //button action--
    pyes.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
        //    String  playagain=parea.getText();
        //    playcon=playagain.toUpperCase();
        }
        
    });


//use Another label
        JLabel jLabel=new JLabel();
        jLabel.setBounds(15,276,476,41);
        jf.add(jLabel);
//Attempt data -->temporary
        JLabel temporary=new JLabel();
        temporary.setBounds(20,349,463,36);
        jf.add(temporary);

        Random randno=new Random();
        int rand =randno.nextInt(100);
    while(true){
        jb.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String ino = jta.getText();
                int val = Integer.parseInt(ino);
                tempno++; 
                if (val==rand) {
                    jLabel.setText("Congrats You guess the number and Win the game");
                    temporary.setText("Your attempt is: "+(tempno));
                    
                    // add playagain-----------
                    jf.add(play);
                    jf.add(parea);
                    jf.add(pyes);
                    
                } 
                else if(val<rand){
                    jLabel.setText("The number is too low ");
                    
                }
                else{
                    jLabel.setText("The number is too high ");
                    
                }            
                
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
                
            }
        });
    }


}
    public static void main(String[] args) {
            new Guess();
            // do {
            //     Guess obj=new Guess();
            // } while ("YES"==playcon);

    }
}

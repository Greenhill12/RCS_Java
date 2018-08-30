
package day10;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Day10 {
    
        public static void main(String[] args) {
                SwingUtilities.invokeLater(new Runnable(){
                @Override
                public void run(){
                    JFrame frame = new JFrame();
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame.getContentPane().add(new Task1());
                    frame.getContentPane().add(new Task2());
                    frame.pack();
                    frame.setVisible(true);
                }
            });
            
        }
    
}

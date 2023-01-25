package Button;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
JButton myButton = new JButton("My Button");
MyFrame (){
    myButton.setBounds(100,100,200,100);
    this.add(myButton);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(420,420);
    this.setLayout(null);
    this.setVisible(true);

}
}

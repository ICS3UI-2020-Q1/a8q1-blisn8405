import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;

  JLabel firstLabel;

  JTextField firstInput;

  JButton sayHelloButton;

  JLabel outputArea;


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);
 
    //initialize the main JPanel
    mainPanel = new JPanel();
    //disable any layout helpers
    mainPanel.setLayout(null);

    //create the side labels
    firstLabel = new JLabel();

    //layout the labels by setting the coordinate and size
    //setBounds(x,y,width,height)
    firstLabel.setBounds(125,175,100,20);

    //initialize the input text fields
    firstInput = new JTextField();

    //set the location and size
    firstInput.setBounds(125,50,375,20);

    //initialize the buttons
    sayHelloButton = new JButton("Say Hello");

    //set the size and location of the buttons
    sayHelloButton.setBounds(200,300,100,20);

    //add an action listener to the buttons
    sayHelloButton.addActionListener(this);

     //set the action command on the button
    sayHelloButton.setActionCommand("Say Hello");

     //initialize the text Areas
   outputArea = new JLabel();
   


   //set size and locaiton of text Areas
   outputArea.setBounds(125,250,375,20);
   

   //disable the text areas so the user cannot type in them
   outputArea.setEnabled(true);
   

   // add to main panel
   mainPanel.add(outputArea);
   

    //add the buttons to the panel
    mainPanel.add(sayHelloButton);

     //add the text fields to the panel
    mainPanel.add(firstInput);

      //add the labels to the main pane;
    mainPanel.add(firstLabel);

      // add the panel to the window
    frame.add(mainPanel);

    // get the text from each text boxes
    String firstText = firstInput.getText();

   


  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

  // get the text from each text boxes
   String firstText = firstInput.getText();
 outputArea.setText("Hello " + firstText);
  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}

package classwork.extrawork;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example extends JFrame {



        private JButton шайтанБабахButton;
        private JTextField пультОтЯдеркиTextField;
        private JRadioButton запускRadioButton;
        private JSpinner spinner1;
        private JPasswordField passwordField1;
    private JPanel panel;

    public Example() {
        шайтанБабахButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               JOptionPane.showMessageDialog(шайтанБабахButton,"hello"+ пультОтЯдеркиTextField.getText());
            }
        });
    }

    public static void main(String[] args) {
        Example form = new Example();
        form.setTitle("This is пульт от ядерки");
        form.setContentPane(form.panel);
        form.setSize(500,500);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setVisible(true);
    }

        private void createUIComponents () {
            // TODO: place custom component creation code here
        }
    }



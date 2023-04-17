package classwork.extrawork2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloForm extends JFrame{

    private JPanel panel;
    private JLabel label;
    private JButton backToMenuButton;
    private  LoginForm loginForm;

    public HelloForm(LoginForm loginForm, String text){
        this.setTitle("This is my app");
        this.setContentPane(this.panel);
        this.setSize(300, 100);
        this.setLocation(450,300);
        this.setResizable(false);
        this.label.setText(text);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.loginForm = loginForm;

        backToMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                HelloForm.super.setVisible(false);
                loginForm.setVisible(true);

            }
        });
    }
}

package classwork.extrawork2;

import classwork.extrawork.Example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
        private JTextField Panel;
        private JPanel panel;
        private JButton loginButton;
        private  HelloForm helloForm;


        public LoginForm() {
            loginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = Panel.getText();
                    System.out.println(text);
                        LoginForm.super.setVisible(false);
                        helloForm = new HelloForm(LoginForm.this, getDoctorByPlan(text));


                }
            });
        }

    public static void main(String[] args) {
            LoginForm form = new LoginForm();
            form.setTitle("This is my app");
            form.setContentPane(form.panel);
            form.setSize(300, 100);
            form.setLocation(450,300);
            form.setResizable(false);
            form.setDefaultCloseOperation(EXIT_ON_CLOSE);
            form.setVisible(true);
        }

        private static String getDoctorByPlan(String plan){
            if(plan.equals("1")) return "You need visit our Terapist";
            if(plan.equals("2")) return "You need visit our Dentist";
            if(plan.equals("3")) return "You need visit our Surgeon";
            return "you need to go to 0kulist, choose correct number";
        }



    }



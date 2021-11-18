package Interfaces;

import javax.swing.*;
import java.awt.*;

/**
 * Instituto Tecnologico de Costa Rica
 * Area Ingenieria en Computadores
 *
 * Lenguaje: Java
 * Clase: PathInterface
 * @version 1.0
 * @author Angelo Ceciliano, Byron Mata, Gustavo Alvarado y Sebastian Chaves
 *
 * Descripcion: Esta clase contiene el constructor de la interfaz principal de la aplicacion
 */
public class PathInterface extends JFrame {

    private JLabel Background, Background2, Title, People;
    private JButton Button1, Button2, Button3, Button4, Button5, Button6,  Button7,  Button8,  Button9, Button10,  Button11, Button12, Button13,  Button14,  Button15,  Button16;
    private JFrame WindowP;


    /**
     * Constructor de la interfaz principal
     */
    public PathInterface(){

        Button1 = new JButton();
        Button1.setBounds(60, 380, 10, 10);
        //Button1.addActionListener(new Action());

        Button2 = new JButton();
        Button2.setBounds(150, 320, 10, 10);
        //Button2.addActionListener(new Action());

        Button3 = new JButton();
        Button3.setBounds(150, 470, 10, 10);
        //Button3.addActionListener(new Action());

        Button4 = new JButton();
        Button4.setBounds(220, 250, 10, 10);
        //Button4.addActionListener(new Action());

        Button5 = new JButton();
        Button5.setBounds(260, 60, 10, 10);
        //Button5.addActionListener(new Action());

        Button6 = new JButton();
        Button6.setBounds(320, 200, 10, 10);
        //Button6.addActionListener(new Action());

        Button7 = new JButton();
        Button7.setBounds(325, 300, 10, 10);
        //Button7.addActionListener(new Action());

        Button8 = new JButton();
        Button8.setBounds(480, 150, 10, 10);
        //Button8.addActionListener(new Action());

        Button9 = new JButton();
        Button9.setBounds(700, 200, 10, 10);
        //Button9.addActionListener(new Action());

        Button10 = new JButton();
        Button10.setBounds(800, 320, 10, 10);
        //Button10.addActionListener(new Action());

        Button11 = new JButton();
        Button11.setBounds(600, 320, 10, 10);
        //Button11.addActionListener(new Action());

        Button12 = new JButton();
        Button12.setBounds(450, 340, 10, 10);
        //Button12.addActionListener(new Action());

        Button13 = new JButton();
        Button13.setBounds(300, 500, 10, 10);
        //Button13.addActionListener(new Action());

        Button14 = new JButton();
        Button14.setBounds(260, 600, 10, 10);
        //Button14.addActionListener(new Action());

        Button15 = new JButton();
        Button15.setBounds(730, 530, 10, 10);
        //Button15.addActionListener(new Action());

        Background = new JLabel();
        Background.setBounds(0,0,870,750);
        Background.add(Button1);
        Background.add(Button2);
        Background.add(Button3);
        Background.add(Button4);
        Background.add(Button5);
        Background.add(Button6);
        Background.add(Button7);
        Background.add(Button8);
        Background.add(Button9);
        Background.add(Button10);
        Background.add(Button11);
        Background.add(Button12);
        Background.add(Button13);
        Background.add(Button14);
        Background.add(Button15);

        Title = new JLabel("L.A|CALIFORNIA|EE.UU.");
        Title.setBounds(13, 40, 400, 300);
        Title.setForeground(Color.WHITE);
        Title.setFont(new Font("Century Gothic", Font.BOLD,30));

        Button16 = new JButton();
        Button16.setBounds(110, 660, 150, 30);
        Button16.setText("Información");
        Button16.setFont(new Font("Century Gothic", Font.ITALIC,20));
        Button16.setForeground(Color.WHITE);
        Button16.setBackground(Color.BLACK);
        Button16.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //Button16.addActionListener(new Action());

        Background2 = new JLabel();
        Background2.setBounds(870,0,370, 750);
        Background2.setBackground(Color.BLACK);
        Background2.setOpaque(true);
        Background2.add(Button16);
        Background2.add(Title);

        WindowP = new JFrame();
        WindowP.setTitle("PathFinder");
        WindowP.setVisible(true);
        WindowP.setLayout(null);
        WindowP.setSize(1250,750);
        WindowP.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        WindowP.add(Background);
        WindowP.add(Background2);
        WindowP.setResizable(false);
        WindowP.setLocationRelativeTo(null);

    }
}
package Interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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

    private JLabel Background, Title, Inf1, Inf2, Inf3, Inf4;
    private JButton Button1, Button2, Button3, Button4, Button5, Button6,  Button7,  Button8,  Button9, Button10,  Button11, Button12, Button13,  Button14,  Button15,  Button16;
    private JFrame WindowP;


    /**
     * Constructor de la interfaz principal
     */
    public PathInterface(){

        Button1 = new JButton();
        Button1.setBounds(60, 380, 15, 15);
        Button1.addActionListener(new ButtonListener());
        list.add(Button1);

        Button2 = new JButton();
        Button2.setBounds(150, 320, 15, 15);
        Button2.addActionListener(new ButtonListener());
        list.add(Button2);

        Button3 = new JButton();
        Button3.setBounds(150, 470, 15, 15);
        Button3.addActionListener(new ButtonListener());
        list.add(Button3);

        Button4 = new JButton();
        Button4.setBounds(220, 250, 15, 15);
        Button4.addActionListener(new ButtonListener());
        list.add(Button4);

        Button5 = new JButton();
        Button5.setBounds(260, 60, 15, 15);
        Button5.addActionListener(new ButtonListener());
        list.add(Button5);

        Button6 = new JButton();
        Button6.setBounds(320, 200, 15, 15);
        Button6.addActionListener(new ButtonListener());
        list.add(Button6);

        Button7 = new JButton();
        Button7.setBounds(325, 300, 15, 15);
        Button7.addActionListener(new ButtonListener());
        list.add(Button7);

        Button8 = new JButton();
        Button8.setBounds(480, 150, 15, 15);
        Button8.addActionListener(new ButtonListener());
        list.add(Button8);

        Button9 = new JButton();
        Button9.setBounds(700, 200, 15, 15);
        Button9.addActionListener(new ButtonListener());
        list.add(Button9);

        Button10 = new JButton();
        Button10.setBounds(800, 320, 15, 15);
        Button10.addActionListener(new ButtonListener());
        list.add(Button10);

        Button11 = new JButton();
        Button11.setBounds(600, 320, 15, 15);
        Button11.addActionListener(new ButtonListener());
        list.add(Button11);

        Button12 = new JButton();
        Button12.setBounds(450, 340, 15, 15);
        Button12.addActionListener(new ButtonListener());
        list.add(Button12);

        Button13 = new JButton();
        Button13.setBounds(300, 500, 15, 15);
        Button13.addActionListener(new ButtonListener());
        list.add(Button13);

        Button14 = new JButton();
        Button14.setBounds(260, 600, 15, 15);
        Button14.addActionListener(new ButtonListener());
        list.add(Button14);

        Button15 = new JButton();
        Button15.setBounds(730, 530, 15, 15);
        Button15.addActionListener(new ButtonListener());
        list.add(Button15);

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
        Button16.addActionListener(new ButtonListener());
        list.add(Button16);

        Inf1 = new JLabel();
        Inf1.setForeground(Color.WHITE);
        Inf1.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        Inf1.setText("<Ciudad de Los Ángeles: 1222,4 Km^2>");
        Inf1.setBounds(20, 50, 600, 600);

        Inf2 = new JLabel();
        Inf2.setForeground(Color.WHITE);
        Inf2.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        Inf2.setText("<Habitantes: 4,0 Millones>");
        Inf2.setBounds(20, 100, 600, 600);

        Inf3 = new JLabel();
        Inf3.setForeground(Color.WHITE);
        Inf3.setFont(new Font("Century Gothic", Font.PLAIN,  16));
        Inf3.setText("<Visitantes: 50,1 millones>");
        Inf3.setBounds(20,150,600,600);

        Inf4 = new JLabel();
        Inf4.setForeground(Color.WHITE);
        Inf4.setFont(new Font("Century Gothic", Font.PLAIN,  16));
        Inf4.setText("<Condado de los Ángeles: 10,5 Km^2>");
        Inf4.setBounds(20,200,600,600);

        Background = new JLabel();
        Background.setBounds(870,0,370, 750);
        Background.setBackground(Color.BLACK);
        Background.setOpaque(true);
        Background.add(Button16);
        Background.add(Title);
        Background.add(Inf1);
        Background.add(Inf2);
        Background.add(Inf3);
        Background.add(Inf4);

        Graphic g = new Graphic();

        WindowP = new JFrame("PathFinder");
        WindowP.setVisible(true);
        WindowP.setSize(1250,750);
        WindowP.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        WindowP.setResizable(false);

        WindowP.add(Button1);
        WindowP.add(Button2);
        WindowP.add(Button3);
        WindowP.add(Button4);
        WindowP.add(Button5);
        WindowP.add(Button6);
        WindowP.add(Button7);
        WindowP.add(Button8);
        WindowP.add(Button9);
        WindowP.add(Button10);
        WindowP.add(Button11);
        WindowP.add(Button12);
        WindowP.add(Button13);
        WindowP.add(Button14);
        WindowP.add(Button15);
        WindowP.add(Background);
        WindowP.add(g);
        
    }

    /**
     * Instituto Tecnologico de Costa Rica
     * Area Ingenieria en Computadores
     *
     * Lenguaje: Java
     * Sub-Clase: ButtonListener
     * @version 1.0
     * @author Angelo Ceciliano, Byron Mata, Gustavo Alvarado y Sebastian Chaves
     *
     * Descripcion: Esta sub-clase contiene el metodo para el accionar de los botones con los que el usuario interactua
     */
    private class ButtonListener implements ActionListener {

        /**
         * Metodo para llevar a cabo las acciones de un boton o varios botones
         *
         * @param e para eventos al accionar de un boton
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            count++;

            if(count == 1){
                press1 = e.getSource();

            }if(count == 2){
                count = 0;
                press2 = e.getSource();

                if(press2 == Button16){

                    Data data = new Data();

                    for(int i = 0; i <= 15; i++){

                        if(list.get(i) == press1){

                            if(i==0){
                                data.DataMuelle();

                            }else if(i==1){
                                data.DataMemorialPark();

                            }else if(i==2){
                                data.DataAirport();

                            }else if (i==3){
                                data.DataGrettyC();
                                
                            }else if(i==4){
                                data.DataAmigos();

                            }else if(i==5){
                                data.DataChineseT();

                            }else if(i==6){
                                data.DataMuseoLA();

                            }else if(i==7){
                                data.DataGriffith();

                            }else if(i==8){
                                data.DataInstitutoCA();

                            }else if(i==9){
                                data.DataWalmart();

                            }else if(i==10){
                                data.DataAngelus();

                            }else if(i==11){
                                data.DataGas();

                            }else if(i==12){
                                data.DataBurger();

                            }else if(i==13){
                                data.DataPalosV();

                            }else{
                                data.DataChicken();

                            }
                        }
                    }
                }
            }
            System.out.println("Contador " + count);
        }
    }
}

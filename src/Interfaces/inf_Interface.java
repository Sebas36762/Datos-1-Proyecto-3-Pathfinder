package Interfaces;

import Sort.quickSort;
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
 * Clase: inf_Interface
 * @version 1.0
 * @author Angelo Ceciliano, Byron Mata, Gustavo Alvarado y Sebastian Chaves
 *
 * Descripcion: Esta clase contiene el constructor de la interfaz para mostrar la lista de las locaciones seleccionadas,
 * además del funcionamiento para ordenar y lograr ver la informacion de las locaciones mediante botones
 */
public class inf_Interface extends JFrame {

    private JFrame WindowI;
    private JButton Sort, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15;
    private JLabel BG, Locaciones;
    private ArrayList<JLabel> list = new ArrayList<>(15);
    private JLabel Santa, Memorial, International, Gretty, Los, Chinese, Country, Griffith, California, Walmart, Angelus, Gas, InNout, Palos, Raining;
    private String Sant, Memo, Inter, Grett, Lo, Chine, Coun, Grif, Cali, Wal, Ange, Ga, In, Pal, Rain;

    /**
     * Constructor de la interfaz de informacion
     */
    public inf_Interface() {

        Locaciones = new JLabel("Locaciones");
        Locaciones.setFont(new Font("Century Gothic", Font.PLAIN, 26));
        Locaciones.setForeground(Color.BLACK);
        Locaciones.setBounds(50, 10, 300, 50);

        Sant = "Santa Monica Pier";
        Santa = new JLabel(">> " + Sant);
        Santa.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        Santa.setForeground(Color.BLACK);
        Santa.setBounds(50, 70, 300, 50);

        Memo = "Memorial Park";
        Memorial = new JLabel(">> " + Memo);
        Memorial.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        Memorial.setForeground(Color.BLACK);
        Memorial.setBounds(50, 100, 300, 50);

        Inter = "International Airport";
        International = new JLabel(">> " + Inter);
        International.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        International.setForeground(Color.BLACK);
        International.setBounds(50, 130, 300, 50);

        Grett = "Gretty Center";
        Gretty = new JLabel(">> " + Grett);
        Gretty.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        Gretty.setForeground(Color.BLACK);
        Gretty.setBounds(50, 160, 300, 50);

        Lo = "Los Amigos Bar & Grill";
        Los = new JLabel(">> " + Lo);
        Los.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        Los.setForeground(Color.BLACK);
        Los.setBounds(50, 190, 300, 50);

        Chine = "Chinesse Threater";
        Chinese = new JLabel(">> " + Chine);
        Chinese.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        Chinese.setForeground(Color.BLACK);
        Chinese.setBounds(50, 220, 300, 50);

        Coun = "Country Museum art";
        Country = new JLabel(">> " + Coun);
        Country.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        Country.setForeground(Color.BLACK);
        Country.setBounds(50, 250, 300, 50);

        Grif = "Griffith Observatory";
        Griffith = new JLabel(">> " + Grif);
        Griffith.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        Griffith.setForeground(Color.BLACK);
        Griffith.setBounds(50, 280, 300, 50);

        Cali = "California Institute of Technology";
        California = new JLabel(">> " + Cali);
        California.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        California.setForeground(Color.BLACK);
        California.setBounds(50, 310, 300, 50);

        Wal = "Walmart Super Center";
        Walmart = new JLabel(">> " + Wal);
        Walmart.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        Walmart.setForeground(Color.BLACK);
        Walmart.setBounds(50, 340, 300, 50);

        Ange = "Angelus Rosedale Cemetery";
        Angelus = new JLabel(">> " + Ange);
        Angelus.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        Angelus.setForeground(Color.BLACK);
        Angelus.setBounds(50, 370, 300, 50);

        Ga = "Gas Station Chevron";
        Gas = new JLabel(">> " + Ga);
        Gas.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        Gas.setForeground(Color.BLACK);
        Gas.setBounds(50, 400, 300, 50);

        In = "In-N-Out Burger";
        InNout = new JLabel(">> " + In);
        InNout.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        InNout.setForeground(Color.BLACK);
        InNout.setBounds(50, 430, 300, 50);

        Pal = "Palos Verdes Nature Preserver";
        Palos = new JLabel((">> " + Pal));
        Palos.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        Palos.setForeground(Color.BLACK);
        Palos.setBounds(50, 460, 300, 50);

        Rain = "Raining Cane's Chicken Finger";
        Raining = new JLabel(">> " + Rain);
        Raining.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        Raining.setForeground(Color.BLACK);
        Raining.setBounds(50, 490, 300, 50);

        B1 = new JButton("Inf");
        B1.setBounds(480, 85, 100, 20);
        B1.addActionListener(new ButtonListener());
        B1.setVisible(false);

        B2 = new JButton("Inf");
        B2.setBounds(480, 115, 100, 20);
        B2.addActionListener(new ButtonListener());
        B2.setVisible(false);

        B3 = new JButton("Inf");
        B3.setBounds(480, 145, 100, 20);
        B3.addActionListener(new ButtonListener());
        B3.setVisible(false);

        B4 = new JButton("Inf");
        B4.setBounds(480, 175, 100, 20);
        B4.addActionListener(new ButtonListener());
        B4.setVisible(false);

        B5 = new JButton("Inf");
        B5.setBounds(480, 205, 100, 20);
        B5.addActionListener(new ButtonListener());
        B5.setVisible(false);

        B6 = new JButton("Inf");
        B6.setBounds(480, 235, 100, 20);
        B6.addActionListener(new ButtonListener());
        B6.setVisible(false);

        B7 = new JButton("Inf");
        B7.setBounds(480, 265, 100, 20);
        B7.addActionListener(new ButtonListener());
        B7.setVisible(false);

        B8 = new JButton("Inf");
        B8.setBounds(480, 295, 100, 20);
        B8.addActionListener(new ButtonListener());
        B8.setVisible(false);

        B9 = new JButton("Inf");
        B9.setBounds(480, 325, 100, 20);
        B9.addActionListener(new ButtonListener());
        B9.setVisible(false);

        B10 = new JButton("Inf");
        B10.setBounds(480, 355, 100, 20);
        B10.addActionListener(new ButtonListener());
        B10.setVisible(false);

        B11 = new JButton("Inf");
        B11.setBounds(480, 385, 100, 20);
        B11.addActionListener(new ButtonListener());
        B11.setVisible(false);

        B12 = new JButton("Inf");
        B12.setBounds(480, 415, 100, 20);
        B12.addActionListener(new ButtonListener());
        B12.setVisible(false);

        B13 = new JButton("Inf");
        B13.setBounds(480, 445, 100, 20);
        B13.addActionListener(new ButtonListener());
        B13.setVisible(false);

        B14 = new JButton("Inf");
        B14.setBounds(480, 475, 100, 20);
        B14.addActionListener(new ButtonListener());
        B14.setVisible(false);

        B15 = new JButton("Inf");
        B15.setBounds(480, 505, 100, 20);
        B15.addActionListener(new ButtonListener());
        B15.setVisible(false);

        BG = new JLabel();
        BG.setBackground(Color.WHITE);
        BG.setBounds(0, 0, 600, 600);

        BG.add(Locaciones); BG.add(Santa); BG.add(Memorial); BG.add(International); BG.add(Gretty); BG.add(Los);
        BG.add(Chinese); BG.add(Country); BG.add(Griffith); BG.add(California); BG.add(Walmart); BG.add(Angelus);
        BG.add(Gas); BG.add(InNout); BG.add(Palos); BG.add(Raining);

        BG.add(B1); BG.add(B2); BG.add(B3); BG.add(B4); BG.add(B5); BG.add(B6); BG.add(B7); BG.add(B8); BG.add(B9);
        BG.add(B10); BG.add(B11); BG.add(B12); BG.add(B13); BG.add(B14); BG.add(B15);

        String[] listS = {Sant, Memo, Inter, Grett, Lo, Chine, Coun, Grif, Cali, Wal, Ange, Ga, In, Pal, Rain};

        list.add(Santa); list.add(Memorial); list.add(International); list.add(Gretty); list.add(Los); list.add(Chinese);
        list.add(Country); list.add(Griffith); list.add(California); list.add(Walmart); list.add(Angelus); list.add(Gas);
        list.add(InNout); list.add(Palos); list.add(Raining);

        Sort = new JButton("Ordenar");
        Sort.setBounds(480, 550, 100, 20);
        Sort.addActionListener(new ActionListener() {

            /**
             * Metodo para llevar a cabo la accion de ordenamiento de las locaciones dadas
             *
             * @param e para eventos al accionar el boton
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                quickSort quick = new quickSort();
                String[] listSort = quick.sort(listS);

                for (int i = 0; i < 15; i++) {
                    list.get(i).setText(">> " + listSort[i]);
                }

                B1.setVisible(true); B2.setVisible(true); B3.setVisible(true); B4.setVisible(true); B5.setVisible(true);
                B6.setVisible(true); B7.setVisible(true); B8.setVisible(true); B9.setVisible(true); B10.setVisible(true);
                B11.setVisible(true); B12.setVisible(true); B13.setVisible(true); B14.setVisible(true); B15.setVisible(true);
            }
        });

        WindowI = new JFrame("Information");
        WindowI.setVisible(true);
        WindowI.setSize(650, 650);
        WindowI.setResizable(false);
        WindowI.add(Sort);
        WindowI.add(BG);

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
     * Descripcion: Esta sub-clase contiene el metodo para el accionar de los botones de informacion con los que el
     * usuario interactua
     *
     */
    private class ButtonListener implements ActionListener {

        /**
         * Metodo para llevar a cabo las acciones de los botones de informacion
         *
         * @param e para eventos al accionar de un boton
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            places_Information data = new places_Information();
            if (e.getSource() == B1) {
                data.DataAngelus();
            } else if (e.getSource() == B2) {
                data.DataInstitutoCA();
            } else if (e.getSource() == B3) {
                data.DataChineseT();
            } else if (e.getSource() == B4) {
                data.DataMuseoLA();
            } else if (e.getSource() == B5) {
                data.DataGas();
            } else if (e.getSource() == B6) {
                data.DataGrettyC();
            } else if (e.getSource() == B7) {
                data.DataGriffith();
            } else if (e.getSource() == B8) {
                data.DataBurger();
            } else if (e.getSource() == B9) {
                data.DataAirport();
            } else if (e.getSource() == B10) {
                data.DataAmigos();
            } else if (e.getSource() == B11) {
                data.DataMemorialPark();
            } else if (e.getSource() == B12) {
                data.DataPalosV();
            } else if (e.getSource() == B13) {
                data.DataChicken();
            } else if (e.getSource() == B14) {
                data.DataMuelle();
            } else if (e.getSource() == B15) {
                data.DataWalmart();
            }
        }
    }
}
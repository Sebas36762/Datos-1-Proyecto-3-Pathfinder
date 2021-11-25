package Interfaces;

import Sort.quickSort;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.*;

/**
 * Instituto Tecnologico de Costa Rica
 * Area Ingenieria en Computadores
 *
 * Lenguaje: Java
 * Clase: Interfaces.inf_Interface
 * @version 1.0
 * @author Angelo Ceciliano, Byron Mata, Gustavo Alvarado y Sebastian Chaves
 *
 * Descripcion: Esta clase contiene el constructor de la interfaz para mostrar la lista de las locaciones seleccionadas,
 * además del funcionamiento para ordenar y lograr ver la informacion de las locaciones mediante botones
 */
public class inf_Interface extends JFrame implements MouseListener {
    private String Sant, Memo, Inter, Grett, Lo, Chine, Coun, Grif, Cali, Wal, Ange, Ga, In, Pal, Rain;
    private JTable table;

    /**
     * Constructor de la interfaz de informacion
     */
    public inf_Interface() {

        table = new JTable();

        Object[] columns = {"Places", "Inf"};

        DefaultTableModel model = new DefaultTableModel() {
            /**
             * Metodo que determina que columnas se pueden editar en la tabla
             *
             * @param row numero de filas minimas
             * @param columns numero de columnas minimas
             *
             * @return de valores booleans para permitir editar o no el espacio de JTable
             */
            @Override
            public boolean isCellEditable(int row, int columns) {
                if (columns == 1) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        model.setColumnIdentifiers(columns);

        //Configuracion de la tabla con los lugares
        table.setModel(model);
        table.setForeground(Color.BLACK);
        table.setRowHeight(30);
        table.addMouseListener(this);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(515);
        table.getColumnModel().getColumn(1).setPreferredWidth(30);

        //Entrada de texto para la busqueda
        JTextField field = new JTextField();
        field.setBounds(20, 400, 250, 25);
        field.addKeyListener(new KeyAdapter() {

            /**
             * Metodo que detecta cuando se presiona una tecla en el teclado (para la busqueda)
             *
             * @param e evento de presionar una tecla del teclado
             */
            @Override
            public void keyReleased(KeyEvent e) {
                DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
                String search = field.getText();
                TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tableModel);
                table.setRowSorter(tr);
                tr.setRowFilter(RowFilter.regexFilter(search));
            }
        });

        JScrollPane scroll = new JScrollPane(table);
        scroll.setBounds(10, 10, 565, 350);

        //Nombres de los lugares del mapa
        Sant = "Santa Monica Pier";
        Memo = "Memorial Park";
        Inter = "International Airport";
        Grett = "Gretty Center";
        Lo = "Los Amigos Bar & Grill";
        Chine = "Chinesse Threater";
        Coun = "Country Museum art";
        Grif = "Griffith Observatory";
        Cali = "California Institute of Technology";
        Wal = "Walmart Super Center";
        Ange = "Angelus Rosedale Cemetery";
        Ga = "Gas Station Chevron";
        In = "In-N-Out Burger";
        Pal = "Palos Verdes Nature Preserver";
        Rain = "Raining Cane's Chicken Finger";

        String[] listS = {Sant, Memo, Inter, Grett, Lo, Chine, Coun, Grif, Cali, Wal, Ange, Ga, In, Pal, Rain};
        String[] temp = new String[1];

        for (int i = 0; i < 15; i++) { //Agrega los lugares del mapa a la tabla
            temp[0] = listS[i];
            model.addRow(temp);
        }

        //Ordenamiento de los lugares alfabeticamente
        quickSort sort = new quickSort();
        String[] list2 = sort.sort(listS);

        //Boton para realizar el ordenamiento de los lugares en la tabla
        JButton btn = new JButton("Sort");
        btn.setBounds(400, 400, 100, 25);
        btn.addActionListener(new ActionListener() {

            /**
             * Metodo que detecta cuando se presiona el boton Sort
             *
             * @param e evento de presionar el boton en pantalla
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model2 = new DefaultTableModel() {

                    /**
                     * Metodo que determina que columnas se pueden editar en la tabla
                     *
                     * @param row numero de filas minimas
                     * @param columns numero de columnas minimas
                     *
                     * @return de valores booleans para permitir editar o no el espacio de JTable
                     */
                    @Override
                    public boolean isCellEditable(int row, int columns) {
                        if (columns == 1) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                };

                model2.setColumnIdentifiers(columns);

                for (int i = 0; i < 15; i++) {
                    temp[0] = list2[i];
                    model2.addRow(temp);
                }

                table.setModel(model2);
                table.getColumnModel().getColumn(0).setPreferredWidth(515);
                table.getColumnModel().getColumn(1).setPreferredWidth(30);
            }
        });

        JLabel buscar = new JLabel(">> Buscar");
        buscar.setBounds(20,380,100,25);

        //Ventana que contiene la tabla de lugares y sistema de busqueda
        JFrame win = new JFrame("Information");
        win.setSize(600, 500);
        win.setVisible(true);
        win.setLayout(null);

        win.add(scroll);
        win.add(field);
        win.add(btn);
        win.add(buscar);
    }

    /**
     * Metodo que contiene el funcionamiento de dar accion a las casillas asignadas en el JTable, en este caso
     * mostrar la informacion
     *
     * @param e para eventos al accionar de un boton
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        int fila = table.rowAtPoint(e.getPoint());
        int col = table.columnAtPoint(e.getPoint());
        places_Information data = new places_Information();

        if (col == 1) { //Detecta que columna fue presionada en la tabla

            //Deteccion de que fila fue presionada en la tabla y despliegue de la informacion
            if (fila == 0) {
                data.DataAngelus();

            } else if (fila == 1) {
                data.DataInstitutoCA();

            } else if (fila == 2) {
                data.DataChineseT();

            } else if (fila == 3) {
                data.DataMuseoLA();

            } else if (fila == 4) {
                data.DataGas();

            } else if (fila == 5) {
                data.DataGrettyC();

            } else if (fila == 6) {
                data.DataGriffith();

            } else if (fila == 7) {
                data.DataBurger();

            } else if (fila == 8) {
                data.DataAirport();

            } else if (fila == 9) {
                data.DataAmigos();

            } else if (fila == 10) {
                data.DataMemorialPark();

            } else if (fila == 11) {
                data.DataPalosV();

            } else if (fila == 12) {
                data.DataChicken();

            } else if (fila == 13) {
                data.DataMuelle();

            } else if (fila == 14) {
                data.DataWalmart();
            }
        }
    }


    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}

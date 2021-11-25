package Interfaces;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.BLACK;
import static java.awt.Color.RED;

/**
 * Instituto Tecnologico de Costa Rica
 * Area Ingenieria en Computadores
 *
 * Lenguaje: Java
 * Clase: graphic
 * @version 1.0
 * @author Angelo Ceciliano, Byron Mata, Gustavo Alvarado y Sebastian Chaves
 *
 * Descripcion: Esta clase contiene el metodo paint que es utilizado en la clase PathInterface en donde cumple la funcion
 * de pintar en pantalla las aristas que conforman el grafo dirigido
 */
public class graphic extends JPanel {

    /**
     * Metodo utilizado para pintar las figuras dadas en el JPanel asignado
     *
     * @param graphics es el contexto en que pintar
     */
    public void paint(Graphics graphics) {

        super.paint(graphics);


        graphics.setColor(BLACK);
        //1->2
        graphics.drawLine(66, 380, 149, 327);
        graphics.drawLine(139, 326, 149, 327);
        graphics.drawLine(145, 336, 149, 327);
        graphics.drawString("2.5",108,342);

        //2->4
        graphics.drawLine(151, 328, 219, 257);
        graphics.drawLine(209, 258, 219, 257);
        graphics.drawLine(217, 268, 219, 257);
        graphics.drawString("8.2",168,292);

        //3->1
        graphics.drawLine(150, 477, 68, 395);
        graphics.drawLine(67, 404, 68, 395);
        graphics.drawLine(78, 396, 68, 395);
        graphics.drawString("20.5",88,448);

        //4->3
        graphics.drawLine(226, 265, 158, 470);
        graphics.drawLine(155, 460, 158, 470);
        graphics.drawLine(167, 463, 158, 470);
        graphics.drawString("20",196,370);

        //4->6
        graphics.drawLine(233, 257, 319, 205);
        graphics.drawLine(309, 204, 319, 204);
        graphics.drawLine(314, 216, 319, 204);
        graphics.drawString("16.2",268,220);

        //4->7
        graphics.drawLine(237, 257, 324, 305);
        graphics.drawLine(312, 306, 324, 305);
        graphics.drawLine(317, 294, 324, 305);
        graphics.drawString("16",268,291);

        //5->4
        graphics.drawLine(267, 75, 228, 250);
        graphics.drawLine(222, 240, 228, 250);
        graphics.drawLine(238, 240, 228, 250);
        graphics.drawString("22.5",221,170);

        //6->8
        graphics.drawLine(333, 205, 480, 155);
        graphics.drawLine(468, 152, 480, 155);
        graphics.drawLine(472, 166, 480, 155);
        graphics.drawString("7.8",390,179);

        //7->6
        graphics.drawLine(332, 300, 327, 215);
        graphics.drawLine(321, 225, 327, 215);
        graphics.drawLine(334, 225, 327, 215);
        graphics.drawString("6",332,260);


        //7->12
        graphics.drawLine(338, 305, 450, 345);
        graphics.drawLine(441, 347, 450, 345);
        graphics.drawLine(445, 338, 450, 345);
        graphics.drawString("9.5",392,324);

        //8->5
        graphics.drawLine(488, 150, 275, 66);
        graphics.drawLine(282, 76, 275, 66);
        graphics.drawLine(284, 62, 275, 66);
        graphics.drawString("14.6",342,92);

        //8->9
        graphics.drawLine(495, 155, 700, 205);
        graphics.drawLine(692, 197, 700, 205);
        graphics.drawLine(691, 209, 700, 205);
        graphics.drawString("25.5",598,178);

        //9->10
        graphics.drawLine(715, 208, 805, 320);
        graphics.drawLine(792, 316, 805, 320);
        graphics.drawLine(804, 309, 805, 320);
        graphics.drawString("15.5",757,260);

        //9->12
        graphics.drawLine(706, 215, 458, 340);
        graphics.drawLine(463, 330, 458, 340);
        graphics.drawLine(467, 342, 458, 340);
        graphics.drawString("18.1",614,250);

        //10->11
        graphics.drawLine(800, 325, 615, 325);
        graphics.drawLine(625, 332, 615, 325);
        graphics.drawLine(625, 320, 615, 325);
        graphics.drawString("4.6",720,322);

        //11->12
        graphics.drawLine(617, 325, 465, 345);
        graphics.drawLine(476, 350, 465, 345);
        graphics.drawLine(473, 336, 465, 345);
        graphics.drawString("4.6",548,331);

        //11->8
        graphics.drawLine(608, 320, 488, 165);
        graphics.drawLine(486, 175, 488, 165);
        graphics.drawLine(498, 168, 488, 165);
        graphics.drawString("12",527,247);

        //12->15
        graphics.drawLine(457, 355, 737, 530);
        graphics.drawLine(724, 528, 737, 530);
        graphics.drawString("25",580,430);

        //13->3
        graphics.drawLine(300, 506, 165, 477);
        graphics.drawLine(172, 487, 165, 477);
        graphics.drawLine(176, 472, 165, 477);
        graphics.drawString("23.3",246,492);

        //13->7
        graphics.drawLine(307, 500, 333, 315);
        graphics.drawLine(325, 322, 333, 315);
        graphics.drawLine(338, 324, 333, 315);
        graphics.drawString("17.2",328,370);

        //13->14
        graphics.drawLine(307, 515, 267, 600);
        graphics.drawLine(266, 587, 267, 600);
        graphics.drawLine(279, 593, 267, 600);
        graphics.drawString("28.6",298,545);

        //14->15
        graphics.drawLine(275, 607, 737, 545);
        graphics.drawLine(730, 554, 737, 545);
        graphics.drawLine(725, 540, 737, 545);
        graphics.drawString("51.6",392,603);

        //15->11
        graphics.drawLine(737, 530, 607, 335);
        graphics.drawLine(605, 346, 607, 335);
        graphics.drawLine(621, 340, 607, 335);
        graphics.drawString("25.7",672,430);

        //15->13
        graphics.drawLine(730, 537, 315, 506);
        graphics.drawLine(326, 514, 315, 506);
        graphics.drawLine(328, 500, 315, 506);
        graphics.drawString("19.6",392,510);

        /////////////////////////////////////////////////////////////////////////////////

        graphics.setFont(new Font("Century Gothic",Font.BOLD,12));
        graphics.setColor(Color.BLUE);

        //Button 1
        graphics.drawString("Santa Monica Pier",40,375);
        //Button 2
        graphics.drawString("Memorial Park",130,315);
        //Button 3
        graphics.drawString("International Aiport",130,495);
        //Button 4
        graphics.drawString("Gretty Center",200,245);
        //Button 5
        graphics.drawString("Los Amigos Bar & Grill",230,55);
        //Button 6
        graphics.drawString("Chinesse Theater",290,195);
        //Button 7
        graphics.drawString("Country Museum art",320,295);
        //Button 8
        graphics.drawString("Griffith observatory",475,145);
        //Button 9
        graphics.drawString("California Institute ",680,185);
        graphics.drawString("of Technology",680,195);
        //Button 10
        graphics.drawString("Waltmart",780,305);
        graphics.drawString("Super Center",780,315);
        //Button 11
        graphics.drawString("Angelus Rosedale Cemetery",595,315);
        //Button 12
        graphics.drawString("Gas Station Chevron",450,365);
        //Button 13
        graphics.drawString("In-N-out-Burger",295,495);
        //Button 14
        graphics.drawString("Palos Verdes ",260, 630);
        graphics.drawString("Nature Preserve",260,640);
        //Button 15
        graphics.drawString("Raining Cane's ",730,505);
        graphics.drawString("Chikens Finger",730,495);
    }
}


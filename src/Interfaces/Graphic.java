package Interfaces;

import javax.swing.*;
import java.awt.*;

/**
 * Instituto Tecnologico de Costa Rica
 * Area Ingenieria en Computadores
 *
 * Lenguaje: Java
 * Clase: Graphic
 * @version 1.0
 * @author Angelo Ceciliano, Byron Mata, Gustavo Alvarado y Sebastian Chaves
 *
 * Descripcion: Esta clase contiene el metodo paint que es utilizado en la clase PathInterface en donde cumple la funcion
 * de pintar en pantalla las aristas que conforman el grafo dirigido
 */
public class Graphic extends JPanel {

    /**
     * Metodo utilizado para pintar las figuras dadas en el JPanel asignado
     *
     * @param graphics es el contexto en que pintar
     */
    public void paint(Graphics graphics) {

        super.paint(graphics);

        graphics.setColor(Color.BLACK);

        //1->2
        graphics.drawLine(66, 380, 149, 327);
        graphics.drawLine(139, 326, 149, 327);
        graphics.drawLine(145, 336, 149, 327);

        //2->4
        graphics.drawLine(151, 328, 219, 257);
        graphics.drawLine(209, 258, 219, 257);
        graphics.drawLine(217, 268, 219, 257);

        //3->1
        graphics.drawLine(150, 477, 68, 395);
        graphics.drawLine(67, 404, 68, 395);
        graphics.drawLine(78, 396, 68, 395);

        //4->3
        graphics.drawLine(226, 265, 158, 470);
        graphics.drawLine(155, 460, 158, 470);
        graphics.drawLine(167, 463, 158, 470);

        //4->6
        graphics.drawLine(233, 257, 319, 205);
        graphics.drawLine(309, 204, 319, 204);
        graphics.drawLine(314, 216, 319, 204);

        //4->7
        graphics.drawLine(237, 257, 324, 305);
        graphics.drawLine(312, 306, 324, 305);
        graphics.drawLine(317, 294, 324, 305);

        //5->4
        graphics.drawLine(267, 75, 228, 250);
        graphics.drawLine(222, 240, 228, 250);
        graphics.drawLine(238, 240, 228, 250);

        //6->8
        graphics.drawLine(333, 205, 480, 155);
        graphics.drawLine(468, 152, 480, 155);
        graphics.drawLine(472, 166, 480, 155);

        //7->6
        graphics.drawLine(332, 300, 327, 215);
        graphics.drawLine(321, 225, 327, 215);
        graphics.drawLine(334, 225, 327, 215);

        //7->12
        graphics.drawLine(338, 305, 450, 345);
        graphics.drawLine(441, 347, 450, 345);
        graphics.drawLine(445, 338, 450, 345);

        //8->5
        graphics.drawLine(488, 150, 275, 66);
        graphics.drawLine(282, 76, 275, 66);
        graphics.drawLine(284, 62, 275, 66);

        //8->9
        graphics.drawLine(495, 155, 700, 205);
        graphics.drawLine(692, 197, 700, 205);
        graphics.drawLine(691, 209, 700, 205);

        //9->10
        graphics.drawLine(715, 208, 805, 320);
        graphics.drawLine(792, 316, 805, 320);
        graphics.drawLine(804, 309, 805, 320);

        //9->12
        graphics.drawLine(706, 215, 458, 340);
        graphics.drawLine(463, 330, 458, 340);
        graphics.drawLine(467, 342, 458, 340);

        //10->11
        graphics.drawLine(800, 325, 615, 325);
        graphics.drawLine(625, 332, 615, 325);
        graphics.drawLine(625, 320, 615, 325);

        //11->12
        graphics.drawLine(617, 325, 465, 345);
        graphics.drawLine(476, 350, 465, 345);
        graphics.drawLine(473, 336, 465, 345);

        //11->8
        graphics.drawLine(608, 320, 488, 165);
        graphics.drawLine(486, 175, 488, 165);
        graphics.drawLine(498, 168, 488, 165);

        //12->15
        graphics.drawLine(457, 355, 737, 530);
        graphics.drawLine(724, 528, 737, 530);

        //13->3
        graphics.drawLine(300, 506, 165, 477);
        graphics.drawLine(172, 487, 165, 477);
        graphics.drawLine(176, 472, 165, 477);

        //13->7
        graphics.drawLine(307, 500, 333, 315);
        graphics.drawLine(325, 322, 333, 315);
        graphics.drawLine(338, 324, 333, 315);

        //13->14
        graphics.drawLine(307, 515, 267, 600);
        graphics.drawLine(266, 587, 267, 600);
        graphics.drawLine(279, 593, 267, 600);

        //14->15
        graphics.drawLine(275, 607, 737, 545);
        graphics.drawLine(730, 554, 737, 545);
        graphics.drawLine(725, 540, 737, 545);

        //15->11
        graphics.drawLine(737, 530, 607, 335);
        graphics.drawLine(605, 346, 607, 335);
        graphics.drawLine(621, 340, 607, 335);

        //15->13
        graphics.drawLine(730, 537, 315, 506);
        graphics.drawLine(326, 514, 315, 506);
        graphics.drawLine(328, 500, 315, 506);

    }
}
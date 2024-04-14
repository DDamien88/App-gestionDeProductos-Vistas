/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

/**
 *
 * @author Damián
 */
public class EscritorioPersonalizado extends JDesktopPane {

    private BufferedImage img;

    public EscritorioPersonalizado() {
        try {
            img = ImageIO.read(getClass().getResourceAsStream("/img/fondo.jpg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img, 0, 0, 700, 500, null);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GambarLingkaran;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author labkom
 */
public class Praktikum4 extends JFrame{
    int xc=0, yc=0;
    public Praktikum4(){
    super("MEMBUAT LINGKARAN");
        setSize(600, 600);
        xc=getWidth()/2;
        yc=getHeight()/2;
        setLocationRelativeTo(null);
        setVisible(true);
    
    }
    public void lingkaranP1 (Graphics g){
    int r=200, x=0, y=0; //deklarasi variable
    g.setColor(Color.red);
    for (int i=0; i<=1000; i++){
        x=(int)((Math.cos((int) i)*r)+xc);
        y=(int)((Math.sin((int) i)*r)+yc);
        g.drawLine(x, y, x, y);
    }
    }
    public void paint(Graphics g){
        lingkaranP1(g);
    }
     public static void main(String[] args) {
// TODO code application logic here
        Praktikum4 gambar = new Praktikum4();
        gambar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}

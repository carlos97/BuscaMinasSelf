/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuscaMinas;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author usuario
 */
public class mainJPanel extends JPanel {
    NoJbutton[][] b;
    int tamX=10;
    int tamY=10;
    Random ran;
    
    public  mainJPanel(){
        b = new NoJbutton[tamX][tamY];
        ran = new Random(System.currentTimeMillis());
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        for(int i=0;i<tamX;i++){
            for(int j=0;j<tamY;j++){
                b[i][j] = new NoJbutton();
                MainEvents ev = new MainEvents(b[i][j],b);
                b[i][j].setText("x");
                b[i][j].setIndexX(i);
                b[i][j].setIndexY(j);
                if(ran.nextInt(100)>70){
                    b[i][j].setHaveMine(true);
                }else{
                    b[i][j].setHaveMine(false);
                }
                gbc.gridx = i;
                gbc.gridx = j;
                add(b[i][j],gbc);
            }
        }
    }
    
}

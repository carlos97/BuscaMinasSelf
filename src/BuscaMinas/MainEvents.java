/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuscaMinas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author usuario
 */
public class MainEvents {

    public MainEvents(NoJbutton btn, NoJbutton[][] nbtn) {
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    
                }else if(e.getButton() == MouseEvent.BUTTON1){
                    if(btn.isHaveMine()==true){
                        btn.setHitMine(true);
                        btn.endGame(nbtn);
                    }
                }
            }
        });

    }

}

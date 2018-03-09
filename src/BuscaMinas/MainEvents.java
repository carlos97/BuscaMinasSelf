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

                } else if (e.getButton() == MouseEvent.BUTTON1) {
                    if (btn.isHaveMine() == true) {
                        btn.setHitMine(true);
                        btn.endGame(nbtn);
                    } else {
                        btn.setText(String.valueOf(cuentaMinas(btn, nbtn)));
                    }
                }
            }
        });

    }

    public int cuentaMinas(NoJbutton btn, NoJbutton[][] nbtn) {
        int startX = 0;
        int startY = 0;
        int endX = 0;
        int endY = 0;
        int count = 0;
        if (btn.getIndexX() != 0) {
            startX = btn.getIndexX()-1;
        }

        if (btn.getIndexY() != 0) {
            startY = btn.getIndexY()-1;
        }

        if (btn.getIndexX() != 0) {
            if (startX + 3 < nbtn.length) {
                endX = startX + 3;
            } else {
                endX = startX + (nbtn.length - startX);
            }
        } else {
            endX = 2;
        }

        if (btn.getIndexY() != 0) {
            if (startY + 3 < nbtn[0].length) {
                endY = startY + 3;
            } else {
                endY = startY + (nbtn.length - startY);
            }
        }else{
            endY=2;
        }
        for (int i = startX; i < endX; i++) {
            for (int j = startY; j < endY; j++) {
                if (nbtn[i][j].isHaveMine()) {
                    count++;
                }
            }
        }

        return count;
    }

}

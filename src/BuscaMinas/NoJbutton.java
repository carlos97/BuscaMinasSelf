/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuscaMinas;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author usuario
 */
public class NoJbutton extends JButton{
    private int indexY;
    private int indexX;
    private boolean haveMine=false;
    private boolean safeCheck=false;
    private boolean hitMine = false;
    Color color = Color.gray;
    
    public NoJbutton(){
    }

    public int getIndexY() {
        return indexY;
    }

    public void setIndexY(int indexY) {
        this.indexY = indexY;
    }

    public int getIndexX() {
        return indexX;
    }

    public void setIndexX(int indexX) {
        this.indexX = indexX;
    }
    
    public boolean isHaveMine() {
        return haveMine;
    }
    
    public void setHaveMine(boolean haveMine) {
        if(haveMine==true)
            color = Color.RED;
            
        this.haveMine = haveMine;
    }

    public boolean isSafeCheck() {
        return safeCheck;
    }

    public void setSafeCheck(boolean safeCheck) {
        this.safeCheck = safeCheck;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        
    }
    
    public boolean getHitMine() {
        return hitMine;
    }
    
    public boolean setHitMine(boolean hitMine) {
        this.hitMine = hitMine;
        if(hitMine==true){
            return true;
        }else{
            return true;
        }
    }
    
    
    public void endGame(NoJbutton[][] btn){
        for(int i=0;i<btn.length;i++){
            for(int j=0;j<btn[0].length;j++){
                if(btn[i][j].haveMine==true)
                    btn[i][j].setForeground(Color.RED);
                else
                    btn[i][j].setForeground(Color.GRAY);
            }
        }
    }

}

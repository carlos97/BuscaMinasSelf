/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuscaMinas;

import javax.swing.JFrame;

/**
 *
 * @author usuario
 */
public class MainJframe extends JFrame {

   private mainJPanel panel;
   
   public MainJframe(){
       panel = new mainJPanel();
       add(panel);
       setSize(500,500);
       setResizable(true);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
}

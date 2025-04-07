/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class SideMenuUtil {
    
    
    
    
//    public void styleButton(JButton button, Color bgColor, Color fontColor) {
//    button.setBackground(bgColor);
//    button.setForeground(fontColor);
//    
//    
//    styleButton(btnVendas, new Color(73, 158, 242), Color.WHITE);
//        styleButton(btnClientes, new Color(169, 200, 231), Color.BLACK);
//        styleButton(btnProdutos, new Color(169, 200, 231), Color.BLACK);
//    
//    }
    
    public void enablePanel(JPanel panel1, JPanel panel2, JPanel panel3){
        
        panel1.setVisible(true);
        panel3.setVisible(false);
        panel2.setVisible(false);
        
    }
    
    
     public void styleButton2(JButton button1, JButton button2, JButton button3) {
         
    button1.setBackground(new Color(73, 158, 242));
    button1.setForeground(Color.WHITE);
    
    button2.setBackground(new Color(169, 200, 231));
    button2.setForeground(Color.BLACK);
    
    button3.setBackground(new Color(169, 200, 231));
    button3.setForeground(Color.BLACK);
    
        
    
    }
     
}

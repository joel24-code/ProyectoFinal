/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Limpiar;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author joel_
 */
public class limpiar_txt {
    public void limpiar_txt(JPanel panel){
        for(int i=0; panel.getComponents().length>i; i++){
            if(panel.getComponent()[i] instanceof JTextField){
                ((JTextField)panel.getComponent()[i]).setText("");
            }
            else if(panel.getComponent()[i] instaneof JPasswordField){
            ((JPasswordField)panel.getComponent()[i]).setText("");
        }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author DELL
 */
public class Driver_imp {
    public static void imprimer(JTable jt,String titre){
        MessageFormat entete =new MessageFormat(titre);
        MessageFormat pied =new MessageFormat("Page(0,number,integer)");
        try {
            jt.print(JTable.PrintMode.FIT_WIDTH,entete,pied);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "erreur -->"+e,"impression",JOptionPane.ERROR_MESSAGE);
        }
        
    }
}

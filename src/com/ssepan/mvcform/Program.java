/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ssepan.mvcform;
//TODO:move this into Utility.Log--SJS
import java.awt.EventQueue;
import java.util.logging.Level;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.ssepan.utility.*;
/** 
 *
 * @author ssepan
 */
public class Program
{

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args)
//    {
//        // TODO code application logic here
//    }
    /**
     * main() is entry point, and calls MainView ctor() as part of running view.
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
        */
       try
       {
           for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
           {
               if ("Windows".equals(info.getName()))
               {
                   UIManager.setLookAndFeel(info.getClassName());
                   break;
               }
           }
       }
       catch (ClassNotFoundException |                   
              InstantiationException |                   
              IllegalAccessException |                   
              UnsupportedLookAndFeelException ex)
       {
           Log.write(ex, Level.SEVERE);
       }
        //</editor-fold>

        // <editor-fold defaultstate="collapsed" desc="main view">
        /* Create and display the form */
        EventQueue.invokeLater(
            new Runnable()
            {
                @Override
                public void run()
                {
                    new MainView().setVisible(true);
                }
            }
        );

        // </editor-fold>
    }
    
}

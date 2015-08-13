/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investtransport;

import javax.swing.JFrame;

/**
 *
 * @author Syllia && Julio 
 */
public class InvestTransport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InterfaceUtilisateur.PrincipalUI mainWindow = new InterfaceUtilisateur.PrincipalUI();
        mainWindow.setExtendedState(mainWindow.getExtendedState()| JFrame.MAXIMIZED_BOTH);
        mainWindow.setVisible(true);
    }
    
}

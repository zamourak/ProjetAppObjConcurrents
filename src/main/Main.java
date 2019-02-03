package main;

import java.util.HashMap;

import IHM.JFApplication;
import core.*;
import gestionfichier.*;

public class Main {

	/*public static void main(String[] args) {
		
		System.out.print("commencement");
		Entreprise entreprise = new Entreprise();
		FichierCSV fElement = new FichierCSVElement();
		FichierCSV fcp = new FichierCSVChaineDeProduction();
		fElement.Charger();
		fcp.Charger();
		/*for (Element e : Entreprise.enteprise.getListeElement()) {
			System.out.println(e);
		}
		for (ChaineProduction cp : Entreprise.enteprise.getListeChaineProduction()) {
			System.out.println(cp);
		}*/
		/*
		System.out.println("------------------ TEST avant \n\n" +Entreprise.enteprise.getListeChaineProduction().get(1));
		
		Entreprise.enteprise.getListeChaineProduction().get(0).attribuerNiveauActivite(1);
		Entreprise.enteprise.getListeChaineProduction().get(1).attribuerNiveauActivite(1);
		System.out.print("démarrage prévision");
		Entreprise.enteprise.Prevision();
		
		System.out.println("------------------ TEST après\n\n" +Entreprise.enteprise.getListeChaineProduction().get(1));
		*/

	
	/**
     * Initialise l'entreprise et charge les données des fichiers CSV
     */
    private static void initialiserAPP() {
    	Entreprise entreprise = new Entreprise();
		FichierCSV fElement = new FichierCSVElement();
		FichierCSV fcp = new FichierCSVChaineDeProduction();
		fElement.Charger();
		fcp.Charger();
    }
	
	public static void main(String args[]) {
		initialiserAPP();
		
		
		
		
		
		
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFApplication().setVisible(true);
            }
        });
    }

}

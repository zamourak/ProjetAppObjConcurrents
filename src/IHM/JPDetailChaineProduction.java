/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import core.ChaineProduction;
import core.Element;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FlorianDELSOL
 */
public class JPDetailChaineProduction extends javax.swing.JPanel {
    private ChaineProduction chaineProduction;
    private DefaultTableModel d1 = new DefaultTableModel();
    private DefaultTableModel d2 = new DefaultTableModel();
    /**
     * Creates new form JStockageGeneral
     */
    public JPDetailChaineProduction(ChaineProduction chaineProduction) {
        this.chaineProduction=chaineProduction;
        initComponents();
        this.d1 = (DefaultTableModel) this.tableau_Element_entree.getModel();
        this.d2 = (DefaultTableModel) this.tableau_Element_sortie.getModel();
        this.finInitialisation();
    }
    private void finInitialisation(){
        this.code_Chaine_Label.setText(this.chaineProduction.getCodeChaineProduction());
        this.nom_Chaine_Label.setText(this.chaineProduction.getNom());
        this.temps_Chaine_Label.setText(""+this.chaineProduction.getTemps()+" minutes");
        this.lvlActivite_Spinner.setValue(this.chaineProduction.getNiveauActivitee());
        this.remplirTable();
    }
    
    private void remplirTable(){
        HashMap<Element, Double> dictionnaireEntree = this.chaineProduction.getEntree();
        HashMap<Element, Double> dictionnaireSortie = this.chaineProduction.getSortie();
        Object[] obj;
        for (Element e : dictionnaireEntree.keySet()){
            obj = new Object[]{
                e.getCodeElement(),
                e.getNom(),
                dictionnaireEntree.get(e),
                e.getStock().getStock(),
                e.getStock().getUnitee()
            };
            this.d1.addRow(obj);
        }
        for (Element e : dictionnaireSortie.keySet()){
            obj = new Object[]{
                e.getCodeElement(),
                e.getNom(),
                dictionnaireEntree.get(e),
                e.getStock().getStock(),
                e.getStock().getUnitee()
            };
            this.d2.addRow(obj);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titre = new javax.swing.JLabel();
        code = new javax.swing.JLabel();
        code_Chaine_Label = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        nom_Chaine_Label = new javax.swing.JLabel();
        temps = new javax.swing.JLabel();
        temps_Chaine_Label = new javax.swing.JLabel();
        lvlActivite = new javax.swing.JLabel();
        lvlActivite_Spinner = new javax.swing.JSpinner();
        titre_elem_entree = new javax.swing.JLabel();
        scroll_Tableau_Elem_entree = new javax.swing.JScrollPane();
        tableau_Element_entree = new javax.swing.JTable();
        titre_elem_sortie = new javax.swing.JLabel();
        scroll_Tableau_Elem_sortie = new javax.swing.JScrollPane();
        tableau_Element_sortie = new javax.swing.JTable();

        titre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titre.setText("Détail de la chaine de production");

        code.setText("Code : ");

        code_Chaine_Label.setText("code_de_la_chaine_de_production");

        nom.setText("Nom : ");

        nom_Chaine_Label.setText("nom_de_la_chaine_de_production");

        temps.setText("Temps : ");

        temps_Chaine_Label.setText("Temps_pour_une_production");

        lvlActivite.setText("niveau d'activité : ");

        lvlActivite_Spinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                lvlActivite_SpinnerStateChanged(evt);
            }
        });

        titre_elem_entree.setText("Elements en entrée");

        tableau_Element_entree.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Nom", "Quantité necessaire", "Quantité disponible", "Unité"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scroll_Tableau_Elem_entree.setViewportView(tableau_Element_entree);

        titre_elem_sortie.setText("Elements en sortie");

        tableau_Element_sortie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Nom", "Quantité necessaire", "Quantité disponible", "Unité"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scroll_Tableau_Elem_sortie.setViewportView(tableau_Element_sortie);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lvlActivite)
                                .addGap(18, 18, 18)
                                .addComponent(lvlActivite_Spinner)
                                .addGap(23, 23, 23))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nom_Chaine_Label))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(code)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(code_Chaine_Label)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titre_elem_sortie)
                            .addComponent(titre_elem_entree)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(temps)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(temps_Chaine_Label))
                            .addComponent(scroll_Tableau_Elem_entree, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                            .addComponent(scroll_Tableau_Elem_sortie))
                        .addGap(0, 38, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(code)
                    .addComponent(code_Chaine_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom)
                    .addComponent(nom_Chaine_Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temps)
                    .addComponent(temps_Chaine_Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lvlActivite)
                    .addComponent(lvlActivite_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(titre_elem_entree)
                .addGap(18, 18, 18)
                .addComponent(scroll_Tableau_Elem_entree, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(titre_elem_sortie)
                .addGap(18, 18, 18)
                .addComponent(scroll_Tableau_Elem_sortie, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lvlActivite_SpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_lvlActivite_SpinnerStateChanged
        this.chaineProduction.attribuerNiveauActivite((int) this.lvlActivite_Spinner.getValue());
        System.out.println(this.chaineProduction.getNiveauActivitee());
    }//GEN-LAST:event_lvlActivite_SpinnerStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel code;
    private javax.swing.JLabel code_Chaine_Label;
    private javax.swing.JLabel lvlActivite;
    private javax.swing.JSpinner lvlActivite_Spinner;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel nom_Chaine_Label;
    private javax.swing.JScrollPane scroll_Tableau_Elem_entree;
    private javax.swing.JScrollPane scroll_Tableau_Elem_sortie;
    private javax.swing.JTable tableau_Element_entree;
    private javax.swing.JTable tableau_Element_sortie;
    private javax.swing.JLabel temps;
    private javax.swing.JLabel temps_Chaine_Label;
    private javax.swing.JLabel titre;
    private javax.swing.JLabel titre_elem_entree;
    private javax.swing.JLabel titre_elem_sortie;
    // End of variables declaration//GEN-END:variables
}

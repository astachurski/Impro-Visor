/**
 * This Java Class is part of the Impro-Visor Application.
 *
 * Copyright (C) 2017 Robert Keller and Harvey Mudd College.
 *
 * Impro-Visor is free software; you can redistribute it and/or modifyc it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * Impro-Visor is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of merchantability or fitness
 * for a particular purpose. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Impro-Visor; if not, write to the Free Software Foundation, Inc., 51 Franklin
 * St, Fifth Floor, Boston, MA 02110-1301 USA
 */

package imp.gui;
import imp.trading.ActiveTradingDialog;

/**
 *
 * @author Samantha Long
 */

public class TransformMenuDialog extends javax.swing.JDialog {

     Notate notate;
     ActiveTradingDialog activeTradingDialog;
     javax.swing.DefaultListModel transformListModel = new javax.swing.DefaultListModel();
     String DEFAULT_TRANSFORM = "BillEvans";
     String transform;
    /**
     * Creates new form TransformMenuDialog
     */
    public TransformMenuDialog(Notate notate, ActiveTradingDialog activeTradingDialog, boolean modal) {
        super(notate, modal);
        initComponents();
        this.setTitle("Transform Menu");
        this.notate = notate;
        this.activeTradingDialog = activeTradingDialog;
        transform = DEFAULT_TRANSFORM;
    }

    public javax.swing.JList getTransformList()
    {
        return transformJlist;
    }
    
    public javax.swing.DefaultListModel getTransformListModel()
    {
        return transformListModel;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        transformListScrollPane = new javax.swing.JScrollPane();
        transformJlist = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        transformListScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        transformListScrollPane.setAutoscrolls(true);
        transformListScrollPane.setDoubleBuffered(true);
        transformListScrollPane.setHorizontalScrollBar(null);
        transformListScrollPane.setMinimumSize(new java.awt.Dimension(300, 100));
        transformListScrollPane.setName("Transform Menu"); // NOI18N
        transformListScrollPane.setPreferredSize(new java.awt.Dimension(300, 600));

        transformJlist.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        transformJlist.setModel(transformListModel);
        transformJlist.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        transformJlist.setToolTipText("");
        transformJlist.setBounds(new java.awt.Rectangle(0, 0, 300, 600));
        transformJlist.setName(""); // NOI18N
        transformJlist.setVisibleRowCount(200);
        transformJlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transformJlistMouseClicked(evt);
            }
        });
        transformListScrollPane.setViewportView(transformJlist);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(transformListScrollPane, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transformJlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transformJlistMouseClicked
       int index = transformJlist.getSelectedIndex();
       transform = (String) transformListModel.getElementAt(index);
       notate.updateMusicianNotate(transform);
    }//GEN-LAST:event_transformJlistMouseClicked
   
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //transformListModel.clear();
    }//GEN-LAST:event_formWindowClosed

    public String getMusicianName()
    {
        return transform;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> transformJlist;
    private javax.swing.JScrollPane transformListScrollPane;
    // End of variables declaration//GEN-END:variables
}

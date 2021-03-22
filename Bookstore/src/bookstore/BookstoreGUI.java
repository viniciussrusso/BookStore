/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author vinicius
 */
public class BookstoreGUI extends javax.swing.JFrame {
    // Variables
    private final String filePath;
    
    // Array of Objects
    String arr[];

    
    /**
     * Creates new form BookstoreGUI
     */
    public BookstoreGUI() {
        initComponents();
        arr = new String[0];
        this.filePath = "list.data";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        appTitle = new javax.swing.JLabel();
        authorTxtField = new javax.swing.JTextField();
        authorLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        titleTxtField = new javax.swing.JTextField();
        costLbl = new javax.swing.JLabel();
        costTxtField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        displayButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        ebookPanel = new javax.swing.JPanel();
        fileFormatLbl = new javax.swing.JLabel();
        eBookTitle = new javax.swing.JLabel();
        hintLbl1 = new javax.swing.JLabel();
        fileFormatTxtField = new javax.swing.JTextField();
        audioPanel = new javax.swing.JPanel();
        narratorLbl = new javax.swing.JLabel();
        narratorTxtField = new javax.swing.JTextField();
        audioTitle = new javax.swing.JLabel();
        hintLbl2 = new javax.swing.JLabel();
        loadButton = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        appTitle.setFont(new java.awt.Font("Apple Braille", 1, 18)); // NOI18N
        appTitle.setText("Bookstore Application ");

        authorTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorTxtFieldActionPerformed(evt);
            }
        });

        authorLbl.setText("Author:");

        titleLbl.setText("Title:");

        titleTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTxtFieldActionPerformed(evt);
            }
        });

        costLbl.setText("Cost:");

        costTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costTxtFieldActionPerformed(evt);
            }
        });

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        displayButton.setText("DISPLAY");
        displayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        saveButton.setText("SAVE INTO FILE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        ebookPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        fileFormatLbl.setText("File Format: ");

        eBookTitle.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        eBookTitle.setText("For e-Books");

        hintLbl1.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        hintLbl1.setText("Select \"N/A\" if not applicable.");

        javax.swing.GroupLayout ebookPanelLayout = new javax.swing.GroupLayout(ebookPanel);
        ebookPanel.setLayout(ebookPanelLayout);
        ebookPanelLayout.setHorizontalGroup(
            ebookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ebookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ebookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ebookPanelLayout.createSequentialGroup()
                        .addComponent(fileFormatLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fileFormatTxtField))
                    .addGroup(ebookPanelLayout.createSequentialGroup()
                        .addGroup(ebookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eBookTitle)
                            .addComponent(hintLbl1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ebookPanelLayout.setVerticalGroup(
            ebookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ebookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eBookTitle)
                .addGap(18, 18, 18)
                .addGroup(ebookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileFormatLbl)
                    .addComponent(fileFormatTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hintLbl1)
                .addContainerGap())
        );

        audioPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        narratorLbl.setText("Narrator:");

        narratorTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                narratorTxtFieldActionPerformed(evt);
            }
        });

        audioTitle.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        audioTitle.setText("For Audio Books");

        hintLbl2.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        hintLbl2.setText("Type N/A if not applicable.");

        javax.swing.GroupLayout audioPanelLayout = new javax.swing.GroupLayout(audioPanel);
        audioPanel.setLayout(audioPanelLayout);
        audioPanelLayout.setHorizontalGroup(
            audioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(audioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(audioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(audioPanelLayout.createSequentialGroup()
                        .addComponent(narratorLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(narratorTxtField))
                    .addGroup(audioPanelLayout.createSequentialGroup()
                        .addGroup(audioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(audioTitle)
                            .addComponent(hintLbl2))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );
        audioPanelLayout.setVerticalGroup(
            audioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(audioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(audioTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(audioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(narratorLbl)
                    .addComponent(narratorTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(hintLbl2)
                .addContainerGap())
        );

        loadButton.setText("LOAD");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(ebookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(audioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(appTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(authorLbl)
                                .addComponent(titleLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(costLbl)
                                .addGap(15, 15, 15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                            .addComponent(authorTxtField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(costTxtField))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(appTitle)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLbl)
                    .addComponent(titleTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costLbl)
                    .addComponent(costTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ebookPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(audioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(displayButton)
                    .addComponent(deleteButton)
                    .addComponent(saveButton)
                    .addComponent(loadButton))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void authorTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorTxtFieldActionPerformed

    private void titleTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTxtFieldActionPerformed

    private void costTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costTxtFieldActionPerformed

    private void narratorTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_narratorTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_narratorTxtFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        // Taking input from GUI 
        
        Bookstore bs = new Bookstore();

        bs.setAuthor(authorTxtField.getText()); 
        bs.setTitle(titleTxtField.getText()); 
        bs.setCost(costTxtField.getText());
        bs.setFileFormat(fileFormatTxtField.getText());
        bs.setNarrator(narratorTxtField.getText());
        
        // Second arr was created to make possible to append more elements. It will copy old array inside new array and resize it as necessary.
        
        String[] arr2 = new String[arr.length + 1];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        arr2[arr.length] = ("Author: "+ authorTxtField.getText() + ". Title: " + titleTxtField.getText()+ ". Cost: " + 
                costTxtField.getText() + ". File Format: "+ fileFormatTxtField.getText() + ". Narrator: " + narratorTxtField.getText()+ "\n");
        
        arr = arr2;

        /***************************************************************************************
        *    Title: Grepper
        *    Author: Rapha149
        *    Date: 20 June 2020
        *    Availability:https://www.codegrepper.com/code-examples/java/how+to+append+to+an+array+in+java
        *
        ***************************************************************************************/
         
        // To clear Text field once button is pressed.
        authorTxtField.setText("");
        titleTxtField.setText("");
        costTxtField.setText("");
        fileFormatTxtField.setText("");
        narratorTxtField.setText("");
        
        JOptionPane.showMessageDialog(null,"Book added successfully!" );

    }//GEN-LAST:event_addButtonActionPerformed

    private void displayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayButtonActionPerformed

        // To display elements added into Array
        
        // Converts Array into ArrayList 
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(arr));
        
        
        
        if (arrayList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No itens have been added yet");
            return;
        }
       
        JOptionPane.showMessageDialog(null, Arrays.toString(arr));

        /***************************************************************************************
        *    Title: ProgramCreek
        *    Author: Unknown
        *    Date: Not available 
        *    Availability:https://www.programcreek.com/2013/09/top-10-methods-for-java-arrays/
        *
        ***************************************************************************************/
        
    }//GEN-LAST:event_displayButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        int index = arr.length - 1;
                
        // Converts Array into ArrayList 
        
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(arr));
        
        // Removes last element from ArrayList
        
        arrayList.remove(index);
        arr = arrayList.toArray(new String[0]);
        
        JOptionPane.showMessageDialog(null, "Last book removed successfully!"); 
        
        
        /***************************************************************************************
        *    Title: ProgramCreek
        *    Author: Unknown
        *    Date: Not available 
        *    Availability:https://www.programcreek.com/2013/09/top-10-methods-for-java-arrays/
        *
        ***************************************************************************************/
        
        
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
     
        // Saving data into file 
        
        FileOutputStream fStream;
        ObjectOutputStream oStream;

        try {;
            fStream = new FileOutputStream(filePath);
            oStream = new ObjectOutputStream(fStream);
            oStream.writeObject(arr);
            oStream.close();

        } catch (Exception except) {
            JOptionPane.showMessageDialog(this, "Error!");
        }

        JOptionPane.showMessageDialog(null, "Saved into file");
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed

        // Loading data stored in file to be displayed in application 
        
        FileInputStream fileStream;
        ObjectInputStream objStream;

        try {
            fileStream = new FileInputStream(filePath);
            objStream = new ObjectInputStream(fileStream);
            
            Bookstore bookstore = new Bookstore();
            arr =  (String[]) objStream.readObject();
            
            JOptionPane.showMessageDialog(null, "File loaded!");

            objStream.close();

        } 
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(this, "File not found!");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error!");
        }
    }//GEN-LAST:event_loadButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(BookstoreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookstoreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookstoreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookstoreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookstoreGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel appTitle;
    private javax.swing.JPanel audioPanel;
    private javax.swing.JLabel audioTitle;
    private javax.swing.JLabel authorLbl;
    private javax.swing.JTextField authorTxtField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JLabel costLbl;
    private javax.swing.JTextField costTxtField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton displayButton;
    private javax.swing.JLabel eBookTitle;
    private javax.swing.JPanel ebookPanel;
    private javax.swing.JLabel fileFormatLbl;
    private javax.swing.JTextField fileFormatTxtField;
    private javax.swing.JLabel hintLbl1;
    private javax.swing.JLabel hintLbl2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton loadButton;
    private javax.swing.JLabel narratorLbl;
    private javax.swing.JTextField narratorTxtField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JTextField titleTxtField;
    // End of variables declaration//GEN-END:variables
}

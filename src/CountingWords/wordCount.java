/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CountingWords;

/**
 *
 * @author PFA Young Lee
 */
public class wordCount extends javax.swing.JFrame {

    /**
     * Creates new form wordCount
     */
    public wordCount() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wordCountPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        typeYourWordsLabel = new javax.swing.JLabel();
        totalWordsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        wordTextArea = new javax.swing.JTextArea();
        totalWordTxtField = new javax.swing.JTextField();
        countYourWordButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        wordCountPanel.setBackground(new java.awt.Color(255, 204, 51));

        titleLabel.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        titleLabel.setText("Word Count Tool");

        typeYourWordsLabel.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        typeYourWordsLabel.setText("Type your words");

        totalWordsLabel.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        totalWordsLabel.setText("Total words");

        wordTextArea.setColumns(20);
        wordTextArea.setRows(5);
        jScrollPane1.setViewportView(wordTextArea);

        countYourWordButton.setBackground(new java.awt.Color(102, 51, 255));
        countYourWordButton.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        countYourWordButton.setForeground(new java.awt.Color(240, 240, 240));
        countYourWordButton.setText("Count your words");
        countYourWordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countYourWordButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(204, 51, 255));
        clearButton.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 51, 51));
        exitButton.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout wordCountPanelLayout = new javax.swing.GroupLayout(wordCountPanel);
        wordCountPanel.setLayout(wordCountPanelLayout);
        wordCountPanelLayout.setHorizontalGroup(
            wordCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wordCountPanelLayout.createSequentialGroup()
                .addGroup(wordCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(wordCountPanelLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(wordCountPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(wordCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(typeYourWordsLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalWordsLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(wordCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(countYourWordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(wordCountPanelLayout.createSequentialGroup()
                                .addGroup(wordCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalWordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)))))
                .addContainerGap())
        );
        wordCountPanelLayout.setVerticalGroup(
            wordCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wordCountPanelLayout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(wordCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeYourWordsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(countYourWordButton, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(wordCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalWordsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalWordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(wordCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wordCountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wordCountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        totalWordTxtField.setText("");
        wordTextArea.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void countYourWordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countYourWordButtonActionPerformed
        
        String sentence = wordTextArea.getText();
        int i = 0, words = 1;
        
        for(i=0;i<sentence.length();i++){
        
        if(sentence.charAt(i)==' ')
            words++;
    }
        totalWordTxtField.setText(" "+words);
    }//GEN-LAST:event_countYourWordButtonActionPerformed

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
            java.util.logging.Logger.getLogger(wordCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wordCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wordCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wordCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wordCount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JButton countYourWordButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField totalWordTxtField;
    private javax.swing.JLabel totalWordsLabel;
    private javax.swing.JLabel typeYourWordsLabel;
    private javax.swing.JPanel wordCountPanel;
    private javax.swing.JTextArea wordTextArea;
    // End of variables declaration//GEN-END:variables
}

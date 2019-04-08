
package muhich_indivproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex Jerard Muhich
 */
public class MainFrame extends javax.swing.JFrame {
    private final SQLiteJDBC database;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        database = new SQLiteJDBC();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        isbnLabel0 = new javax.swing.JLabel();
        titleLabel0 = new javax.swing.JLabel();
        authorLabel0 = new javax.swing.JLabel();
        volumeLabel0 = new javax.swing.JLabel();
        ownLabel0 = new javax.swing.JLabel();
        etVolume0 = new javax.swing.JTextField();
        etOwn0 = new javax.swing.JTextField();
        etAuthor0 = new javax.swing.JTextField();
        etTitle0 = new javax.swing.JTextField();
        etISBN0 = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Manga Collection");
        setResizable(false);

        isbnLabel0.setText("ISBN:");

        titleLabel0.setText("Title:");

        authorLabel0.setText("Author:");

        volumeLabel0.setText("Volume:");

        ownLabel0.setText("Own?:");

        etISBN0.setToolTipText("");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(volumeLabel0)
                                    .addComponent(ownLabel0))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etVolume0, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etOwn0, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(authorLabel0)
                                    .addComponent(titleLabel0)
                                    .addComponent(isbnLabel0))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(etISBN0, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etTitle0, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etAuthor0, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbnLabel0)
                    .addComponent(etISBN0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel0)
                    .addComponent(etTitle0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorLabel0)
                    .addComponent(etAuthor0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volumeLabel0)
                    .addComponent(etVolume0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ownLabel0)
                    .addComponent(etOwn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnAdd))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        //search for all is invoked by hitting search with all search fields empty
        if(etISBN0.getText().isEmpty() &&
           etAuthor0.getText().isEmpty() &&
           etTitle0.getText().isEmpty() &&
           etOwn0.getText().isEmpty() &&
           etVolume0.getText().isEmpty()){
            /*
            do a selectAll and convert to string array to display if multiple entries found
            if the database has only one item for some reason, i want it displayed
            in the indivmangaframe
            */
            ArrayList<Manga> mangaList = database.selectAll();
            if(mangaList.size() > 1){
                String[] stringList = new String[mangaList.size()];
                for(int i = 0; i < mangaList.size(); i++){
                    stringList[i] = mangaList.get(i).toString();
                }
                new ListMangaFrame(stringList).setVisible(true);
            }
            else new IndivMangaFrame(mangaList.get(0)).setVisible(true);
        }else{ //user wants to search on some criteria
            ArrayList<Manga> mangaList = database.selectWhere(
                etISBN0.getText(),
                etTitle0.getText(),
                etAuthor0.getText(),
                etVolume0.getText(),
                etOwn0.getText());
            if(mangaList.size() > 1){
                String[] stringList = new String[mangaList.size()];
                for(int i = 0; i < mangaList.size(); i++){
                    stringList[i] = mangaList.get(i).toString();
                }
                new ListMangaFrame(stringList).setVisible(true);
            }else if(mangaList.size() == 1){
                new IndivMangaFrame(mangaList.get(0)).setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Nothing with those criteria was found in the database");
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //check if any of the fields are empty
        if(etISBN0.getText().isEmpty() ||
            etAuthor0.getText().isEmpty() ||
            etTitle0.getText().isEmpty() ||
            etOwn0.getText().isEmpty() ||
            etVolume0.getText().isEmpty()){
            //alert user that empty fields are not allowed
            JOptionPane.showMessageDialog(null, "Please don't leave any fields blank");
        }else{
            //add the info to the database
            database.insert(new Manga(etISBN0.getText(), etTitle0.getText(), etAuthor0.getText(),
                    etOwn0.getText(), etVolume0.getText()));
        }
    }//GEN-LAST:event_btnAddActionPerformed

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
        } catch (ClassNotFoundException |
                 InstantiationException |
                 IllegalAccessException |
                 javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorLabel0;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField etAuthor0;
    private javax.swing.JTextField etISBN0;
    private javax.swing.JTextField etOwn0;
    private javax.swing.JTextField etTitle0;
    private javax.swing.JTextField etVolume0;
    private javax.swing.JLabel isbnLabel0;
    private javax.swing.JLabel ownLabel0;
    private javax.swing.JLabel titleLabel0;
    private javax.swing.JLabel volumeLabel0;
    // End of variables declaration//GEN-END:variables
}
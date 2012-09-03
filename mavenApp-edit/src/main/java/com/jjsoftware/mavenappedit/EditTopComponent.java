package com.jjsoftware.mavenappedit;

import com.jjsoftware.mavenapp.Student;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;


@ConvertAsProperties(
    dtd = "-//com.jjsoftware.mavenappedit//Edit//EN",
autostore = false)
@TopComponent.Description(
    preferredID = "EditTopComponent",
//iconBase="SET/PATH/TO/ICON/HERE", 
persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "editor", openAtStartup = true)
@ActionID(category = "Window", id = "com.jjsoftware.mavenappedit.EditTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
    displayName = "#CTL_EditAction",
preferredID = "EditTopComponent")
@Messages({
    "CTL_EditAction=Edit",
    "CTL_EditTopComponent=Edit Window",
    "HINT_EditTopComponent=This is a Edit window"
})
public final class EditTopComponent extends TopComponent {

    public EditTopComponent() {
        initComponents();
        setName(Bundle.CTL_EditTopComponent());
        setToolTipText(Bundle.HINT_EditTopComponent());

    }

    private void addData(Long id, Long age, String name) {
        EntityManager em = Persistence.
                createEntityManagerFactory(
                "com.jjsoftware_mavenApp-dbaccess_nbm_1.0-SNAPSHOTPU").
                createEntityManager();
        Student currentStudent = new Student();
        try {
        currentStudent.setId(id);
        currentStudent.setAge(age);
        currentStudent.setName(name);
        em.getTransaction().begin();
        em.persist(currentStudent);
        em.getTransaction().commit();
        } catch (Exception e) {
            
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        ID = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        WIEK = new javax.swing.JTextPane();
        IDlabel = new javax.swing.JLabel();
        WIEKlabel = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        IMIE = new javax.swing.JTextPane();
        IMIElabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jScrollPane3.setViewportView(jTextPane1);

        jScrollPane1.setViewportView(ID);

        jScrollPane2.setViewportView(WIEK);

        org.openide.awt.Mnemonics.setLocalizedText(IDlabel, org.openide.util.NbBundle.getMessage(EditTopComponent.class, "EditTopComponent.IDlabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(WIEKlabel, org.openide.util.NbBundle.getMessage(EditTopComponent.class, "EditTopComponent.WIEKlabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(AddButton, org.openide.util.NbBundle.getMessage(EditTopComponent.class, "EditTopComponent.AddButton.text")); // NOI18N
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(IMIE);

        org.openide.awt.Mnemonics.setLocalizedText(IMIElabel, org.openide.util.NbBundle.getMessage(EditTopComponent.class, "EditTopComponent.IMIElabel.text")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(EditTopComponent.class, "EditTopComponent.jLabel1.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDlabel)
                            .addComponent(IMIElabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AddButton)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(WIEKlabel)))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IDlabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(IMIElabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WIEKlabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(31, 31, 31)
                .addComponent(AddButton)
                .addContainerGap(109, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        int temp = Integer.parseInt(ID.getText());
        Long id = (Long)(long)temp;
        String imie= IMIE.getText();
        temp = Integer.parseInt(WIEK.getText());
        Long wiek = (Long)(long)temp;
        
        addData(id,wiek,imie);
    }//GEN-LAST:event_AddButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextPane ID;
    private javax.swing.JLabel IDlabel;
    private javax.swing.JTextPane IMIE;
    private javax.swing.JLabel IMIElabel;
    private javax.swing.JTextPane WIEK;
    private javax.swing.JLabel WIEKlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
    }
}

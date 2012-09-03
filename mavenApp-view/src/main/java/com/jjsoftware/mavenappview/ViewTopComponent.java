package com.jjsoftware.mavenappview;

import com.jjsoftware.mavenapp.Student;
import java.awt.BorderLayout;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JButton;
import javax.swing.JTextArea;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;


@ConvertAsProperties(
    dtd = "-//com.jjsoftware.mavenappview//View//EN",
autostore = false)
@TopComponent.Description(
    preferredID = "ViewTopComponent",
//iconBase="SET/PATH/TO/ICON/HERE", 
persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "explorer", openAtStartup = true)
@ActionID(category = "Window", id = "com.jjsoftware.mavenappview.ViewTopComponent")
@ActionReference(path = "Menu/Window" , position = 333 )
@TopComponent.OpenActionRegistration(
    displayName = "#CTL_ViewAction",
preferredID = "ViewTopComponent")
@Messages({
    "CTL_ViewAction=View",
    "CTL_ViewTopComponent=View Window",
    "HINT_ViewTopComponent=This is a View window"
})
public final class ViewTopComponent extends TopComponent {
    
    private JTextArea area; 
    
    public ViewTopComponent() {
        initComponents();
        setName(Bundle.CTL_ViewTopComponent());
        setToolTipText(Bundle.HINT_ViewTopComponent());
        
        setLayout(new BorderLayout());
        area = new JTextArea();
        add(area,BorderLayout.NORTH);
        JButton button = new JButton();
        
        showData();

    }
    
    public void showData() {
        EntityManager em = Persistence.
                createEntityManagerFactory(
                "com.jjsoftware_mavenApp-dbaccess_nbm_1.0-SNAPSHOTPU").
                createEntityManager();
        Query query = em.createNamedQuery("Student.findAll");
        List<Student> resultList = query.getResultList();
        for(Student s: resultList) {
            area.append(s.getId()+ " " + s.getName()+ " (" + s.getAge() + ") \n");
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
}

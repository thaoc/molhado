/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GraphViewForm.java
 *
 * Created on Aug 24, 2009, 9:57:58 PM
 */
package edu.uwm.cs.molhado.version;

import edu.cmu.cs.fluid.version.Version;
import edu.uwm.cs.molhado.version.VersionSupport;
import java.awt.Color;
import java.util.Collection;
import javax.swing.JComponent;
import org.openide.util.Lookup;
import org.openide.util.LookupEvent;
import org.openide.util.LookupListener;
import edu.uwm.cs.molhado.version.VersionGraphScene;
import edu.uwm.cs.molhado.fluid.test.TestFluid;
import javax.swing.JDialog;

/**
 *
 * @author chengt
 */
public class VersionGraphViewForm extends JDialog implements LookupListener {

    Lookup.Result<Version> result;
    VersionGraphScene scene;

    /** Creates new form GraphViewForm */
    public VersionGraphViewForm(Version root) {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);

    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        scene = new VersionGraphScene(root);
        JComponent component = scene.createView(); //must be called before build graph
        graphScene.setViewportView(component); //must be called before build graph
        scene.buildGraph();  //must to be called last..
       // Version.getShadowTree().addDigraphListener(scene);
   //    result = scene.getLookup().lookupResult(Version.class);
    //   result.addLookupListener(this);
     //  resultChanged(null);


    }

    public Lookup getLookup(){
      return scene.getLookup();
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    graphScene = new javax.swing.JScrollPane();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setBackground(new java.awt.Color(254, 247, 247));

    graphScene.setBackground(new java.awt.Color(253, 251, 251));
    graphScene.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(graphScene, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(graphScene, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JScrollPane graphScene;
  // End of variables declaration//GEN-END:variables
    int count = 0;

    public void resultChanged(LookupEvent ev) {
        Collection<? extends Version> versions = result.allInstances();
        if (!versions.isEmpty()) {
            Version v = versions.iterator().next();
            System.out.println("gv: " + VersionSupport.getVersionNumber(v));
            TestFluid.printTree(v);
        }

    }
}
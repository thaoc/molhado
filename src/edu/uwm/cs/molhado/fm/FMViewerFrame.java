
/*
 * FMViewerFrame.java
 *
 * Created on Jan 9, 2012, 11:03:04 AM
 */
package edu.uwm.cs.molhado.fm;

import edu.cmu.cs.fluid.version.Version;
import edu.cmu.cs.fluid.version.VersionMarker;
import edu.uwm.cs.molhado.fm.FMGraphScene.RelationConflict;
import java.util.ArrayList;
import org.netbeans.api.visual.graph.layout.GraphLayout;
import org.netbeans.api.visual.graph.layout.GraphLayoutFactory;
import org.netbeans.api.visual.widget.Widget;

/**
 *
 * @author chengt
 */
public class FMViewerFrame extends javax.swing.JFrame implements FMGraphScene.FMValidationListener {
	
	private FMGraphScene scene;
	private GraphLayout layout;
	private Widget rootWidget;

	/** Creates new form FMViewerFrame */
	public FMViewerFrame() {
		initComponents();
		scene = new FMGraphScene(new VersionMarker(Version.getInitialVersion()));
		jScrollPane1.setViewportView(scene.createView());
		//layout  = GraphLayoutFactory.createHierarchicalGraphLayout(scene, true);
		scene.addValidationListener(this);
		
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jSplitPane1 = new javax.swing.JSplitPane();
      jScrollPane2 = new javax.swing.JScrollPane();
      jTextArea1 = new javax.swing.JTextArea();
      jScrollPane1 = new javax.swing.JScrollPane();
      jMenuBar1 = new javax.swing.JMenuBar();
      jMenu1 = new javax.swing.JMenu();
      jMenuItem1 = new javax.swing.JMenuItem();
      jMenuItem2 = new javax.swing.JMenuItem();
      jMenuItem6 = new javax.swing.JMenuItem();
      jMenu2 = new javax.swing.JMenu();
      jMenuItem3 = new javax.swing.JMenuItem();
      jMenu5 = new javax.swing.JMenu();
      jMenuItem4 = new javax.swing.JMenuItem();
      jMenu3 = new javax.swing.JMenu();
      jMenuItem5 = new javax.swing.JMenuItem();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jSplitPane1.setDividerLocation(250);
      jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

      jTextArea1.setColumns(20);
      jTextArea1.setFont(new java.awt.Font("Courier 10 Pitch", 0, 10)); // NOI18N
      jTextArea1.setLineWrap(true);
      jTextArea1.setRows(5);
      jScrollPane2.setViewportView(jTextArea1);

      jSplitPane1.setBottomComponent(jScrollPane2);
      jSplitPane1.setLeftComponent(jScrollPane1);

      jMenu1.setText(org.openide.util.NbBundle.getMessage(FMViewerFrame.class, "FMViewerFrame.jMenu1.text")); // NOI18N

      jMenuItem1.setText(org.openide.util.NbBundle.getMessage(FMViewerFrame.class, "FMViewerFrame.jMenuItem1.text")); // NOI18N
      jMenu1.add(jMenuItem1);

      jMenuItem2.setText(org.openide.util.NbBundle.getMessage(FMViewerFrame.class, "FMViewerFrame.jMenuItem2.text")); // NOI18N
      jMenu1.add(jMenuItem2);

      jMenuItem6.setText(org.openide.util.NbBundle.getMessage(FMViewerFrame.class, "FMViewerFrame.jMenuItem6.text")); // NOI18N
      jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem6ActionPerformed(evt);
         }
      });
      jMenu1.add(jMenuItem6);

      jMenuBar1.add(jMenu1);

      jMenu2.setText(org.openide.util.NbBundle.getMessage(FMViewerFrame.class, "FMViewerFrame.jMenu2.text")); // NOI18N

      jMenuItem3.setText(org.openide.util.NbBundle.getMessage(FMViewerFrame.class, "FMViewerFrame.jMenuItem3.text")); // NOI18N
      jMenu2.add(jMenuItem3);

      jMenu5.setText(org.openide.util.NbBundle.getMessage(FMViewerFrame.class, "FMViewerFrame.jMenu5.text")); // NOI18N
      jMenu2.add(jMenu5);

      jMenuItem4.setText(org.openide.util.NbBundle.getMessage(FMViewerFrame.class, "FMViewerFrame.jMenuItem4.text")); // NOI18N
      jMenu2.add(jMenuItem4);

      jMenuBar1.add(jMenu2);

      jMenu3.setText(org.openide.util.NbBundle.getMessage(FMViewerFrame.class, "FMViewerFrame.jMenu3.text")); // NOI18N
      jMenu3.setActionCommand(org.openide.util.NbBundle.getMessage(FMViewerFrame.class, "FMViewerFrame.jMenu3.actionCommand")); // NOI18N

      jMenuItem5.setText(org.openide.util.NbBundle.getMessage(FMViewerFrame.class, "FMViewerFrame.jMenuItem5.text")); // NOI18N
      jMenu3.add(jMenuItem5);

      jMenuBar1.add(jMenu3);

      setJMenuBar(jMenuBar1);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

	private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
		System.exit(0);
	}//GEN-LAST:event_jMenuItem6ActionPerformed

	private void layoutScene(){
		layout.layoutGraph(scene);
	}
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				new FMViewerFrame().setVisible(true);
			}
		});
	}
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JMenu jMenu1;
   private javax.swing.JMenu jMenu2;
   private javax.swing.JMenu jMenu3;
   private javax.swing.JMenu jMenu5;
   private javax.swing.JMenuBar jMenuBar1;
   private javax.swing.JMenuItem jMenuItem1;
   private javax.swing.JMenuItem jMenuItem2;
   private javax.swing.JMenuItem jMenuItem3;
   private javax.swing.JMenuItem jMenuItem4;
   private javax.swing.JMenuItem jMenuItem5;
   private javax.swing.JMenuItem jMenuItem6;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JSplitPane jSplitPane1;
   private javax.swing.JTextArea jTextArea1;
   // End of variables declaration//GEN-END:variables

	public void validation(boolean valid, ArrayList<RelationConflict> conflicts) {
		jTextArea1.setText("");
		if (!valid){
			jTextArea1.append("Fix errors by deleting constraints or updating feature dependencies.\n");
			jTextArea1.append("--------------------------------------------------------------------\n");
		}
		int i=1;
		for(RelationConflict c: conflicts){
			jTextArea1.append(i++ +": " +c.toString());
			jTextArea1.append("\n");
		}
	}
}

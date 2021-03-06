/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iconimagescaler;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.imgscalr.Scalr;

/**
 *
 * @author sam
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        ReadProps();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbResize = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaImageSizes = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcType = new javax.swing.JComboBox();
        jbLoadList = new javax.swing.JButton();
        jcFitImage = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setIconImages(getIconImages());

        jbResize.setText("Resize Image");
        jbResize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbResizeActionPerformed(evt);
            }
        });

        jtaImageSizes.setColumns(20);
        jtaImageSizes.setRows(5);
        jtaImageSizes.setText("22x22\n25x25\n29x29\n40x40\n44x44\n50x50\n57x57\n58x58\n72x72\n76x76\n80x80\n114x114\n120x120\n144x144\n152x152\n256x256\n512x512\n640x1136\n640x960\n768x1024\n1024x1024\n1024x768\n1536x2048\n2048x1536");
        jtaImageSizes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtaImageSizesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtaImageSizes);

        jLabel1.setText("Image Resize List:");

        jLabel2.setText("Image File Type:");

        jcType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PNG", "JPG", "GIF" }));

        jbLoadList.setText("Load List");
        jbLoadList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoadListActionPerformed(evt);
            }
        });

        jcFitImage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Width", "Height", "Exact", "Auto" }));

        jLabel3.setText("Fit Image To:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbResize, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbLoadList, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcType, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcFitImage, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbResize)
                    .addComponent(jbLoadList))
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcFitImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(291, 456));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbResizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbResizeActionPerformed
        String origFileName = "";
        String origFilePath = "";
        BufferedImage original = null;
        BufferedImage scaled = null;

        JFileChooser fileChooser = new JFileChooser();
        if (filepath.isEmpty()) {
            filepath = ".";
        }
        File cfile = new File(filepath);
        fileChooser.setCurrentDirectory(cfile);
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                origFilePath = file.getAbsolutePath();
                origFilePath = origFilePath.substring(0, origFilePath.lastIndexOf(File.separator));

                filepath = origFilePath;
                WriteProps();
                origFileName = file.getName();

//                System.out.println("origFilePath " + origFilePath);
//                System.out.println("origFileName " + origFileName);

            } catch (Exception ex) {
                System.out.println("problem accessing file" + file.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }


        if (!origFileName.isEmpty()) {
            try {
                String imageType = jcType.getSelectedItem().toString();
//                System.out.println("ImageIO: " + origFilePath + File.separator + origFileName);

                String nameOnly = origFileName.substring(0, origFileName.lastIndexOf("."));
                original = ImageIO.read(new File(origFilePath + File.separator + origFileName));

                ImageIO.write(original, imageType, new File(origFilePath + File.separator + "XTESTX" + nameOnly + "." + imageType.toLowerCase()));

                String sizes = jtaImageSizes.getText();
                String[] sizeArray = sizes.split("\n");

                for (int i = 0; i < sizeArray.length; i++) {
                    String[] string = sizeArray[i].split("x");
                    String xString = string[0];
                    String yString = string[1];

//                    System.out.println("xString " + xString);
//                    System.out.println("yString " + yString);

                    int sx = Integer.parseInt(xString);
                    int sy = Integer.parseInt(yString);
                    String saveOut = "";

//                    Magic happens in this little line - get Scalr if you don't have it
                    if (jcFitImage.getSelectedItem().toString().equals("Width")) {
                    scaled = Scalr.resize(original, Scalr.Method.ULTRA_QUALITY, Scalr.Mode.FIT_TO_WIDTH, sx, sy, Scalr.OP_ANTIALIAS);
                    saveOut = origFilePath + File.separator + nameOnly + "_" + xString + "x" + "." + imageType.toLowerCase();
                    } else if (jcFitImage.getSelectedItem().toString().equals("Height")) {
                        scaled = Scalr.resize(original, Scalr.Method.ULTRA_QUALITY, Scalr.Mode.FIT_TO_HEIGHT, sx, sy, Scalr.OP_ANTIALIAS);
                        saveOut = origFilePath + File.separator + nameOnly + "_" + "x" + yString + "." + imageType.toLowerCase();
                    } else if (jcFitImage.getSelectedItem().toString().equals("Exact")) {
                        scaled = Scalr.resize(original, Scalr.Method.ULTRA_QUALITY, Scalr.Mode.FIT_EXACT, sx, sy, Scalr.OP_ANTIALIAS);
                        saveOut = origFilePath + File.separator + nameOnly + "_" + xString + "x" + yString + "." + imageType.toLowerCase();
                    } else {
                        scaled = Scalr.resize(original, Scalr.Method.ULTRA_QUALITY, Scalr.Mode.AUTOMATIC, sx, sy, Scalr.OP_ANTIALIAS);
                        saveOut = origFilePath + File.separator + nameOnly + "_" + xString + "a" + yString + "." + imageType.toLowerCase();
                    }
                    
//                    System.out.println("saveOut " + saveOut);

                    try {
                        ImageIO.write(scaled, imageType, new File(saveOut));
                    } catch (Exception ex) {
                        System.out.println("ex: " + ex);
                    }

                }

                JOptionPane.showMessageDialog(null, "Done!");

            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jbResizeActionPerformed

    private void jbLoadListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoadListActionPerformed

        if (jbLoadList.getText().equals("Load List")) {
            JFileChooser fileChooser = new JFileChooser();
            if (filepath.isEmpty()) {
                filepath = ".";
            }
            File cfile = new File(filepath);
            fileChooser.setCurrentDirectory(cfile);
            int returnVal = fileChooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try {
                    String origFilePath = file.getAbsolutePath();
                    origFilePath = origFilePath.substring(0, origFilePath.lastIndexOf(File.separator));

                    filepath = origFilePath;
                    WriteProps();

                    BufferedReader reader = null;
                    try {
                        reader = new BufferedReader(new FileReader(file));
                        String text = "";
                        String savetext = "";
                        final String LS = System.getProperty("line.separator");

                        while ((text = reader.readLine()) != null) {
                            savetext += text + LS;
                        }
                        jtaImageSizes.setText(savetext);
                    } catch (Exception ex) {
                    }


                } catch (Exception ex) {
                    System.out.println("problem accessing file" + file.getAbsolutePath());
                }
            } else {
                System.out.println("File access cancelled by user.");
            }
        } else {
            JFileChooser fileChooser = new JFileChooser();
            if (filepath.isEmpty()) {
                filepath = ".";
            }
            File cfile = new File(filepath);
            fileChooser.setCurrentDirectory(cfile);
            int returnVal = fileChooser.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try {
                    String origFilePath = file.getAbsolutePath();
                    WriteProps();

                    BufferedWriter writer = null;
                    writer = new BufferedWriter(new FileWriter(origFilePath));
                    jtaImageSizes.write(writer);
                    writer.close();


                } catch (Exception ex) {
                    System.out.println("problem accessing file" + file.getAbsolutePath());
                }
            } else {
                System.out.println("File access cancelled by user.");
            }
        }

        jbLoadList.setText("Load List");
    }//GEN-LAST:event_jbLoadListActionPerformed

    private void jtaImageSizesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtaImageSizesKeyReleased
        jbLoadList.setText("Save List");
    }//GEN-LAST:event_jtaImageSizesKeyReleased

    private void ReadProps() {
        try {
            Properties p = new Properties();
            p.load(new FileInputStream("imagescaler.props"));

            if (filepath.trim().length() == 0) {
                filepath = p.getProperty("filepath");
            }

            p.list(System.out);
        } catch (Exception e) {
            //--*System.out.println(e);
        }
    }

    private void WriteProps() {
        try {
            Properties p = new Properties();
            p.put("filepath", filepath);
            FileOutputStream out = new FileOutputStream("imagescaler.props");
            p.store(out, "/* properties updated */");

        } catch (Exception e) {
            //--*System.out.println(e);
        }

    }

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbLoadList;
    private javax.swing.JButton jbResize;
    private javax.swing.JComboBox jcFitImage;
    private javax.swing.JComboBox jcType;
    private javax.swing.JTextArea jtaImageSizes;
    // End of variables declaration//GEN-END:variables
    private String filepath = "";
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinedoctorappointmentsystem;

import java.util.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import static onlinedoctorappointmentsystem.ManageProfile.user1;

/**
 *
 * @author raghavendhra
 */
public class Selectdoctor extends javax.swing.JFrame {

    public static int id,p=1;
    public static int doctor_id;
    public static Date date = new Date();
    /**
     * Creates new form Selectdoctory
     */
    public Selectdoctor() {
        initComponents();
        int x ,y,w,p;
        date=null;
        String docname1 =Specilization.docname;
        String name;
       JLabel[] array = new JLabel[10];
       
       
      
       
//        for(int i=0;i<10;i++)
//        {
//            array[i] = new JLabel("raghs"+i);
//            array[i].setText("i"+i);
//            this.add(array[i]);
//            array[i].setOpaque(true);
//            array[i].setBounds(x, y, 40, 40);
//           // array[i].setBackground(Color.CYAN);
//            //array[i].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
//            x += 140;
//
//           // System.out.println(array[i].toString());
//        }
        try {
           Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorappointment","raghs","root");
                Statement stmt=conn.createStatement();  
                ResultSet rp = stmt.executeQuery("select * from doctor where specailization='"+docname1+"'");
                x=10;
                w=110;
                y=100;
               // name1.setText(" " );
                while(rp.next())
                {
                    rp.next();
                    rp.previous();
                    JLabel name2 = new JLabel();
                    name2.setText("Name : ");
                    this.add(name2);
                    name2.setOpaque(true);
                    name2.setBounds(x,y,50,50);
                    //y+=50
                    
                    JLabel name1 = new JLabel();
                    name1.setText(String.valueOf(rp.getString(2)));
                    this.add(name1);
                    name1.setOpaque(true);
                    name1.setBounds(w, y, 200, 50);
                    System.out.println(rp.getString(2));
                    y+=30;
                  
                    JLabel time2 = new JLabel();
                    time2.setText("Time : ");
                    this.add(time2);
                    time2.setOpaque(true);
                    time2.setBounds(x,y,50,50);
                    
                    JLabel time = new JLabel();
                    time.setText(String.valueOf(rp.getString(6)));
                    this.add(time);
                    time.setOpaque(true);
                    time.setBounds(w, y, 100, 50);
                     //x+=100;
                    y+=30;
                   // y-=50;
                    
                    JLabel gender1 = new JLabel();
                    gender1.setText("Gender : ");
                    this.add(gender1);
                    gender1.setOpaque(true);
                    gender1.setBounds(x,y,100,50);
                    //y-=50;
                    
                    JLabel gender = new JLabel();
                    gender.setText(String.valueOf(rp.getString(3)));
                    this.add(gender);
                    gender.setOpaque(true);
                    gender.setBounds(w, y, 150, 50);
                    y+=30;
                    
                    JLabel amount1 = new JLabel();
                    amount1.setText("Amount : ");
                    this.add(amount1);
                    amount1.setOpaque(true);
                    amount1.setBounds(x,y,100,50);
                   // x+=50;
                    
                    JLabel amount = new JLabel();
                    amount.setText(String.valueOf(rp.getString(5)));
                    this.add(amount);
                    amount.setOpaque(true);
                    amount.setBounds(w, y, 150, 50);
                  //.setText(String.valueOf(rp.getString(2)));
                  //name1=null;
                    y+=50;
                    final int id=rp.getInt(1);
                    JButton b=new JButton("Book Appointment");  
                    this.add(b);
                    b.setOpaque(true);
                    b.setBounds(20,y,150,30);
                    b.addActionListener(new ActionListener(){  
                    public void actionPerformed(ActionEvent e){  
                    // System.out.println(id);
                    doctor_id=Selectdoctor.id;
                    if(Selectdoctor.p==1)
                    {
                        JOptionPane.showMessageDialog(rootPane,"Please Select Date!!");
                    }
        }  
    });  
                  x=10;
                  y+=50;
                 // i++;
                }
                  conn.close();
        }
         catch (Exception e) {
                    e.printStackTrace();
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

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToggleButton1.setText("Back");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(java.awt.Color.gray);

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 48)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Select Doctor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(391, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        jCalendar1.setBackground(java.awt.Color.lightGray);

        jButton1.setText("Confirm Date");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jToggleButton1)
                .addGap(34, 34, 34)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(0, 334, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        Specilization s = new Specilization();
        dispose();
        s.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        p=0;
        date = jCalendar1.getDate();
        System.out.println(date);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Selectdoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selectdoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selectdoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selectdoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selectdoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}

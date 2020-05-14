/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinedoctorappointmentsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static onlinedoctorappointmentsystem.Selectdoctor.r;

/**
 *
 * @author raghavendhra
 */
public class ViewAppointments extends javax.swing.JFrame {
    public static int id,r;
    /**
     * Creates new form ViewAppointments
     */
    public ViewAppointments() {
        initComponents();
         try {
           Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorappointment","raghs","root");
                Statement stmt=conn.createStatement();  
                ResultSet rp = stmt.executeQuery("select a.appoint_id,d.name,a.dateofapp,a.time from appointmentbooking as a,doctor as d where a.doc_id=d.doc_id and (a.dateofapp >=(select curdate()) and id="+Login.id1+")");
                int x=350;
                int w=500;
                int y=250;
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
                    //System.out.println(rp.getString(2));
                    y+=30;
                  
                    JLabel time2 = new JLabel();
                    time2.setText("Date : ");
                    this.add(time2);
                    time2.setOpaque(true);
                    time2.setBounds(x,y,50,50);
                    
                    JLabel time = new JLabel();
                    time.setText(String.valueOf(rp.getString(3)));
                    this.add(time);
                    time.setOpaque(true);
                    time.setBounds(w, y, 100, 50);
                     //x+=100;
                    y+=30;
                   // y-=50;
                    
                    JLabel gender1 = new JLabel();
                    gender1.setText("Time : ");
                    this.add(gender1);
                    gender1.setOpaque(true);
                    gender1.setBounds(x,y,100,50);
                    //y-=50;
                    
                    JLabel gender = new JLabel();
                    gender.setText(String.valueOf(rp.getString(4)));
                    this.add(gender);
                    gender.setOpaque(true);
                    gender.setBounds(w, y, 150, 50);
                    y+=50;
                    
                    id=rp.getInt(1);
                    //System.out.println(id);
                    ChooseAppointment.ea=1;
                    JButton b=new JButton("Edit Appointment"+id);  
                    this.add(b);
                    b.setOpaque(true);
                    b.setBounds(320,y,170,30);
                    b.addActionListener(new ActionListener(){  
                    public void actionPerformed(ActionEvent e){  
                    String oo = b.getText();
                    int h = oo.length();
                    //char ch = getCharFromString(o, h-1); 
                    //System.out.println(h);
                    if(h==17)
                    {
                        r = oo.charAt(h-1) - '0';
                    }
                    else
                    {
                        int b=oo.charAt(h-2) - '0';
                        int bb = oo.charAt(h-1) - '0';
                        r=(b*10)+bb;
                    }
                     EditAppointment o = new EditAppointment();
                    dispose();
                    o.setVisible(true);
        }  
    });  
                    JButton b1=new JButton("Cancel Appointment"+id);  
                    this.add(b1);
                    b1.setOpaque(true);
                    b1.setBounds(500,y,170,30);
                    b1.addActionListener(new ActionListener(){  
                    public void actionPerformed(ActionEvent e){  
                    String oo = b1.getText();
                    int h = oo.length();
                    //char ch = getCharFromString(o, h-1); 
                   // System.out.println(h);
                    //System.out.println(h);
                    if(h==19)
                    {
                        r = oo.charAt(h-1) - '0';
                    }
                    else
                    {
                        int b=oo.charAt(h-2) - '0';
                        int bb = oo.charAt(h-1) - '0';
                        r=(b*10)+bb;
                    }
                     CancelAppointment o = new CancelAppointment();
                    dispose();
                    o.setVisible(true);
        }  
    });  
                  x=350;
                  y+=50;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.lightGray);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinedoctorappointmentsystem/icon.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 48)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Amrita Hospitals");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(200, 200, 200)
                .addComponent(jLabel2)
                .addGap(0, 252, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2))
        );

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 32)); // NOI18N
        jLabel3.setText("Your Next Appointments");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 702, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Main m = new Main();
        dispose();
        m.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ChooseAppointment ca = new ChooseAppointment();
        dispose();
        ca.setVisible(true);
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
            java.util.logging.Logger.getLogger(ViewAppointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAppointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAppointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAppointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAppointments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

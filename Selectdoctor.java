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
import java.text.SimpleDateFormat;
import java.sql.Time;
//import static onlinedoctorappointmentsystem.Login;

/**
 *
 * @author raghavendhra
 */
public class Selectdoctor extends javax.swing.JFrame {

    public static int id,p=1,l=0,r;
    public static int doctor_id;
    public static Date date = new Date();
    public static String date2;
    public static Time time5;
   // public static Statement stmt; 
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
                x=20;
                w=120;
                y=190;
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
                    id=rp.getInt("doc_id");
                    //System.out.println(id);
                    JButton b=new JButton("Book Appointment"+rp.getInt(1));  
                    this.add(b);
                    b.setOpaque(true);
                    b.setBounds(20,y,150,30);
                    b.addActionListener(new ActionListener(){  
                    public void actionPerformed(ActionEvent e){  
                    // System.out.println(id);
                    String o = b.getText();
                    int h = o.length();
                    //char ch = getCharFromString(o, h-1); 
                    System.out.println(h);
                    if(h==17)
                    {
                        r = o.charAt(h-1) - '0';
                    }
                    else
                    {
                        int b=o.charAt(h-2) - '0';
                        int bb = o.charAt(h-1) - '0';
                        r=(b*10)+bb;
                    }
                    System.out.println(o.charAt(h-1));
                    //System.out.println(o);
                    //time5 = rp.getTime("timmings");
                    doctor_id=Selectdoctor.id;
                    //System.out.println(Selectdoctor.id);
                    if(Selectdoctor.p==1)
                    {
                        JOptionPane.showMessageDialog(rootPane,"Please Select Date!!");
                    }
                    else
                    {
                        try
                        {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorappointment","raghs","root");
                            Statement stmt=conn.createStatement();  
                            ResultSet rp = stmt.executeQuery("select * from doctor where doc_id="+r);
                            rp.next();
                           stmt.executeUpdate("insert into appointmentbooking(id,doc_id,dateofapp,time)"+ "values("+Login.id1+","+r+",'"+date2+"','"+rp.getTime(6)+"')");
                           FixAppointment f = new FixAppointment();
                            dispose();
                            f.setVisible(true);
                        }
                        catch (Exception p)
                        {
                            p.printStackTrace();
                        }
                    }
        }  
    });  
//                    if(Selectdoctor.l==1)
//                    {
//                        stmt.executeUpdate("insert into appointmentbooking(id,doc_id,dateofapp)"+ "values("+Login.id1+","+doctor_id+",'"+date+"')");
//                        
//                        break;
//                    }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToggleButton1.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jToggleButton1.setText("Back");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(java.awt.Color.lightGray);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinedoctorappointmentsystem/icon.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Ubuntu", 3, 48)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Amrita Hospital ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(249, 249, 249)
                .addComponent(jLabel3)
                .addGap(0, 220, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel3))
        );

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jButton1.setForeground(java.awt.Color.lightGray);
        jButton1.setText("Confirm Date");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(java.awt.Color.gray);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 48)); // NOI18N
        jLabel1.setForeground(java.awt.Color.gray);
        jLabel1.setText("Select Doctor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addGap(0, 234, Short.MAX_VALUE))
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
        Date comdate = new Date();
        String f;
        p=0;
        SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
        date2 = dcn.format(jCalendar1.getDate());
        dcn.format(comdate);
        //System.out.println(comdate);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}

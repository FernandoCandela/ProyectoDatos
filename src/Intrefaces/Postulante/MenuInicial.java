/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intrefaces.Postulante;
import Clases.Convocatoria;
import Interfaces.Reclutador.Login;
import java.util.ArrayList;
/**
 *
 * @author Fernando
 */
public class MenuInicial extends javax.swing.JFrame {

    /**
     * Creates new form MenuInicial1
     */
    public MenuInicial() {
        initComponents();
        this.setLocationRelativeTo(null);
        conv1=Convocatoria.makeConvocatoriaList();
        
        //prueba
        /*Convocatoria c1 = new Convocatoria(703,"20/07/2001","pruebaaa");
        Convocatoria c2 = new Convocatoria(709,"25/07/2002","pruebaaaaaaaa");
        Convocatoria c3 = new Convocatoria(710,"25/07/2003","pruebaaaaaaaaa");
        Convocatoria c4 = new Convocatoria(711,"25/07/2004","pruebaaaaaaaaaa");
        Convocatoria c5 = new Convocatoria(712,"25/07/2005","pruebaaaaaaaaaaaa");
        conv1.add(c1);
        conv1.add(c2);
        conv1.add(c3);
        conv1.add(c4);
        conv1.add(c5);*/
        
        txtId1.setText(Integer.toString(conv1.get(conv1.size()-1).getId_convocatoria()));
        txtConv1.setText(conv1.get(conv1.size()-1).getDescripcion());
        txtId2.setText(Integer.toString(conv1.get(conv1.size()-2).getId_convocatoria()));
        txtConv2.setText(conv1.get(conv1.size()-2).getDescripcion());
        txtId3.setText(Integer.toString(conv1.get(conv1.size()-3).getId_convocatoria()));
        txtConv3.setText(conv1.get(conv1.size()-3).getDescripcion());
        txtId4.setText(Integer.toString(conv1.get(conv1.size()-4).getId_convocatoria()));
        txtConv4.setText(conv1.get(conv1.size()-4).getDescripcion());

        
    }
    public static String titulo = "";
    public static String descripcion = "";
    public static String fecha = "";
    public static ArrayList<Convocatoria> conv1=new ArrayList();
    public static Convocatoria cSelec = new Convocatoria();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConv3 = new javax.swing.JTextArea();
        txtId1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtConv1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtConv2 = new javax.swing.JTextArea();
        txtId2 = new javax.swing.JLabel();
        txtId3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtConv4 = new javax.swing.JTextArea();
        txtId4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtId5 = new javax.swing.JLabel();
        txtId6 = new javax.swing.JLabel();
        txtId7 = new javax.swing.JLabel();
        txtId8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("Cerrar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CORPORACION SIC");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Renatto\\Desktop\\ProyectoDatos\\ProyectoDatos\\WhatsApp Image 2020-07-03 at 7.57.23 PM.jpeg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Iniciar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtConv3.setEditable(false);
        txtConv3.setColumns(20);
        txtConv3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtConv3.setLineWrap(true);
        txtConv3.setRows(5);
        txtConv3.setText("REQUISITOS:\nHombres o mujeres mayores de 18 años.\nCon o Sin experiencia.\nDisponibilidad para trabajar 8 horas diarias de Lunes a Sabado\nen horarios rotativos entre las 7a.m. y 11p.m.\nDisponibilidad para laborar en la ciudad de Huancayo.\nDisponibilidad para realizar capacitaciones previas al ingreso\na laborar.");
        txtConv3.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtConv3);

        txtId1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtId1.setForeground(new java.awt.Color(255, 255, 255));
        txtId1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtId1.setText("701");

        jButton2.setBackground(new java.awt.Color(255, 204, 102));
        jButton2.setText("Postular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtConv1.setEditable(false);
        txtConv1.setColumns(20);
        txtConv1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtConv1.setLineWrap(true);
        txtConv1.setRows(5);
        txtConv1.setText("REQUISITOS:\nHombres o mujeres mayores de 18 años.\nCon o Sin experiencia.\nDisponibilidad para trabajar 8 horas diarias de Lunes a Domingo\nen horarios rotativos entre las 7a.m. y 11p.m.\nDisponibilidad para laborar en estos distritos: Miraflores,\nSan Juan de Lurigancho, Puente Piedra.\nDisponibilidad para realizar capacitaciones previas al ingreso\na laborar.\n");
        txtConv1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtConv1);

        txtConv2.setEditable(false);
        txtConv2.setColumns(20);
        txtConv2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtConv2.setLineWrap(true);
        txtConv2.setRows(5);
        txtConv2.setText("REQUISITOS:\nHombres o mujeres mayores de 18 años.\nCon o Sin experiencia.\nDisponibilidad para trabajar 4 horas diarias de Lunes a Sabado\nen horarios rotativos entre las 7a.m. y 11p.m.\nDisponibilidad para laborar en estos distritos: Cercado de Lima,\nSanta Anita, San Juan de Lurigancho.\nDisponibilidad para realizar capacitaciones previas al ingreso\na laborar.");
        txtConv2.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtConv2);

        txtId2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtId2.setForeground(new java.awt.Color(255, 255, 255));
        txtId2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtId2.setText("702");

        txtId3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtId3.setForeground(new java.awt.Color(255, 255, 255));
        txtId3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtId3.setText("703");

        txtConv4.setEditable(false);
        txtConv4.setColumns(20);
        txtConv4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtConv4.setLineWrap(true);
        txtConv4.setRows(5);
        txtConv4.setText("No hay convocatoria en este momento");
        txtConv4.setWrapStyleWord(true);
        jScrollPane4.setViewportView(txtConv4);

        txtId4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtId4.setForeground(new java.awt.Color(255, 255, 255));
        txtId4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtId4.setText("7");

        jButton3.setBackground(new java.awt.Color(255, 204, 102));
        jButton3.setText("Postular");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 204, 102));
        jButton4.setText("Postular");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 204, 102));
        jButton5.setText("Postular");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtId5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtId5.setForeground(new java.awt.Color(255, 255, 255));
        txtId5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtId5.setText("Convocatoria");

        txtId6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtId6.setForeground(new java.awt.Color(255, 255, 255));
        txtId6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtId6.setText("Convocatoria");

        txtId7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtId7.setForeground(new java.awt.Color(255, 255, 255));
        txtId7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtId7.setText("Convocatoria");

        txtId8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtId8.setForeground(new java.awt.Color(255, 255, 255));
        txtId8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtId8.setText("Convocatoria");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtId8)
                            .addComponent(txtId6))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId3, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(txtId4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtId5)
                                .addGap(18, 18, 18)
                                .addComponent(txtId1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtId7)
                                .addGap(24, 24, 24)
                                .addComponent(txtId2)))
                        .addGap(9, 9, 9)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            // TODO add your handling code here:
            System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        titulo = txtId1.getText();
        descripcion = txtConv1.getText();
        fecha = conv1.get(conv1.size()-1).getFecha_convocatoria();
        
        cSelec = conv1.get(conv1.size()-1);
        
        
        
        MenuConvocatoria mConvocatoria = new MenuConvocatoria();
        mConvocatoria.setVisible(true);
        
        this.dispose();
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        titulo = txtId2.getText();
        descripcion = txtConv2.getText();
        fecha = conv1.get(conv1.size()-2).getFecha_convocatoria();
        
        cSelec = conv1.get(conv1.size()-2);
        MenuConvocatoria mConvocatoria = new MenuConvocatoria();
        mConvocatoria.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        titulo = txtId3.getText();
        descripcion = txtConv3.getText();
        fecha = conv1.get(conv1.size()-3).getFecha_convocatoria();
        
        cSelec = conv1.get(conv1.size()-3);
        MenuConvocatoria mConvocatoria = new MenuConvocatoria();
        mConvocatoria.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        titulo = txtId4.getText();
        descripcion = txtConv4.getText();
        fecha = conv1.get(conv1.size()-4).getFecha_convocatoria();
        
        cSelec = conv1.get(conv1.size()-4);
        MenuConvocatoria mConvocatoria = new MenuConvocatoria();
        mConvocatoria.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtConv1;
    private javax.swing.JTextArea txtConv2;
    private javax.swing.JTextArea txtConv3;
    private javax.swing.JTextArea txtConv4;
    private javax.swing.JLabel txtId1;
    private javax.swing.JLabel txtId2;
    private javax.swing.JLabel txtId3;
    private javax.swing.JLabel txtId4;
    private javax.swing.JLabel txtId5;
    private javax.swing.JLabel txtId6;
    private javax.swing.JLabel txtId7;
    private javax.swing.JLabel txtId8;
    // End of variables declaration//GEN-END:variables
}

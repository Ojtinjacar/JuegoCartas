/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Codigo.Codigo;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Yeison
 */
public class Juego extends javax.swing.JFrame {

    private Codigo cod;
    private boolean caraUp = false;
    private ImageIcon im1;
    private ImageIcon im2;
    private JButton[] pbtn = new JButton[2];
    private boolean primerc = false;

    public Juego() {
        initComponents();
        cod = new Codigo();
        setCards();
        setLocationRelativeTo(null);
    }

    private void setCards() {
        int[] numeros = cod.obtenerNumeros();

        carta1.setDisabledIcon(new ImageIcon(getClass().getResource("/Fotos/c" + numeros[0] + ".png")));
        carta2.setDisabledIcon(new ImageIcon(getClass().getResource("/Fotos/c" + numeros[1] + ".png")));
        carta3.setDisabledIcon(new ImageIcon(getClass().getResource("/Fotos/c" + numeros[2] + ".png")));
        carta4.setDisabledIcon(new ImageIcon(getClass().getResource("/Fotos/c" + numeros[3] + ".png")));
        carta5.setDisabledIcon(new ImageIcon(getClass().getResource("/Fotos/c" + numeros[4] + ".png")));
        carta6.setDisabledIcon(new ImageIcon(getClass().getResource("/Fotos/c" + numeros[5] + ".png")));
        carta7.setDisabledIcon(new ImageIcon(getClass().getResource("/Fotos/c" + numeros[6] + ".png")));
        carta8.setDisabledIcon(new ImageIcon(getClass().getResource("/Fotos/c" + numeros[7] + ".png")));
        carta9.setDisabledIcon(new ImageIcon(getClass().getResource("/Fotos/c" + numeros[8] + ".png")));
        carta10.setDisabledIcon(new ImageIcon(getClass().getResource("/Fotos/c" + numeros[9] + ".png")));
        carta11.setDisabledIcon(new ImageIcon(getClass().getResource("/Fotos/c" + numeros[10] + ".png")));
        carta12.setDisabledIcon(new ImageIcon(getClass().getResource("/Fotos/c" + numeros[11] + ".png")));
    }

    private void btnEnabled(JButton btn) {

        if (!caraUp) {
            btn.setEnabled(false);
            im1 = (ImageIcon) btn.getDisabledIcon();
            pbtn[0] = btn;
            caraUp = true;
            primerc = false;
        } else {
            btn.setEnabled(false);
            im2 = (ImageIcon) btn.getDisabledIcon();
            pbtn[1] = btn;
            primerc = true;
//            puntaje += 20;
            win();
        }
    }

    private void comparar() {
        if (caraUp && primerc) {

            if (im1.getDescription().compareTo(im2.getDescription()) != 0) {
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
//                if (puntaje > 10) {
//                    puntaje -= 10;
//                }
            }
            caraUp = false;
        }
    }

    private void reiniciar() {

        carta1.setEnabled(true);
        carta2.setEnabled(true);
        carta3.setEnabled(true);
        carta4.setEnabled(true);
        carta5.setEnabled(true);
        carta6.setEnabled(true);
        carta7.setEnabled(true);
        carta8.setEnabled(true);
        carta9.setEnabled(true);
        carta10.setEnabled(true);
        carta11.setEnabled(true);
        carta12.setEnabled(true);

        primerc = false;
        caraUp = false;
        setCards();
    }

    private void win() {
        if (!carta1.isEnabled() && !carta2.isEnabled() && !carta3.isEnabled() && !carta4.isEnabled() && !carta5.isEnabled() && !carta6.isEnabled()
                && !carta7.isEnabled() && !carta8.isEnabled() && !carta9.isEnabled() && !carta10.isEnabled() && !carta11.isEnabled()
                && !carta12.isEnabled()) {
            JOptionPane.showMessageDialog(this, "Felicidades, has ganado. :) ", "Felicidades!", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        carta1 = new javax.swing.JButton();
        carta2 = new javax.swing.JButton();
        carta3 = new javax.swing.JButton();
        carta4 = new javax.swing.JButton();
        carta5 = new javax.swing.JButton();
        carta6 = new javax.swing.JButton();
        carta7 = new javax.swing.JButton();
        carta8 = new javax.swing.JButton();
        carta9 = new javax.swing.JButton();
        carta10 = new javax.swing.JButton();
        carta11 = new javax.swing.JButton();
        carta12 = new javax.swing.JButton();
        Reiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cartas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Encuentra las parejas");

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        carta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/0.png"))); // NOI18N
        carta1.setToolTipText("");
        carta1.setBorder(null);
        carta1.setBorderPainted(false);
        carta1.setContentAreaFilled(false);
        carta1.setFocusable(false);
        carta1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/00.png"))); // NOI18N
        carta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carta1MouseExited(evt);
            }
        });
        carta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta1ActionPerformed(evt);
            }
        });

        carta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/0.png"))); // NOI18N
        carta2.setToolTipText("");
        carta2.setBorder(null);
        carta2.setBorderPainted(false);
        carta2.setContentAreaFilled(false);
        carta2.setFocusable(false);
        carta2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/00.png"))); // NOI18N
        carta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carta2MouseExited(evt);
            }
        });
        carta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta2ActionPerformed(evt);
            }
        });

        carta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/0.png"))); // NOI18N
        carta3.setToolTipText("");
        carta3.setBorder(null);
        carta3.setBorderPainted(false);
        carta3.setContentAreaFilled(false);
        carta3.setFocusable(false);
        carta3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/00.png"))); // NOI18N
        carta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carta3MouseExited(evt);
            }
        });
        carta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta3ActionPerformed(evt);
            }
        });

        carta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/0.png"))); // NOI18N
        carta4.setToolTipText("");
        carta4.setBorder(null);
        carta4.setBorderPainted(false);
        carta4.setContentAreaFilled(false);
        carta4.setFocusable(false);
        carta4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/00.png"))); // NOI18N
        carta4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carta4MouseExited(evt);
            }
        });
        carta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta4ActionPerformed(evt);
            }
        });

        carta5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/0.png"))); // NOI18N
        carta5.setToolTipText("");
        carta5.setBorder(null);
        carta5.setBorderPainted(false);
        carta5.setContentAreaFilled(false);
        carta5.setFocusable(false);
        carta5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/00.png"))); // NOI18N
        carta5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carta5MouseExited(evt);
            }
        });
        carta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta5ActionPerformed(evt);
            }
        });

        carta6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/0.png"))); // NOI18N
        carta6.setToolTipText("");
        carta6.setBorder(null);
        carta6.setBorderPainted(false);
        carta6.setContentAreaFilled(false);
        carta6.setFocusable(false);
        carta6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/00.png"))); // NOI18N
        carta6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carta6MouseExited(evt);
            }
        });
        carta6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta6ActionPerformed(evt);
            }
        });

        carta7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/0.png"))); // NOI18N
        carta7.setToolTipText("");
        carta7.setBorder(null);
        carta7.setBorderPainted(false);
        carta7.setContentAreaFilled(false);
        carta7.setFocusable(false);
        carta7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/00.png"))); // NOI18N
        carta7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carta7MouseExited(evt);
            }
        });
        carta7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta7ActionPerformed(evt);
            }
        });

        carta8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/0.png"))); // NOI18N
        carta8.setToolTipText("");
        carta8.setBorder(null);
        carta8.setBorderPainted(false);
        carta8.setContentAreaFilled(false);
        carta8.setFocusable(false);
        carta8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/00.png"))); // NOI18N
        carta8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carta8MouseExited(evt);
            }
        });
        carta8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta8ActionPerformed(evt);
            }
        });

        carta9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/0.png"))); // NOI18N
        carta9.setToolTipText("");
        carta9.setBorder(null);
        carta9.setBorderPainted(false);
        carta9.setContentAreaFilled(false);
        carta9.setFocusable(false);
        carta9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/00.png"))); // NOI18N
        carta9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carta9MouseExited(evt);
            }
        });
        carta9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta9ActionPerformed(evt);
            }
        });

        carta10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/0.png"))); // NOI18N
        carta10.setToolTipText("");
        carta10.setBorder(null);
        carta10.setBorderPainted(false);
        carta10.setContentAreaFilled(false);
        carta10.setFocusable(false);
        carta10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/00.png"))); // NOI18N
        carta10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carta10MouseExited(evt);
            }
        });
        carta10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta10ActionPerformed(evt);
            }
        });

        carta11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/0.png"))); // NOI18N
        carta11.setToolTipText("");
        carta11.setBorder(null);
        carta11.setBorderPainted(false);
        carta11.setContentAreaFilled(false);
        carta11.setFocusable(false);
        carta11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/00.png"))); // NOI18N
        carta11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta11ActionPerformed(evt);
            }
        });

        carta12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/0.png"))); // NOI18N
        carta12.setToolTipText("");
        carta12.setBorder(null);
        carta12.setBorderPainted(false);
        carta12.setContentAreaFilled(false);
        carta12.setFocusable(false);
        carta12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/00.png"))); // NOI18N
        carta12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(carta9)
                        .addGap(18, 18, 18)
                        .addComponent(carta10)
                        .addGap(18, 18, 18)
                        .addComponent(carta11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carta12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(carta5)
                        .addGap(18, 18, 18)
                        .addComponent(carta6)
                        .addGap(18, 18, 18)
                        .addComponent(carta7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carta8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(carta1)
                        .addGap(18, 18, 18)
                        .addComponent(carta2)
                        .addGap(18, 18, 18)
                        .addComponent(carta3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carta4)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carta4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(carta1)
                        .addComponent(carta2)
                        .addComponent(carta3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carta6)
                    .addComponent(carta5)
                    .addComponent(carta7)
                    .addComponent(carta8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carta10)
                    .addComponent(carta11)
                    .addComponent(carta12)
                    .addComponent(carta9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Reiniciar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Reiniciar.setForeground(new java.awt.Color(255, 0, 0));
        Reiniciar.setText("Reiniciar");
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Reiniciar)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reiniciar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 396, 423);
    }// </editor-fold>//GEN-END:initComponents

    private void carta12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta12ActionPerformed
        // TODO add your handling code here:
        btnEnabled(carta12);
    }//GEN-LAST:event_carta12ActionPerformed

    private void carta11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta11ActionPerformed
        // TODO add your handling code here:
        btnEnabled(carta11);
    }//GEN-LAST:event_carta11ActionPerformed

    private void carta10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta10ActionPerformed
        // TODO add your handling code here:
        btnEnabled(carta10);
    }//GEN-LAST:event_carta10ActionPerformed

    private void carta10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta10MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_carta10MouseExited

    private void carta9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta9ActionPerformed
        // TODO add your handling code here:
        btnEnabled(carta9);
    }//GEN-LAST:event_carta9ActionPerformed

    private void carta9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta9MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_carta9MouseExited

    private void carta8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta8ActionPerformed
        // TODO add your handling code here:
        btnEnabled(carta8);
    }//GEN-LAST:event_carta8ActionPerformed

    private void carta8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta8MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_carta8MouseExited

    private void carta7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta7ActionPerformed
        // TODO add your handling code here:
        btnEnabled(carta7);
    }//GEN-LAST:event_carta7ActionPerformed

    private void carta7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta7MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_carta7MouseExited

    private void carta6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta6ActionPerformed
        // TODO add your handling code here:
        btnEnabled(carta6);
    }//GEN-LAST:event_carta6ActionPerformed

    private void carta6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta6MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_carta6MouseExited

    private void carta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta5ActionPerformed
        // TODO add your handling code here:
        btnEnabled(carta5);
    }//GEN-LAST:event_carta5ActionPerformed

    private void carta5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta5MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_carta5MouseExited

    private void carta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta4ActionPerformed
        // TODO add your handling code here:
        btnEnabled(carta4);
    }//GEN-LAST:event_carta4ActionPerformed

    private void carta4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta4MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_carta4MouseExited

    private void carta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta3ActionPerformed
        // TODO add your handling code here:
        btnEnabled(carta3);
    }//GEN-LAST:event_carta3ActionPerformed

    private void carta3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta3MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_carta3MouseExited

    private void carta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta2ActionPerformed
        // TODO add your handling code here:
        btnEnabled(carta2);
    }//GEN-LAST:event_carta2ActionPerformed

    private void carta2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta2MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_carta2MouseExited

    private void carta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta1ActionPerformed
        // TODO add your handling code here:
        btnEnabled(carta1);
    }//GEN-LAST:event_carta1ActionPerformed

    private void carta1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta1MouseExited
        // TODO add your handling code here:
        comparar();
    }//GEN-LAST:event_carta1MouseExited

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
        // TODO add your handling code here:
        reiniciar();
    }//GEN-LAST:event_ReiniciarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reiniciar;
    private javax.swing.JButton carta1;
    private javax.swing.JButton carta10;
    private javax.swing.JButton carta11;
    private javax.swing.JButton carta12;
    private javax.swing.JButton carta2;
    private javax.swing.JButton carta3;
    private javax.swing.JButton carta4;
    private javax.swing.JButton carta5;
    private javax.swing.JButton carta6;
    private javax.swing.JButton carta7;
    private javax.swing.JButton carta8;
    private javax.swing.JButton carta9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

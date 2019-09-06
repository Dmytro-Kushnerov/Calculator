package Calculator;

import javax.swing.JTextField;

public class CalcUI extends javax.swing.JFrame {

    private double num1, num2, result;
    private int operation;
    private boolean zerodisp, pointdisp;

    public CalcUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField = new javax.swing.JTextField();
        jLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jBttnPoint = new javax.swing.JButton();
        jBttnNegative = new javax.swing.JButton();
        jBttnPlus = new javax.swing.JButton();
        jBttnMinus = new javax.swing.JButton();
        jBttnMultiple = new javax.swing.JButton();
        jBttnDivision = new javax.swing.JButton();
        jBttnEquals = new javax.swing.JButton();
        jBttnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldActionPerformed(evt);
            }
        });

        jLabel.setForeground(new java.awt.Color(255, 0, 0));
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jBttnPoint.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBttnPoint.setText(".");
        jBttnPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnPointActionPerformed(evt);
            }
        });

        jBttnNegative.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBttnNegative.setText("+-");
        jBttnNegative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnNegativeActionPerformed(evt);
            }
        });

        jBttnPlus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBttnPlus.setText("+");
        jBttnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnPlusActionPerformed(evt);
            }
        });

        jBttnMinus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBttnMinus.setText("-");
        jBttnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnMinusActionPerformed(evt);
            }
        });

        jBttnMultiple.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBttnMultiple.setText("*");
        jBttnMultiple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnMultipleActionPerformed(evt);
            }
        });

        jBttnDivision.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBttnDivision.setText("/");
        jBttnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnDivisionActionPerformed(evt);
            }
        });

        jBttnEquals.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBttnEquals.setText("=");
        jBttnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnEqualsActionPerformed(evt);
            }
        });

        jBttnClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBttnClear.setText("C");
        jBttnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jTextField)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBttnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBttnNegative, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBttnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBttnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBttnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBttnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBttnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBttnMultiple, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBttnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBttnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBttnMultiple, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBttnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBttnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBttnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBttnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBttnNegative, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!zerodisp && !pointdisp) {
            jTextField.setText(null);
        }
        jTextField.setText(jTextField.getText() + "1");
        zerodisp = true;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!zerodisp && !pointdisp) {
            jTextField.setText(null);
        }
        jTextField.setText(jTextField.getText() + "2");
        zerodisp = true;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!zerodisp && !pointdisp) {
            jTextField.setText(null);
        }
        jTextField.setText(jTextField.getText() + "3");
        zerodisp = true;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!zerodisp && !pointdisp) {
            jTextField.setText(null);
        }
        jTextField.setText(jTextField.getText() + "4");
        zerodisp = true;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (!zerodisp && !pointdisp) {
            jTextField.setText(null);
        }
        jTextField.setText(jTextField.getText() + "5");
        zerodisp = true;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (!zerodisp && !pointdisp) {
            jTextField.setText(null);
        }
        jTextField.setText(jTextField.getText() + "6");
        zerodisp = true;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (!zerodisp && !pointdisp) {
            jTextField.setText(null);
        }
        jTextField.setText(jTextField.getText() + "7");
        zerodisp = true;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (!zerodisp && !pointdisp) {
            jTextField.setText(null);
        }
        jTextField.setText(jTextField.getText() + "8");
        zerodisp = true;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (!zerodisp && !pointdisp) {
            jTextField.setText(null);
        }
        jTextField.setText(jTextField.getText() + "9");
        zerodisp = true;
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        if (!zerodisp && !pointdisp) {
            jTextField.setText(null);
        }
        jTextField.setText(jTextField.getText() + "0");
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jBttnPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnPointActionPerformed
        if (!pointdisp) {
            jTextField.setText(jTextField.getText() + ".");
            pointdisp = true;
        }
    }//GEN-LAST:event_jBttnPointActionPerformed

    private void jBttnNegativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnNegativeActionPerformed
        num1 = Double.parseDouble(String.valueOf(jTextField.getText()));
        result = num1 * -1;

        jTextField.setText(String.valueOf(result));
        pointdisp = true;

        result = 0;
    }//GEN-LAST:event_jBttnNegativeActionPerformed

    private void jBttnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnClearActionPerformed
        jTextField.setText("0");
        zerodisp = false;
        pointdisp = false;
    }//GEN-LAST:event_jBttnClearActionPerformed

    private void jBttnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnPlusActionPerformed
        if (operation == 0) {
            num1 = Double.parseDouble(String.valueOf(jTextField.getText()));
        } else {
            num2 = Double.parseDouble(String.valueOf(jTextField.getText()));
        }
        if (operation == 1) {
            num1 += num2;
        }
        if (operation == 2) {
            num1 -= num2;
        }
        if (operation == 3) {
            num1 /= num2;
        }
        if (operation == 4) {
            num1 *= num2;
        }
        jTextField.setText("0");
        jLabel.setText(String.valueOf(num1) + " + ");

        operation = 1;

        pointdisp = false;
        zerodisp = false;
    }//GEN-LAST:event_jBttnPlusActionPerformed

    private void jBttnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnMinusActionPerformed
        if (operation == 0) {
            num1 = Double.parseDouble(String.valueOf(jTextField.getText()));
        } else {
            num2 = Double.parseDouble(String.valueOf(jTextField.getText()));
        }
        if (operation == 1) {
            num1 += num2;
        }
        if (operation == 2) {
            num1 -= num2;
        }
        if (operation == 3) {
            num1 /= num2;
        }
        if (operation == 4) {
            num1 *= num2;
        }
        jTextField.setText("0");
        jLabel.setText(String.valueOf(num1) + " - ");

        operation = 2;

        pointdisp = false;
        zerodisp = false;
    }//GEN-LAST:event_jBttnMinusActionPerformed

    private void jBttnMultipleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnMultipleActionPerformed
        if (operation == 0) {
            num1 = Double.parseDouble(String.valueOf(jTextField.getText()));
        } else {
            num2 = Double.parseDouble(String.valueOf(jTextField.getText()));
        }
        if (operation == 1) {
            num1 += num2;
        }
        if (operation == 2) {
            num1 -= num2;
        }
        if (operation == 3) {
            num1 /= num2;
        }
        if (operation == 4) {
            num1 *= num2;
        }
        jTextField.setText("0");
        jLabel.setText(String.valueOf(num1) + " * ");

        operation = 4;

        pointdisp = false;
        zerodisp = false;
    }//GEN-LAST:event_jBttnMultipleActionPerformed

    private void jBttnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnDivisionActionPerformed
        if (operation == 0) {
            num1 = Double.parseDouble(String.valueOf(jTextField.getText()));
        } else {
            num2 = Double.parseDouble(String.valueOf(jTextField.getText()));
        }
        if (operation == 1) {
            num1 += num2;
        }
        if (operation == 2) {
            num1 -= num2;
        }
        if (operation == 3) {
            num1 /= num2;
        }
        if (operation == 4) {
            num1 *= num2;
        }
        jTextField.setText("0");
        jLabel.setText(String.valueOf(num1) + " / ");

        operation = 3;

        pointdisp = false;
        zerodisp = false;
    }//GEN-LAST:event_jBttnDivisionActionPerformed

    private void jBttnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnEqualsActionPerformed
        num2 = Double.parseDouble(jTextField.getText());

        if (operation == 0) {
            result = num2;
            jLabel.setText(String.valueOf(num2));
        }

        if (operation == 1) {
            result = num1 + num2;
            jLabel.setText(jLabel.getText() + String.valueOf(num2));
        }

        if (operation == 2) {
            result = num1 - num2;
            jLabel.setText(jLabel.getText() + String.valueOf(num2));
        }

        if (operation == 3) {
            result = num1 / num2;
            jLabel.setText(jLabel.getText() + String.valueOf(num2));
        }

        if (operation == 4) {
            result = num1 * num2;
            jLabel.setText(jLabel.getText() + String.valueOf(num2));
        }

        jTextField.setText(String.valueOf(result));

        num1 = 0;
        num2 = 0;
        result = 0;

        operation = 0;
        pointdisp = false;
        zerodisp = false;
    }//GEN-LAST:event_jBttnEqualsActionPerformed

    public JTextField getjTextField() {
        return jTextField;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBttnClear;
    private javax.swing.JButton jBttnDivision;
    private javax.swing.JButton jBttnEquals;
    private javax.swing.JButton jBttnMinus;
    private javax.swing.JButton jBttnMultiple;
    private javax.swing.JButton jBttnNegative;
    private javax.swing.JButton jBttnPlus;
    private javax.swing.JButton jBttnPoint;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel;
    private javax.swing.JTextField jTextField;
    // End of variables declaration//GEN-END:variables
}

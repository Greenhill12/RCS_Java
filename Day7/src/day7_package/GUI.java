package day7_package;

public class GUI extends javax.swing.JPanel {

    String pirmaisSkaitlis = "";
    String otraisSkaitlis = "";
    
    boolean pressSum = false;
    boolean pressMinus = false;
    boolean pressMult = false;
    boolean pressDiv = false;
    boolean pressKap = false;
    
    private void Parbaude(String a){
        if(pressSum == true || pressMinus == true || pressMult == true || pressDiv == true || pressKap == true){
            otraisSkaitlis += a;
            Lauks1.setText(otraisSkaitlis);
        }else{
            pirmaisSkaitlis += a;
            Lauks1.setText(pirmaisSkaitlis);
        }
    }
   
    public GUI() {
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calc0 = new javax.swing.JButton();
        Lauks1 = new javax.swing.JLabel();
        calc1 = new javax.swing.JButton();
        calc2 = new javax.swing.JButton();
        calc3 = new javax.swing.JButton();
        calc4 = new javax.swing.JButton();
        calc5 = new javax.swing.JButton();
        calc6 = new javax.swing.JButton();
        calc7 = new javax.swing.JButton();
        calc8 = new javax.swing.JButton();
        calc9 = new javax.swing.JButton();
        calcPlus = new javax.swing.JButton();
        calcMinus = new javax.swing.JButton();
        calcMult = new javax.swing.JButton();
        calcDiv = new javax.swing.JButton();
        calcEqual = new javax.swing.JButton();
        calcClear = new javax.swing.JButton();
        calcKap = new javax.swing.JButton();

        calc0.setBackground(new java.awt.Color(0, 204, 0));
        calc0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        calc0.setForeground(new java.awt.Color(255, 0, 51));
        calc0.setText("0");
        calc0.setToolTipText("");
        calc0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calc0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc0ActionPerformed(evt);
            }
        });

        Lauks1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Lauks1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lauks1.setText("0");

        calc1.setBackground(new java.awt.Color(0, 204, 0));
        calc1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        calc1.setForeground(new java.awt.Color(255, 0, 51));
        calc1.setText("1");
        calc1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc1ActionPerformed(evt);
            }
        });

        calc2.setBackground(new java.awt.Color(0, 204, 0));
        calc2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        calc2.setForeground(new java.awt.Color(255, 0, 51));
        calc2.setText("2");
        calc2.setToolTipText("");
        calc2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc2ActionPerformed(evt);
            }
        });

        calc3.setBackground(new java.awt.Color(0, 204, 0));
        calc3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        calc3.setForeground(new java.awt.Color(255, 0, 51));
        calc3.setText("3");
        calc3.setToolTipText("");
        calc3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc3ActionPerformed(evt);
            }
        });

        calc4.setBackground(new java.awt.Color(0, 204, 0));
        calc4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        calc4.setForeground(new java.awt.Color(255, 0, 51));
        calc4.setText("4");
        calc4.setToolTipText("");
        calc4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc4ActionPerformed(evt);
            }
        });

        calc5.setBackground(new java.awt.Color(0, 204, 0));
        calc5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        calc5.setForeground(new java.awt.Color(255, 0, 51));
        calc5.setText("5");
        calc5.setToolTipText("");
        calc5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc5ActionPerformed(evt);
            }
        });

        calc6.setBackground(new java.awt.Color(0, 204, 0));
        calc6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        calc6.setForeground(new java.awt.Color(255, 0, 51));
        calc6.setText("6");
        calc6.setToolTipText("");
        calc6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calc6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc6ActionPerformed(evt);
            }
        });

        calc7.setBackground(new java.awt.Color(0, 204, 0));
        calc7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        calc7.setForeground(new java.awt.Color(255, 0, 51));
        calc7.setText("7");
        calc7.setToolTipText("");
        calc7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calc7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc7ActionPerformed(evt);
            }
        });

        calc8.setBackground(new java.awt.Color(0, 204, 0));
        calc8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        calc8.setForeground(new java.awt.Color(255, 0, 51));
        calc8.setText("8");
        calc8.setToolTipText("");
        calc8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calc8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc8ActionPerformed(evt);
            }
        });

        calc9.setBackground(new java.awt.Color(0, 204, 0));
        calc9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        calc9.setForeground(new java.awt.Color(255, 0, 51));
        calc9.setText("9");
        calc9.setToolTipText("");
        calc9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calc9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc9ActionPerformed(evt);
            }
        });

        calcPlus.setBackground(new java.awt.Color(0, 204, 0));
        calcPlus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        calcPlus.setForeground(new java.awt.Color(255, 0, 51));
        calcPlus.setText("+");
        calcPlus.setToolTipText("");
        calcPlus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calcPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcPlusActionPerformed(evt);
            }
        });

        calcMinus.setBackground(new java.awt.Color(0, 204, 0));
        calcMinus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        calcMinus.setForeground(new java.awt.Color(255, 0, 51));
        calcMinus.setText("-");
        calcMinus.setToolTipText("");
        calcMinus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calcMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcMinusActionPerformed(evt);
            }
        });

        calcMult.setBackground(new java.awt.Color(0, 204, 0));
        calcMult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        calcMult.setForeground(new java.awt.Color(255, 0, 51));
        calcMult.setText("*");
        calcMult.setToolTipText("");
        calcMult.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calcMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcMultActionPerformed(evt);
            }
        });

        calcDiv.setBackground(new java.awt.Color(0, 204, 0));
        calcDiv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        calcDiv.setForeground(new java.awt.Color(255, 0, 51));
        calcDiv.setText("/");
        calcDiv.setToolTipText("");
        calcDiv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calcDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcDivActionPerformed(evt);
            }
        });

        calcEqual.setBackground(new java.awt.Color(0, 204, 0));
        calcEqual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        calcEqual.setForeground(new java.awt.Color(255, 0, 51));
        calcEqual.setText("=");
        calcEqual.setToolTipText("");
        calcEqual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calcEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcEqualActionPerformed(evt);
            }
        });

        calcClear.setBackground(new java.awt.Color(0, 204, 0));
        calcClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        calcClear.setForeground(new java.awt.Color(255, 0, 51));
        calcClear.setText("CE");
        calcClear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calcClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcClearActionPerformed(evt);
            }
        });

        calcKap.setBackground(new java.awt.Color(0, 204, 0));
        calcKap.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        calcKap.setForeground(new java.awt.Color(255, 0, 51));
        calcKap.setText("^");
        calcKap.setToolTipText("");
        calcKap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calcKap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcKapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Lauks1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(calc7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(calc8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(calc4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(calc5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(calc9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(calc6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(calc1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calc2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calc3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(calcClear, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calc0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calcMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcMult, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(calcEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calcKap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lauks1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calcPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(calc7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(calc8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(calc9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calcMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(calc4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(calc5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(calc6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calcMult, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(calc1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(calc2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(calc3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calc0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcKap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void calc0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc0ActionPerformed
        Parbaude("0");        
    }//GEN-LAST:event_calc0ActionPerformed

    private void calc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc1ActionPerformed
        Parbaude("1");
    }//GEN-LAST:event_calc1ActionPerformed

    private void calc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc2ActionPerformed
        Parbaude("2");
    }//GEN-LAST:event_calc2ActionPerformed

    private void calc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc3ActionPerformed
        Parbaude("3");
    }//GEN-LAST:event_calc3ActionPerformed

    private void calc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc4ActionPerformed
        Parbaude("4");
    }//GEN-LAST:event_calc4ActionPerformed

    private void calc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc5ActionPerformed
        Parbaude("5");
    }//GEN-LAST:event_calc5ActionPerformed

    private void calc6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc6ActionPerformed
        Parbaude("6");
    }//GEN-LAST:event_calc6ActionPerformed

    private void calc7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc7ActionPerformed
        Parbaude("7");
    }//GEN-LAST:event_calc7ActionPerformed

    private void calc8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc8ActionPerformed
        Parbaude("8");
    }//GEN-LAST:event_calc8ActionPerformed

    private void calc9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc9ActionPerformed
        Parbaude("9");
    }//GEN-LAST:event_calc9ActionPerformed

    private void calcPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcPlusActionPerformed
        pirmaisSkaitlis = Lauks1.getText();       
        pressSum = true;
    }//GEN-LAST:event_calcPlusActionPerformed

    private void calcMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcMinusActionPerformed
        pirmaisSkaitlis = Lauks1.getText();
        pressMinus = true;
    }//GEN-LAST:event_calcMinusActionPerformed

    private void calcMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcMultActionPerformed
        pirmaisSkaitlis = Lauks1.getText();
        pressMult = true;
    }//GEN-LAST:event_calcMultActionPerformed

    private void calcDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcDivActionPerformed
        pirmaisSkaitlis = Lauks1.getText();
        pressDiv = true;
    }//GEN-LAST:event_calcDivActionPerformed

    private void calcEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcEqualActionPerformed
        Aprekins rekins = new Aprekins();
                
        double num1 = Integer.valueOf(pirmaisSkaitlis);
        double num2;
        
        if(otraisSkaitlis == ""){
            num2 = 0;
        }else{
            num2 = Integer.valueOf(otraisSkaitlis); 
        }
        
        if(pressSum){            
            Lauks1.setText(rekins.Sum(num1, num2));
            pressSum = false;
        }else if(pressMinus){
            Lauks1.setText(rekins.Minus(num1, num2));
            pressMinus = false;
        }else if(pressMult){
            Lauks1.setText(rekins.Mult(num1, num2));
            pressMult = false;
        }else if(pressDiv){
            Lauks1.setText(rekins.Div(num1, num2));
            pressDiv = false;
        }else if(pressKap){
            Lauks1.setText(rekins.Kap(num1, num2));
            pressKap = false;
        }
    }//GEN-LAST:event_calcEqualActionPerformed

    private void calcClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcClearActionPerformed
        pirmaisSkaitlis = "";
        otraisSkaitlis = "";
        Lauks1.setText("0");
    }//GEN-LAST:event_calcClearActionPerformed

    private void calcKapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcKapActionPerformed
        pirmaisSkaitlis = Lauks1.getText();
        pressKap = true;
    }//GEN-LAST:event_calcKapActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lauks1;
    private javax.swing.JButton calc0;
    private javax.swing.JButton calc1;
    private javax.swing.JButton calc2;
    private javax.swing.JButton calc3;
    private javax.swing.JButton calc4;
    private javax.swing.JButton calc5;
    private javax.swing.JButton calc6;
    private javax.swing.JButton calc7;
    private javax.swing.JButton calc8;
    private javax.swing.JButton calc9;
    private javax.swing.JButton calcClear;
    private javax.swing.JButton calcDiv;
    private javax.swing.JButton calcEqual;
    private javax.swing.JButton calcKap;
    private javax.swing.JButton calcMinus;
    private javax.swing.JButton calcMult;
    private javax.swing.JButton calcPlus;
    // End of variables declaration//GEN-END:variables
}

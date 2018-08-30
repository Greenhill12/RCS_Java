package day8_package;

import java.awt.Color;

public class GUI extends javax.swing.JPanel {

    public GUI() {
        initComponents();
        
    }
        
    private boolean player;
    private String value;
                   
    private String Game(){
               
        String a = "";       
               
        if(player == false){
            a = "O";
            player = !player;
        }else{
            a = "X";
            player = !player;
        }
        
        return a;        
    }
    
    private boolean Parbaude(){
       
        boolean check = false; 
       
        if(but1.getText() == "O" && but2.getText() == "O" && but3.getText() == "O" ||
           but4.getText() == "O" && but5.getText() == "O" && but6.getText() == "O" ||
           but7.getText() == "O" && but8.getText() == "O" && but9.getText() == "O" ||
           but1.getText() == "O" && but4.getText() == "O" && but7.getText() == "O" ||
           but2.getText() == "O" && but5.getText() == "O" && but8.getText() == "O" ||
           but3.getText() == "O" && but6.getText() == "O" && but9.getText() == "O" ||
           but1.getText() == "O" && but5.getText() == "O" && but9.getText() == "O" ||
           but3.getText() == "O" && but5.getText() == "O" && but7.getText() == "O" ||
           but1.getText() == "X" && but2.getText() == "X" && but3.getText() == "X" ||
           but4.getText() == "X" && but5.getText() == "X" && but6.getText() == "X" ||
           but7.getText() == "X" && but8.getText() == "X" && but9.getText() == "X" ||
           but1.getText() == "X" && but4.getText() == "X" && but7.getText() == "X" ||
           but2.getText() == "X" && but5.getText() == "X" && but8.getText() == "X" ||
           but3.getText() == "X" && but6.getText() == "X" && but9.getText() == "X" ||
           but1.getText() == "X" && but5.getText() == "X" && but9.getText() == "X" ||
           but3.getText() == "X" && but5.getText() == "X" && but7.getText() == "X"){               
               check = true;
        }       
        return check;
    }
    
    private String Uzvara(){
       String uzvara = "";
        
        if(but1.getText() == "O" && but2.getText() == "O" && but3.getText() == "O" ||
           but4.getText() == "O" && but5.getText() == "O" && but6.getText() == "O" ||
           but7.getText() == "O" && but8.getText() == "O" && but9.getText() == "O" ||
           but1.getText() == "O" && but4.getText() == "O" && but7.getText() == "O" ||
           but2.getText() == "O" && but5.getText() == "O" && but8.getText() == "O" ||
           but3.getText() == "O" && but6.getText() == "O" && but9.getText() == "O" ||
           but1.getText() == "O" && but5.getText() == "O" && but9.getText() == "O" ||
           but3.getText() == "O" && but5.getText() == "O" && but7.getText() == "O"){
            uzvara = "1";
        }else if(but1.getText() == "X" && but2.getText() == "X" && but3.getText() == "X" ||
                 but4.getText() == "X" && but5.getText() == "X" && but6.getText() == "X" ||
                 but7.getText() == "X" && but8.getText() == "X" && but9.getText() == "X" ||
                 but1.getText() == "X" && but4.getText() == "X" && but7.getText() == "X" ||
                 but2.getText() == "X" && but5.getText() == "X" && but8.getText() == "X" ||
                 but3.getText() == "X" && but6.getText() == "X" && but9.getText() == "X" ||
                 but1.getText() == "X" && but5.getText() == "X" && but9.getText() == "X" ||
                 but3.getText() == "X" && but5.getText() == "X" && but7.getText() == "X"){
            uzvara = "2";
        }        
        return uzvara;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        but1 = new javax.swing.JButton();
        but2 = new javax.swing.JButton();
        but3 = new javax.swing.JButton();
        but4 = new javax.swing.JButton();
        but5 = new javax.swing.JButton();
        but6 = new javax.swing.JButton();
        but7 = new javax.swing.JButton();
        but8 = new javax.swing.JButton();
        but9 = new javax.swing.JButton();
        Heading = new javax.swing.JLabel();
        alert = new javax.swing.JLabel();
        playerO = new javax.swing.JLabel();
        playerX = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();

        but1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1ActionPerformed(evt);
            }
        });

        but2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but2ActionPerformed(evt);
            }
        });

        but3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        but3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but3ActionPerformed(evt);
            }
        });

        but4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        but4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but4ActionPerformed(evt);
            }
        });

        but5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        but5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but5ActionPerformed(evt);
            }
        });

        but6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        but6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but6ActionPerformed(evt);
            }
        });

        but7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        but7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but7ActionPerformed(evt);
            }
        });

        but8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        but8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but8ActionPerformed(evt);
            }
        });

        but9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        but9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but9ActionPerformed(evt);
            }
        });

        Heading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("DESAS");

        alert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        playerO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        playerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerO.setText("O");
        playerO.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                playerOAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        playerX.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        playerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerX.setText("X");
        playerX.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                playerXAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        refresh.setText("↻");
        refresh.setMargin(new java.awt.Insets(2, 2, 2, 2));
        refresh.setMaximumSize(new java.awt.Dimension(20, 20));
        refresh.setMinimumSize(new java.awt.Dimension(20, 20));
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(playerO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(but4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(but5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(but6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(but7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(but8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(but9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(but1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(but2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(but3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(playerX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(alert, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Heading)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(but7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(but5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(but1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(but3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playerO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(alert, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
        if(Uzvara() == ""){
                
            if(value == "O" || value == "X"){
                alert.setText("Šis lauciņš ir aizņemts. Izvēlies citu.");
            }else{
                alert.setText("");
                but1.setText(Game());

                Parbaude();

                if(Parbaude() == true){
                    if(Uzvara() == "1"){
                        alert.setText("Spēle beigusies. Uzvarēja 1. spēlētājs!");
                    }else if(Uzvara() == "2"){
                        alert.setText("Spēle beigusies. Uzvarēja 2. spēlētājs!");
                    }            
                }
            }
        }        
        value = "";
    }//GEN-LAST:event_but1ActionPerformed

    private void but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2ActionPerformed
        if(Uzvara() == ""){
        
            value = but2.getText();

            if(value == "O" || value == "X"){
                alert.setText("Šis lauciņš ir aizņemts. Izvēlies citu.");
            }else{
                alert.setText("");
                but2.setText(Game());

                Parbaude();

                if(Parbaude() == true){
                    if(Uzvara() == "1"){
                        alert.setText("Spēle beigusies. Uzvarēja 1. spēlētājs!");
                    }else if(Uzvara() == "2"){
                        alert.setText("Spēle beigusies. Uzvarēja 2. spēlētājs!");
                    }            
                }
            }
        }
        
        value = "";
    }//GEN-LAST:event_but2ActionPerformed

    private void but3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but3ActionPerformed
        if(Uzvara() == ""){
          
            if(value == "O" || value == "X"){
                alert.setText("Šis lauciņš ir aizņemts. Izvēlies citu.");
            }else{
                alert.setText("");
                but3.setText(Game());

                Parbaude();

                if(Parbaude() == true){
                    if(Uzvara() == "1"){
                        alert.setText("Spēle beigusies. Uzvarēja 1. spēlētājs!");
                    }else if(Uzvara() == "2"){
                        alert.setText("Spēle beigusies. Uzvarēja 2. spēlētājs!");
                    }            
                }
            }
        }        
        value = "";
    }//GEN-LAST:event_but3ActionPerformed

    private void but4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but4ActionPerformed
        if(Uzvara() == ""){
        
            value = but4.getText();

            if(value == "O" || value == "X"){
                alert.setText("Šis lauciņš ir aizņemts. Izvēlies citu.");
            }else{
                alert.setText("");
                but4.setText(Game());

                Parbaude();

                if(Parbaude() == true){
                    if(Uzvara() == "1"){
                        alert.setText("Spēle beigusies. Uzvarēja 1. spēlētājs!");
                    }else if(Uzvara() == "2"){
                        alert.setText("Spēle beigusies. Uzvarēja 2. spēlētājs!");
                    }            
                }
            }          
        }
        value = "";
    }//GEN-LAST:event_but4ActionPerformed

    private void but5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but5ActionPerformed
        if(Uzvara() == ""){
        
            value = but5.getText();

            if(value == "O" || value == "X"){
                alert.setText("Šis lauciņš ir aizņemts. Izvēlies citu.");
            }else{
                alert.setText("");
                but5.setText(Game());

                Parbaude();

                if(Parbaude() == true){
                    if(Uzvara() == "1"){
                        alert.setText("Spēle beigusies. Uzvarēja 1. spēlētājs!");
                    }else if(Uzvara() == "2"){
                        alert.setText("Spēle beigusies. Uzvarēja 2. spēlētājs!");
                    }            
                }
            }
        }
        value = "";
    }//GEN-LAST:event_but5ActionPerformed

    private void but6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but6ActionPerformed
        if(Uzvara() == ""){
        
            value = but6.getText();

            if(value == "O" || value == "X"){
                alert.setText("Šis lauciņš ir aizņemts. Izvēlies citu.");
            }else{
                alert.setText("");
                but6.setText(Game());

                Parbaude();

                if(Parbaude() == true){
                    if(Uzvara() == "1"){
                        alert.setText("Spēle beigusies. Uzvarēja 1. spēlētājs!");
                    }else if(Uzvara() == "2"){
                        alert.setText("Spēle beigusies. Uzvarēja 2. spēlētājs!");
                    }            
                }
            }
        }
        value = "";
    }//GEN-LAST:event_but6ActionPerformed

    private void but7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but7ActionPerformed
        if(Uzvara() == ""){
        
            value = but7.getText();

            if(value == "O" || value == "X"){
                alert.setText("Šis lauciņš ir aizņemts. Izvēlies citu.");
            }else{
                alert.setText("");
                but7.setText(Game());

                Parbaude();

                if(Parbaude() == true){
                    if(Uzvara() == "1"){
                        alert.setText("Spēle beigusies. Uzvarēja 1. spēlētājs!");
                    }else if(Uzvara() == "2"){
                        alert.setText("Spēle beigusies. Uzvarēja 2. spēlētājs!");
                    }            
                }
            }
        }
        value = "";
    }//GEN-LAST:event_but7ActionPerformed

    private void but8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but8ActionPerformed
        if(Uzvara() == ""){
        
            value = but8.getText();

            if(value == "O" || value == "X"){
                alert.setText("Šis lauciņš ir aizņemts. Izvēlies citu.");
            }else{
                alert.setText("");
                but8.setText(Game());

                Parbaude();

                if(Parbaude() == true){
                    if(Uzvara() == "1"){
                        alert.setText("Spēle beigusies. Uzvarēja 1. spēlētājs!");
                    }else if(Uzvara() == "2"){
                        alert.setText("Spēle beigusies. Uzvarēja 2. spēlētājs!");
                    }            
                }
            }
        }
        value = "";
    }//GEN-LAST:event_but8ActionPerformed

    private void but9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but9ActionPerformed
        if(Uzvara() == ""){

            value = but9.getText();

            if(value == "O" || value == "X"){
                alert.setText("Šis lauciņš ir aizņemts. Izvēlies citu.");
            }else{
                alert.setText("");
                but9.setText(Game());

                Parbaude();

                if(Parbaude() == true){
                    if(Uzvara() == "1"){
                        alert.setText("Spēle beigusies. Uzvarēja 1. spēlētājs!");
                    }else if(Uzvara() == "2"){
                        alert.setText("Spēle beigusies. Uzvarēja 2. spēlētājs!");
                    }            
                }
            }
        }
        value = "";
    }//GEN-LAST:event_but9ActionPerformed

    private void playerOAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_playerOAncestorAdded
        if(player == false){
            playerO.setOpaque(true);
            playerO.setBackground(Color.green);
        }else{
            playerO.setOpaque(false);
        }
        
    }//GEN-LAST:event_playerOAncestorAdded

    private void playerXAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_playerXAncestorAdded
        if(player == true){
            playerO.setOpaque(true);
            playerO.setBackground(Color.green);
        }else{
            playerO.setOpaque(false);
        }
    }//GEN-LAST:event_playerXAncestorAdded

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel alert;
    private javax.swing.JButton but1;
    private javax.swing.JButton but2;
    private javax.swing.JButton but3;
    private javax.swing.JButton but4;
    private javax.swing.JButton but5;
    private javax.swing.JButton but6;
    private javax.swing.JButton but7;
    private javax.swing.JButton but8;
    private javax.swing.JButton but9;
    private javax.swing.JLabel playerO;
    private javax.swing.JLabel playerX;
    private javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables
}

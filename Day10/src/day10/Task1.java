package day10;

public class Task1 extends javax.swing.JPanel {

    public Task1() {
        initComponents();
    }
    
    private String variable;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        input = new javax.swing.JTextField();
        but1 = new javax.swing.JButton();
        but2 = new javax.swing.JButton();
        but3 = new javax.swing.JButton();
        message = new javax.swing.JLabel();

        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        but1.setText("Skaitlis"); // NOI18N
        but1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1ActionPerformed(evt);
            }
        });

        but2.setText("Zvaigznes");
        but2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but2ActionPerformed(evt);
            }
        });

        but3.setText("Lielais burts");
        but3.setMargin(new java.awt.Insets(2, 2, 2, 2));
        but3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(input)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(but1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(but2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(but3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(but1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(but2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(but3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
        variable = input.getText();
        
        if(variable.matches(".*\\d+.*")){
            int number = Integer.parseInt(variable);
            if(number < 5){
                message.setText("Ievadītais skaitlis ir mazāks par 5.");
            }else if(number == 5){
                message.setText("Ievadītais skaitlis ir 5.");
            }else if(number > 5){
                message.setText("Ievadītais skaitlis ir lielāks par 5.");
            }
        }else{
            message.setText("Ievadītā vērtība nav skaitilis");
        }
    }//GEN-LAST:event_but1ActionPerformed

    private void but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2ActionPerformed
        variable = input.getText();
        
        if(variable.matches(".*\\d+.*")){
            int number = Integer.parseInt(variable);
            String star = "";
            
            if(number <= 10){
                for(int i = 0; i < number; i++){
                    star += "#";
                }                
                message.setText(star);
            }else{
                message.setText("Ievadītais skaitlis pārsniedz 10.");
            }        
        }else{
            message.setText("Ievadītā vērtība nav skaitilis");
        }
    }//GEN-LAST:event_but2ActionPerformed

    private void but3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but3ActionPerformed
        variable = input.getText();
            
        if(Character.isUpperCase(variable.charAt(0))){
            variable = variable.toUpperCase();
            
            message.setText(variable);
        }else{
            message.setText(variable);
        }
    }//GEN-LAST:event_but3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but1;
    private javax.swing.JButton but2;
    private javax.swing.JButton but3;
    private javax.swing.JTextField input;
    private javax.swing.JLabel message;
    // End of variables declaration//GEN-END:variables
}

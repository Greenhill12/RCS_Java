package day10;

import java.awt.Color;

public class Task2 extends javax.swing.JPanel {

    public Task2() {
        initComponents();
    }
    
    private String name;
    private String name2;
    
    char[] burti;
    char[] burti2;
    String[] pogas = new String[2];
    
    private String b1;
    private String b2;
    private String b3;
    private String b4;
    private String b5;
    
    private String bb1;
    private String bb2;
    private String bb3;
    private String bb4;
    private String bb5;
    
    private String empty;
    
    private boolean Winner(){
        boolean win = false;
        
        if(burti[0] == burti2[0] && burti[1] == burti2[1] && burti[2] == burti2[2] && burti[3] == burti2[3] && burti[4] == burti2[4]){
                win = true;
            }
        return win;        
    }
    
    private void NewGame(){
        
        name = "";
        name2 = "";
        input.setEditable(true);
        alert.setText("");
        but1.setBackground(new Color (240, 240, 240));
        
        check1.setText("");     check1.setBackground(new Color (240,240,240));
        check2.setText("");     check2.setBackground(new Color (240,240,240));
        check3.setText("");     check3.setBackground(new Color (240,240,240));
        check4.setText("");     check4.setBackground(new Color (240,240,240));
        check5.setText("");     check5.setBackground(new Color (240,240,240));
        check6.setText("");     check6.setBackground(new Color (240,240,240));
        check7.setText("");     check7.setBackground(new Color (240,240,240));
        check8.setText("");     check8.setBackground(new Color (240,240,240));
        check9.setText("");     check9.setBackground(new Color (240,240,240));
        check10.setText("");    check10.setBackground(new Color (240,240,240));
        check11.setText("");    check11.setBackground(new Color (240,240,240));
        check12.setText("");    check12.setBackground(new Color (240,240,240));
        check13.setText("");    check13.setBackground(new Color (240,240,240));
        check14.setText("");    check14.setBackground(new Color (240,240,240));
        check15.setText("");    check15.setBackground(new Color (240,240,240));
        check16.setText("");    check16.setBackground(new Color (240,240,240));
        check17.setText("");    check17.setBackground(new Color (240,240,240));
        check18.setText("");    check18.setBackground(new Color (240,240,240));
        check19.setText("");    check19.setBackground(new Color (240,240,240));
        check20.setText("");    check20.setBackground(new Color (240,240,240));
        check21.setText("");    check21.setBackground(new Color (240,240,240));
        check22.setText("");    check22.setBackground(new Color (240,240,240));
        check23.setText("");    check23.setBackground(new Color (240,240,240));
        check24.setText("");    check24.setBackground(new Color (240,240,240));
        check25.setText("");    check25.setBackground(new Color (240,240,240));
    }
    
    private void Parbaude1(){
        
        empty = "-";
        
        if(burti2[0] == burti[0]){
            check1.setBackground(Color.green);
            check1.setText(bb1);
        }else if(burti2[0] != burti[0]){
            for(int i = 0; i < 5; i++){
                if(burti2[0] == burti[i]){  
                    check1.setBackground(Color.yellow);
                    check1.setText(bb1);
                }                            
            }
        }
        if(check1.getText().equals("")){
            check1.setBackground(Color.red); 
            check1.setText(empty);
        }
                
        if(burti2[1] == burti[1]){
            check2.setBackground(Color.green);
            check2.setText(bb2);
        }else if(burti2[1] != burti[1]){
            for(int i = 0; i < 5; i++){
                if(burti2[1] == burti[i]){
                    check2.setBackground(Color.yellow);
                    check2.setText(bb2);
                }              
            }
        }
        if(check2.getText().equals("")){
            check2.setBackground(Color.red); 
            check2.setText(empty);
        }
                    
        if(burti2[2] == burti[2]){
            check3.setBackground(Color.green);
            check3.setText(bb3);
        }else if(burti2[2] != burti[2]){
            for(int i = 0; i < 5; i++){
                if(burti2[2] == burti[i]){
                    check3.setBackground(Color.yellow);
                    check3.setText(bb3);
                }             
            }
        }
        if(check3.getText().equals("")){
            check3.setBackground(Color.red); 
            check3.setText(empty);
        }
                
        if(burti2[3] == burti[3]){
            check4.setBackground(Color.green);
            check4.setText(bb4);
        }else if(burti2[3] != burti[3]){
            for(int i = 0; i < 5; i++){
                if(burti2[3] == burti[i]){
                    check4.setBackground(Color.yellow);
                    check4.setText(bb4);
                }               
            }
        }
        if(check4.getText().equals("")){
            check4.setBackground(Color.red); 
            check4.setText(empty);
        }
        
        if(burti2[4] == burti[4]){
            check5.setBackground(Color.green);
            check5.setText(bb5);
        }else if(burti2[4] != burti[4]){
            for(int i = 0; i < 5; i++){
                if(burti2[4] == burti[i]){
                    check5.setBackground(Color.yellow);
                    check5.setText(bb5);                    
                }              
            }         
        }
        if(check5.getText().equals("")){
            check5.setBackground(Color.red); 
            check5.setText(empty);
        }
    }
    
    private void Parbaude2(){
               
        if(burti2[0] == burti[0]){
            check6.setBackground(Color.green);
            check6.setText(bb1);
        }else if(burti2[0] != burti[0]){
            for(int i = 0; i < 5; i++){
                if(burti2[0] == burti[i]){  
                    check6.setBackground(Color.yellow);
                    check6.setText(bb1);
                }                            
            }
        }
        if(check6.getText().equals("")){
            check6.setBackground(Color.red); 
            check6.setText(empty);
        }
                
        if(burti2[1] == burti[1]){
            check7.setBackground(Color.green);
            check7.setText(bb2);
        }else if(burti2[1] != burti[1]){
            for(int i = 0; i < 5; i++){
                if(burti2[1] == burti[i]){
                    check7.setBackground(Color.yellow);
                    check7.setText(bb2);
                }              
            }
        }
        if(check7.getText().equals("")){
            check7.setBackground(Color.red); 
            check7.setText(empty);
        }
                    
        if(burti2[2] == burti[2]){
            check8.setBackground(Color.green);
            check8.setText(bb3);
        }else if(burti2[2] != burti[2]){
            for(int i = 0; i < 5; i++){
                if(burti2[2] == burti[i]){
                    check8.setBackground(Color.yellow);
                    check8.setText(bb3);
                }             
            }
        }
        if(check8.getText().equals("")){
            check8.setBackground(Color.red); 
            check8.setText(empty);
        }
                
        if(burti2[3] == burti[3]){
            check9.setBackground(Color.green);
            check9.setText(bb4);
        }else if(burti2[3] != burti[3]){
            for(int i = 0; i < 5; i++){
                if(burti2[3] == burti[i]){
                    check9.setBackground(Color.yellow);
                    check9.setText(bb4);
                }               
            }
        }
        if(check9.getText().equals("")){
            check9.setBackground(Color.red); 
            check9.setText(empty);
        }
        
        if(burti2[4] == burti[4]){
            check10.setBackground(Color.green);
            check10.setText(bb5);
        }else if(burti2[4] != burti[4]){
            for(int i = 0; i < 5; i++){
                if(burti2[4] == burti[i]){
                    check10.setBackground(Color.yellow);
                    check10.setText(bb5);                    
                }              
            }         
        }
        if(check10.getText().equals("")){
            check10.setBackground(Color.red); 
            check10.setText(empty);
        }
    }
    
    private void Parbaude3(){
               
        if(burti2[0] == burti[0]){
            check11.setBackground(Color.green);
            check11.setText(bb1);
        }else if(burti2[0] != burti[0]){
            for(int i = 0; i < 5; i++){
                if(burti2[0] == burti[i]){  
                    check11.setBackground(Color.yellow);
                    check11.setText(bb1);
                }                            
            }
        }
        if(check11.getText().equals("")){
            check11.setBackground(Color.red); 
            check11.setText(empty);
        }
                
        if(burti2[1] == burti[1]){
            check12.setBackground(Color.green);
            check12.setText(bb2);
        }else if(burti2[1] != burti[1]){
            for(int i = 0; i < 5; i++){
                if(burti2[1] == burti[i]){
                    check12.setBackground(Color.yellow);
                    check12.setText(bb2);
                }              
            }
        }
        if(check12.getText().equals("")){
            check12.setBackground(Color.red); 
            check12.setText(empty);
        }
                    
        if(burti2[2] == burti[2]){
            check13.setBackground(Color.green);
            check13.setText(bb3);
        }else if(burti2[2] != burti[2]){
            for(int i = 0; i < 5; i++){
                if(burti2[2] == burti[i]){
                    check13.setBackground(Color.yellow);
                    check13.setText(bb3);
                }             
            }
        }
        if(check13.getText().equals("")){
            check13.setBackground(Color.red); 
            check13.setText(empty);
        }
                
        if(burti2[3] == burti[3]){
            check14.setBackground(Color.green);
            check14.setText(bb4);
        }else if(burti2[3] != burti[3]){
            for(int i = 0; i < 5; i++){
                if(burti2[3] == burti[i]){
                    check14.setBackground(Color.yellow);
                    check14.setText(bb4);
                }               
            }
        }
        if(check14.getText().equals("")){
            check14.setBackground(Color.red); 
            check14.setText(empty);
        }
        
        if(burti2[4] == burti[4]){
            check15.setBackground(Color.green);
            check15.setText(bb5);
        }else if(burti2[4] != burti[4]){
            for(int i = 0; i < 5; i++){
                if(burti2[4] == burti[i]){
                    check15.setBackground(Color.yellow);
                    check15.setText(bb5);                    
                }              
            }         
        }
        if(check15.getText().equals("")){
            check15.setBackground(Color.red); 
            check15.setText(empty);
        }
    }
    
    private void Parbaude4(){
               
        if(burti2[0] == burti[0]){
            check16.setBackground(Color.green);
            check16.setText(bb1);
        }else if(burti2[0] != burti[0]){
            for(int i = 0; i < 5; i++){
                if(burti2[0] == burti[i]){  
                    check16.setBackground(Color.yellow);
                    check16.setText(bb1);
                }                            
            }
        }
        if(check16.getText().equals("")){
            check16.setBackground(Color.red); 
            check16.setText(empty);
        }
                
        if(burti2[1] == burti[1]){
            check17.setBackground(Color.green);
            check17.setText(bb2);
        }else if(burti2[1] != burti[1]){
            for(int i = 0; i < 5; i++){
                if(burti2[1] == burti[i]){
                    check17.setBackground(Color.yellow);
                    check17.setText(bb2);
                }              
            }
        }
        if(check17.getText().equals("")){
            check17.setBackground(Color.red); 
            check17.setText(empty);
        }
                    
        if(burti2[2] == burti[2]){
            check18.setBackground(Color.green);
            check18.setText(bb3);
        }else if(burti2[2] != burti[2]){
            for(int i = 0; i < 5; i++){
                if(burti2[2] == burti[i]){
                    check18.setBackground(Color.yellow);
                    check18.setText(bb3);
                }             
            }
        }
        if(check18.getText().equals("")){
            check18.setBackground(Color.red); 
            check18.setText(empty);
        }
                
        if(burti2[3] == burti[3]){
            check19.setBackground(Color.green);
            check19.setText(bb4);
        }else if(burti2[3] != burti[3]){
            for(int i = 0; i < 5; i++){
                if(burti2[3] == burti[i]){
                    check19.setBackground(Color.yellow);
                    check19.setText(bb4);
                }               
            }
        }
        if(check19.getText().equals("")){
            check19.setBackground(Color.red); 
            check19.setText(empty);
        }
        
        if(burti2[4] == burti[4]){
            check20.setBackground(Color.green);
            check20.setText(bb5);
        }else if(burti2[4] != burti[4]){
            for(int i = 0; i < 5; i++){
                if(burti2[4] == burti[i]){
                    check20.setBackground(Color.yellow);
                    check20.setText(bb5);                    
                }              
            }         
        }
        if(check20.getText().equals("")){
            check20.setBackground(Color.red); 
            check20.setText(empty);
        }
    }
    
    private void Parbaude5(){
               
        if(burti2[0] == burti[0]){
            check21.setBackground(Color.green);
            check21.setText(bb1);
        }else if(burti2[0] != burti[0]){
            for(int i = 0; i < 5; i++){
                if(burti2[0] == burti[i]){  
                    check21.setBackground(Color.yellow);
                    check21.setText(bb1);
                }                            
            }
        }
        if(check21.getText().equals("")){
            check21.setBackground(Color.red); 
            check21.setText(empty);
        }
                
        if(burti2[1] == burti[1]){
            check22.setBackground(Color.green);
            check22.setText(bb2);
        }else if(burti2[1] != burti[1]){
            for(int i = 0; i < 5; i++){
                if(burti2[1] == burti[i]){
                    check22.setBackground(Color.yellow);
                    check22.setText(bb2);
                }              
            }
        }
        if(check22.getText().equals("")){
            check22.setBackground(Color.red); 
            check22.setText(empty);
        }
                    
        if(burti2[2] == burti[2]){
            check23.setBackground(Color.green);
            check23.setText(bb3);
        }else if(burti2[2] != burti[2]){
            for(int i = 0; i < 5; i++){
                if(burti2[2] == burti[i]){
                    check23.setBackground(Color.yellow);
                    check23.setText(bb3);
                }             
            }
        }
        if(check23.getText().equals("")){
            check23.setBackground(Color.red); 
            check23.setText(empty);
        }
                
        if(burti2[3] == burti[3]){
            check24.setBackground(Color.green);
            check24.setText(bb4);
        }else if(burti2[3] != burti[3]){
            for(int i = 0; i < 5; i++){
                if(burti2[3] == burti[i]){
                    check24.setBackground(Color.yellow);
                    check24.setText(bb4);
                }               
            }
        }
        if(check24.getText().equals("")){
            check24.setBackground(Color.red); 
            check24.setText(empty);
        }
        
        if(burti2[4] == burti[4]){
            check25.setBackground(Color.green);
            check25.setText(bb5);
        }else if(burti2[4] != burti[4]){
            for(int i = 0; i < 5; i++){
                if(burti2[4] == burti[i]){
                    check25.setBackground(Color.yellow);
                    check25.setText(bb5);                    
                }              
            }         
        }
        if(check25.getText().equals("")){
            check25.setBackground(Color.red); 
            check25.setText(empty);
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        input = new javax.swing.JTextField();
        check1 = new javax.swing.JLabel();
        check2 = new javax.swing.JLabel();
        check3 = new javax.swing.JLabel();
        check4 = new javax.swing.JLabel();
        check5 = new javax.swing.JLabel();
        check6 = new javax.swing.JLabel();
        check7 = new javax.swing.JLabel();
        check8 = new javax.swing.JLabel();
        check9 = new javax.swing.JLabel();
        check10 = new javax.swing.JLabel();
        check11 = new javax.swing.JLabel();
        check12 = new javax.swing.JLabel();
        check13 = new javax.swing.JLabel();
        check14 = new javax.swing.JLabel();
        check15 = new javax.swing.JLabel();
        check16 = new javax.swing.JLabel();
        check17 = new javax.swing.JLabel();
        check18 = new javax.swing.JLabel();
        check19 = new javax.swing.JLabel();
        check20 = new javax.swing.JLabel();
        check21 = new javax.swing.JLabel();
        check22 = new javax.swing.JLabel();
        check23 = new javax.swing.JLabel();
        check24 = new javax.swing.JLabel();
        check25 = new javax.swing.JLabel();
        but1 = new javax.swing.JButton();
        alert = new javax.swing.JLabel();
        but2 = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        input.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        check1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        check1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        check2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        check3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        check3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        check4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        check4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        check5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        check6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        check6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        check7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        check7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        check8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        check9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        check9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        check10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        check11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        check11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        check12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        check13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        check13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        check14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        check15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        check15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        check16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        check17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        check17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        check18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        check19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check19.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        check20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        check21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check21.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        check22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        check22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        check23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check23.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        check24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        check24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        check25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check25.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        but1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        but1.setText("SAGLABĀT VĀRDU");
        but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1ActionPerformed(evt);
            }
        });

        alert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        but2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        but2.setText("PĀRBAUDĪT");
        but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(check6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(check11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(check16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(check21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(check1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(but2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(check1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(check2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(check3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(check6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(check16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(check21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(but1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(but2)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
        if(but1.getText().equals("RESTARTĒT")){
            
            NewGame();
            
            but1.setText("SAGLABĀT VĀRDU");            
        }else{
            name = input.getText();
            
            if(name.length() == 5){
                alert.setText("Tagad mini vārdu");
                
                name = name.toUpperCase();            
                burti = name.toCharArray();          
                input.setText("");

                b1 = String.valueOf(burti[0]);
                b2 = String.valueOf(burti[1]);
                b3 = String.valueOf(burti[2]);
                b4 = String.valueOf(burti[3]);
                b5 = String.valueOf(burti[4]);
                
                
                but1.setText("RESTARTĒT");
                but1.setBackground(Color.LIGHT_GRAY);
            }else{
                alert.setText("Vārdā ir jābūt 5 burtiem!");
            }            
        }
    }//GEN-LAST:event_but1ActionPerformed

    private void but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2ActionPerformed
        if(but1.getText().equals("RESTARTĒT")){ 
        
            name2 = input.getText();

            if(name2.length() == 5){

                for(int i = 0; i < 5; i++){
                    alert.setText("");

                    name2 = name2.toUpperCase();            
                    burti2 = name2.toCharArray();            
                    input.setText("");

                    bb1 = String.valueOf(burti2[0]);
                    bb2 = String.valueOf(burti2[1]);
                    bb3 = String.valueOf(burti2[2]);
                    bb4 = String.valueOf(burti2[3]);
                    bb5 = String.valueOf(burti2[4]);

                    if(check1.getText() == ""){
                        Parbaude1();
                        Winner();
                        if(Winner() == true){
                            alert.setText("TU UZVARĒJI");
                            input.setEditable(false);
                        }
                        break;
                    }else if(check6.getText() == ""){
                        Parbaude2();
                        if(Winner() == true){
                            alert.setText("TU UZVARĒJI");
                            input.setEditable(false);
                        }
                        break;
                    }else if(check11.getText() == ""){
                        Parbaude3();
                        if(Winner() == true){
                            alert.setText("TU UZVARĒJI");
                            input.setEditable(false);
                        }
                        break;
                    }else if(check16.getText() == ""){
                        Parbaude4();
                        if(Winner() == true){
                            alert.setText("TU UZVARĒJI");
                            input.setEditable(false);
                        }
                        break;
                    }else if(check21.getText() == ""){
                        Parbaude5();
                        if(Winner() == true){
                            alert.setText("TU UZVARĒJI");
                            input.setEditable(false);
                        }
                        break;
                    }
                }            
            }else{
                alert.setText("Vārdā ir jābūt 5 burtiem!");
            }
        }else{
            alert.setText("Vispirms vārds ir jāsaglabā!");
        }
    }//GEN-LAST:event_but2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert;
    private javax.swing.JButton but1;
    private javax.swing.JButton but2;
    private javax.swing.JLabel check1;
    private javax.swing.JLabel check10;
    private javax.swing.JLabel check11;
    private javax.swing.JLabel check12;
    private javax.swing.JLabel check13;
    private javax.swing.JLabel check14;
    private javax.swing.JLabel check15;
    private javax.swing.JLabel check16;
    private javax.swing.JLabel check17;
    private javax.swing.JLabel check18;
    private javax.swing.JLabel check19;
    private javax.swing.JLabel check2;
    private javax.swing.JLabel check20;
    private javax.swing.JLabel check21;
    private javax.swing.JLabel check22;
    private javax.swing.JLabel check23;
    private javax.swing.JLabel check24;
    private javax.swing.JLabel check25;
    private javax.swing.JLabel check3;
    private javax.swing.JLabel check4;
    private javax.swing.JLabel check5;
    private javax.swing.JLabel check6;
    private javax.swing.JLabel check7;
    private javax.swing.JLabel check8;
    private javax.swing.JLabel check9;
    private javax.swing.JTextField input;
    // End of variables declaration//GEN-END:variables
}

package Parte2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Relatorio extends javax.swing.JFrame {

    public Relatorio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("(##)#####-####");
            jTextField2 = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jTextField2 = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("(##)#####-####");
            jTextField2 = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jLabelRelatTitulo = new javax.swing.JLabel();
        jLabelRelatValInvest = new javax.swing.JLabel();
        jTextFieldRelatValInvest = new javax.swing.JTextField();
        try{
            jTextFieldRelatValInvest.setDocument(new Parte2.TeclasNumeros());
        }
        catch (Exception e){
        }
        jTextFieldRelatQtMaxVis = new javax.swing.JTextField();
        try{
            jTextFieldRelatQtMaxVis.setDocument(new Parte2.TeclasNumeros());
        }
        catch (Exception e){
        }
        jLabelRelatQtMaxVis = new javax.swing.JLabel();
        jTextFieldRelatQtMaxComp = new javax.swing.JTextField();
        try{
            jTextFieldRelatQtMaxComp.setDocument(new Parte2.TeclasNumeros());
        }
        catch (Exception e){
        }
        jLabelRelatQtMaxCliq = new javax.swing.JLabel();
        jTextFieldRelatQtMaxCliq = new javax.swing.JTextField();
        try{
            jTextFieldRelatQtMaxCliq.setDocument(new Parte2.TeclasNumeros());
        }
        catch (Exception e){
        }
        jLabelRelatQtMaxComp = new javax.swing.JLabel();
        jLabelRelatCliente = new javax.swing.JLabel();
        jLabelRelatDtInicio = new javax.swing.JLabel();
        jLabelRelatDtFim = new javax.swing.JLabel();
        jTextFieldRelatDtFim = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");
            jTextFieldRelatDtFim = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jTextFieldRelatDtInicio = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");
            jTextFieldRelatDtInicio = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jTextFieldRelatCliente = new javax.swing.JTextField();
        try{
            jTextFieldRelatCliente.setDocument(new TeclasLetras());
        }
        catch (Exception e){
        }
        jButtonRelatConsultar = new javax.swing.JButton();
        jButtonRelatLimpar = new javax.swing.JButton();

        jLabel9.setText("Cliente:");

        jLabel2.setText("Data de início:");

        jLabel10.setText("Data de término:");

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelRelatTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelRelatTitulo.setText("Relatório de Anúncios");

        jLabelRelatValInvest.setText("Valor total investido:");

        jTextFieldRelatValInvest.setEnabled(false);
        jTextFieldRelatValInvest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRelatValInvestActionPerformed(evt);
            }
        });

        jTextFieldRelatQtMaxVis.setEnabled(false);
        jTextFieldRelatQtMaxVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRelatQtMaxVisActionPerformed(evt);
            }
        });

        jLabelRelatQtMaxVis.setText("Quantidade máxima de visualizações:");

        jTextFieldRelatQtMaxComp.setEnabled(false);
        jTextFieldRelatQtMaxComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRelatQtMaxCompActionPerformed(evt);
            }
        });

        jLabelRelatQtMaxCliq.setText("Quantidade máxima de cliques:");

        jTextFieldRelatQtMaxCliq.setEnabled(false);
        jTextFieldRelatQtMaxCliq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRelatQtMaxCliqActionPerformed(evt);
            }
        });

        jLabelRelatQtMaxComp.setText("Quantidade máxima de compartilhamentos:");

        jLabelRelatCliente.setText("Cliente:");

        jLabelRelatDtInicio.setText("Data de início:");

        jLabelRelatDtFim.setText("Data de término:");

        jTextFieldRelatDtFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRelatDtFimActionPerformed(evt);
            }
        });

        jTextFieldRelatDtInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRelatDtInicioActionPerformed(evt);
            }
        });

        jTextFieldRelatCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRelatClienteActionPerformed(evt);
            }
        });

        jButtonRelatConsultar.setText("Consultar");
        jButtonRelatConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelatConsultarActionPerformed(evt);
            }
        });

        jButtonRelatLimpar.setText("Limpar");
        jButtonRelatLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelatLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabelRelatTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRelatCliente)
                            .addComponent(jLabelRelatDtFim)
                            .addComponent(jLabelRelatDtInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldRelatDtFim, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRelatCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRelatDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelRelatQtMaxComp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRelatQtMaxCliq, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRelatQtMaxVis, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRelatValInvest, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldRelatQtMaxCliq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRelatQtMaxComp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRelatValInvest, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRelatQtMaxVis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRelatConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRelatLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabelRelatTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelRelatCliente)
                                .addGap(29, 29, 29))
                            .addComponent(jLabelRelatDtInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRelatDtFim))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldRelatCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addComponent(jTextFieldRelatDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldRelatDtFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRelatConsultar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonRelatLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldRelatValInvest, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRelatValInvest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRelatQtMaxVis, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRelatQtMaxVis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRelatQtMaxComp)
                    .addComponent(jTextFieldRelatQtMaxComp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRelatQtMaxCliq, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRelatQtMaxCliq))
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldRelatValInvestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRelatValInvestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRelatValInvestActionPerformed

    private void jTextFieldRelatQtMaxVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRelatQtMaxVisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRelatQtMaxVisActionPerformed

    private void jTextFieldRelatQtMaxCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRelatQtMaxCompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRelatQtMaxCompActionPerformed

    private void jTextFieldRelatQtMaxCliqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRelatQtMaxCliqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRelatQtMaxCliqActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextFieldRelatDtFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRelatDtFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRelatDtFimActionPerformed

    private void jTextFieldRelatDtInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRelatDtInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRelatDtInicioActionPerformed

    private void jTextFieldRelatClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRelatClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRelatClienteActionPerformed

    private void jButtonRelatConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelatConsultarActionPerformed

        try{
            if (jTextFieldRelatCliente.getText().isEmpty()||jTextFieldRelatDtInicio.getText().equals("  /  /    ") ||jTextFieldRelatDtFim.getText().equals("  /  /    ") ){
                JOptionPane.showMessageDialog(null, "Dados obrigatórios não informados!!!");
            }else{
                if (!ValidaData(jTextFieldRelatDtInicio.getText())||!ValidaData(jTextFieldRelatDtFim.getText())){
                    JOptionPane.showMessageDialog(null, "Data inválida!!!");
                    return;
                }    
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
                LocalDate dataini = LocalDate.parse(jTextFieldRelatDtInicio.getText(), formato); 
                LocalDate datafim = LocalDate.parse(jTextFieldRelatDtFim.getText(), formato);
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_estudo");
                Statement declara = con.createStatement();
                ResultSet resultado = declara.executeQuery("select sum(investimento_dia) soma from anuncio where cliente = '"+jTextFieldRelatCliente.getText().toUpperCase()+"' and data_inicio >= '"+dataini+"' and data_fim <= '"+datafim+"'");
                System.out.println(resultado);

                resultado.next();
                jTextFieldRelatValInvest.setText(resultado.getString("soma"));
                if (jTextFieldRelatValInvest.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Anúncio não cadastrado!!!");
                    jTextFieldRelatCliente.setEnabled(true);
                    jTextFieldRelatDtInicio.setEnabled(true);
                    jTextFieldRelatDtFim.setEnabled(true);
                    jButtonRelatConsultar.setEnabled(true);
                    jButtonRelatLimpar.setEnabled(true);
                    jTextFieldRelatCliente.setText("");
                    jTextFieldRelatDtInicio.setText("");
                    jTextFieldRelatDtFim.setText("");
                    jTextFieldRelatValInvest.setText("");
                    jTextFieldRelatQtMaxVis.setText("");
                    jTextFieldRelatQtMaxComp.setText("");
                    jTextFieldRelatQtMaxCliq.setText("");
                }else{
                    jTextFieldRelatCliente.setEnabled(false);
                    jTextFieldRelatDtInicio.setEnabled(false);
                    jTextFieldRelatDtFim.setEnabled(false);
                    jTextFieldRelatValInvest.setEnabled(false);
                    jTextFieldRelatQtMaxVis.setEnabled(false);
                    jTextFieldRelatQtMaxComp.setEnabled(false);
                    jTextFieldRelatQtMaxCliq.setEnabled(false);
                    jButtonRelatConsultar.setEnabled(false);
                    jButtonRelatLimpar.setEnabled(true);
                }
                resultado.close();
                declara.close();
                con.close();
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonRelatConsultarActionPerformed

    private void jButtonRelatLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelatLimparActionPerformed
                    jTextFieldRelatCliente.setEnabled(true);
                    jTextFieldRelatDtInicio.setEnabled(true);
                    jTextFieldRelatDtFim.setEnabled(true);
                    jButtonRelatConsultar.setEnabled(true);
                    jButtonRelatLimpar.setEnabled(true);
                    jTextFieldRelatCliente.setText("");
                    jTextFieldRelatDtInicio.setText("");
                    jTextFieldRelatDtFim.setText("");
                    jTextFieldRelatValInvest.setText("");
                    jTextFieldRelatQtMaxVis.setText("");
                    jTextFieldRelatQtMaxComp.setText("");
                    jTextFieldRelatQtMaxCliq.setText("");
                    jTextFieldRelatValInvest.setEnabled(false);
                    jTextFieldRelatQtMaxVis.setEnabled(false);
                    jTextFieldRelatQtMaxComp.setEnabled(false);
                    jTextFieldRelatQtMaxCliq.setEnabled(false);
    }//GEN-LAST:event_jButtonRelatLimparActionPerformed

    public boolean ValidaData(String data) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            sdf.parse(data);
            return true;
        } catch (ParseException ex) {
            return false;
        }  
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
                
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRelatConsultar;
    private javax.swing.JButton jButtonRelatLimpar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelRelatCliente;
    private javax.swing.JLabel jLabelRelatDtFim;
    private javax.swing.JLabel jLabelRelatDtInicio;
    private javax.swing.JLabel jLabelRelatQtMaxCliq;
    private javax.swing.JLabel jLabelRelatQtMaxComp;
    private javax.swing.JLabel jLabelRelatQtMaxVis;
    private javax.swing.JLabel jLabelRelatTitulo;
    private javax.swing.JLabel jLabelRelatValInvest;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextFieldRelatCliente;
    private javax.swing.JTextField jTextFieldRelatDtFim;
    private javax.swing.JTextField jTextFieldRelatDtInicio;
    private javax.swing.JTextField jTextFieldRelatQtMaxCliq;
    private javax.swing.JTextField jTextFieldRelatQtMaxComp;
    private javax.swing.JTextField jTextFieldRelatQtMaxVis;
    private javax.swing.JTextField jTextFieldRelatValInvest;
    // End of variables declaration//GEN-END:variables
}
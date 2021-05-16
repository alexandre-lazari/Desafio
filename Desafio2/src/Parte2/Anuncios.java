package Parte2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;

public class Anuncios extends javax.swing.JFrame {

    public Anuncios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextDtInicio = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");
            jTextDtInicio = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jTextInvestDia = new javax.swing.JTextField();
        jButtonConsultar = new javax.swing.JButton();
        jButtonInserir = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabelNmAnuncio = new javax.swing.JLabel();
        jLabelDtInicio = new javax.swing.JLabel();
        jLabelInvestDia = new javax.swing.JLabel();
        jLabelCdAnuncio = new javax.swing.JLabel();
        jTextCdAnuncio = new javax.swing.JTextField();
        jButtonLimpar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jLabelTituloCadastro = new javax.swing.JLabel();
        jTextCliente = new javax.swing.JTextField();
        try{
            jTextCliente.setDocument(new TeclasLetras());
        }
        catch (Exception e){
        }
        jLabelCliente = new javax.swing.JLabel();
        jTextDtFim = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");
            jTextDtFim = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jLabelDtFim = new javax.swing.JLabel();
        jTextNmAnuncio = new javax.swing.JTextField();
        try{
            jTextNmAnuncio.setDocument(new TeclasLetras());
        }
        catch (Exception e){
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextDtInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDtInicioActionPerformed(evt);
            }
        });

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonInserir.setText("Inserir");
        jButtonInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jLabelNmAnuncio.setText("Nome do anúncio:");

        jLabelDtInicio.setText("Data de início:");

        jLabelInvestDia.setText("Investimento por dia (R$):");

        jLabelCdAnuncio.setText("Código do anúncio:");

        jTextCdAnuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCdAnuncioActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jLabelTituloCadastro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTituloCadastro.setText("Sistema de Cadastro de Anúncios");

        jTextCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextClienteActionPerformed(evt);
            }
        });

        jLabelCliente.setText("Cliente:");

        jTextDtFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDtFimActionPerformed(evt);
            }
        });

        jLabelDtFim.setText("Data de término:");

        jTextNmAnuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNmAnuncioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNmAnuncio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextCdAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextNmAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelCdAnuncio)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelDtFim)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextDtFim, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelInvestDia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextInvestDia, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelDtInicio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(404, 404, 404))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabelTituloCadastro)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloCadastro)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCdAnuncio)
                    .addComponent(jTextCdAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNmAnuncio)
                    .addComponent(jTextNmAnuncio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDtInicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDtFim)
                    .addComponent(jTextDtFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextInvestDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInvestDia))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButtonInserir)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonLimpar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
    
        try{
            if (jTextCdAnuncio.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "O código do anúncio é obrigatório!!!");
            }else{
                Class.forName("org.apache.derby.jdbc.ClientDriver"); 
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_estudo");
                Statement declara = con.createStatement(); 
                ResultSet resultado = declara.executeQuery("select * from anuncio where codigo_anuncio = '"+jTextCdAnuncio.getText()+"'"); 
                System.out.println(resultado);
                
                if(resultado.next()){
                    jButtonConsultar.setEnabled(false);
                    jButtonInserir.setEnabled(false);
                    jButtonExcluir.setEnabled(true);
                    jButtonAlterar.setEnabled(true);
                    jButtonLimpar.setEnabled(true);
                    jTextNmAnuncio.setEnabled(true);
                    jTextDtInicio.setEnabled(true);
                    jTextInvestDia.setEnabled(true);
                    jTextCdAnuncio.setEnabled(false);
                    jTextNmAnuncio.setText(resultado.getString("nome_anuncio"));
                    jTextCliente.setText(resultado.getString("cliente"));
                    jTextInvestDia.setText(resultado.getString("investimento_dia"));
                    
                    DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
                    DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
                    String sdataini = resultado.getString("data_inicio");
                    Date dataini = df2.parse(sdataini);
                    jTextDtInicio.setText(df1.format(dataini));
                    
                    DateFormat df3 = new SimpleDateFormat("dd/MM/yyyy");
                    DateFormat df4 = new SimpleDateFormat("yyyy-MM-dd");
                    String sdatafim = resultado.getString("data_fim");
                    Date datafim = df4.parse(sdatafim);
                    jTextDtFim.setText(df3.format(datafim));

                }else{
                    jButtonConsultar.setEnabled(true);
                    jButtonInserir.setEnabled(true);
                    jButtonExcluir.setEnabled(false);
                    jButtonAlterar.setEnabled(false);
                    jButtonLimpar.setEnabled(true);
                    jTextNmAnuncio.setEnabled(true);
                    jTextDtInicio.setEnabled(true);
                    jTextInvestDia.setEnabled(true);
                    jTextCdAnuncio.setEnabled(true);
                    jTextCdAnuncio.setText("");
                    JOptionPane.showMessageDialog(null, "Anúncio não cadastrado!!!");
                }
                resultado.close();
                declara.close();
                con.close();
            }    
        }catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirActionPerformed
     
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver"); 
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_estudo");
            Statement declara = con.createStatement();

            if (jTextCdAnuncio.getText().isEmpty()||jTextNmAnuncio.getText().isEmpty()||jTextCliente.getText().isEmpty()||jTextDtInicio.getText().equals("  /  /    ")||jTextDtFim.getText().equals("  /  /    ")||jTextInvestDia.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Campos obrigatórios não informados!!!");
            }else{
                ResultSet resultcons = declara.executeQuery("select * from anuncio where codigo_anuncio = '"+jTextCdAnuncio.getText()+"'");
                if(resultcons.next()){
                    JOptionPane.showMessageDialog(null, "Anúncio já cadastrado!!!");
                }else{   
                    if (!ValidaData(jTextDtInicio.getText())||!ValidaData(jTextDtFim.getText())){
                        JOptionPane.showMessageDialog(null, "Data inválida!!!");
                        return;
                    }
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
                    LocalDate dataini = LocalDate.parse(jTextDtInicio.getText(), formato); 
                    LocalDate datafim = LocalDate.parse(jTextDtFim.getText(), formato);
                    String expressao = "'"+jTextCdAnuncio.getText()+"',";
                    expressao+= "'"+jTextNmAnuncio.getText().toUpperCase()+"',";
                    expressao+= "'"+jTextCliente.getText().toUpperCase()+"',";
                    expressao+= "'"+dataini+"',";
                    expressao+= "'"+datafim+"',";
                    expressao+= +Integer.parseInt(jTextInvestDia.getText())+")";
                        
                    int resultupd = declara.executeUpdate("insert into anuncio (codigo_anuncio,nome_anuncio,cliente,data_inicio,data_fim,investimento_dia) values ("+expressao);
                        if(resultupd>0){
                            JOptionPane.showMessageDialog(null, "Registro incluído!!!");
                            jButtonConsultar.setEnabled(false);
                            jButtonInserir.setEnabled(false);
                            jButtonExcluir.setEnabled(false);
                            jButtonAlterar.setEnabled(false);
                            jButtonLimpar.setEnabled(true);
                            jTextCdAnuncio.setEnabled(false);
                            jTextNmAnuncio.setEnabled(false);
                            jTextCliente.setEnabled(false);
                            jTextDtInicio.setEnabled(false);
                            jTextDtFim.setEnabled(false);
                            jTextInvestDia.setEnabled(false);
                        }else{
                            JOptionPane.showMessageDialog(null, "Erro na inclusão!!!");
                        }
                    }      
                }        
            }            
        catch(Exception e){
        }
    }//GEN-LAST:event_jButtonInserirActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver"); 
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_estudo");
            Statement declara = con.createStatement(); 

            int resultado = declara.executeUpdate("delete from anuncio where codigo_anuncio = '"+jTextCdAnuncio.getText()+"'");
            if(resultado>0){
                JOptionPane.showMessageDialog(null, "Registro excluído!!!");
                jButtonConsultar.setEnabled(false);
                jButtonInserir.setEnabled(false);
                jButtonExcluir.setEnabled(false);
                jButtonAlterar.setEnabled(false);
                jButtonLimpar.setEnabled(true);
                jTextCdAnuncio.setEnabled(false);
                jTextNmAnuncio.setEnabled(false);
                jTextCliente.setEnabled(false);
                jTextDtInicio.setEnabled(false);
                jTextDtFim.setEnabled(false);
                jTextInvestDia.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(null, "Erro na exclusão!!!");
            }
        }catch(Exception e){
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed

            jTextCdAnuncio.setText("");
            jTextNmAnuncio.setText("");
            jTextCliente.setText("");
            jTextDtInicio.setText("");
            jTextDtFim.setText("");
            jTextInvestDia.setText("");
            jButtonConsultar.setEnabled(true);
            jButtonInserir.setEnabled(true);
            jButtonExcluir.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonLimpar.setEnabled(true);
            jTextCdAnuncio.setEnabled(true);
            jTextNmAnuncio.setEnabled(true);
            jTextCliente.setEnabled(true);
            jTextDtInicio.setEnabled(true);
            jTextDtFim.setEnabled(true);
            jTextInvestDia.setEnabled(true);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed

        try {
            
                Class.forName("org.apache.derby.jdbc.ClientDriver"); 
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/db_estudo");
                Statement declara = con.createStatement(); 

            if (jTextCdAnuncio.getText().isEmpty()||jTextNmAnuncio.getText().isEmpty()||jTextCliente.getText().isEmpty()||jTextDtInicio.getText().equals("  /  /    ")||jTextDtFim.getText().equals("  /  /    ")||jTextInvestDia.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Campos obrigatórios não informados!!!");
                }else{
                    if (!ValidaData(jTextDtInicio.getText())||!ValidaData(jTextDtFim.getText())){
                        JOptionPane.showMessageDialog(null, "Data inválida!!!");
                        return;
                    } 
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
                    LocalDate dataini = LocalDate.parse(jTextDtInicio.getText(), formato); 
                    LocalDate datafim = LocalDate.parse(jTextDtFim.getText(), formato);
                    int resultado = declara.executeUpdate("update anuncio set nome_anuncio ="+"'"+jTextNmAnuncio.getText().toUpperCase()+"',"+"cliente ="+"'"+jTextCliente.getText().toUpperCase()+"',"+"data_inicio ="+"'"+dataini+"',"+"data_fim ="+"'"+datafim+"',"+"investimento_dia ="+Integer.parseInt(jTextInvestDia.getText())+"where codigo_anuncio ='"+jTextCdAnuncio.getText()+"'");
                    if(resultado>0){
                        JOptionPane.showMessageDialog(null, "Registro alterado!!!");
                        jButtonConsultar.setEnabled(false);
                        jButtonInserir.setEnabled(false);
                        jButtonExcluir.setEnabled(false);
                        jButtonAlterar.setEnabled(false);
                        jButtonLimpar.setEnabled(true);
                        jTextCdAnuncio.setEnabled(false);
                        jTextNmAnuncio.setEnabled(false);
                        jTextCliente.setEnabled(false);
                        jTextDtInicio.setEnabled(false);
                        jTextDtFim.setEnabled(false);
                        jTextInvestDia.setEnabled(false);
                    }else{
                        JOptionPane.showMessageDialog(null, "Erro na alteração!!!");
                    }
                }  
            }
        
        catch(Exception e){
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

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
    
    private void jTextInvestDiaActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }      
    
    private void jTextDtInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDtInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDtInicioActionPerformed

    private void jTextCdAnuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCdAnuncioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCdAnuncioActionPerformed

    private void jTextClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextClienteActionPerformed

    private void jTextDtFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDtFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDtFimActionPerformed

    private void jTextNmAnuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNmAnuncioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNmAnuncioActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anuncios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonInserir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JLabel jLabelCdAnuncio;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelDtFim;
    private javax.swing.JLabel jLabelDtInicio;
    private javax.swing.JLabel jLabelInvestDia;
    private javax.swing.JLabel jLabelNmAnuncio;
    private javax.swing.JLabel jLabelTituloCadastro;
    private javax.swing.JTextField jTextCdAnuncio;
    private javax.swing.JTextField jTextCliente;
    private javax.swing.JTextField jTextDtFim;
    private javax.swing.JTextField jTextDtInicio;
    private javax.swing.JTextField jTextInvestDia;
    private javax.swing.JTextField jTextNmAnuncio;
    // End of variables declaration//GEN-END:variables
}
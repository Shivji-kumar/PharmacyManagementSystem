/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package pms;
import java.sql.*;
/**
 *
 * @author DELL
 */
public class NewItemDetails extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewItemDetails
     */
    public NewItemDetails() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Invoice = new javax.swing.JTextField();
        ItemCode = new javax.swing.JTextField();
        ItemName = new javax.swing.JTextField();
        ItemType = new javax.swing.JTextField();
        Company = new javax.swing.JTextField();
        Batchs = new javax.swing.JTextField();
        MFG = new javax.swing.JTextField();
        EXP = new javax.swing.JTextField();
        PDate = new javax.swing.JTextField();
        Size = new javax.swing.JTextField();
        ItemPrice = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        GST = new javax.swing.JTextField();
        DiscRs = new javax.swing.JTextField();
        Purchase = new javax.swing.JTextField();
        MRP = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setAutoscrolls(true);

        jLabel2.setText("Item Code");

        jLabel3.setText("Item Name");

        jLabel4.setText("Itme Type");

        jLabel5.setText("Company");

        jLabel6.setText("Pack");

        jLabel7.setText("Trade Price");

        jLabel8.setText("Quantity");

        jLabel9.setText("GST");

        jLabel10.setText("Purchase Price");

        jLabel11.setText("MRP");

        jLabel12.setText("Invoice No");

        jLabel13.setText("Batch");

        jLabel14.setText("MFgDate");

        jLabel15.setText("EXPDate");

        jLabel16.setText("PurchaseDate");

        jLabel17.setText("Discount");

        ItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNameActionPerformed(evt);
            }
        });

        MFG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MFGActionPerformed(evt);
            }
        });

        PDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDateActionPerformed(evt);
            }
        });

        DiscRs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscRsActionPerformed(evt);
            }
        });

        MRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRPActionPerformed(evt);
            }
        });

        Save.setText("Save Data");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Exit.setText("Exit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Save)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MFG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                    .addComponent(PDate, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Quantity, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(MRP)
                                    .addComponent(Purchase)
                                    .addComponent(GST)
                                    .addComponent(DiscRs)
                                    .addComponent(Size)
                                    .addComponent(ItemPrice)
                                    .addComponent(Company)
                                    .addComponent(Batchs)
                                    .addComponent(ItemType)
                                    .addComponent(ItemName)
                                    .addComponent(EXP)
                                    .addComponent(Invoice, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ItemCode)))
                        .addGap(323, 323, 323))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Exit)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Invoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(ItemType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(Company, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Batchs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(MFG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(EXP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(PDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(Size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addComponent(jLabel7))
                            .addComponent(ItemPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8))
                    .addComponent(Quantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(GST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(DiscRs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Purchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(MRP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Exit)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel1.setText("Purchase Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemNameActionPerformed

    private void MRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MRPActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

                Connection con=null;
		PreparedStatement pstmt1=null,pstmt2=null,pstmt3=null;
                Statement stmt=null;
                
		ResultSet rs=null;
                
                int invoiceno=Integer.parseInt(Invoice.getText());
                int itemcode=Integer.parseInt(ItemCode.getText());
		String itemname=ItemName.getText();
		String itemtype=ItemType.getText();
		String  company=Company.getText();
                String Batch=Batchs.getText();
                String MFgDate=MFG.getText();
                String EXPDate=EXP.getText();     
                String PurchaseDate=PDate.getText();
		int Pack=Integer.parseInt(Size.getText());
		int tradeprice=Integer.parseInt(ItemPrice.getText());
                int quantity=Integer.parseInt(Quantity.getText());
		int gst=Integer.parseInt(GST.getText());
                int discount=Integer.parseInt(DiscRs.getText());
                int purchaserate=Integer.parseInt(Purchase.getText());
                int mrp=Integer.parseInt(MRP.getText());

		try
		{
                    
			Class.forName("com.mysql.jdbc.Driver");
		
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pms","root","1234");
                        
                        
                        stmt = con.createStatement();

			rs = stmt.executeQuery("Select * from purchase where itemcode="+itemcode);
                        
                        if(rs.next())
                        {                       
                        
                        
	
			pstmt1=con.prepareStatement("insert into purchase values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

                        pstmt1.setInt(1,invoiceno);
			pstmt1.setInt(2,itemcode);
			pstmt1.setString(3,itemname);
			pstmt1.setString(4,itemtype);
			pstmt1.setString(5,company);
                        pstmt1.setString(6, Batch);
                        pstmt1.setString(7,MFgDate);
                        pstmt1.setString(8,EXPDate);
                        pstmt1.setString(9,PurchaseDate);                        
			pstmt1.setInt(10,Pack);
			pstmt1.setInt(11,tradeprice);
                        pstmt1.setInt(12,quantity);
			pstmt1.setInt(13,gst);
                        pstmt1.setInt(14,discount);
                        pstmt1.setInt(15,purchaserate);
                        pstmt1.setInt(16,mrp);
      
			pstmt1.executeUpdate();
                        
                  //      System.out.println("Data Inserted");
                        
                        
                        
                        //pstmt3=con.prepareStatement("update stocks set Quantity = Quantity + 200 where itemcode="+itemcode);
                        pstmt3=con.prepareStatement("update stock set Quantity=? where itemcode="+itemcode);

                        
			pstmt3.setInt(1,quantity);
			
			pstmt3.executeUpdate();
                        
			System.out.println("Data Updated");
                        
                        }
                        
                        
                        else
                        {
                        
                        pstmt1=con.prepareStatement("insert into purchase values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

                        pstmt1.setInt(1,invoiceno);
			pstmt1.setInt(2,itemcode);
			pstmt1.setString(3,itemname);
			pstmt1.setString(4,itemtype);
			pstmt1.setString(5,company);
                        pstmt1.setString(6, Batch);
                        pstmt1.setString(7,MFgDate);
                        pstmt1.setString(8,EXPDate);
                        pstmt1.setString(9,PurchaseDate);                        
			pstmt1.setInt(10,Pack);
			pstmt1.setInt(11,tradeprice);
                        pstmt1.setInt(12,quantity);
			pstmt1.setInt(13,gst);
                        pstmt1.setInt(14,discount);
                        pstmt1.setInt(15,purchaserate);
                        pstmt1.setInt(16,mrp);

			pstmt1.executeUpdate();
                        
                            
                            
                        pstmt2=con.prepareStatement("insert into stock values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

                        pstmt2.setInt(1,invoiceno);
			pstmt2.setInt(2,itemcode);
			pstmt2.setString(3,itemname);
			pstmt2.setString(4,itemtype);
			pstmt2.setString(5,company);
                        pstmt2.setString(6, Batch);
                        pstmt2.setString(7,MFgDate);
                        pstmt2.setString(8,EXPDate);
                        pstmt2.setString(9,PurchaseDate);                        
			pstmt2.setInt(10,Pack);
			pstmt2.setInt(11,tradeprice);
                        pstmt2.setInt(12,quantity);
			pstmt2.setInt(13,gst);
                        pstmt2.setInt(14,discount);
                        pstmt2.setInt(15,purchaserate);
                        pstmt2.setInt(16,mrp);


			pstmt2.executeUpdate();
                        
                        System.out.println("Data Inserted");
               
                        }

		}

		catch(ClassNotFoundException | SQLException ex)
		{
			System.out.println(ex);
		}
    }//GEN-LAST:event_SaveActionPerformed

    private void DiscRsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscRsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiscRsActionPerformed

    private void MFGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MFGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MFGActionPerformed

    private void PDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Batchs;
    private javax.swing.JTextField Company;
    private javax.swing.JTextField DiscRs;
    private javax.swing.JTextField EXP;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField GST;
    private javax.swing.JTextField Invoice;
    private javax.swing.JTextField ItemCode;
    private javax.swing.JTextField ItemName;
    private javax.swing.JTextField ItemPrice;
    private javax.swing.JTextField ItemType;
    private javax.swing.JTextField MFG;
    private javax.swing.JTextField MRP;
    private javax.swing.JTextField PDate;
    private javax.swing.JTextField Purchase;
    private javax.swing.JTextField Quantity;
    private javax.swing.JButton Save;
    private javax.swing.JTextField Size;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

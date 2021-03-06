/*
 * ReportGeneration.java
 *
 * Created on November 25, 2015, 12:41 AM
 */

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author  rs748
 */
public class ReportGeneration extends javax.swing.JFrame {
    
    Connection conn = null;
    Statement statement = null;
    ResultSet resultSet = null;
    DefaultTableModel model; 
    
    /** Creates new form ReportGeneration */
    public ReportGeneration() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Report Generation");

        jLabel1.setText("Begin Date:");

        jLabel2.setText("End Date:");

        jLabel3.setText("Criteria:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "Most Frequently Sold Products", "Products Sold to Highest Distinct Customers", "10 Best Customers", "5 Best Zip Codes", "Average Product Price" }));
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenu1.setText("Customer Operations");

        jMenuItem1.setText("Add Customer");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Edit Customer");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem2MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Shopping");

        jMenuItem3.setText("New Shopping Cart");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem3MousePressed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Transaction History");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem4MousePressed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Report Generation");
        jMenu2.add(jSeparator1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(dateChooserCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateChooserCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        dispose();
        AddCustomer AC = new AddCustomer();
        AC.setVisible(true);
    }                                       

    private void jMenuItem2MousePressed(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        dispose();
        EditCustomer EC = new EditCustomer();
        EC.setVisible(true);
    }                                       

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {                                                        
        // TODO add your handling code here:
        int operation = jComboBox1.getSelectedIndex();
        int count = 100;
        if(operation == 0)
        {
            
        }
        else
        {
          try
         {
            //Connect to server
            conn = DriverManager.getConnection("jdbc:mysql://sql2.njit.edu/rs748?" + "user=rs748&password=O2cYL83NM");
            // Statements allow to issue SQL queries to the database
            statement = conn.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from CUSTOMER");
            
            model = new DefaultTableModel();
            jTable1.setModel(model);
            
            Date start = new Date();
            Date end = new Date();
            Calendar cal = Calendar.getInstance();
            int Sdd,Smm,Syyyy;
            int Edd,Emm,Eyyyy;
            String SDate = "";
            String EDate = "";
            
            start = dateChooserCombo1.getSelectedDate().getTime();
            end = dateChooserCombo2.getSelectedDate().getTime();
            
            cal.setTime(start);
            Sdd = cal.get(Calendar.DAY_OF_MONTH);
            Smm = cal.get(Calendar.MONTH)+1;
            Syyyy = cal.get(Calendar.YEAR);
            SDate = Syyyy + "-" + Smm + "-" + Sdd;
            cal.setTime(end);
            Edd = cal.get(Calendar.DAY_OF_MONTH);
            Emm = cal.get(Calendar.MONTH)+1;
            Eyyyy = cal.get(Calendar.YEAR);
            EDate = Eyyyy + "-" + Emm + "-" + Edd;
        
            String SQL = "";
            switch(operation)
            {
                case 1:
                    SQL = "SELECT P.PNAME AS \'PRODUCT NAME\', count(P.PNAME) AS \'Numbers Sold\' " +
                    "FROM CART C, APPEARS_IN AI, PRODUCT P " +
                    "WHERE C.CARTID = AI.CARTID AND P.PID = AI.PID AND C.TDATE BETWEEN CAST(\'" + SDate + "\' AS DATE) AND CAST(\'" + EDate + "\' AS DATE) " +
                    "GROUP BY P.PNAME, P.PID " +
                    "HAVING COUNT(P.PNAME) > 3 " +
                    "ORDER BY COUNT(P.PNAME) DESC";
                    break;
                case 2:
                    SQL = "SELECT P.PNAME AS \'PRODUCT NAME\', count(DISTINCT C.CID) AS \'No of Distinct Customers\' " +
                    "FROM CART C, APPEARS_IN AI, PRODUCT P " +
                    "WHERE C.CARTID = AI.CARTID AND P.PID = AI.PID AND C.TDATE BETWEEN CAST(\'" + SDate + "\' AS DATE) AND CAST(\'" + EDate + "\' AS DATE) " +
                    "GROUP BY P.PNAME, P.PID " +
                    "HAVING COUNT(DISTINCT C.CID) > 2 " +
                    "ORDER BY COUNT(DISTINCT C.CID) DESC";
                    break;
                case 3:
                    SQL = "SELECT CU.CID, CU.FNAME, CU.LNAME, SUM(AI.PRICESOLD * AI.QUANTITY) AS 'Total Spent' " +
                    "FROM APPEARS_IN AI, CART C, CUSTOMER CU " +
                    "WHERE C.CARTID = AI.CARTID AND C.CID = CU.CID AND C.TDATE BETWEEN CAST(\'" + SDate + "\' AS DATE) AND CAST(\'" + EDate + "\' AS DATE) " +
                    "GROUP BY CU.CID " +
                    "ORDER BY SUM(AI.PRICESOLD * AI.QUANTITY) DESC LIMIT 10";
                    break;
                case 4:
                    SQL = "SELECT SA.ZIP AS 'ZIP Code' , COUNT(SA.ZIP) AS 'No of Products' " +
                    "FROM CART C, SHIP_ADDRESS SA " +
                    "WHERE C.CID = SA.CID AND C.SANAME = SA.SANAME AND C.TDATE BETWEEN CAST(\'" + SDate + "\' AS DATE) AND CAST(\'" + EDate + "\' AS DATE) " +
                    "GROUP BY SA.ZIP " +
                    "ORDER BY COUNT(SA.ZIP) DESC LIMIT 5";
                    break;
                case 5:
                    SQL = "SELECT P.PTYPE AS 'Product Type', AVG(AI.PRICESOLD * AI.QUANTITY) AS 'Average Price Sold' " +
                    "FROM PRODUCT P, APPEARS_IN AI, CART C " +
                    "WHERE P.PID = AI.PID AND C.CARTID = AI.CARTID AND C.TDATE BETWEEN CAST(\'" + SDate + "\' AS DATE) AND CAST(\'" + EDate + "\' AS DATE) " +
                    "GROUP BY P.PTYPE ";
                    break;
            }
            
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery(SQL);
            
            //Display Result in jTable
            for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++)
            {
                model.addColumn(resultSet.getMetaData().getColumnName(i));
            }
            
            while (resultSet.next())
            {
                Object[] temp = new Object[resultSet.getMetaData().getColumnCount()];
                for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++)
                {
                    temp[i-1] = resultSet.getString(i);
                }
                model.addRow(temp);
            }
          
            resultSet.close();
            statement.close();
            conn.close();
          }
          catch (SQLException ex)
          {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
          }
        }
    }                                                       

    private void jMenuItem3MousePressed(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        dispose();
        NewShopping NS = new NewShopping();
        NS.setVisible(true);
    }                                       

    private void jMenuItem4MousePressed(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        dispose();
        TransactionHistory TH = new TransactionHistory();
        TH.setVisible(true);
    }                                       
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportGeneration().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify                     
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   
    
}
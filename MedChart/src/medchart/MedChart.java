/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medchart;

import java.sql.SQLException;

/**
 *
 * @author Brandon George, David Amaya, Bee Yang
 * 
 * This is the main class for medchart that contains the main method. The 
 * software begins running in this class and in the main method.
 */
public class MedChart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        Database_test db = new Database_test();
        
        db.openConnection();
    }
    
}

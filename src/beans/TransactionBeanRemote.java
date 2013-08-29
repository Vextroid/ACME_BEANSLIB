/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Vextroid
 */
@Remote
public interface TransactionBeanRemote {
 
    public void deposit(int C_ID, String accNum, int amount, String description);
    public void withdrawl(int C_ID, String accNum, int amount, String description);
    public List viewAllTransactions(String accNum);
    
}

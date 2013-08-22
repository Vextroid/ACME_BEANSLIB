/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Remote;

/**
 *
 * @author Vextroid
 */
//
@Remote
public interface SavingsBeanRemote {
    
    public void createSavingsAccount(int C_ID, String accNum, int balance);
    public int getBalance(String accNum);

    
}

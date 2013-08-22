/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.sql.Date;
import javax.ejb.Remote;

/**
 *
 * @author Vextroid
 */
@Remote
public interface CustomerBeanRemote {
    
    public void addCustomer(String firstName, String lastName, Date dob, String address);
    public String readCustomer (int id) ;
    
}

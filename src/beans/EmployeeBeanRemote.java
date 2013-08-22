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
@Remote
public interface EmployeeBeanRemote {
    
    public void addEmployee(String firstName, String lastName);
    public String readEmployee (int id) ;
    
    
}

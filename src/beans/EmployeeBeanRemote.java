/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.concurrent.TimeUnit;
import javax.ejb.AccessTimeout;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Remote;

/**
 *
 * @author Vextroid
 */
@Remote
public interface EmployeeBeanRemote {
    
    @Lock(LockType.READ)
    @AccessTimeout(value=1,unit=TimeUnit.MINUTES)
    
    public void addEmployee(String firstName, String lastName);
    public String readEmployee (int id) ;
    
    
}

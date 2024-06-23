/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

/**
 *
 * @author DELL
 */
import java.sql.ResultSet;
import controller.CustomerController;
public interface CustomerDAO {
    /**
     * this method will store the data of customer 
     * @param cc // here cc is an object of CustomerController
     * @return 
     */
    public abstract boolean createCustomer(CustomerController cc);
    
    public abstract ResultSet selectCustomer(CustomerController cc);
    
    public abstract boolean updateCustomer(CustomerController cc);
       
    public abstract ResultSet selectCustomerById(CustomerController cc);
       
    public abstract boolean deleteCustomer(CustomerController cc);
    
    
}

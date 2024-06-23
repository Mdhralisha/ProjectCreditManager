/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

/**
 *
 * @author DELL
 */
import controller.AdminController;
public interface AdminDAO {
    /**
     * 
     * @param ac
     * abstract method to handle login functionality for admin user
     * @return 
     * 
     */
    
    public abstract boolean login(AdminController ac);
    
    //Abstract Method
    // abstract boolean login 
    //abstract keyword paranthesis(); huna parxa abstract banauda
    
    //public boolean getLogin(){}// ordinary method 
    
}

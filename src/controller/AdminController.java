/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author DELL
 */
import dao.impl.AdminDAOImpl;
import dao.AdminDAO;
public class AdminController {
    
    // controller attributes
    
    public String username;
    public String password;
    
    public boolean doLogin(AdminController ac){
        boolean status = false;
        AdminDAO ad = new AdminDAOImpl();
        if(ad.login(ac)){
            status=true;
        }
        return status;
    }
     
    
}

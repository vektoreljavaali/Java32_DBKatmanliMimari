/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTIL;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 *
 * @author vektorel
 */
public class DBConnection {
    
    private Connection conn;
     
    public Connection baglan(){
        if(StaticValues.isDB==0){
            try{
            
            Driver.class.forName(StaticValues.DBCLASSNAME_POSTGRE);
            conn = DriverManager.getConnection(isconnectionstring(), 
                    StaticValues.DBUSER, StaticValues.DBPASSWORD);
           
            }catch(Exception ex){
            
            }
        }
        else if(StaticValues.isDB==1){
            try{
            
                Driver.class.forName(StaticValues.DBCLASSNAME_MSSQL);
                conn = DriverManager.getConnection(isconnectionstring(), 
                    StaticValues.DBUSER, StaticValues.DBPASSWORD);
                
            }catch(Exception ex){
            
            }
            
        }
        else if(StaticValues.isDB==2){
        try{
            Driver.class.forName(StaticValues.DBCLASSNAME_ORACLE);
            conn = DriverManager.getConnection(isconnectionstring(), 
             StaticValues.DBUSER, StaticValues.DBPASSWORD);     
        }catch(Exception ex){
        
        }
        
        }
       return conn; 
    }
    
    public void kapat(){
            try{
                 conn.close();
            }catch(Exception ex){

            }
    }
    
    
        private String isconnectionstring(){
   
        String result="";
             
        if(StaticValues.isDB==0){//PostgreSQL
        result = "jdbc:postgresql://"+StaticValues.DBSERVER+":"+StaticValues.DBPORT+
                "/"+StaticValues.DBNAME;
        }
        else if(StaticValues.isDB==1){//MsSQL 
             result = "jdbc:sqlserver://"+StaticValues.DBSERVER+":"+StaticValues.DBPORT+
                ";databaseName="+StaticValues.DBNAME+";integratedSecurity=true";
        }
        else if(StaticValues.isDB==2){// Oracle
        result = "jdbc:oracle:thin:@"+StaticValues.DBSERVER+":"+StaticValues.DBPORT+":"+
                StaticValues.DBNAME;
        }
       
        return result;   
        }
    
    
}

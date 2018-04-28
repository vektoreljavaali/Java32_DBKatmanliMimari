/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTIL;

/**
 *
 * @author vektorel
 */
public class StaticValues {
    
    /**
     * Değerlin Karşılıkları
     * 0 -> PostgreSQL
     * 1 -> MsSQL
     * 2 -> Oracle
     * 
     */
    public static int isDB=0;
    
    public static String DBCLASSNAME_POSTGRE="org.postgresql.Driver";
    public static String DBCLASSNAME_MSSQL="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String DBCLASSNAME_ORACLE="oracle.jdbc.OracleDriver";
    
    // "jdbc:microsoft:sqlserver://localhost:1433, userName, password)"
    //  jdbc:postgresql://10.0.11.12:5432/DBmusteritakip", "postgres", "postgres"
    //  jdbc:oracle:thin:@myhost:1521:orcl", "scott", "tiger"
    
    public static String DBSERVER="10.0.11.12";
    public static String DBPORT="5432";
    public static String DBNAME="DBmusteritakip";
    public static String DBUSER="postgres";
    public static String DBPASSWORD="postgres";
    
    
    
    
    
    
}

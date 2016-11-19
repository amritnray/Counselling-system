/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrator
 */
public class mycode {
    
    static String err_msg;
    
    
    static  Connection con;
    public boolean get_connection_status()
    {
        
        try
        {
            
           // Class.forName("org.apache.derby.jdbc.ClientDriver");
           con=DriverManager.getConnection("jdbc:derby://localhost:1527/master;user=owner;password=secret");
            //System.out.println("helllo");
            return  true;
        }catch(Exception ex)
        {
            err_msg=ex.toString();
            return  false;
        }
        
    }
    
    
   
    public void insert_register()
    {
        try {
              
            myclass c1=new myclass();
            Statement st= con.createStatement();
            String insert_query= "insert into register1(id,name,fname,category,dob,rank,pass) values("+c1.get_autoid()+",'"+c1.get_name()+"','"+c1.get_fname()+"','"+c1.get_cate()+"','"+c1.get_dob()+"' ,"+c1.get_rank()+",'"+c1.get_pass()+"')";
            int result=st.executeUpdate(insert_query);
       
            
            if(result==1)
            {
                JOptionPane.showMessageDialog(null, "saved");
           
            
            }
            else
            {
               JOptionPane.showMessageDialog(null, "not saved");
                
                
            }
        } catch (Exception e) {
            err_msg=e.toString();
                    
            
        }

        
    }
    public boolean  get_auto_id()
    {
        try{
            
            get_connection_status();
            Statement st =con.createStatement();
            String str="select max(id) from register1";
            
            ResultSet result=st.executeQuery(str);
            int auto_id;
            if(result.next())
            {
            auto_id=result.getInt(1)+1;
            
            }
            else
            {
                auto_id=1;
            }
            myclass c1=new myclass();
            c1.set_autoid(auto_id);
            return true;
        }
        catch(Exception ex)
        {
            err_msg=ex.toString();
            return false;
                    
        }
    }
}

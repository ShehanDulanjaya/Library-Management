/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.assist;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Shehan Dulanjaya
 */
public class Library implements Serializable{
    private booksSetting holdings;
    private membersSetting theMembers;
    public static Library lib;
    
    
    Library(){
        holdings =new booksSetting();
        theMembers = new membersSetting();
    }
    
    
    public booksSetting getHoldings(){
        return holdings;
    }
    
    public membersSetting getMembers(){
        
        return theMembers;
    }
    
    public static Library getlibrary(){
        
        return lib;
        
    }
    
    public static void write(String filename){
        try {
            FileOutputStream fil=new FileOutputStream(filename);
            ObjectOutputStream oo=new ObjectOutputStream(fil);
            oo.writeObject(lib);
           
            fil.flush();
            fil.close();
           
        } catch (Exception e) {
            System.out.println("write "+ e);
        }

    }
    public static void delete(String filename){
        
        File file = new File (filename);
        if (! file.exists() )
            {
        boolean success = file.delete();
        }
     
       file.delete();
         
        try{
             
               FileWriter fstream = new FileWriter(filename);
                   BufferedWriter out = new BufferedWriter(fstream);
 
               out.close();
               }catch (Exception e){
                 System.err.println("Error: " + e.getMessage());
               }
 
            
       
    }
    
    public static boolean read(String filename){
        try {
            FileInputStream fil=new FileInputStream(filename);
            ObjectInputStream oo=new ObjectInputStream(fil);
            Object obj= oo.readObject();
            
            fil.close();
            if(Library.class.equals(obj.getClass())){
                lib = (Library) obj;
                return true;
            }
            
        } catch (Exception e) {
            System.out.println("read "+ e);
        }

        lib =new Library();
        return false;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.assist;

import java.io.Serializable;

/**
 *
 * @author Shehan Dulanjaya
 */
public class Members implements Serializable{
    private String name="";
    private int memberNumber;
    private booksSetting currentLoans ;
//    private static int memberCount = 0;
    
    public Members(String aName,int memnum){
     name = aName;
     memberNumber = memnum;
     currentLoans = new booksSetting();
    }

    public String toString(){
        return Integer.toString(memberNumber) + " " + name;
        
    }

    public void borrowBook(Bookclass aBook){
        
         aBook.setCurrentBorrower(this );
        currentLoans.addBook(aBook);
        
       
    }
    
    public void returnBook(Bookclass bBook){
       bBook.setCurrentBorrower(null);
       currentLoans.removeBook(bBook);
       
    }
    
   
    
    public int getmemnum(){
        return memberNumber;
    }
    
   public String getmembername(){
       return name;
   }
    
    public booksSetting getBooksOnLoan(){
        return currentLoans;
    }
    
    
}

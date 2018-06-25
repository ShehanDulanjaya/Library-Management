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
public class Bookclass implements Serializable{
    private String ISBN;
    private String title;
    private String Author;
    private String avail;
    private Members borrower = null;
    private int accessionNumber;
    private boolean Availability;
    
    
    public Bookclass(String name,String Isbn,String author,int Accesionnum,String Available){
        title = name;
        ISBN =Isbn;
        Author=author;
        accessionNumber = Accesionnum;
        avail=Available;
          Availability=true;

    }

    void setCurrentBorrower(Members theBorrower) {
        borrower = theBorrower;
    }
    void setavailability(String check ){
        if("add".equals(check)){
            Availability=false;
        }
        else{
            Availability=true;
        }
    }

    Members getBorrower() {
        return borrower;
    }
    
    public String toString(){
        return Integer.toString(accessionNumber) + " " + title;
        
    }
    
    public boolean isOnLoan(){
        if(Availability==false){
            return true;
        }            
        else{
            return false;
        }
    }
    
    public boolean getAvailability(){
        return Availability;
    }
    
    public String getISBN(){
        return ISBN;
    }
    
    public String gettitle(){
        return title;
    }
    
    public String getauth(){
        return Author;
    }
    
    public String getavail(){
        return avail;
    }
    public int getacc(){
        return accessionNumber;
    }
}

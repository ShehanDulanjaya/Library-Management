/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.assist;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Shehan Dulanjaya
 */
public class booksSetting implements Serializable {
    
    private ArrayList<Bookclass> books;
    
    booksSetting bookset=null;
    Bookclass book=null;
    
    public booksSetting(){

        books=new ArrayList<>();
    }
    
    public int getSize(){
        return books.size();
    }

    public void addBook(Bookclass Book){
        books.add(Book);
        
    }
    
        
    
   
    
    Bookclass findbookbyauthor(String auth){
        for(Bookclass boook:books){
                if(auth.equals(boook.getauth())){
                    return boook;
                }
            }
                        return null;
    }
    
    Bookclass findbookbytitle(String title){
        for(Bookclass boook:books){
                if(title.equals(boook.gettitle())){
                    return boook;
                }
            }
                        return null;
      
           
    }
    
    Bookclass findbookfromaccnum(int acc){
        for(Bookclass boook:books){
                if(acc == boook.getacc()){
                    return boook;
                }
            }
                        return null;
      
           }
    
    Bookclass findbookfromISBN(int isbn){
        for(Bookclass boook:books){
            Integer i=new Integer(boook.getISBN());
                if(isbn == i){
                    return boook;
                }
            }
                        return null;
    }
    
    void removeBook(Bookclass book){
        books.remove(book);
    }
    
    public Bookclass[] getallbooks(){
        return books.toArray(new Bookclass[0]);
    }
}

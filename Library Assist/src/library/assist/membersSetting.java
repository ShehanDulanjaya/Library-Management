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
public class membersSetting implements Serializable{
    
        private ArrayList<Members> members;
    
        public void addMember(Members aMember) {
            members.add(aMember);

         }
        
        public membersSetting(){
            members= new ArrayList<>();
        }
        
        Members getMemberFromName(String memname){
            for(Members member:members){
                if(memname.equals(member.getmembername())){
                    return member;
                }
            }
                        return null;
        }
        
         Members getMemberFromNumber(int memnum){
            for(Members member:members){
                if(memnum == member.getmemnum()){
                    return member;
                }
            }
                        return null;
                        
        }
         
        public Members[] getallmembers(){
            return members.toArray(new Members[0]);
        } 
         
         void removeMember(Members mem){
             members.remove(mem);
         }
}

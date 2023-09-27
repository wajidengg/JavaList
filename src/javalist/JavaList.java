/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javalist;
import java.io.*;
import java.util.*;

/**
 *
 * @author Wajid
 */
public class JavaList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        List al = new LinkedList();
        for(int i=0; i<size; i++){
            int num = sc.nextInt();
            al.add(num);
        }
        int q1 = sc.nextInt();
        
        for(int j=0; j<q1; j++){
            String qr = sc.next();
            //System.out.println(qr);
            
            if(qr.equals("Insert")){
                int aindex = sc.nextInt();
                int adnum = sc.nextInt();
                al.add(aindex, adnum);
            } else if(qr.equals("Delete")){
                int dl = sc.nextInt();
                al.remove(dl);                
            }
            
        }
        for(int i=0; i<al.size(); i++){
            System.out.print(al.get(i) +" ");
        } 
    }
    
}

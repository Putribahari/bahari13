/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan;

/**
 *
 * @author kurnia
 */
public class Run {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Orangtua ot = new Orangtua();//<-membuat class
        Anak a = new Anak();//<-membuat class
        ot.nama= "Putri Bahari Satrianti";//<-method dari class
        a.nama="putri";//<-method dari class
        System.out.println(ot.nama);
        System.out.println(a.nama);
        // TODO code application logic here
    }
    
}

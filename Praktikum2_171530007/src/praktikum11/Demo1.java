/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum11;

/**
 *
 * @author Adoenkz_Hikki
 */
public class Demo1 {
    public static void main (String []args ){
        String S="Pemograman Java";
        String HurufKapital = S.toUpperCase();
        String HurufKecil = S.toLowerCase();
        
        int IndexAwal=12;
        int IndexAkhir=16;
        char[] Karakter=new char [IndexAkhir-IndexAwal];
        S.getChars(IndexAwal, IndexAkhir, Karakter, 0);
        
        byte[] temp =new byte [S.length()];
        temp=S.getBytes();
        
        String Trim =S.trim();
        String sub = S.substring(5, 9);
        String Replace1 = S.replace("Pemograman", "Pemograman");
        String Replace2 = S.replace('v', 'w');
        
        System.out.println("Penggunaan toUpperCase()\t :" +HurufKapital );
        System.out.println("Penggunaan Method toLowerCase()\t :" +HurufKecil );
        System.out.println("Penggunaan Method charAt()\t :" +S.charAt(0) );
        
        
        
    }
}

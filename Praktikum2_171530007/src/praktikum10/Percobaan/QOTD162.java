/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum10.Percobaan;

/**
 *
 * @author Teknik Informatika
 */
class QOTD162 {
    public int x = 5;
    
}

class Child extends QOTD162{
    public int x =10;
    
    public void info (int x){
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
}

class AksesNilai { /* public dihilangkan yang tadinya public class AksesNilai */
    public static void main (String arg[]){
        Child c = new Child();
        c.info(15);
    }
}

/* penamaan class harus AksesNilai.java karena penamaan class harus sama
sebelumnya class bernama QOTD162
*/

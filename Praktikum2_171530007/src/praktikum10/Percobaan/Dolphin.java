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
class Animal {}
class Mammal extends Animal{}
class Cat extends Animal{}
public class Dolphin extends Mammal{
    
    public static void main (String [] args){
        Mammal m = new Mammal ();  /*  Mammal m = new Cat (); disamakan objeknya dengan Mammal*/
        Animal a = m;
        Dolphin d = (Dolphin) a;
    }
}


/* pendeklarasian objek harus sama , pada baris 18,19
Jika objek ditulis Mammal seharusnya objek new Mammal bukan Cat dan sebaliknya
*/
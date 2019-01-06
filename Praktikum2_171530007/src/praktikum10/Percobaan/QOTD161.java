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
class QOTD161 {  /* Modifier final dihilangkan yang tadinya class QOTD161*/
    int xxx;
    void yyy () {xxx=1;}
    
}

class Bbb extends QOTD161{
    final QOTD161 finalref = new QOTD161();
    
    final void yyy (){
        System.out.println("method yyy");
        finalref.xxx = 12345;
    }
}


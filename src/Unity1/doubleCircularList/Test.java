/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity1.doubleCircularList;

/**
 *
 * @author Johana Romero
 */
public class Test {
    public static void main (String [] args){        
        testingList();
    }
    
    public static void testingList(){
        System.out.println("---------------List Testing-----------------");
        List l = new List();
        for (int i = 1; i <= 10; i++) {
            l.add(i);
        }
        l.print();
        l.moveFirstToEnd();
        l.print();
        l.moveLastToBeginning();
        l.print();
        l.remove(3);
        l.print();
        l.invert();
        l.print();
        
        /*l.add(2);
        l.add(4);
        l.add(6);
        l.add(8);
        l.add(10);
        l.print();*/
    }        
}

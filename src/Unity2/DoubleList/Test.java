/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity2.DoubleList;

/**
 *
 * @author AULA3
 */
public class Test {
    
    public static void main (String [] args){        
        testingList();
    }
    
    public static void testingList(){
        System.out.println("---------------List Testing-----------------");
        List l = new List();
        l.add(2);
        l.add(8);
        l.add(7);
        l.add(9);
        l.add(4);
        
        System.out.print("The Reverse Print");
        l.reversePrint();
        l.print();
        
        System.out.println("The Push");
        l.push(200);
        l.print();
    }
}

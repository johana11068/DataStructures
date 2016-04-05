/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity1.DoubleList;

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
        
        System.out.print("The Reverse Print: ");
        l.reversePrint();
        
        System.out.print("\nThe Push: ");
        l.push(20);
        l.print();
        
        System.out.print("The Remove Last: ");
        l.removeLast();
        l.print();
        
        System.out.print("The Remove first: ");
        l.removeFirst();
        l.print();
        
        System.out.print("The print First Element: ");
        l.printFirstElement();
        
        System.out.print("The duplicate Element: ");
        l.duplicate();
        l.print();
        
        System.out.print("The duplicate Intercaled: ");
        l.duplicateIntercaled();
        l.print();
    }
}

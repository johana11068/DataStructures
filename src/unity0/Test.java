/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity0;

/**
 *
 * @author Johana Romero
 */
public class Test {//FILA----
    
    public static void main (String [] args){
        testingStacks();
        testingQueue();
        testingList();
    }
    
    public static void testingStacks(){
        System.out.println("---------------Stack Testing-----------------");
        Stack s = new Stack();
        s.add(10);
        s.add(20);
        s.add(30);
        s.print();
        s.remove();//remueve ultimo elemento e imprime
        s.print();
        for(int i=2; i<20; i+=2){ //incremento de 2 en 2
            s.add(i);
        }
        s.print();
    }
    
    public static void testingQueue(){
        System.out.println("---------------Queue Testing-----------------");
        Queue q = new Queue();
        for(int i=1; i<=20; i++){
            q.add(i);
        }
        System.out.print("Initial values: ");
        q.print();
        int d=q.remove();
        System.out.println("The element removed was: "+d);
        System.out.print("Current values: ");
        q.print();
    }
    public static void testingList(){
        System.out.println("---------------List Testing-----------------");
        List l = new List();
        l.add(5);
        l.add(8);
        l.add(18);
        l.print();
        l.remove(8);
        l.print();
        
    }
}

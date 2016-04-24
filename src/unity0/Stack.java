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
public class Stack {
    
    private int[] data;
    private int top;
    
    //constructor pila
    public Stack(){
        data = new int[100];
        top=0;
    }
    
    public void add(int d){
        data[top]=d;
        top++;
    }
    
    public int remove(){
        top--;
        return data[top];
    }
    
    public void print(){
        for(int i=0; i<top;i++){
            System.out.print(" "+data[i]);
        }
        System.out.println();
    }
}

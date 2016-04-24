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
public class List {
    private Node head;
    
    public List(){
        head = null;        
    }
    
    public void add(int d){
        Node n = new Node(d);
        if(head == null){
            head = n;
        }else{
            Node aux = head;            
            n.next = head;
            n.back = head.back;
            head.back.next = n;
            head.back = n;
        }
    }
    public void print(){
        if(head == null)return;
        Node aux = head;
        do{
            System.out.print(" "+aux.data);
            aux = aux.next;
        }
        while(aux != head);
        System.out.println("");
    }
    public void moveFirstToEnd(){
        if(head == null)return;
        head = head.next;
    }
    public void moveLastToBeginning(){
        if(head == null)return;
        head = head.back ; 
    }
    public void remove(int p){
        Node aux = head;
        if(head == null)return;
        for (int i = 1; i < p; i++) {
            aux = aux.next;
        }
        aux.back.next = aux.next;
        aux.next.back = aux.back;
    }
    public void invert(){
        Node aux = head;
        if(head == null)return;
        while(aux.next != head){
            aux = aux.back;
        }        
    }
}

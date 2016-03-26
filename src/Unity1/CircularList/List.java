/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity1.CircularList;

/**
 *
 * @author Jairo David
 */
public class List {
    private Node head;
    
    public List(){
        head = null;        
    }
    
    public void add(int d){
        Node n = new Node(d);
        if (head == null) {
            head = n;
        }else{
            Node aux = head;
            while(aux.next != head){
                aux = aux.next;
            }
            n.next = head;
            aux.next = n;
        }
    }
    public void print(){
        if(head == null)return;
        Node aux = head;
        do{
            System.out.println(" "+aux.data);
            aux = aux.next;
        }
        while(aux != head);
        System.out.println("");
    }
    /*
    public void reversePrint(){
        if(head == null) return;
        Node aux = head;
        while(aux.next != null){
            aux = aux.next;
        }
        while(aux != null){
            System.out.print(" "+aux.data);
            aux = aux.back;
        }
    }
    public void push(int d){
        Node n = new Node(d);
        if (head == null) {
            head = n;
        }else{
            n.next = head;
            head.back = n;
            head = n;
        }
    }
    public void removeLast(){
        if(head != null) return;
        Node aux = head;
        if(head.next == null){
            head = head.next;
        }else{
            while(aux.next != null){                
                aux = aux.next;          
            }
        }
    }
    
    public void removeFirst(){
        if(head == null)return;
        head = head.next;
        head.back = null;
        
    }*/
}

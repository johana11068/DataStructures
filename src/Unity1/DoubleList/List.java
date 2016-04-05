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
            while(aux.next != null){
                aux = aux.next;
            }
            aux.next = n;
            n.back = aux;
        }
    }
    public void print(){
        Node aux = head;
        while(aux != null){
            System.out.print(" "+aux.data);
            aux = aux.next;
        }
        System.out.println();
    }
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
    public void removeFirst(){
        if(head == null)return;
        head = head.next;
        head.back = null;        
    }    
    public void removeLast(){
        if(head != null) return;
        Node aux = head;
        Node p = head;
        while(aux.next != aux){
            aux = aux.next;
            while(p.next != aux){
                p = p.next;
            }
        }
        p.next = null;
        aux.back = p;
    }
    
    public void printFirstElement(){
        Node aux = head;
        if(aux == null){
            System.out.print(" -1 ");
        }else{
            System.out.println(aux.data);
        }
    }        
    public int count(){
        Node aux = head;
        int conter=0;
        while(aux != null){
            conter++;
            aux = aux.next;
        }
        return conter;        
    }
    public void duplicate(){
        if(head == null) return;
        Node aux = head;
        Node last = head;
        while(last.next != null){
            last = last.next;            
        }  
        int c = count();
        for (int i = 0; i < c ; i++) {
            last.next = new Node(aux.data);
            aux = aux.next;
            aux.back = last;
            last = last.next;
        }
    }
    public void duplicateIntercaled(){
        if(head == null)return;
        Node aux = head;
        Node p = head;
        while(aux != null){
            Node n = new Node(p.data);
            aux = aux.next;
            p.next = n;
            n.back=p;
            n.next = aux;
            p = aux;
        }
        
    }
    
}

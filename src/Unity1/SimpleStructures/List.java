/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity1.SimpleStructures;

/**
 *
 * @author AULA1
 */
public class List {
    
    private Node head;
    
    public List(){
        head = null;
    }
    public void add(int d){
        Node n = new Node(d);
        if(head == null){
            head=n;
        }else{
            Node aux = head;
            while (aux.next != null){
                aux = aux.next;
            }
            aux.next=n;
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
    public int remove(int p){
        return 0;
        
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
    public void printFirstElement(){
        Node aux = head;        
        if(head == null){
            System.out.println("-1");
        }else{
            System.out.println(""+aux.data);
        }        
    }
    public void printLastElement(){
        Node aux = head;  
        while(aux.next != null){
            aux = aux.next;
        }
        System.out.println(""+aux.data);
    }      
    
}

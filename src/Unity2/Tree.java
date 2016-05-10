/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity2;

import java.awt.Graphics;
import java.util.Stack;
import java.util.Vector;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Johana Romero
 */
public class Tree {
    private Node root;
    
    public Tree() {
        root = null;
    }
    
    public void add(int d) {
        Node n = new Node(d);
        if(root == null) {
            root = n;
        } else {
            Node aux = root, p = null;
            while(aux != null) {
                if(d < aux.data) {
                    p = aux;
                    aux = aux.left;
                } else if(d > aux.data) {
                    p = aux;
                    aux = aux.right;
                } else {
                    return;
                }
            }
            if(d < p.data) {
                p.left = n;
            } else {
                p.right = n;
            }
        } 
    }
    
    public void printPath(int d){
        Vector<Node> path = new Vector<Node>();
        Node aux = root;
        while(aux != null){
            path.add(aux);
            if(d > aux.data){
                aux = aux.right;
            }else if(d < aux.data){
                aux = aux.left;
            }else{
                for (int i = 0; i < path.size(); i++) {
                    System.out.println(" "+path.elementAt(i).data);
                }
                System.out.println();
                return;
            }
        }
        System.out.println("Doesn't exist ");
    }
    
    public boolean isleaf (int d){
        Node aux = root;
        while(aux != null){
            if(d > aux.data){
                aux = aux.right;
            }else if(d < aux.data){
                aux = aux.left;
            }else{
                if(aux.right == null && aux.left == null){
                return true;
            }else{
                    return false;
                }
            }
        }
        return false;
    }
    
    public void print(){
        Node aux=root;
        Stack <Node> s = new Stack <Node> ();
        while(aux!=null){
            s.push(aux);
            aux=aux.left;
        }
        while(!s.empty()){
            aux=s.pop();
            System.out.println(""+aux.data);
            aux=aux.right;
            while(aux!=null){
                s.push(aux);
                aux=aux.left;
            }
        }
    }    
    public int count(){
        int cont=0;
        Node aux=root;
        Stack <Node> s = new Stack <Node> ();
        while(aux!=null){
            s.push(aux);
            aux=aux.left;
        }
        while(!s.empty()){
            aux=s.pop();
            cont++;
            aux=aux.right;
            while(aux!=null){
                s.push(aux);
                aux=aux.left;
            }
        }
        return cont;
    }
    public void printLeafs(){
        Node aux = root;
        Stack <Node> s = new Stack <Node> ();
        while(aux != null){
            s.push(aux);
            aux = aux.left;
        }
        while(!s.empty()){
            aux = s.pop();
            aux = aux.right;
            if(aux.left == null && aux.right == null){
                System.out.println(" "+aux.data);
            }
            while(aux != null){
                s.push(aux);
                aux = aux.left;
            }
        }
    }
    public int max(){
        if(root==null)return -1;
        Node aux=root;
        while(aux.right!=null){
            aux=aux.right;
        }
        return aux.data;
    }
    public int min(){
        if(root==null)return -1;
        Node aux=root;
        while(aux.left!=null){
            aux=aux.left;
        }
        return aux.data;
    }
    
    public void recursivePrint(){
        recursivePrint(root);
        System.out.println();
    }
    
    private void recursivePrint(Node r){
        if(r == null)return;
        recursivePrint(r.left);//imprimir el lado izquierdo
        System.out.print(" "+r.data);//imprimir el root (cabecera)
        recursivePrint(r.right);//imprimi el lado derecho
    }
    
    public int recursiveCount(){
        return recursiveCount(root);       
    }
    
    private int recursiveCount(Node r){
        if(r == null) return 0;
        return recursiveCount(r.left) + recursiveCount(r.right) + 1;        
    }
    
    public int recursiveSum(){
        return recursiveSum(root);
    }
    public int recursiveSum(Node r){
        if(r == null)return 0;
        return recursiveSum(r.left)+recursiveSum(r.right)+r.data;        
    }
    
    public void rPrintLeafs(){
        rPrintLeafs(root);
    }
    
    private void rPrintLeafs(Node r){
       if(r == null) return;
       if(r.left == null && r.right == null){
           System.out.println(r.data);
           return;
       }
       rPrintLeafs(r.left);
       rPrintLeafs(r.right);        
    }
    
    public int rHelght(){
        return rHelght(root);
    }
    private int rHelght(Node r){
        if (r == null) return 0;        
        int a = rHelght(r.left);
        int b = rHelght(r.right);
        return Math.max(a,b)+1;
        
    }
    
    public void rDraw(){
        JFrame f = new JFrame(){            
            public void paint(Graphics g){
                rDraw(root,20,40,g);
            }
        };
        f.setSize(600,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    class Info{
        int xRoot, xFinal;
    }
    
    private Info rDraw(Node r, int x, int y, Graphics g){
        Info rootInfo = new Info();
        rootInfo.xFinal = x;
        if(r == null){
            return rootInfo;
        }
        Info leftInfo, rightInfo;
        leftInfo = rDraw(r.left,x,y+40,g);
        x = leftInfo.xFinal;
        
        g.drawOval(x,y,30,30);
        g.drawString(""+r.data,x+10,y+20);
        rootInfo.xRoot = x;
        
        rightInfo = rDraw(r.right,x+30,y+40,g);
        rootInfo.xFinal = rightInfo.xFinal;
        
        if(r.left != null){
            g.drawLine(rootInfo.xRoot+5,y+25,leftInfo.xRoot+15,y+40);
        }
        if(r.right != null){
            g.drawLine(rootInfo.xRoot+25,y+25,rightInfo.xRoot+15,y+40);
        }
        return rootInfo;
        
    } 
    
    public boolean isComplete(){
        return isComplete(root);        
    }
    private boolean isComplete(Node r){
        if(r == null)return true;
        if(r.left == null ^ r.right == null){
            return false;
        }
        return (isComplete(r.left) && isComplete(r.right));
    }
        
    public boolean exists(int d){        
        Node aux = root;
        while(aux != null){
            if(d == aux.data){
                return true;
            }else if(d > aux.data){
                aux = aux.right;
            }else{
                aux = aux.left;
            }
        }
        return false;
    }
    
    public void invert(){
        invert(root);
    }
    private void invert(Node r){
        if(r == null) return;
        Node aux = r.left;
        r.left = r.right;
        r.right = aux;
        invert(r.left);
        invert(r.right);
    }
    //prune()=cortar rama sobrante
    public void prune(){
        prune(root);
    }
    private void prune(Node r){
        if(r == null)return;
        
    }
    //completar hijo faltante
    public void complete(){
        
    }
       
}
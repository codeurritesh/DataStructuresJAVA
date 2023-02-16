package Linked_List;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_nodes_k_Groups {
        private class node{
            int value;
        node next;
        }
        node head;
        node tail;
        private int size;
        public void addfirst(int item){
            node nn=new node();
            nn.value=item;
            if(this.size==0){
                head=nn;
                tail=nn;
                size++;
            }
            else {
                nn.next=head;
                head=nn;
//            nn.value=item;
                size++;
            }
        }
        public void addlast(int item)
        {
            node nn=new node();
            nn.value=item;
            if(this.size==0){
                addfirst(item);
            }
            else {
                tail.next=nn;
                tail=nn;
//            head=nn;
//            nn.value=item;
                size++;
            }
        }

        public void display() {
            node ns;
            ns = head;
            while (ns != null) {
                System.out.print(ns.value + " ");
                ns = ns.next;
            }
            System.out.println();
        }
        public void reverse(int k){
            node curr=head;
            node temp=null;
            node head2=null;
            node points=null;
            Stack<node> st=new Stack<>();
            while(curr!=null) {
                if(st.size()==0)
                    points=curr;
                if (st.size() <= k) {
                    st.push(curr);
                    curr = curr.next;
                }
                if(st.size()==k){
                while (!st.isEmpty()) {
                    if (head2 == null) {
                        head2 = st.pop();
                        temp = head2;
                    } else {
                        temp.next = st.pop();
                        temp = temp.next;
                    }
                }
            }
                }
            if(st.size()==0)
            temp.next=null;
            else
                temp.next=points;
head=head2;
        }
        public static void main(String[] args) throws Exception {
            Reverse_nodes_k_Groups ll=new Reverse_nodes_k_Groups();
           Scanner s=new Scanner(System.in);
           int n=s.nextInt();
           int k=s.nextInt();
            for (int i = 0; i < n; i++) {
                ll.addlast(s.nextInt());
            }
            ll.reverse(k);
            ll.display();

//
        }
    }

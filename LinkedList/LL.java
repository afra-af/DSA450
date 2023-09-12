import java.util.*;
class LL {
    //create head
    Node head;
    //to track size of ll
    private int size;
    //constructor of size
    LL(){
       this.size=0; 
    }
    //create node class
    class Node{
        String data;
        Node next;
        
        //create constructor  to take this data from user
        Node(String data){
        this.data=data;
        //by default null at first even if it has single node
        this.next=null;
        //as the newnode is created increase the size
        size++;
    }
    }
    // add @ first , last in LL
    // initial LL we have 2->3->4, we need to add 1 at first. so create 1 node first . by default 1 node will point to null, remove 2 node refrence as head and point it to 1 node. so now 1 which has reference as head is the first node
    public void addFirst(String data){
        // if ll not created yet create one
        Node newNode=new Node(data);
         //to add at first assign newnode next reference as head. and head will be the newNode
        newNode.next=head;
        head=newNode;
        //check if  ll exists
        if(head==null){
            //assign the head to newNode that is created.
            head=newNode;
            return;
        }
       

    }
    
    // move the head until lasnode where node.next=null . make it point to newNode whose default ptr will be null 
    public void addLast(String data){
        Node newNode=new Node(data);
         //to add at first assign newnode next reference as head. and head will be the newNode
        //check if  ll exists
        if(head==null){
            //assign the head to newNode that is created.
            head=newNode;
            return;
    }
    // dont loose head node. make currentnode and update head node traversing in that
    Node lastNode=head;
    while(lastNode.next!=null){
        //updating the head node in current node
        lastNode=lastNode.next;
    }
    //when u reach the last node make it currentnode will have null ptr so assign it to newnode we want to add atlast of LL
    lastNode.next=newNode;
    }
    

// print list
public void printList(){
    if(head==null){
        System.out.println("list is empty");
        return;
    }
    Node currNode=head;
    while(currNode!=null){
        System.out.println(currNode.data + "->");
       currNode=currNode.next;
    }
    System.out.println("Null");
    
}
//delete first node : shift head node to next node then the prevoius head node is lost forever
// delete last node: traverse head node till second last node and make its ptr as null.
public void deleteFirst(){
    if(head==null){
        return;
    }
    //when node is deleted 
    size--;
    
    //make head poin to its next node
    head=head.next;
}
public void  deleteLast(){
    if(head==null){
        System.out.print("empty");
        return;
    }
    size--;
    //if in case ll has only one node head.next=null
    if(head.next==null){
        //make head null
        head=null;
        return;
    }
    //traverse head till last second node
    Node secondlast=head;
    Node lastNode=head.next;
    while(lastNode.next!=null){
        lastNode=lastNode.next;
        secondlast=secondlast.next;
        
    }
    secondlast.next=null;
}
// track tha size of ll
public int getSize(){
    return size;
}

    public static void main(String[] args) {
        //create obj of LL class
        LL list=new LL();
        list.addFirst("is");
        list.addFirst("a");
        list.printList();
        list.addLast("list");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
       System.out.print(list.getSize());
}
}

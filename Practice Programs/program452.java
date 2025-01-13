import java.util.*;

//Singly Linear Linked List

class program452
{
    public static void main(String arg[])
    {
        SinglyLL obj = new SinglyLL();

        obj.InsertFirst(51);
         obj.InsertFirst(21);
          obj.InsertFirst(11);

        obj.InsertLast(101);
        obj.InsertLast(111);
        obj.InsertLast(121);
        
        obj.display();

        System.out.println("Number of Nodes is "+obj.iCount);
    }
}

class Node
{
    public int data;
    public Node next;

    public Node(int no)
    {
        this.data = no;
        this.next = null;
    }
}

class SinglyLL
{
    public Node first;
    public int iCount;

    public SinglyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void display()
    {
        System.out.println("Elements of Linked List Are : ");

        Node temp = first;

        while(temp != null)
        {
            System.out.print("| "+temp.data+" |-> ");
            temp = temp.next;
        }
        System.out.print("");
    }

    public int Count()
    {
        return this.iCount;
    }

    public void InsertFirst(int no)
    {
        Node newn = new Node(no);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            newn.next = first;
            first = newn;
        }
        iCount++;
    }

    public void InsertLast(int no)
    {
         Node newn = new Node(no);

        if(first == null)
        {
            first = newn;
        }
        else
        {
           Node temp = first;

           while(temp.next != null)
           {
                temp = temp.next;
           }
           temp.next = newn;

        }
        iCount++;
    }

    public void InsertAtPos(int no, int iPos)
    {}

    public void DeleteFirst()
    {
        if(first != null)
        {
            first = first.next;
            iCount--;
        }
        
    }

    public void DeleteLast()
    {}

    public void DeleteAtPos()
    {}
}
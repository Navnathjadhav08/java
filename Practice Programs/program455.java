import java.util.*;

//Doubly Linear Linked List

class program455
{
    public static void main(String arg[])
    {
        DoublyLL obj = new DoublyLL();

        obj.InsertFirst(51);
         obj.InsertFirst(21);
          obj.InsertFirst(11);

        obj.InsertLast(101);
        obj.InsertLast(111);
        obj.InsertLast(121);

        obj.InsertAtPos(55, 4);
        
        obj.display();

        System.out.println("Number of Nodes is "+obj.iCount);

        obj.DeleteFirst();
        obj.DeleteLast();
        obj.DeleteAtPos(4);

        obj.display();
        System.out.println("Number of Nodes is "+obj.iCount);

    }   
}

class Node
{
    public int data;
    public Node next;
    public Node prev;

    public Node(int no)
    {
        this.data = no;
        this.next = null;
        this.prev = null;
    }

}

class DoublyLL
{
    public Node first;
    public int iCount;

    public DoublyLL()
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
            System.out.print("| "+temp.data+" |<=> ");
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
            first.prev = newn;
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
           temp.prev = newn;

        }
        iCount++;
    }

    public void InsertAtPos(int no, int iPos)
    {
        int iSize = Count();

        if((iPos < 1) || (iPos > iSize+1))
        {
            InsertFirst(no);
        }
        else if(iPos == iSize+1)
        {
            InsertLast(no);
        }
        else
        {
            Node temp = first;
            for(int iCnt = 1; iCnt < iPos-1; iCnt++)
            {
                temp = temp.next;
            }
            Node newn= new Node(no);

            newn.next = temp.next;
            temp.next = newn;

            temp.next = newn;
            newn.prev = temp;

            iCount++;

        }
    }

    public void DeleteFirst()
    {
        if(first == null)
        {
          return;
        }
        if(first.next == null)
        {
            first = null;

        }
        else
        {
            first = first.next;
            first.prev = null;
        }
        iCount--;
        
    }

    public void DeleteLast()
    {
        if(first == null)
        {
            return;
        }
        if(first.next == null)
        {
            first = null;
        }
        else
        {
            Node temp = first;

            while(temp.next.next != null)
            {
                temp = temp.next;
            }

            temp.next = null;
        }

        iCount--;
    }

    public void DeleteAtPos(int iPos)
    {
         int iSize = Count();

        if((iPos < 1) || (iPos > iSize+1))
        {
            DeleteFirst();
        }
        else if(iPos == iSize+1)
        {
            DeleteLast();
        }
        else
        {
            Node temp = first;
            for(int iCnt = 1; iCnt < iPos-1; iCnt++)
            {
                temp = temp.next;
            }

           temp.next = temp.next.next;
           temp.next.prev = temp;

            iCount--;

        }
    }

    public void DisplayRevrse()
    {
        System.out.println("Elements of Linked list in reverve order is : ");

        Node temp = first;

        while(temp.next != null)
        {
            temp = temp;
        }
    }
}
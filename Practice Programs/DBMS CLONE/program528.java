import java.util.*;

public class program524
{
    public static void main(String arg[])
    {
        DBMS obj = new DBMS();
        obj.StartDBMS();

        obj.InsertIntoTable("Rahul", 23, 89);
        obj.InsertIntoTable("Sagar", 26, 60);
        obj.InsertIntoTable("Pooja", 20, 70);
        obj.InsertIntoTable("Sayali", 30, 99);
        obj.InsertIntoTable("Tejas", 29, 91);

        obj.SelectFrom();

    }
    
}

class Student
{
    public int Rno;
    public String Name;
    public int Age;
    public int Marks;

    public static int Generator;

    static
    {
        Generator = 0;
    }

    public Student(String str,int X,int Y)
    {
        this.Rno = ++Generator;
        this.Name = str;
        this.Age = X;
        this.Marks = Y; 
    }

    public void Display()
    {
        System.out.println(this.Rno + " " +this.Name +" "+this.Age+" "+this.Marks);
    }
}

class DBMS
{
    public LinkedList <Student> lobj;

    public DBMS()
    {
        lobj = new LinkedList<Student>();
    }

    public void StartDBMS()
    {
        System.out.println("Marvellous DataBase Management System Started......");
        System.out.println("MArve");

        //logic
    }

    //Insert into Table Student Values(----------,---------,-------);
    public void InsertIntoTable(String name,int age,int Marks)
    {
        Student sobj = new Student(name, age, Marks);
        lobj.add( sobj);
    }

    //Select * from student
    public void SelectFrom()
    {
        System.out.println("Record from the student database are : ");

        for(Student sref : lobj)
        {
            sref.Display();
        }
    }
}